package linkedList;

//linkedlist implements list and dequeue interface where ll contains links with node having 3 fields prev,

//data,next and its not synchronized and default size is 0 and can dynamically expand. 

//doubly and circular linked list have the last node pointing to the address of first node.

public class LinkedListImpl {

	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println("nodes data are: " + node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public void showNext(String s) {
		String str=s.toUpperCase();
		System.out.println("upperCase: "+s+" letter is: "+str);
	}

	public static void main(String[] args) {
		LinkedListImpl l = new LinkedListImpl();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.show();
		
		String st="karthik";
		l.showNext(st);

	}
}
