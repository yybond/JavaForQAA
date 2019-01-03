package Basic.Exercises;

// Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,
// используя циклы while/ do ... while, for. (Все три реализации)

public class SalaryApp {
    public static void main(String[] args) {
        //Первая реализация
        int s1 = 1;
        int salary1 = 0;

        while (s1 != 12){
            s1++;
            salary1 = salary1 + 1000;
            System.out.println("Your salary for " + s1 + " months is " + salary1);
        }


        //Вторая реализация
        int s2 = 1;
        int salary2 = 0;

        do {
            salary2 = salary2 + 1000;
            System.out.println(salary2);
            s2++;
        }while ( s2<13 );


        //Третья реализация
        int salary3 = 0;

        for (int s3 = 0; s3 < 12; s3++){
            salary3 = salary3 + 1000;
            System.out.println(salary3);
        }
    }
}
