package basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FourthLargestNoInArray {
	
	public static void findFourthLargest(int numArr[],int index) {
		
		Arrays.sort(numArr);
	int size=numArr.length;
	System.out.println(numArr[size-index]);
	}
   public static void main(String[] args) {
		int[] numArr= { 1,10,5,45,26,2,2,10};
		findFourthLargest(numArr,4);
	}

}
