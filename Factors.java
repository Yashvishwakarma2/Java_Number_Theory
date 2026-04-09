
import java.util.Scanner;

//Factors of a number
public class Factors{
public static int factor(int num,int constant){
if(num==0){
return 0;
}if(constant%num==0){
System.out.println(num);
}return factor(num-1, constant);
}
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Enter a number");
int num = obj.nextInt();
int counstant = num/2;
//System.out.println(factor(num, counstant));
factor(num, counstant);
}
}