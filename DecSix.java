import java.util.Scanner;

public class DecSix {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        String hexstr = Integer.toString(a, 16);
        System.out.println(hexstr);

    }
}
