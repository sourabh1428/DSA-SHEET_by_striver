import java.util.*;
class LL{
    Node head;
class Node{
    String data;
    Node next;

    Node(String data){
        this.data=data;
        this.next=next;

    }
}

public void addFirst(String data){
    Node newnode=new Node(data);

    if(head==null){
        head= newnode;
        return;
    }

newnode.next=head;
    head=newnode;

}
public void addLst(String data){
    Node newnode=new Node(data);

    if(head==null){
        head= newnode;
        return;
    }
    Node currNode =head;
    while(currNode.next!=null){
        currNode=currNode.next;
    }
    currNode.next=newnode;


}
public void printList(){
    if(head==null){
        System.out.println("list is empty");
    }
    Node currNode=head;
    while(currNode!=null){
        System.out.println(currNode.data+"->");
        currNode=currNode.next;
    }
    System.out.println("NULL");

}


public class rough {
    public static void main(String[] args){
        LL list= new LL();

        //ADD - FIRST OR LAST

        list.addFirst("a");
        list.addFirst("b");
        list.addLst("c");
        list.printList();





    }}
}
