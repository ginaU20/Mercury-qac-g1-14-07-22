public class Punctul3 {
    /*
    Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
    Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
     */

    public static void main(String[] args) {

//        int[0] = [1][2][3];
//        int[0] [1] = [5] [6] [9];

        int[] array = new int[5];

        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;

        int[][] matrice = new int[3][5];
        for (int i = 0; i<=2; i++){
            for (int j = 0; j<=4; j++){
                matrice[i][j] = i + j;
            }
        }

        System.out.println(matrice[0][0]);
        System.out.println(matrice[2][4]);


//        char[] arrayDeStringuri = new char[3];


//        String[][] bidimensionalArray = new String[2][2];
//        bidimensionalArray[0][0] = "abc";



    }
}

