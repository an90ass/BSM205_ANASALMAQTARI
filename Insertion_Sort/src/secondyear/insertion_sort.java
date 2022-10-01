package secondyear;
import java.util.*;
public class insertion_sort {
	public static void main(String[] args) {
              creat_array(100);
	}//endMain
	public static void creat_array(int size) {
		int [] arr = new int [size];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);			
		}//endFor
		time_sorting(arr,"Random");

		for (int i = 0; i < arr.length; i++) {
		arr[i] = i;
		}//endFor
		time_sorting(arr,"Unordered");

		for (int i = arr.length -1; i >= 0; i--) {
			arr[i] = arr.length -i;
		}//endFor
		time_sorting(arr,"Reverse Order");	
	}//endClass creat_array
	
	public static void time_sorting(int[] arr, String s) {
		long start = System.nanoTime();
		insertion_sort2(arr);
		long end = System.nanoTime();
		System.out.println(s + " array run time :" + (end - start));
	}//endClass time_sorting
	
	public static void insertion_sort2(int[] arr) {
		int n = arr.length;
		int j ;
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			j = i-1;
			while(j>0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}//endFor
	}//endClass insertion_sort2
}//endClass insertion_sort
