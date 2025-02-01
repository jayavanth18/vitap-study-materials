public class Linked_List1 {
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
   static void insertatend(int data) {
   
      //create a link
      node lk = new node(data);
      node linkedlist = head;

      // point it to old first node
      while(linkedlist.next != null)
         linkedlist = linkedlist.next;
      //point first to new first node
      linkedlist.next = lk;
   }
   public static void main(String args[]) {
      int k=0;
      insertatbegin(12);
      insertatbegin(22);
      insertatbegin(30);
      insertatend(44);
      insertatend(50);
      insertatend(33);
      System.out.println("Linked List: ");

      // print list
      printList();
   }
}