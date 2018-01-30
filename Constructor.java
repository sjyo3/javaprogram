package com.mypackage;

public class Constructor {
	Constructor(){
		System.out.println("Good Morning");
	}
   Constructor(int a){
	   System.out.println(a);
   }
   Constructor(int a, int b){
	   System.out.println(a);
	   System.out.println(b);
   }
   Constructor(int id, String s, int salary ){
	   System.out.println(id + " " + s + " " + salary);
   }

   public static void main(String[] args) {
	Constructor obj=new Constructor();
	Constructor obj1=new Constructor(3);
	Constructor obj2=new Constructor(5,1994);
	Constructor obj3=new Constructor(14, "Sai", 90);
}
}
