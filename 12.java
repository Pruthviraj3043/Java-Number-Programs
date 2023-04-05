import java.util.Scanner;
class unary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Before swapping a="+a+"and b="+b);
int temp=a;
a=b;
b=temp;
System.out.println("After swapping a="+a+ "and b="+b);
}}