import java.util.Scanner;
public class IT24100097LAB4Q1{
public static void main(String[]args){
	int num;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	num = input.nextInt();
	if(num==0){
		System.out.println("Number is zero");
	}
	else if(num>0){
		System.out.println("Number is Positive");
	}
	else{
		System.out.println("Number is Negative");
	}
}
}