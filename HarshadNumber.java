 //harshad Number
 public class HarshadNumber{
    public static int harshad(int num){
        if(num==0){
            return 0;
        }
        int digit = num%10;
        return digit+harshad(num/10);
    }
    public static void main(String[] args) {
        int num = 123;
        int sum = harshad(num);
        if(num%sum==0){
            System.out.println("is harshad number");
        }else{
            System.out.println("is not harshad number");
        }
    }
 }