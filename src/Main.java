import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

          String myFirstHomeWord;

          final int NUM = 0;

          String word = "Nik";

          myFirstHomeWord = word + NUM;

          System.out.println(myFirstHomeWord + word + NUM);

          if (NUM < 0) {
              System.out.println("You saved a negative number");
          } else if (NUM > 0) {
              System.out.println("You saved a positive number");
        } else {
              System.out.println("You saved zero");
          }

        Scanner s = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String string = s.nextLine();
        System.out.println("Привет! "+string);
    }
    }
