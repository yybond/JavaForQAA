package OOP.Generics;

public class Program {

    public static void main(String[] args) {
        MyAccount acc1 = new MyAccount("2334", 5000); // id - string
        MyAccount acc2 = new MyAccount(234234, 5000); // id - string
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
//
//        Printer printer = new Printer();
//        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
//        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
//        printer.<String>print(people);
//        printer.<Integer>print(numbers);

//        NewAccount<String, Double> acc3 = new NewAccount<String, Double>("354", 5000.87);
//        String id = acc3.getNewid();
//        Double sum = acc3.getNewsum();
//        System.out.printf("Id: %s Sum: %f \n", id, sum);
    }
}
