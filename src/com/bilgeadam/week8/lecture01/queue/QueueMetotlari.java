package com.bilgeadam.week8.lecture01.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMetotlari {

	public static void main(String[] args) {

		// Queue FIFO --> First in First out prensibiyle isler. Yani ilk gelen, ilk
		// çikar.

		Queue<Integer> queue = new LinkedList<>();
		// [ ] [-1] [ ] [ ] [-2-] [-3-]

		queue.offer(2); // sıraya bir eleman ekler.
		queue.add(2); // siraya bir eleman ekler.
		queue.peek(); // sıradaki ilk ogeyi gösterir.Herhangi bir işlemm yapmaz.
		queue.poll(); // siradaki ilk ogeyi dondurur ve sıradan çıkarır.
		queue.isEmpty(); // sirada eleman kalıp kalmadığını gösterir.

	}

}
