package javaBasicConcepts;

import java.util.Arrays;

public class ArrayExamples {

	public ArrayExamples() {
		
	}
	public static int sum(int start,int end) {
		if(end>start) {
			return end + sum(start,end-1);
		}
		else {
			return end;
		}
	}
	
	public static int duplicateElements(int sArr[]) {
	int count=0;
	for(int i=0;i<sArr.length;i++) {
		for(int j=i+1;j<sArr.length;i++) {
			if(sArr[j]==sArr[i]) {
				count++;
				break;
				
			}
			
		}
	}
	 System.out.println("repeated is:"+count);
	 return 0;
	}

	public static void main(String[] args) {
		
	//sample sort	
int arr[]= {12,34,23,11,5};
Arrays.sort(arr);
for(int i:arr) {
	System.out.println("sorted array is"+i);
}

//reverse a number
for(int j=arr.length-1;j>=0;j--) {
	System.out.println(arr[j]);
}

//using recursion: function declaration in main methods
int result = sum(50,100);
System.out.println("total btw the no. is :"+result);

//finding duplicated elements in an array
int sampleArray[]= {2,4,2,5,2};
duplicateElements(sampleArray);
}
	}


