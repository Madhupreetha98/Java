import java.io.*;
import java.util.*;
class Num{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int i;
String ans="";
int count=0;
for(i=0;i<s.length();i++)
{  
char c=s.charAt(i);
if(Character.isDigit(c))
{
 count++;

}
}
if(count==s.length()){
System.out.println("yes");
}
else{
System.out.println("no");
}
}}
