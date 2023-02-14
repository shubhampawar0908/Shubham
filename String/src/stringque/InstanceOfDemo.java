package stringque;

class Happy
{
      void show()
      {
    	  System.out.println("not happy");
      }
}

class NotHappy extends Happy
{
	void display()
	{
		System.out.println("Still Happy");
	}
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		
		
		Happy h=new Happy();
		NotHappy n=new NotHappy();
		
		
		System.out.println(n instanceof Happy);
		
		
		System.out.println(h instanceof NotHappy);

	}

}
