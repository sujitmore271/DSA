import java.util.Scanner;
class Node{
    int data ;
    Node next ;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class FindStartingPointInLinkedList_M {
    public static Node findStart(Node head){
        if (head == null) return null;

        Node slow = head ;
        Node fast = head ;

        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                fast = head ;
                while( fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
           
        }
         return null;
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

        System.out.println(findStart(head).data);

        Node tempi = head ;
        int k = 8;
            while (k > 0 ) {
                System.out.println(tempi.data);
                tempi = tempi.next ;
                k--;
            }
    }
}
