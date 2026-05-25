package Linked_list.Single_LL;

import java.util.HashSet;
class Node{
    int data ;
    Node next ;

    public Node(int data ){
        this.data = data ;
        this.next  = null;
    }
}
public class FindTheIntersectionPointOFY_LL {

    public static Node IntesectionnBrute(Node headA , Node headB){
        HashSet<Node> set = new HashSet<>();

        Node temp = headA;

        while(temp != null){
            set.add(temp);
            temp = temp.next;
        }
        
        temp = headB;

        while(temp != null){
            if(set.contains(temp)){
                return temp;
            }
            temp = temp.next ;
        }
        return null ;
    }
    public static Node getIntersectionNode(Node headA, Node headB) {
        // case
        if (headA == null || headB == null) return null;

        Node pointerA = headA;
        Node pointerB = headB;

        //loop util the intesectio is occured
    
    while (pointerA != pointerB) {

        if (pointerA == null) {
            pointerA = headB;
        } else {
            pointerA = pointerA.next;
        }

        if (pointerB == null) {
            pointerB = headA;
        } else {
            pointerB = pointerB.next;
        }
    }

        // Both are either pointing to the intersection node or both are null
        return pointerA;
    }
}
