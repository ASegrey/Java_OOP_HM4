package home_made_04;

import java.util.ArrayList;
import java.util.List;

public class DataContainer<T> {
    private List<T> obj;

    public DataContainer() {
        this.obj = new ArrayList<T>();
    }

    public T get(int index) {
        List<T> objNull = new ArrayList<T>();
        if (this.obj.size() == 0){
            System.out.println("Массив пуст");
            return objNull.get(0);
        }
        else{
            if (this.obj.size()-1 >= index){
                return obj.get(index);
            }
            else{
                System.out.println("Индекс за пределами массива");
                return objNull.get(0);
            }
        }
    }

    public void add(T item) {
        obj.add(item);
    }

    public void remove(int index){
        if (this.obj.size() == 0){
            System.out.println("Массив пуст");
        }
        else{
            if (this.obj.size()-1 >= index){
                obj.remove(index);
            }
            else{
                System.out.println("Индекс за пределами массива");
            }
        }
    }

    public int getSize(){
        return this.obj.size();
    }

}
