package src.abbas;
public class sort {
	public static void QUICKSORT(int[]arr, int start,int end){
		 if (end<=start) return;
		 int pivot = partion(arr,start,end);
		 QUICKSORT(arr, pivot +1, end);//left side
		 QUICKSORT(arr, start, pivot -1);//right side 
	}

	private static int partion(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i=  start-1;
		for (int j = start; j <=end; j++) {//[3,2,5,6]->
			if (arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j] =temp;
				}
			}
		int temp =arr[i+1];
		arr[i+1]= arr[end];
		arr[end] = temp;
		return i+1;
	}
}
