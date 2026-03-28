
public class prefactNumber {
    public static int factSum(int num, int constant) {
        if (constant == num) {
            return 0;
        }
        if (num % constant == 0) {
            return constant + factSum(num, constant + 1);
        }
        return factSum(num, constant + 1);
    }
    public static void main(String[] args) {
        int num = 6;
        int constant = 1;
        int sum = factSum(num, constant);
        if(num==sum){
            System.out.println("is prefact number");
        }else{
            System.out.println("is not prefact number");            
    }
    }

}
