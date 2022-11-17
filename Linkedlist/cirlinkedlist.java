package src.Linkedlist;

public class cirlinkedlist {
	Node head;
	Node tail;
	int size;
	public cirlinkedlist(Node head) {
		this.head=head;
		tail=this.head;
		size++;
}
	public void addfirst(Node node) {
		Node node2=head;
		head=head.nextNode;
		head=node;
		head.nextNode=node2;
		tail.nextNode=head;
		size++;
}
	public void display() {
		Node n=head;
		for (int i = 0; i <size; i++) {
			System.out.print(n.data + "-->");
			n=n.nextNode;
		}
		System.out.print(n.data);
		
}
public void deletefirst() {
	head=head.nextNode;
	tail.nextNode=head;
	size--;
	
}	
public void delete(Node node) {
	Node node2=head;
	for (int i = 0; i < size; i++) {
		if (node2.nextNode==node) {
			node2.nextNode=node2.nextNode.nextNode;
			size--;
			 break;
		}
	}	
}
}