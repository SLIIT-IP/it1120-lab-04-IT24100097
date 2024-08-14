import java.util.Scanner;
public class IT24100097LAB4Q3{
public static void main(String[]args){
	int num;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	num = input.nextInt();
	String res = (num==0)? "Number is zero" : (num>0)? "Number is Positive" : "Number is Negative";
	System.out.println(res);
 }
}