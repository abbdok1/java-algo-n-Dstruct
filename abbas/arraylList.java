package src.abbas;
public class arraylList<N> {
	Object []Array;
	int size=0;
	int capacity=10;
	public arraylList() {
		this.Array=new Object[capacity];	
	}
	public arraylList(int capacity) {
		this.Array=new Object[this.capacity=capacity];
}
	public boolean isEmpty() {
	return size==0;
	}
	public void add(Object data) {
		if (size>=capacity) {
			grow();
}
		Array[size]=data;
		size++;}
	
	public void insert(int index,Object data) {
		if (size>=capacity) {
			grow();
}
		for (int i = size;i>index ; i--) {
			Array[i]=Array[i-1];
		}
		Array[index]=data;
		size++;
	}
	public String tostring() {
		StringBuilder string= new StringBuilder();
		for (int i = 0; i < capacity; i++) {
			string.append(Array[i]).append(",");
			
		}
		
		return "["+ string + "]";
	}
	private void grow() {
		int newcapacity= (int)capacity *2;
		Object[]newarray=new Object[newcapacity];
		for(int i=0;i<size;i++) {
			newarray[i]=Array[i];
		}
		Array=newarray;
		capacity=newcapacity;
	}
	public void delete2(Object data ) {
		for (int i = 0; i < size; i++) {
		if(Array[i]==data) {
			for (int j = 0; j < size-i-1; j++) {
				Array[i+j]=Array[i+j+1];
				
			}
		}
		}
		Array[size-1]=null;
		size--;
	}
	public int search1(Object data) {
		for (int i = 0; i < size; i++) {
			if (Array[i] == data) {
				return i;
			}
		}
		return -1;
	}
}
