package stringassignment1;



public class ass2 {

	public static void main(String[] args) {
		String str = "Shubham";
		  String revString = "";

		  for (int i = str.length() - 1; i >= 0; --i) {
		   revString += str.charAt(i);
		  }

		  System.out.println(revString);

	}

}
