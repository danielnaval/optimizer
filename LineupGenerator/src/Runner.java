import java.util.ArrayList;


public class Runner {
	public static void main(String[] args) {
		final long startTime = System.nanoTime();
		
		int salary;
		int value;
		int position;
		ArrayList<Player> pgList = new ArrayList<Player>();
		ArrayList<Player> sgList = new ArrayList<Player>();
		ArrayList<Player> sfList = new ArrayList<Player>();
		ArrayList<Player> pfList = new ArrayList<Player>();
		ArrayList<Player> cList = new ArrayList<Player>();
		
		for (int i = 0; i < 200; i++) {
			Player player = new Player();
			salary = (int) (30 + 90*Math.random());
			player.setSalary(salary);
			value = (int) (10 + 40*Math.random());
			player.setValue(value);
			position = (int) (5*Math.random());
			if (position == 0) {
				player.setPosition(Position.PG);
				pgList.add(player);
			} else if (position == 1) {
				player.setPosition(Position.SG);
				sgList.add(player);
			} else if (position == 2) {
				player.setPosition(Position.SF);
				sfList.add(player);
			} else if (position == 3) {
				player.setPosition(Position.PF);
				pfList.add(player);
			} else {
				player.setPosition(Position.C);
				cList.add(player);
			}
		}
		PlayerSalaryComparator comparator = new PlayerSalaryComparator();
		pgList.sort(comparator);
		sgList.sort(comparator);
		sfList.sort(comparator);
		pfList.sort(comparator);
		cList.sort(comparator);
		ArrayList<Player> gList = new ArrayList<Player>(pgList);
		gList.addAll(sgList);
		ArrayList<Player> fList = new ArrayList<Player>(sfList);
		fList.addAll(pfList);
		ArrayList<Player> flexList = new ArrayList<Player>(pgList);
		flexList.addAll(sgList);
		flexList.addAll(sfList);
		flexList.addAll(pfList);
		flexList.addAll(cList);

		Player pg, sg, sf, pf, c, g, f, flex;
		int pgSalary, sgSalary, sfSalary, pfSalary, cSalary, gSalary, fSalary, flexSalary;
		int pgLSize = pgList.size();
		int sgLSize = sgList.size();
		int sfLSize = sgList.size();
		int pfLSize = pfList.size();
		LineupVector lineup;
		ArrayList<LineupVector> lineups = new ArrayList<LineupVector>();
		LineupValueComparator valueComparator = new LineupValueComparator();
		long operations = 0;
		long solutions = 0;
		int maxValue = 0;
		int maxCount = 0;
		for (int i = 0; i < pgList.size(); i++) {
			operations++;
			pg = pgList.get(i);
			pgSalary = pg.getSalary();
			for (int j = 0; j < sgList.size(); j++) {
				operations++;
				sg = sgList.get(j);
				sgSalary = sg.getSalary();
				if (pgSalary + sgSalary < 500 && pgSalary + sgSalary > 20) {
					for (int k = 0; k < sfList.size(); k++) {
						operations++;
						sf = sfList.get(k);
						sfSalary = sf.getSalary();
						if (pgSalary + sgSalary + sfSalary < 500 && pgSalary + sgSalary + sfSalary > 160) {
							for (int l = 0; l < pfList.size(); l++) {
								operations++;
								pf = pfList.get(l);
								pfSalary = pf.getSalary();
								if (pgSalary + sgSalary + sfSalary + pfSalary < 500 && pgSalary + sgSalary + sfSalary + pfSalary > 280) {
									for (int m = 0; m < cList.size(); m++) {
										operations++;
										c = cList.get(m);
										cSalary = c.getSalary();
										if (pgSalary + sgSalary + sfSalary + pfSalary + cSalary < 400) {
											solutions++;
											value = pg.getValue() + sg.getValue() + sf.getValue() + pf.getValue() + c.getValue();
											lineup = new LineupVector(pg, sg, sf, pf, c, null, null, null);
											if (value > maxValue) {
												maxValue = value;
												lineups.clear();
												lineups.add(lineup);
												maxCount = 1;
											} else if (value == maxValue) {
												maxCount++;
												lineups.add(lineup);
											}
										}
//										if (pgSalary + sgSalary + sfSalary + pfSalary + cSalary < 500) {
//											for (int n = 0; n < gList.size(); n++) {
//												operations++;
//												if (n != i && n != j+pgLSize) {
//													g = gList.get(n);
//													gSalary = g.getSalary();
//													if (pgSalary + sgSalary + sfSalary + pfSalary + cSalary + gSalary < 500) {
//														for (int o = 0; o < fList.size(); o++) {
//															operations++;
//															if (o != k && o != l+sfLSize) {
//																f = fList.get(o);
//																fSalary = f.getSalary();
//																if (pgSalary + sgSalary + sfSalary + pfSalary + cSalary + gSalary + fSalary < 500) {
//																	for (int p = 0; p < flexList.size(); p++) {
//																		if (p != i && p != j + pgLSize && p != k + pgLSize + sgLSize && 
//																				p != l + pgLSize + sgLSize + sfLSize && p!= m + pgLSize + sgLSize + sfLSize + pfLSize) {
//																			flex = flexList.get(p);
//																			flexSalary = flex.getSalary();
//																		
//																		}
//																	}
//																} else {
//																	break;
//																}
//															}
//														}
//													} else {
//														break;
//													}
//												}
//											}
//										} else {
//											break;
//										}
									}
								} else {
									break;
								}
							}
						} else {
							break;
						}
					}
				} else {
					break;
				}
			}
		}
		lineups.sort(valueComparator);
		for (int x = 0; x < lineups.size(); x++) {
			System.out.println(x + ": " + lineups.get(x).totalSalary());
		}
		
		final long duration = System.nanoTime() - startTime;
		System.out.println(duration);
		System.out.println(operations);
		System.out.println(solutions);
		System.out.println("Max Value: " + maxValue + ", Max Count: " + maxCount);
	}
}
