import java.util.Comparator;

public class CarCompareterColor implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o1.color.compareTo(o2.color);
	}

}