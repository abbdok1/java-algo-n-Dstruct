package src.abbas;
public class stack {
    int top;
    int size;
    int[]stack;
    public stack(int size){
        stack=new int[this.size=size];
    }
    public void push(int item ){
        if (isfull()) System.out.println("FULL");
        stack[top]=item;
        top++;
    }
    public boolean isfull(){
        return (top==size-1);
    }
    public int pop(){
        int item=stack[top];
        top--;
        return item;

    }
    public boolean isempty(){
        return top==0;
    }
}