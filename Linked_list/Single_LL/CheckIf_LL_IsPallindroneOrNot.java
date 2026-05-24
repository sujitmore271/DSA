package Linked_list.Single_LL;

class Node{
    int data ;
    Node next ;

    public Node(int data){
        this.data = data ;
        this.next = null;
    }
}
public class CheckIf_LL_IsPallindroneOrNot {
    public static boolean pallindroneOrNot(Node head){
        boolean isPalin = true;
        Node slow = head ;
        Node fast = head ;

        Node center = findCenter(slow , fast);

        Node leftHead = head;
        Node rightHead = reverseList(center);
        Node reverseHead = rightHead;

        while(rightHead != null){
            if(leftHead.data != rightHead.data){
                isPalin = false ;
                break;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;

        }
            reverseList(reverseHead);
            return isPalin;

        }

        private static Node reverseList(Node center){
            Node prev = null ;
            Node curr = center ;
            Node front = null ;

            while(curr != null){
                front = curr.next;
                curr.next = prev ;
                prev = curr ;
                curr = front ;
            }
            return prev ;
        }

        private static Node findCenter(Node slow , Node fast){
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    public static void main(String[] args) {
        
    }
}