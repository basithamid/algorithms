import java.util.Scanner;
public class Quicksort {

	public static int partition(int[] arr, int low, int high){
		int pivot = arr[low];
		int i = low+1, j = high;
		int temp;
		while(i <= j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] >= pivot){
				j--;
			}
			if(i <= j){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(i > j){
				temp = arr[j];
				arr[j] = arr[low];
				arr[low] = temp;
			}
		}
		
		return j;
	}
	
	public static void quicksort(int arr[], int low, int high){
		if(low < high){
			int pi = partition(arr, low, high);
			quicksort(arr, low, pi-1);
			quicksort(arr, pi+1, high);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of array:");
		for(int i = 0; i < n; i++){
			System.out.println("arr["+i+"]");
			arr[i] = scan.nextInt();
		}
		quicksort(arr, 0, n-1);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
