
public class LineupVector {
	private Player pg, sg, sf, pf, c, f, g, flex;
	
	public LineupVector() {
		this.pg = null;
		this.sg = null;
		this.sf = null;
		this.pf = null;
		this.c = null;
		this.g = null;
		this.f = null;
		this.flex = null;
	}
	
	public LineupVector(Player pg, Player sg, Player sf, 
			Player pf, Player c, Player g,
			Player f, Player flex) {
		this.pg = pg;
		this.sg = sg;
		this.sf = sf;
		this.pf = pf;
		this.c = c;
		this.g = g;
		this.f = f;
		this.flex = flex;
	}
	
	public Player getPG() {
		return pg;
	}
	
	public void setPG(Player pg) {
		this.pg = pg;
	}
	
	public Player getSG() {
		return sg;
	}
	
	public void setSG(Player sg) {
		this.sg = sg;
	}
	
	public Player getSF() {
		return sf;
	}
	
	public void setSF(Player sf) {
		this.sf = sf;
	}
	
	public Player getPF() {
		return pf;
	}
	
	public void setPF(Player pf) {
		this.pf = pf;
	}
	
	public Player getC() {
		return c;
	}
	
	public void setC(Player c) {
		this.c = c;
	}
	
	public Player getG() {
		return g;
	}
	
	public void setG(Player g) {
		this.g = g;
	}
	
	public Player getF() {
		return f;
	}
	
	public void setF(Player f) {
		this.f = f;
	}
	
	public Player getFlex() {
		return flex;
	}
	
	public void setFlex(Player flex) {
		this.flex = flex;
	}
	
	public int totalSalary() {
		int total = 0;
		if (pg != null)
			total += pg.getSalary();
		if (sg != null)
			total += sg.getSalary();
		if (sf != null)
			total += sf.getSalary();
		if (pf != null)
			total += pf.getSalary();
		if (c != null)
			total += c.getSalary();
		if (g != null)
			total += g.getSalary();
		if (f != null)
			total += f.getSalary();
		if (c != null)
			total += c.getSalary();
		if (g != null)
			total += g.getSalary();
		if (f != null)
			total += f.getSalary();
		if (flex != null)
			total += flex.getSalary();
		return total;
	}
	
	public int totalValue() {
		int total = 0;
		if (pg != null)
			total += pg.getValue();
		if (sg != null)
			total += sg.getValue();
		if (sf != null)
			total += sf.getValue();
		if (pf != null)
			total += pf.getValue();
		if (c != null)
			total += c.getValue();
		if (g != null)
			total += g.getValue();
		if (f != null)
			total += f.getValue();
		if (c != null)
			total += c.getValue();
		if (g != null)
			total += g.getValue();
		if (f != null)
			total += f.getValue();
		if (flex != null)
			total += flex.getValue();
		return total;
	}
	
}
