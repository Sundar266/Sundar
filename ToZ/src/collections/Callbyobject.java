package collections;

public class Callbyobject {
	
       int a;
       int b;
       
       public Callbyobject(int a, int b) {
    	   this.a = a;
    	   this.b =b;
       }

	
	public void add() {
		int c= a+b;
		System.out.println("The addition value  of C is:\t" +c);
	}

}
