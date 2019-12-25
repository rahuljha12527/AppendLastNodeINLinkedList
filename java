public class Solution {
	
    public static int length(LinkedListNode<Integer> head){
        int counter=0;
        while(head!=null){
            head=head.next;
            counter++;
        }
        
        return counter;
        
    }
    public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
      
        LinkedListNode<Integer> temp1=root;
        LinkedListNode<Integer> temp2=root;
        
        int count=length(root);
        int i=0;
        while(i<count-n-1){
            temp2=temp2.next;
            i++;
        }
       root=temp2.next;
      temp2.next=null;
       
        LinkedListNode<Integer> tempHead=root;
        
        while(tempHead.next!=null){
            
            tempHead=tempHead.next;
        }
            
        tempHead.next=temp1;
        return root;
    }
}
