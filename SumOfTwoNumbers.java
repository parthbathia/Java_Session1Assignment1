import java.util.Scanner;
class SumOfTwoNumbers{

	public static void main(String[] args){
		// Scanner is used for User-Input In Java
              Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number")      
		int a = sc.nextInt();
		System.out.println("Enter your second number")
                int b = sc.nextInt();
		int c = a+b;
		System.out.println("The addition of numbers is : " + c);
	}

}
