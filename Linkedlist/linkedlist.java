package src.Linkedlist;
public  class linkedlist  {
	Node head;
	Node tail;
	Node cuurentnode=head;
	int count=0;
	int size=0;
	int c=0;
	public void addfirst(Object value) {
		Node  node2=new Node(value);
		node2.nextNode=head;
		head=node2;
		if (tail==null) {
			tail=head;
		}
		size++;
		
}
	public void deletefirst() {
		head=head.nextNode;
		size--;
	}
	public void display() {
		Node node=head;
		for(int i=0;i<size-1;i++){
			System.out.print(node.data + "-->");
			node=node.nextNode;

		}

		System.out.print(node.data);
		//System.out.print("null");
	}
	public  void addlast(Object v) {
		Node node2=new Node(v);
		tail.nextNode=node2;
		tail=node2;
		size++;
}

	public void deleteLAST() {
		Node node=head;
		while (node!=null) {
			if (node.nextNode==tail) {
				tail=node;
				node.nextNode=null;
				break;
			}
			node=node.nextNode;
		}
		size--;
}


	public void delete(Node node) {//c--> b-->a-->x-->q-->null {
	Node	node1=head;
	while (node1.nextNode!=null) {
		if (node1.nextNode.data==node.data) {
			node1.nextNode=node1.nextNode.nextNode;
			size--;
			break;
			}
		node1=node1.nextNode;
}
	}
	
	public void middlenode(){
		 cuurentnode=head;
		for(int i=0;i<=(size/2);i++){
			if (i==size/2){
				 if (size%2!=0){
					System.out.println(cuurentnode.data);
					break;
				}
				else if (size%2==0){
					System.out.println(cuurentnode.data);
					break;
				}
		}
	cuurentnode=cuurentnode.nextNode;
}
	}
	public void removeduplicatesnodes(){
		Node node=head;
		Node node1=head;
		while (node!=null) {
			node1=node.nextNode;
			while (node1!=null) {
				if (node.data==node1.data) {
					node1=node1.nextNode;
					delete(node);
				}
				else {
					node1=node1.nextNode;
				}
			}
			node=node.nextNode;
		}
	}
	public void circ(){
		tail.nextNode=head;
		size++;
	}
	public boolean iscirc(){
				Node node=head;
		for(int i=0;i<size;i++){
			if(node.nextNode==null)return false;
			node=node.nextNode;
		}
		return true;

	}
	public  Object thecycleNode(){
		Node[]arr=new Node[size];
		Node node=head;
		for(int i=0;i<size;i++){
			arr[i]=node;
			node=node.nextNode;
		}
		Node cURNode=head;
		int i=0;
		while(true){
			if (arr[i]==tail.nextNode) {
				return i;
			}
			cURNode=cURNode.nextNode;
			i++;
			if(cURNode==null){
				return null;
			}
		}
	}
}