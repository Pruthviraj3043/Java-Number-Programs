import java.util.Scanner;
class Divide
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int number=sc.nextInt();
if(number%5==0&&number%3==0)
{
System.out.println("Fizz-Buzz");
}
else if(number%5==0){
System.out.println("Fizz");
}
else if(number%3==0){
System.out.println("Buzz");
}
else{
System.out.println("No Fizz-No Buzz");
}
}
}