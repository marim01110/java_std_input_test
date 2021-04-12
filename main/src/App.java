import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        select();
        q1();
        q2();
    }

    static int select() {
        System.out.println("sel=");
        Scanner in = new Scanner(System.in);
        int sel = in.nextInt();
        return sel;
    }

    static void q1() {
        System.out.println("Hello, World!");
    }

    static void q2(){
        Random rand = new Random();
        int loop = 5;
        for(int i=0;i<loop;i++){
            int num = rand.nextInt(100);
            System.out.println(num);
        }
    }
}
