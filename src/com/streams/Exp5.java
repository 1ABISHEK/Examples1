package com.streams;

import java.util.stream.Stream;

public class Exp5 {

	public static void main(String[] args) {

		Stream<Number> strm = Stream.of(10, 20, 30, 40);

		Stream<String> names = Stream.of("sky", "kohli", "dravid", "rohit", "dhoni");

		Stream.of(2, 4, 5, 6, 4).findAny().ifPresent(System.out::println);

		Stream.of("java", "python").parallel().findAny().ifPresent(System.out::println);

		names.parallel().sorted().forEach(System.out::println);

	}
}
