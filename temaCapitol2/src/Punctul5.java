/*
Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for, si daca un
element este egal cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai mare decat 5, afisati
mesajul “Element peste 5”
 */


public class Punctul5 {

    public static void main (String[] args){

        //definim array de doubles
        double[] d = new double[6];

        d[0] = 3.45;
        d[1] = 34.45;
        d[2] = 27.45;
        d[3] = 3.47;
        d[4] = 1.68;
        d[5] = 4.5;


        for(int i = 0; i<6; i++){

//            if (d[i]<4.5){
////                System.out.println(d[i] + " e mai mic decat 5");
//            }  else if(d[i] == 4.5){
//                System.out.println("numarul este 4.5");
//            } else{
//                System.out.println(d[i] + " este mai mare decat 5");
//            }

            if (d[i] == 4.5){
                System.out.println(d[i] + " este 4.5");
            } else if (d[i]>5){
                System.out.println(d[i] + " este mai mare decat 5");
            }


        }



    }




}
