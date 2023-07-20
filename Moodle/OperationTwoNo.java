import java.util.Scanner;
class Operations{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("First Number");
int fno = sc.nextInt();
System.out.println("Second Number");
int sno = sc.nextInt();

System.out.println(fno + " + " + sno + " = " + (fno + sno));
System.out.println(fno + " - " + sno + " = " + (fno - sno));
System.out.println(fno + " x " + sno + " = " + (fno * sno));
System.out.println(fno + " / " + sno + " = " + (fno / sno));
System.out.println(fno + " mod " + sno + " = " + (fno % sno));


}

}