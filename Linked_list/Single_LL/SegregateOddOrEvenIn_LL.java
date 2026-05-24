package Linked_list.Single_LL;

class Node{
    int data ;
    Node next;

    public Node(int data){
        this.data = data ;
        this.next = null;
    }
}
class SegregateOddOrEven_LL{

    public static Node segregateList(Node head){
        if(head == null || head.next == null || head.next.next == null) return head ;

        
        Node odd = head ;
        Node oddHead = head;
        Node even = head.next;
        Node evenHead = head.next;

      

        while(even != null && even.next!= null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;

        }

        odd.next = evenHead;

        return oddHead; 
    }
    public static void main(String[] args) {
        
    }
}
