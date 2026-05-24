package Linked_list.Single_LL;

class Node{
    int data ;
    Node next ;

    public Node(int data ){
        this.data = data ;
        this.next  = null;
    }
}
public class AddTwoNumbers_LL {
    public static Node addTwoList(Node l1 , Node l2){
        Node dummy = new Node(-1);
        Node tail = dummy ;
        int carry = 0 ;

        while(l1 != null || l2 != null){
            int sum = carry ;

            if(l1 != null){
                sum += l1.data ;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum/10 ;
            
            tail.next = new Node(sum%10);
            tail = tail.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        
    }
}
