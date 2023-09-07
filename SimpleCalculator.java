import java.util.*;

class FirstClass {
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter first number");
    	int a = sc.nextInt();
    	System.out.println("Enter operator");
    	String x = sc.next();
    	System.out.println("enter eecond number");
    	int b = sc.nextInt();
    	
    	if (x.equals("+")) {
    		System.out.println(a+b);
    	}
    	else if (x.equals("-")) {
    		System.out.println(a-b);
    	}
    	else if (x.equals("*")) {
    		System.out.println(a*b);
    	}
    	else if (x.equals("/")) {
    		System.out.println(a/b);
    	}
    	else if (x.equals("%")) {
    		System.out.println(a%b);
    	}
    	else {
    		System.out.println("Wrong input");
    	}
    	
    	
    	
    }
}
