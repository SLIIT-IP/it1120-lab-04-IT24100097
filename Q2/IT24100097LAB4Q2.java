import java.util.Scanner;
public class IT24100097LAB4Q2{
public static void main(String[]args){
	int emarks;
	int lmarks;
	int eper;
	int lper;
	double fin;
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter exam marks");
	emarks = input.nextInt();
	if(emarks>=0&&emarks<=100){
			System.out.println("Please enter lab sumbisson marks");
			lmarks = input.nextInt();
			if(lmarks>=0 && lmarks<=100){
				System.out.println("Please enter the percentage given for the exam");
				eper = input.nextInt();
				System.out.println("Please enter the percentage given for the lab subbmisson");
				lper = input.nextInt();
				if(eper+lper==100){
					fin = ((emarks*eper/100)+(lmarks*lper/100));
					System.out.println("Final Exam Marks is : "+ fin);
				}
				else{
					System.out.println("The percentages must add up to 100. Terminatng program");
				}
			}
			else{
				System.out.println("Invaild input for lab subbmisson marks. Teminating program.");
			}
	}
	else{
		System.out.println("Invaild input for exam marks. Teminating program.");
	}
	
 }
}