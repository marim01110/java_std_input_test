import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("実行する課題番号を入力してください。[1,2,3]");
        switch(input_int()){
            case 1:     q1();
                        break;
            case 2:     q2();
                        break;
            case 3:     q3();
                        break;
            default:    break;
        }
    }

    static int input_int() {
        Scanner in = new Scanner(System.in);
        int tmp = in.nextInt();
        return tmp;
    }

    static void q1() {
        System.out.println("Hello, World!");
    }

    static void q2(){
        Random rand = new Random();
        int loop;

        System.out.println("乱数をいくつ表示しますか？");
        loop = input_int();
        System.out.println("乱数を" + loop + "[個]出力します。");
        
        for(int i=0;i<loop;i++){
            int num = rand.nextInt(100);
            System.out.println(num);
        }
    }

    static void q3(){

    }
}
