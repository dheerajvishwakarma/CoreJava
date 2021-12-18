package Exercise;

public class Armstrong {
	public static void main(String[] args) {
		int num=121, rem, result=0;
		
		while (num!=0) {
			rem=num%10;
			result+=Math.pow(rem, 3);
			num/=10;
		}
		if(result==num)
			System.out.println(num+"Number is Armstrong");
		else
			System.out.println(num+"Number is not Armstrong");
			
		}
	}


