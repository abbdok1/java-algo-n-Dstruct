package src.abbas;
import  java.util.ArrayList;
import java.util.LinkedList;
public class adjacencylist {
    ArrayList<LinkedList<Node>>lst;
    adjacencylist(){
        lst=new ArrayList<>();
    }
    public void add(Node node){
        LinkedList<Node> CUR=new LinkedList<>();
        CUR.add(node);
        lst.add(CUR);
    } 
    public void addedge(int src,int dst ){
        LinkedList<Node> CUR=lst.get(src);
        Node DSTnode=lst.get(dst).get(0);
        CUR.add(DSTnode);
    }
    public boolean checkEdge(int src,int dst){
        LinkedList<Node> CUR=lst.get(src);
        Node DSTnode=lst.get(dst).get(0);
        for (Node node:CUR) {
            if ( node == DSTnode)return true;
        }
        return false;
    }
public void print(){
    for (LinkedList<Node> l:lst) {
        for (Node node:l) {
            System.out.print(node.data + "->");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    adjacencylist LST=new adjacencylist();
    LST.add(new Node('a'));
    LST.add(new Node('b'));
    LST.add(new Node('c'));
    LST.addedge(0, 1);
    LST.addedge(1, 2);
    LST.print();

}
}
