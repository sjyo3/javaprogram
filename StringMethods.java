package package1;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s = "sai Krishna";
		String s1= "Jyothirmayi";
		String s2 = "Pranav Teja";
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s2.contains("sai"));
		System.out.println(s2.contains("Teja"));
		System.out.println(s.concat("Garik"));
		
		String s3=" We, Three, are, one, batch";
		String[] sp = s3.split(",");
		System.out.println(sp[3]);
		System.out.println(sp[0] + sp[1] + sp[2] + sp[3] + sp[4]);
		
		
		
		
		
		
	}

}
