import java.util.Comparator;

import Lec50.Cars;

public class CarCompareterSpeed implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o1.speed - o2.speed;
	}

}