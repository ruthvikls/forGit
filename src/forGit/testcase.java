package forGit;

import java.util.Scanner;

public class testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age:");
	age= s.nextInt();
if(age>18){
System.out.println("Eligible to vote");	
}
else {
System.out.println("Not eligible to vote");	
}
	}

}
