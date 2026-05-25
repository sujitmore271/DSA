package Linked_list.Single_LL;

class Node{
    int data ;
    Node next ;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class RemoveDuplicatesFromSorted_LL {
  public static Node remove(Node head) {
        
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;

        // temp and temp.next is not null
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next; // Skip duplicate node
            } else {
                temp = temp.next; //  if no duplicate was found move forward
            }
        }
        return head;
    }
    public static void main(String[] args){

    }
}

