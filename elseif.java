import java.util.Scanner;
class elseIf{

public static void main(String args[]){

Scanner Mark = new Scanner(System.in);
System.out.println("Enter Your Mark");
int mark = Mark.nextInt();
	if((mark >=0) && (mark<=39)){
	System.out.println("Your Grade is D");
	}
	else if(mark <=59){
	System.out.println("Your Grade is C");
	}
	else if(mark <=79){
	System.out.println("Your Grade is B");
	}
	else if(mark <=89){
	System.out.println("Your Grade is A");
	}
	else if(mark <=100){
	System.out.println("Your Grade is O");
	}
	else{
	System.out.println("Not Valid");
	}
}
}