package com.mypackage;

public class Method {
	public static void main(String[] args) {
		System.out.println("Welcome to");
		B obj=new B();
		obj.m1();
		C obj1=new C();
		System.out.println(obj1.m3("Sai", " " + "Krishna"));
		
		
	}

}
class B{
	void m1(){
		System.out.println("JAVA Programming");
		B obj1= new B();
		System.out.println(obj1.m2(5));

		
		
			}
   int m2(int a){
	  return a;
	  
   }

}

class C{
	
	String m3(String firstname, String lastname ){
		return firstname + lastname;
		
		
	}
}

	
