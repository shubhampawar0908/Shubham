package stringassignment1;

public class Ass7 {

	public static void main(String[] args) {
		String str = "India is my country";  
        System.out.println(charRemoveAt(str, 7));  
        System.out.println(str.substring(0, 4));
        
       System.out.println( str.toCharArray());
       System.out.println(str.valueOf("I"));
	} 
	      
	public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);
	}
	

	
}

