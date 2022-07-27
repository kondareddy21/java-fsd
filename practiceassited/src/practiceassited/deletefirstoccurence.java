package practiceassited;

import java.util.NoSuchElementException;

public class deletefirstoccurence {
	public class LinkedList<T> {
		
		private Node<T> head;
		
		//This internal class represents Node in Linked List
		private static class Node<T>{
			
			private T data;
			private Node<T> next;
			public Node(T data) {
				super();
				this.data = data;
				this.next = null;
			}
		}
		
		
public void insert(T data) {
			Node<T> newNode = new Node<T>(data);
			if(head == null) {
				head = newNode;
			}else {
				Node<T> currentNode = head;
				while (currentNode.next != null) {
					currentNode = currentNode.next;
				}
				 currentNode.next = newNode;
			}
		}
		
		public T removeFirst() {
			if(head == null) {
				throw new NoSuchElementException("List is Empty!!");
			}
			
			Node<T> tempNode = head;
			T result = tempNode.data;
			head = head.next;
			tempNode.next = null;
			return result;
		}
		
		
		public void displayLinkedList() {
			Node<T> currentNode = head;
			while(currentNode!= null) {
				System.out.print(currentNode.data+" ");
				currentNode = currentNode.next;
			}
		}
		
		public static void main(String[] args) {
			
			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.insert(10);
			linkedList.insert(20);
			linkedList.insert(30);
			linkedList.insert(40);
			linkedList.insert(50);
			linkedList.insert(60);
			
			System.out.println("Original LinkedList:");
			linkedList.displayLinkedList();
			System.out.println();
			Integer removeFirst = linkedList.removeFirst();
			System.out.println("After removing first Elememnt:"+removeFirst);
			linkedList.displayLinkedList();
			
		}
	}
}