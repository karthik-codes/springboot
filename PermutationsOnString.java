package basics;

public class PermutationsOnString {
	
	public static void givePermutation(String str,String answer) {
		 if (str.length() == 0)
		    {
		        System.out.print(answer + "  ");
		        return;
		    }
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
		    String left_substr = str.substring(0, i);
	        String right_substr = str.substring(i + 1);
	        String rest = left_substr + right_substr;
			givePermutation(rest,answer+ch);
		}
		
	}

	public static void main(String[] args) {
		givePermutation("abb","");

	}

}
