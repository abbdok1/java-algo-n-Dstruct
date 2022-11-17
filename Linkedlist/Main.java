package src.Linkedlist;
public class Main {

	public static void main(String[] args) {
		linkedlist lst=new linkedlist();
		lst.addfirst(1);
		lst.addlast(2);
		lst.addlast(3);
		lst.addlast(4);
		lst.circ();
		lst.display();
		System.out.println();
		System.out.println(lst.thecycleNode());

		}
}