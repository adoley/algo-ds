package v2.linklistmiddle;

import v2.linkedlist.Node;

/**
 * The approach is to use the concept of slow and fast pointer.
 * For every step a slow pointer take, faster pointer move by 2 steps
 *
 * Runtime complexity: O(n)
 * Space complexity: O(1)
 */
public class Approach1 {
    public static void main(String[] args) {
      // int[] input={1,2,3,4,5};
        int[] input={1,2,3,4,5,6};

       Node head=new Node();
       head.setVal(input[0]);

       Node current=head;
       for(int i=1;i< input.length;i++){
          Node temp=new Node();
          temp.setVal(input[i]);

          current.setNext(temp);
          current=current.getNext();
       }

       Node result=middleNode(head);
       while (result!=null){
           System.out.print(result.getVal()+" ");
           result=result.getNext();
       }
    }

    private static Node middleNode(Node head) {
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.getNext()!=null){
            slow=slow.getNext();

            fast=fast.getNext();
            if(fast!=null){
                fast=fast.getNext();
            }
        }

        return slow;
    }
}
