import java.util.Scanner;

/*
 Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch,
    daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
        -‘a’: adaugare
        -‘s’: scadere
        -‘i’: inmultire
        -‘p’: impartire
        -‘m’: modul
    Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
 */

class Punctul2 {

    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("alege-ti o operatie: a - adunare, s - scadere, i - inmultire, p - impartire, m - modul");
        operator = input.next().charAt(0);


        System.out.println("introduce-ti primul numar");
        number1 = input.nextDouble();

        System.out.println("introduce-ti al doilea numar");
        number2 = input.nextDouble();

        switch (operator) {

            case 'a':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case 's':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case 'i':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case 'p':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            case 'm':
                result = number1 % number2;
                System.out.println(number1 + " % " + number2 + " = " + result);
                break;

            default:
                System.out.println(" operator invalid!");
                break;
        }

        input.close();
    }
}