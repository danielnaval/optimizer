import java.util.Comparator;


public class PlayerSalaryComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		return o2.getSalary() - o1.getSalary();
	}

}
