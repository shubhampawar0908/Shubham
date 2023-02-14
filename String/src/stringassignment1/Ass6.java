package stringassignment1;

public class Ass6 {

	public static void main(String[] args) {
		
		int n=0;
		String S3="WAP to count the number of words in a given string sentence with and without built-in function";
		for(int i=0;i<S3.length();i++) {
			if (S3.charAt(i)==' ') {
				n=n+1;
			}
		}
		System.out.println("Count of the number is "+(n+1));

	}

}
