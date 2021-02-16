import java.util.Scanner;

public class Addition{

public static void main(String[] args){

Scanner userinput =new Scanner(System.in);

int firstnumber;
int secondnumber;
int sum;

System.out.print("Enter first number: ");

firstnumber =userinput.nextInt();

System.out.print("Enter second number: ");

secondnumber = userinput.nextInt();

sum=firstnumber + secondnumber;

System.out.printf("Sum is %d%n", sum);




}


}