import java.util.Random;
import java.util.Scanner;

 /*
    Cititi un numar de la tastatura si stocati valoarea lui intr-o variabila. Generati un numar random intre 1 si 100
    si stocati acel numar intr-o alta variabila. Daca numarul introdus de la tastatura este mai mic decat numarul
    random generat, afisati mesajul “Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului
    random generat in textul afisat).
     */

public class Punctul1 {


    static int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(100)+1;
    }



    public static void main(String[] args) {

        System.out.println("introduce-ti un numar de la 1 la 100");

        Scanner in = new Scanner(System.in);


        int numar = in.nextInt();
        int numarGenerat = (int)(Math.random() * 101);

        numarGenerat = (int)(Math.random()*100) + 1;

        if (numar < numarGenerat) {
                System.out.println("numarul generat este mai mare: " + numarGenerat);
            }else {
            System.out.println("numarul dumneavoastra este : " + numar +
                    " iar numarul generat este " + numarGenerat);
        }
    }
 }

