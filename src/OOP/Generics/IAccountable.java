package OOP.Generics;

public interface IAccountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
