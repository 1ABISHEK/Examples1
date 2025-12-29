package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;




class Book{
	private int id;
	
	private String name;
	
	private int price;

	public Book(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}

public class Exp1 {

	public static void main(String[] args) {
		
		List<Book> data = Arrays.asList(
				new Book(101,"java",340) ,
				new Book(201,"php",10),
				new Book(501,"python",43),
				new Book(401,"kotlin",25),
				new Book(301,"core java",55));
		
		//Function Interface Order
//		data.stream().sorted(Comparator.comparing(Book :: getId));
		
		Function<Book, String> fnf = Book::getName;
		Function<Book, Integer> fni = Book::getId;
		Function<Book, Integer> fnp = Book::getPrice;
		
		data.stream().sorted(Comparator
				.comparing(fnp)
				.thenComparing(fni)
				.thenComparing(fnf)).forEach(System.out::println);
		
		Supplier<Double> dt = () -> Math.random();
		
		System.out.println(dt.get());
		
		Map<Book, Integer> mp = new HashMap<>();
		
		for(Book bk : data) {
			mp.put(bk, bk.getId());
		}
		
		Map<Integer, String> mp1 = data.stream().collect(Collectors.toMap(Book::getId, Book::getName));
		
		
		
	}

}
