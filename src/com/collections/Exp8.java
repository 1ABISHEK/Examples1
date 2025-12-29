package com.collections;

class StackArray {
	private int maxSize;
	private int[] arr;
	private int top;

	public StackArray(int size) {
		this.maxSize = size;
		this.arr = new int[maxSize];
		this.top = -1;
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack OverFlow");
			return;
		}
		arr[++top] = value;

		System.out.println("Element added in top position: " + value);

	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int tp = arr[top];
		top--;

		System.out.println("Popped Element: " + tp);

		return tp;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack UnderFlow unable to fetch data");

			return -1;
		}
		return arr[top];
	}
}

public class Exp8 {

	public static void main(String[] args) {

		StackArray obj = new StackArray(5);

		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);
		obj.push(55);
		obj.push(66);

		System.out.println(obj.peek());

		obj.pop();

	}
}
