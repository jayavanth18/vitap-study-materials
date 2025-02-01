public class Linked_List {
   // Inner class representing a node
   static class node {
      int data;
      node next;
      node(int value) {
         data = value;
         next = null;
      }
   }

   static node head; // Reference to the head of the linked list

   // Method to display the list
   static void printList() {
      node p = head;
      System.out.print("\n[");
   
      // Start from the beginning of the list
      while (p != null) {
         System.out.print(" " + p.data + " ");
         p = p.next;
      }
      System.out.print("]");
   }

   // Method for insertion at the beginning
   static void insertatbegin(int data) {
      // Create a new node
      node newNode = new node(data);

      // Point it to the old first node
      newNode.next = head;

      // Point the 'head' reference to the new first node
      head = newNode;
   }

   public static void main(String args[]) {
      int k = 0;
      insertatbegin(12);
      insertatbegin(22);
      insertatbegin(30);
      insertatbegin(44);
      insertatbegin(50);
      insertatbegin(33);
      System.out.println("Linked List: ");
      
      // Print the list
      printList();
   }
}
