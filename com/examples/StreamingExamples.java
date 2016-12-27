package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamingExamples {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			myList.add(i);

		// sequential stream
		Stream<Integer> seqStream = myList.stream();

		// parallel stream
		Stream<Integer> paraStream = myList.parallelStream();

		// using lambda with Stream API, filter example
		Stream<Integer> parallel = paraStream.filter(num -> (num > 10 && num < 30));
		// using lambda in forEach
		parallel.forEach(p -> System.out.println("parallel values=" + p));

		Stream<Integer> sequence = seqStream.filter(n -> (n>55 && n<71));
		sequence.forEach(p -> System.out.println("sequential values=" + p));

	}

}