package src.abbas;
public class binarysearch {
	public static int Search(int[]arr,int target, int low, int high) {
		int mid=Math.round(low+(high-low)/2); 
		if(high-low==1){//base case
			return 0;
		} 
		if(target >arr[mid]){
			return  Search(arr, target,mid,high);
		}
		else if (target < arr[mid]){
			return  Search(arr, target, low, mid);
		}
		else{
			return 1;
		}
}
public static void main(String[] args)
 {
	int[]arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	System.out.println(Search(arr,0,0,arr.length-1));
	
}

}