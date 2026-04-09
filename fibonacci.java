
public class fibonacci {
public static int fibonacci1(int num) {
if (num == 0||num==1 ) {
return num;
}

        return fibonacci1(num-1)+fibonacci1(num-2);
    }

    public static void main(String[] args) {
        int num = 7;
         
        System.out.println(fibonacci1(num));
    }

}