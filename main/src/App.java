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
            case 3:     q3();
                        break;
            default:    break;
        }
    }

    static int select() {
        System.out.print("実行する課題番号を入力してください[1,2,3]。");
        Scanner in = new Scanner(System.in);
        int sel = in.nextInt();
        in.close();
        return sel;
    }

    static void q1() {
        System.out.println("Hello, World!");
    }

    static void q2(){
        int loop = 0;
        Random rand = new Random();

        System.out.print("乱数をいくつ表示しますか？");

        Scanner in = new Scanner(System.in);
        loop = in.nextInt();
        in.close();
        
        for(int i=0;i<loop;i++){
            int num = rand.nextInt(100);
            System.out.println(num);
        }
    }

    static void q3(){

    }
}
