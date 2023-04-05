import java.util.Scanner;
class ternary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
String result=a>b && a>c && a>d?a+"is greatest":b>c && b>d?b+"is greatest":c>d?c+"is greatest":d+"is greatest";
System.out.println(result);
}}

