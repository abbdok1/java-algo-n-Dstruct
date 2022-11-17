package src.abbas;
import java.util.Arrays;
public class queue  {
    int capacity;
    int size;
    int index=0;
    int peek;
    int[]queue;
    public  queue(int capacity){
        queue=new int[this.capacity=capacity];
    }
    public queue(){
        queue=new int[10];
    }
    public void offer(int element) throws Exception {
        if (isfull()) throw new Exception("queue is full");
        peek = queue[0];
        queue[index] = element;
        index++;
        size++;
    }
    public void poll() {
        size--;
        if (size >= 0) System.arraycopy(queue, 1, queue, 0, size);
        queue[size]=0;
        peek=queue[0];

    }
    public void print(){
        System.out.println(Arrays.toString(queue));
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isfull(){
        return capacity==size;}

    public int getPeek() {
        return peek;
    }
}
