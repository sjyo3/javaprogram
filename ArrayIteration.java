package package1;

public class ArrayIteration {
	public static void main(String[] args) {
		 
		String a= "This is, a Java, Program ";
		String[] b = a.split(" ");
		
		
		for (int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	
	int[] c=new int[5];
	c[0]=2;
	c[1]=4;
	c[2]=6;
	c[3]=8;
	
	
	for (int i=0; i<c.length; i++)
	{
	System.out.println(c[i]);
	}
	}

}
