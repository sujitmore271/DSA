package Linked_list.Single_LL;

import java.util.Scanner;

class Node{
    int data ;
    Node next ;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DetectLoopInLInkedList_M {
    public static boolean cycle(Node head){
        if(head == null) return false;

        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        Node head = new Node(10);

        Node temp = head;

        int i = 7;
        System.out.println("eneter list elemets");
        while(i > 0){
            

            int value = sc.nextInt();

            Node newNode = new Node(value);

            temp.next = newNode;

            temp = temp.next;

            i--;
        }
        sc.close();

        Node connectNode = head;

        for(int j = 0 ; j<3 ;   j++){
            connectNode = connectNode.next;
        }
        temp.next = connectNode;

        System.out.println(cycle(head));
    }
}
