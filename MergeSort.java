import java.util.*;
public class MergeSort {

	public static void merge(int arr[], int s, int m, int l){
		int i, j, k;
		int n1 = m - s + 1;
		int n2 = l - m;
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(i = 0; i < n1; i++)
			L[i] = arr[s + i];
		for(j = 0; j < n2; j++)
			R[j] = arr[m + 1 + j];
		
		i = j = 0;
		k=s;
		while(i < n1 && j < n2){
			if(L[i] <= R[j])
				arr[k] = L[i++];
			else
				arr[k] = R[j++];
			k++;
			
			
		}
		while(i < n1)
			arr[k] = L[i++];
		while(j < n2)
			arr[k] = R[j++];
		
	}
	
	public static void mergeSort(int arr[], int s, int l){
		if(s < l){
			int m = (s + l)/2;
			mergeSort(arr, s, m);
			mergeSort(arr, m+1, l);
			merge(arr, s, m, l);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements");
		for(int i = 0; i < n ; i++){
			arr[i] = scan.nextInt();
		}
		mergeSort(arr, 0, n-1);
		for(int i = 0; i < n; i++){
			System.out.println(arr[i]);
		}
	}

}
