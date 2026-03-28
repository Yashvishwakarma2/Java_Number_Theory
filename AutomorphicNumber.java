//Automorphic number
public class AutomorphicNumber {
    public static boolean  automorphicNumber(int num,int sqr) {
        if(num==0){
            return true;
        }if(num%10!=sqr%10){
            return false;
        }
        return automorphicNumber(num/10, sqr/10);
         
    }
    public static void main(String[] args) {
        int num = 76;
        int sqr = num*num;
        boolean isAutomorphic = automorphicNumber(num, sqr);
        if(isAutomorphic){
            System.out.println("is Automorphic");
        }else{
            System.out.println("is not Automorphic");
        }
    }
}
