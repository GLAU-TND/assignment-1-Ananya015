package definition;

public class LinkedList {
  private static class Node<E>{
      private E data;
      private Node<E> next;
      public Node(E data, Node<E> next) {
          this.data = data;
          this.next = next;
      }



  }
}
