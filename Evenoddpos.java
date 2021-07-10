import java.util.*;
class Evenoddpos
 {
 public static void main(String[] args) 
 {
String str;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
str=sc.next();
int n=str.length();
System.out.print(" Odd:");
for(int i=0;i<n;i++)
{
if(i%2==0)
System.out.print(str.charAt(i));
}
System.out.print(" Even:");
for(int i=0;i<n;i++)
{
if(i%2!=0)
System.out.print(str.charAt(i));
 }}
}
