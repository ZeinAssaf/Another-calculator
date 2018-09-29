package backend;

import java.util.Stack;

public class Postfix {
	public Postfix() {}	
	
	public String convertToPostfix(String stringOperation) {
		String postfixString="";
		
		Stack<Character> operatorStack=new Stack<Character>();
		char[] characterOperation=stringOperation.toCharArray();
		
		for (int i=0;i<characterOperation.length;i++) {
			
			if (Character.isDigit(characterOperation[i])) {
				postfixString+=Character.toString(characterOperation[i]);
			}
			else if (characterOperation[i]=='+'|
					characterOperation[i]=='-'|
					characterOperation[i]=='*'|
					characterOperation[i]=='/') {
				switch (characterOperation[i]) {
				case '+':
					while(!operatorStack.empty()) {
						postfixString+=operatorStack.pop();
					}operatorStack.push(characterOperation[i]);
					break;
				case '-':
					while(!operatorStack.empty()) {
						postfixString+=operatorStack.pop();
					}operatorStack.push(characterOperation[i]);
					break;
				case '*':
					if (isSuperior(operatorStack)) {
						postfixString+=operatorStack.pop();
						operatorStack.push(characterOperation[i]);
					}
					else {
						operatorStack.push(characterOperation[i]);
					}
					break;
				case '/':
					if (isSuperior(operatorStack)) {
						postfixString+=operatorStack.pop();
						operatorStack.push(characterOperation[i]);
					}
					else {
						operatorStack.push(characterOperation[i]);
					}
					break;
				default:
					break;
				}
				
			}
			
			else {
				System.out.println("Please enter a valid input");
			}
			
		}
		while(!operatorStack.empty()) {
			postfixString+=operatorStack.pop();
		}
		System.out.println(postfixString);
		return postfixString;
		
	}
	public Boolean isSuperior(Stack<Character> stack) {
		
		while (!stack.empty()) {
			if (stack.peek()=='/'|stack.peek()=='*') {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

}
