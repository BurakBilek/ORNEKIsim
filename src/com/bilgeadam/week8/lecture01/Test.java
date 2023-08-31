package com.bilgeadam.week8.lecture01;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// Stack ->>> LIFO ->> Last in first out
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1); // 1 sayisini stack e ekler
		stack.push(2); // 2 sayisini stack'e ekler.Genellikle stacklerde ekleme işlemi push kullanılır.

		stack.peek(); // Stack'e en son eklenen değeri , stack'ten çıkarmadan getirir.

		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println();

		stack.pop(); // Stack'e en son eklenen değeri getirir ve stack ten çıkarır.
		System.out.println(stack.pop());
		System.out.println(stack);

		// stack.pop(); Stack'e eleman kalmamis
	}

}
