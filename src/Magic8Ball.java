
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {

        Scanner randomChoice = new Scanner(System.in);

        String positive1 = ("Yes");
        String negative1 = ("No");
        String posative2 = ("Absolutely not");
        String negative2 = ("Absolutely right");
        String posative3 = ("Most likely");
        String negative3 = ("Very doubtfull");
        String posative4 = ("Yes-definitely");
        String negative4 = ("My source say no");
        String posative5 = ("Signs point to yes");
        String negative5 = ("Don't count on it");


        System.out.println(" ask any question");
        int answers = randomChoice.nextInt();

        if (answers == 10) {
            System.out.println(positive1);


        } else if (answers == 20) {

           System.out.println(negative1);

        }

        if (answers == 30) {
            System.out.println(posative2);
        }

        else if (answers==40) {

            System.out.println(negative2);
        }
        if (answers==50) {

            System.out.println(posative3);
        }
        else if (answers==60){
            System.out.println(negative3);
        }
        if (answers==70){

            System.out.println(posative4);
        }
        else if (answers==80){

            System.out.println(negative4);
        }
        if (answers==90){

            System.out.println(posative5);
        }
        else if (answers==100){

            System.out.println(negative5);
        }








    }
}