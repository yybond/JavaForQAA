package OOP.Generics;

class NewAccount <T, S> {

    private T newid;
    private S newsum;

    NewAccount(T newid, S newsum ){
        this.newid = newid;
        this.newsum = newsum;
    }

    public T getNewid() { return newid; }
    public S getNewsum() { return newsum; }
    public void setNewsum(S sum) { this.newsum = sum; }
}
