package OOP;

public class Human {
    //параметры
    int age;
    double weight;

    public static void main(String[] args) {
        Human human = new Human();
        human.byuBred();
        human.buyMilk();
        System.out.println("Hello");
    }

    //методы
    void byuBred(){
        System.out.println("Buy bred");
    }

    void buyMilk(){
        System.out.println("Buy milk");
    }

    void birthday(){
        age = age++;
    }
}


