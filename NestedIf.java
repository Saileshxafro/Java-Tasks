import java.util.Scanner;

class NestedIf{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Your age");
int age = sc.nextInt();

if(age>=18){
System.out.println("Enter Your 12th Percentage");
int percent = sc.nextInt();
	if(percent>=60){
	System.out.println("Admission is open");
	}
	else{
	System.out.println("Your Percentage doesn't match the criteria");
}
}
else{
	System.out.println("Your Age doesn't match the criteria");
}




}
}