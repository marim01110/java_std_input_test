import java.util.Random;

public class q3 {
  static void main(){
    int percent, win = 0 , times;

    Random rand = new Random();
    System.out.println("くじの当選確率[%]はどうしますか？");
    percent = App.input_int();
    System.out.println("くじの試行回数[回]はどうしますか？");
    times = App.input_int();

    for(int i=0;i<times;i++){
        if(percent>=rand.nextInt(100)){
            win += 1;
            System.out.println("当たりました。");
        }
        else System.out.println("はずれました。");
    }

    System.out.println("今回の試行における当選回数は、" + win + "回、確率は" + (float)win * 100 / times + "%でした。");
  }
}
