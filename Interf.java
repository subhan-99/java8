package features;

public interface Interf {
	
	default void m1()
	{
		System.out.println("Default method");
		
	}
	
	class Test implements Interf
	{
		
		public void m1()
		{
			System.out.println("Overriding version of default method");
		}
		public static void main(String[]args)
		{
			Test t = new Test();
			t.m1();
		}
	}

}
