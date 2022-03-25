package com.greatlearning.Question1;

import java.util.Stack;

public class SortStack {
public Stack<Integer> sort(Stack<Integer> input){
		
		Stack<Integer> tempStack = new Stack<Integer>();
		while(!input.isEmpty())
		{
			// pop out the first element
			int tmp = input.pop();
			// While temporary stack is not empty
			// top of stack is greater then temp
			while(!tempStack.isEmpty() && tempStack.peek() > tmp)
			{
				// pop from temporary stack and
				// push it to the input stack
				input.push(tempStack.pop());
			}
			// push temp in temporary of stack
			tempStack.push(tmp);
		}
		input = tempStack;
		return input;
		
	}

}
