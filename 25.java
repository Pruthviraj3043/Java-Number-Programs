import java.util.Scanner;
class JeeMains
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter Marks");
int marks=sc.nextInt();
if(marks>=341&&marks<=360){
System.out.println("You are elgible for IIT");
}
else if(marks>=321&&marks<=340){
System.out.println("You are elgible for NIT");
}
else if(marks>=301&&marks<=320){
System.out.println("You are elgible for IIIT");
}
else{
System.out.println("join Jspyders");
}
}
}