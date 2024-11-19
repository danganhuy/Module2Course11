public class MyStack2<E> {
    private E[] arr;
    private int size;
    private int index = 0;

    public MyStack2(int size) {
        this.size = size;
        arr = (E[]) new Object[size];
    }

    public void push(E element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public E pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == size;
    }
}
