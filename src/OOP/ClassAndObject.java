package OOP;

public class ClassAndObject {
    public static void main(String[] args) {
        ClassAndObject myClass = new ClassAndObject("Example");
        System.out.println(myClass.getName());
    }

    String name;

    //Конструктор
    public  ClassAndObject(String name){
        this.name = name;
    }

    //Метод
    public String getName(){
        return name;
    }
}
