package Thread;

public class ThreadInfo {
	
	private static final String index="0";
	
	public static void main(String[] args) {
		Thread t= new Thread("My Thread");
		log(" ",t);
	}

	private static void log(String indent, Thread t) {
		
		
		System.out.println(indent+ "THREAD Name :	"+ t.getName());
		System.out.println(indent+ "ID 			:	"+ t.getId());
		System.out.println(indent+ "Priority 	:	"+ t.getPriority());
		System.out.println(indent+ "State 		:   "+ t.getState());
		
	}

}
