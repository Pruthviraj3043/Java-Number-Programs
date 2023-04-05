class unary{
public static void main(String[] args){
int a=10;
int b=15;
System.out.println("before swapping a="+a+"and b="+b);
a=a*b;
b=a/b;
a=a/b;
System.out.println("After swapping a="+a+ "and b="+b);
}}