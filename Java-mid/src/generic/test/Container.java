package generic.test.ex1;

public class Container<T> {
    private T data;

    public boolean isEmpty() {
        return data == null;
    }

    public T getItem() {
        return data;
    }

    public void setItem(T data) {
        this.data = data;
    }
}
