package OOP.Exercises;

//Напишите метод, который принимает два арумента, перемножает их и выводит результат наэкран.

public class MethodEx {
    public static void main(String[] args) {
        Mult myMult = new Mult();

        myMult.a = 134;
        myMult.b = 31;

        System.out.println(myMult.getMult());
    }
}
