package src.abbas;

public class recursion {

	public static void main(String[] args) {
		System.out.println(factorial(5));
}

	public static void print(int i) {
		if (i==0) {
			return;
		}
		else {
			print(i-1);
			System.out.println("print " + i);
			
		}
	}
	

/*	private static int add1(int num) {//5 as parameter 
		if (num==0)return 0;
		else {
			return num +add1(num-1);
		}
	}

*/	
	
	
	
	public static int sum1(int n1,int n2) {/*
	sum numbers from range n1 to n2 
	Assume  the range is(1,2);
	n1=1
	n2=2
	*/
		if (n1==n2) {//check if 1==2
			return n1;//if yes return n1) 
		}
		else {
			return n1 +sum1(n1+1, n2);/*
			else return 1+sum1(2,2);invoke sum1 again
			              +is 2==2:
			              +yes:return 2
			              sum1(2,2)=2
			   1+sum1(2,2)=1+2=3           
	
			*/
		}
		
	}
	public  static int factorial(int num){
		if(num==1){
			return 1;
		}
		else{
			return factorial(num-1)*num;
		}

	}
}