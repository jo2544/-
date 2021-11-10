package application;

public class CalModel {

	public int calculate(String op, int x, int y) {		
		int result = 0;
		
		if(op == "+") {
			result = x + y;
		} else if(op == "-") {
			result = x - y;
		} else if(op == "*") {
			result = x * y;
		} else {
			result = x / y;
		}
		return result;
	}
}
