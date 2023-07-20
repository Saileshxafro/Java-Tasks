import java.util.Scanner;
class IfStatement{

public static void main(String args[]){

	Scanner Age = new Scanner(System.in);
	System.out.println("Enter Your Age");
	int age = Age.nextInt();
	if(age>18){
	
		System.out.println("You are eligible for voting");
	}
	else{
		System.out.println("You are not eligible for voting");
	}


}

}