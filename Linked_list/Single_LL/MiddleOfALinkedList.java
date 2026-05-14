package Linked_list.Single_LL;
class Node{
    int data ;
    Node next ;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MiddleOfALinkedList {
    //brute force
    public static Node findMiddle2Loops(Node head){

    if(head == null) return null;

    Node temp = head;

    int n = 0;

    while(temp != null){
        temp = temp.next;
        n++;
    }

    int mid = n / 2;

    Node find = head;

    int i = 0;

    while(i != mid){
        find = find.next;
        i++;
    }

    return find;
}

    //optimal solution 
    public static Node findMiddle(Node head){
        if(head == null) return head ;

        Node slow = head;
        Node fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow ;
    }
    public static void main(String[] args) {
        
    }
}
