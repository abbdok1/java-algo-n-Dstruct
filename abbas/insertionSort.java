package src.abbas;

public class insertionSort {
	public static void insertionsort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp=arr[i];
			int j=i-1;
			while (j>=0 &&arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
		}


}
}