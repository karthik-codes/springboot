package basics;

import java.util.Arrays;
import java.util.Collections;

public class ReverseNumber {
	
	public static void reverseNumber(int[] arr) {
		int len=arr.length;
		
		for(int i=len-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void reverseArrayAsList(int[] arr) {
		Collections.reverse(Arrays.asList(arr));
		System.out.println("Reversed Array:" + Arrays.asList(arr));
		//Arrays.asList(arr).stream().forEach(x->System.out.println(x.toString()));
	}

	public static void main(String[] args) {
		int[] numArray= {4,5,8,9,2,3}; 
		
//reverseNumber(numArray);
reverseArrayAsList(numArray);
	}

}
