import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //select();
        switch(select()){
            case 1:     q1();
                        break;
            case 2:     q2();
                        break;
            default:    break;
        }
    }

    static int select() {
        System.out.println("sel=");
        Scanner in = new Scanner(System.in);
        int sel = in.nextInt();
        in.close();
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
