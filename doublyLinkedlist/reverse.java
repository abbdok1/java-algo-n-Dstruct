package src.doublyLinkedlist;

import src.Linkedlist.linkedlist;

public class reverse {
public static void main(String[] args) {
	linkedlist linkedlist1=new linkedlist();
	Node node=new Node('a');
	Node node1=new Node('b');
	Node node2=new Node('c');
	linkedlist1.addfirst(node2.data);
	linkedlist1.addfirst(node1.data);
	linkedlist1.addfirst(node.data);
	linkedlist1.display();// a-->b-->c-->d:b-->a
	
}

}
