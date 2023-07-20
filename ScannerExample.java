import java.util.Scanner;

class ScannerExample{

public static void main(String args[]){

System.out.println("Enter your First Name :");
Scanner sc = new Scanner(System.in);

String firstName = sc.nextLine();
System.out.println("Your name is :" + firstName);

}
}