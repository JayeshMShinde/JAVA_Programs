package Second_day;
import java.util.Scanner;

public class Switch_case {

	void  addition() {
		int a ,b,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number:");
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a+b;
		System.out.println("Adiition is :"+sum);
	}
	void  Substraction() {
		int a ,b,sub=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number:");
		a = sc.nextInt();
		b = sc.nextInt();
		sub = a-b;
		System.out.println("Substraction is :"+sub);
	}
	void  Division() {
		int a ,b,div=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number:");
		a = sc.nextInt();
		b = sc.nextInt();
		div = a/b;
		System.out.println("Division is :"+div);
	}
	void  Multiplication() {
		int a ,b,mul=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number:");
		a = sc.nextInt();
		b = sc.nextInt();
		mul = a*b;
		System.out.println("Multiplication is :"+mul);
	}
	void switch_case_ex() {
		int ch;
		Scanner s2 = new Scanner(System.in);
		System.out.print("\n 1.Addition \n 2.Subtraction \n 3.Division \n 4.Multipication");
		System.out.println("\n Enter the choice :");
		ch = s2.nextInt();
		switch(ch) {
		
		case 1 :
				addition();
				break;
		case 2:
				Substraction();
				break;
		case 3:
				Division();
				break;
		case 4:
				Multiplication();
				break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch_case sc1 = new Switch_case();
		sc1.switch_case_ex();
		Scanner st= new Scanner(System.in);
		System.out.print("Do you want to continue (Y/N) :");
		String c;
		c ="";
		c = st.nextLine();
		System.out.println(c);
		if(c== "y" || c=="Y") 
		{
			sc1.switch_case_ex();
		}
		else if(c=="n" || c=="N") 
		{
			System.out.println("Thank to visit");
		}
		else 
		{
			System.out.println("Invalid Choice");
		}
	}

}
