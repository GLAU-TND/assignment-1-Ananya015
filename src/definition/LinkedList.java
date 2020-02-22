package definition;

import Adt.MyLinkListAdt;

public class LinkedList<E> implements MyLinkListAdt<E> {
    private Node<E> head=null;
    private int size=0;

    private void addFirst(E item)
    {
        head=new Node<> (  item,head);
        size++;
    }
    private void addAfter(E item,Node<E> afterNode)
    {
        afterNode.next = new Node<>(item, afterNode.next);
        size++;
    }
    private Node<E> getNode(int index)
    {
        Node<E> reponse=head;
        for(int i=0;i<index;i++){
            reponse=reponse.getNext ();
        }
        return reponse;
    }
    @Override
    public void add(Object item) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E getData(int index) {
        return null;
    }

    private static class Node<E>{
      private E data;
      private Node<E> next;
      public Node(E data, Node<E> next) {
          this.data = data;
          this.next = next;
      }
      public E getData() {
          return data;
      }

      public Node<E> getNext() {
          return next;
      }


  }
}
