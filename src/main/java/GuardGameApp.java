import java.util.Scanner;

/**
 * Created by yash on 2/25/16.
 */
public class GuardGameApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        GuardGame gg = new GuardGame();
        System.out.println(gg.answer(x));

    }
}