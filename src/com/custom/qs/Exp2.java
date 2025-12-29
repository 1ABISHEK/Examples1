package com.custom.qs;

class ArrayQueue {

	int[] arr;

	private int front;

	int rear;

	private int size;

	private int capacity;

	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public int size() {
		return size;
	}

	public void enqueue(int value) {
		if (isFull()) {
			System.out.println("Queue is Full");

			return;
		}
		rear = (rear + 1) % capacity;

		arr[rear] = value;

		size++;

		System.out.println("Enqueued one element: " + value);
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");

			return -1;
		}
		int value = arr[front];
		front = (front + 1) % capacity;
		size--;

		return value;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		return arr[front];
	}
}

public class Exp2 {

	public static void main(String[] args) {
		ArrayQueue data = new ArrayQueue(5);
		
		data.enqueue(10);
		data.enqueue(20);
		data.enqueue(30);
		data.enqueue(40);
		data.enqueue(50);
		data.enqueue(60);
		
		System.out.println("Top Element is :"+data.peek());
		
		data.dequeue();
		data.dequeue();
		
		System.out.println("Top Element is: "+data.peek());
		
		data.enqueue(70);
		data.enqueue(60);
		
		System.out.println("The rear element is: "+data.arr[data.rear]);
	}
}
