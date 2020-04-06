import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericArray <T>{

    private T[] array;
    private int size;
    private int n = 0;


    public GenericArray(Class<T> tClass, int size){
        array = (T[])Array.newInstance(tClass, size);
        this.size = size;
    }

    public T get(int index){
        return array[index];
    }

    public void add(T t){
        array[n++] = t;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
