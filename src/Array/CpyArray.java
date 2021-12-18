package Array;

public class CpyArray {
	public static void main(String[] args) {
	
		char[] ch   = {'a','b','c','d','e','f','g'};
		char[] bb = new char[9];
    System.arraycopy(ch, 01, bb, 0, 6);
	     for(char w:bb) {
		System.out.println(w);
	}
	}

}
