
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {

        Scanner randomChoice = new Scanner(System.in);

        String positive1 = ("Yes");
        String negative1 = ("No");
        String positive2 = ("Absolutely not");
        String negative2 = ("Absolutely right");
        String positive3 = ("Most likely");
        String negative3 = ("Very doubtfull");
        String positive4 = ("Yes-definitely");
        String negative4 = ("My source say no");
        String positive5 = ("Signs point to yes");
        String negative5 = ("Don't count on it");


        System.out.println(" ask any question");
        int answers = randomChoice.nextInt();

        if (0<answers&&answers<=10) {
            System.out.println(positive1);


        } else if (10<answers&&answers <=20) {

           System.out.println(negative1);

        }

        if (20<answers&&answers <=30) {
            System.out.println(positive2);
        }

        else if (30<answers&&answers<=40) {

            System.out.println(negative2);
        }
        if (40<answers&&answers<=50) {

            System.out.println(positive3);
        }
        else if (50<answers&&answers<=60){
            System.out.println(negative3);
        }
        if (60<answers&&answers<=70){

            System.out.println(positive4);
        }
        else if (70<answers&&answers<=80){

            System.out.println(negative4);
        }
        if (80<answers&&answers<=90){

            System.out.println(positive5);
        }
        else if (90<answers&&answers<=100){

            System.out.println(negative5);
        }








    }
}