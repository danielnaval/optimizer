import java.util.Comparator;


public class LineupValueComparator implements Comparator<LineupVector>{

	@Override
	public int compare(LineupVector o1, LineupVector o2) {
		return o2.totalValue() - o1.totalValue();
	}

}
