package src.doublyLinkedlist;
public class mmmm {
	public static void main(String[] args) {
		Node node=new Node(5);
		Node node2=new Node(6);
		Node node3=new Node(10);
		DLL dll=new DLL(node);
		dll.addfirst(node2);
		dll.addfirst(node3);
		dll.addfirst(new Node(1));
		dll.delete(node2);
		dll.deletefirst();
		dll.display();
		
}

}
