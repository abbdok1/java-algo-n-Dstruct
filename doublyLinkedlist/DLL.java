package src.doublyLinkedlist;
public class DLL{
	Node head;
	Node tail;
public	DLL(Node head) {
	this.head=head;
	head.previuousNode=null;
	tail=this.head;
}
public void addfirst(Node node) {
	head.previuousNode=node;
	node.nextNode=head;
	head=node;
	
}
public void deletelast( )
{Node node=tail;
tail=tail.previuousNode;
node.previuousNode=null;
tail.nextNode=null;
}
public void display() {
Node node=head;
while(node!=null) {
	System.out.print(node.data+ "<-->");
	node=node.nextNode;
}
System.out.print("null");

}
public void addlast(Node node) {
	tail.nextNode=node;
	node.previuousNode=tail;
	tail=node;
} 
public void add(Node node,Node wantNodetoreplace) {
	Node head=this.head;
	while(head.nextNode!=null) {
		if (head.nextNode==wantNodetoreplace) {
			Node tempNode=head.nextNode;
			head.nextNode=node;
			node.previuousNode=head;
			tempNode.previuousNode=node;
			node.nextNode=tempNode;
			break;
		}
		head=head.nextNode;
	}
	}
public void delete(Node node) {
Node nod=head;
	while(nod.nextNode!=null) {
		if (nod.nextNode==node) {
			Node P=nod.nextNode.nextNode;
			nod.nextNode=nod.nextNode.nextNode;
			P.previuousNode=P.previuousNode.previuousNode;
			
			break;

	}
		nod=nod.nextNode;
	
	
	}
}
public void deletefirst() {
	head=head.nextNode;
	head.previuousNode=null;
}
}