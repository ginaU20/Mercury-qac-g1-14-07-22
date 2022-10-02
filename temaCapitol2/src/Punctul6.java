/*
Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca
iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.
 */

import java.sql.Time;
import java.util.Date;

public class Punctul6 {



    public static void main(String[] args){

        int[] a = new int[30];

        //initializare sir
        for(int i = 0; i<30; i++){
            a[i] = i;
//            System.out.println(a[i]);
        }

//        Date date = new Date();
//        System.out.println(date.toLocaleString());

//        Time time = new Time(12,00,00);
//
//        if (System.get<time){
//
//        }


        //prelucrare date
        for (int i = 0; i<30; i++){

            if (i == 2){
                continue;
            }

            if (i == 7){
                break;
            }

            System.out.println(i + " index valid");
        }

    }
}
