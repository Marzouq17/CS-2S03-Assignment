import java.util.Scanner;

public class CupcakeCostCalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int k = sc.nextInt();
    int d = sc.nextInt();
    int D = sc.nextInt();
    int sum;
    if (t>k){
        sum = t*D;
    }else{
        sum = t*d;
    }
    System.out.println(sum);
    }
}
