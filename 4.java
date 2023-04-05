class ternary{
public static void main(String[] args){
int a=20;
int b=25;
int c=15;
String result=a<b && a<c?a+"is smallest":b<c?b+"is smallest":c+"is smallest";
System.out.println(result);
}}