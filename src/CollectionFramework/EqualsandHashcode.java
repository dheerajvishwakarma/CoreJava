package CollectionFramework;

public class EqualsandHashcode {
	public static void main(String[] args) {
	
		String s1 = "Dheeru";
		String s2 = "Dheeru";
		String s3 = "dheeru";
		

		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println("Hash Code of s1 : " + s1.hashCode());
		System.out.println("Hash Code of s2 : " + s2.hashCode());
		System.out.println("Hash Code of s3 : " + s3.hashCode());
		
		
		Integer h= 5; //   for hash code integer is warper class for primitive data type we can use  Integer
		System.out.println("Hash Code of h : "+h.hashCode());
	}

}
