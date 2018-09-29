package backend;

import java.util.Stack;

public class PostfixEvaluator {
	public PostfixEvaluator() {}
	
	public String evaluate(String postfixString) {
		
		Stack<Double>stack= new Stack();
		String finalResult="";
		Calculations calculations= new Calculations();
		
		for (char token:postfixString.toCharArray()) {
			if ("+-/*".indexOf(token)!=-1) {
				double second=stack.pop();
				double first=stack.pop();
				switch (token) {
				case '+':
					stack.push(calculations.add(second,first));
					break;
				case '-':
					stack.push(calculations.subtract(first,second));
					break;
				case '*':
					stack.push(calculations.multiply(first,second));
					break;
				case '/':
					stack.push(calculations.divide(first,second));
					break;
				default:
					System.out.println("Please enter a valid number");
					break;
				}	
				
			}
			else {
				stack.push((double)Character.getNumericValue(token));
	
			}
		}
		return finalResult=stack.pop().toString();
	}

}
