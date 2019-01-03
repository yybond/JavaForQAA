package Basic.Exercises;

// Реализуйте телевизионный пульт, используя одномерный массив.
// (Пользователь вводит номер канала - программа выдаёт имя канала).

public class Controller {
    public static void main(String[] args) {

        String[] anArray;
        anArray = new String[10];

        anArray[0] = "Inter";
        anArray[1] = "STB";
        anArray[2] = "Kvartal TV";
        anArray[3] = "Novii Kanal";
        anArray[4] = "1+1";
        anArray[5] = "2+2";
        anArray[6] = "Sirius TV";
        anArray[7] = "TET";
        anArray[8] = "ZEE TV";
        anArray[9] = "ICTV";

        System.out.println("Канал № 8 - " + anArray[7]);
    }
}
