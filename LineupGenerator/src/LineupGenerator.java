import java.util.ArrayList;


public class LineupGenerator extends Thread {
	private LineupVector lineup;
	private ArrayList<Player> sgList;
	private ArrayList<Player> sfList;
	private ArrayList<Player> pfList;
	private ArrayList<Player> cList;
	private int salaryRemaining;
	
	public LineupGenerator() {
		this.lineup = new LineupVector();
		sgList = new ArrayList<Player>();
		sfList = new ArrayList<Player>();
		pfList = new ArrayList<Player>();
		cList = new ArrayList<Player>();
		salaryRemaining = 0;
	}
	
	public void setSGList (ArrayList<Player> sgList) {
		this.sgList = sgList;
	}
	
	public void setSFList (ArrayList<Player> sfList) {
		this.sfList = sfList;
	}
	
	public void setPFList (ArrayList<Player> pfList) {
		this.pfList = pfList;
	}
	
	public void setCList (ArrayList<Player> cList) {
		this.cList = cList;
	}
	
	public void setSalaryRemaining (int salaryRemaining) {
		this.salaryRemaining = salaryRemaining;
	}
	
	public void run() {
		
	}
	
}
