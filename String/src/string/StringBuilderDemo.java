package string;

public class StringBuilderDemo {

	public static void main(String[] args) {
	
		
		StringBuffer s1=new StringBuffer("Good Morning");
	   String s2="Good Morning";
	   String s4="shubham";
		
		//System.out.println(s1.delete(0, 3));
		
		//s1.replace(0, 4, "Nighj");
		System.out.println(s1);
		//System.out.println(s1.append(s2));
		System.out.println(s1.equals(s2));
		
		String s3=s2+s1;
		System.out.println(s3);
		
	     System.out.println(s2.concat(s4));
	     
	     
		
		

	}

}
