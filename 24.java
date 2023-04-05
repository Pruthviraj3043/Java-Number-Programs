import java.util.Scanner;
class Marks
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks");
int marks=sc.nextInt();
if(marks>=91&&marks<=100){
System.out.println("Excellent");
}
else if(marks>=81&&marks<=90){
System.out.println("very good");
}
else if(marks>=71&&marks<=80){
System.out.println("good");
}
else if(marks>=61&&marks<=70){
System.out.println("Average");
}
else if(marks>=56&&marks<=60){
System.out.println("below average");
}
else if(marks>=51&&marks<=55){
System.out.println("border pass");
}
else{
System.out.println("Legend");
}
}
}