package home_made_04;

public class  Pair <T, U> {
    private T obj1;
    private U obj2;

    public Pair(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getFirst() {
        return obj1;
    }

    public void setFirst(T obj1) {
        this.obj1 = obj1;
    }

    public U getSecond() {
        return obj2;
    }
    
    public void setSecond(U obj2) {
        this.obj2 = obj2;
    }
     
}
