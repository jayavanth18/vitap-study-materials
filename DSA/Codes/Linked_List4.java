public class Linked_List4 {
   static class node {
      int data;
      node next;
      node (int value) {
         data = value;
         next = null;
      }
   }
   static node head;
   
   // display the list
   static void printList() {
      node p = head;
      System.out.print("\n[");
   
      //start from the beginning
      while(p != null) {
         System.out.print(" " + p.data + " ");
         p = p.next;
      }
      System.out.print("]");
   }
   
   //insertion at the beginning
   static void insertatbegin(int data) {

   
      //create a link
      node lk = new node(data);;

      // point it to old first node
      lk.next = head;

      //point first to new first node
      head = lk;
   }
   static void deletenode(int key) {
      node temp = head;
      node prev = null;
      if (temp != null && temp.data == key) {
         head = temp.next;
         return;
      }
      
      // Find the key to be deleted
      while (temp != null && temp.data != key) {
         prev = temp;
         temp = temp.next;
      }
      
      // If the key is not present
      if (temp == null) return;
      
      // Remove the node
      prev.next = temp.next;
   }
   public static void main(String args[]) {
      int k=0;
      insertatbegin(12);
      insertatbegin(22);
      insertatbegin(30);
      insertatbegin(44);
      insertatbegin(50);
      insertatbegin(33);
      System.out.println("Linked List: ");

      // print list
      printList();

      //deleteatbegin();
      //deleteatend();
      deletenode(12);
      System.out.println("\nLinked List after deletion: ");

      // print list
      printList();
   }
}