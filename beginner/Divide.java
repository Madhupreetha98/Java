import java.io.*;
import java.util.*;
class Divide{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int n1=a;
int n2=b;
int count=0;
while(n1>=n2){
n1=n1-n2;
count++;
} 
System.out.println(count);
}
}
