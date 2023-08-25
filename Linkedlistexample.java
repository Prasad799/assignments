package myWork;
	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	    public LinkedList() {
	        this.head = null;
	    }

	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}

	public class Linkedlistexample {
	    public static void main(String[] args) {
	        LinkedList linkedList = new LinkedList();
	        linkedList.insert(10);
	        linkedList.insert(20);
	        linkedList.insert(30);

	        System.out.println("Linked List elements:");
	        linkedList.display();
	    }
	}

