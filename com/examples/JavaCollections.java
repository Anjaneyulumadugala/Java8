package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class JavaCollections {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <=100; i++)
			numbers.add(i);

		// traverse using Iterator
		Iterator<Integer> numIterator = numbers.iterator();
		while (numIterator.hasNext()) {
			Integer i = numIterator.next();
			System.out.println("Using Iterator ::" + i);
		}

		// traverse through forEach method of Iterable with anonymous class
		numbers.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println("Using ForEach loop from java8::" + i);
			}
		});

		// traversing with Consumer interface implementation
		CustomConsumer action = new CustomConsumer();
		numbers.forEach(action);
	}
}

// Consumer implementation that can be reused
class CustomConsumer implements Consumer<Integer> {
	public void accept(Integer i) {
		System.out.println("Using Consumer implementation from java8::" + i);
	}
}