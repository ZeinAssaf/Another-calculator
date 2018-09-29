package backend;

public class Calculations {

	public  double add(Double first,Double second) {
		return first+second;
	}
	public  double subtract(Double first,Double second) {
		return first-second;
	}
	public  double multiply(Double first,Double second) {
		return first*second;
	}
	public  double divide(Double first,Double second) {
		if (second==0) throw new ArithmeticException();
		else {
			return first/second;
		}
		
	}
}
