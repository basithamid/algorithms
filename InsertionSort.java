import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void printArr(int n, int[] arr){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void insertionSort2(int n, int[] arr) {
        // Complete this function
        for(int i = 1; i < n; i++){
            int temp = arr[i];
            for(int j = i - 1; j >= 0; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                else
                    break;
            }
            printArr(n,arr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }
}
