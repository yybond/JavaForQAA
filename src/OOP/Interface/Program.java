package OOP.Interface;

public class Program {

    public static void main(String[] args) {
        IPrintable printable = new Book("Java. Complete Reference", "H. Shildt");
        printable.print();
        printable = new Journal("Foregn Policy");
        printable.print();

    }
}

class Book implements IPrintable{

    String name;
    String author;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public void print(){
        System.out.printf("%s (%s) \n", name, author);
    }
}