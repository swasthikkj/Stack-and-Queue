package com.stackqueue;

import java.util.Scanner;

public class ImplementationQueue {
	public static void main(String[] args) {
		SingleLinkedList stack = new SingleLinkedList();
		int choice;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Welcome to Menu of Queue");
			System.out.println("1. Enque");
			System.out.println("2. Display Linked List");
			System.out.println("3. Deque Element");
			System.out.println("4. Exit");

			choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("Enter The Element to insert");
				int num = scan.nextInt();
				stack.append(num);
			}

			else if (choice == 2) {
				stack.display();
			}

			else if (choice == 3) {
				stack.popLastElement();
			}

			System.out.println();
		}

		while(choice != 4);
	}
}
