package DataStructureAlgo.dynamic_programming.data_structures.linked_lists.singly;

public class MySinglyLinkedNode {

  private int value;
  private MySinglyLinkedNode next;

  public MySinglyLinkedNode(int value) {
    this.value = value;
    this.next = null;
  }

  public MySinglyLinkedNode(int value, MySinglyLinkedNode next) {
    this.value = value;
    this.next = next;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public MySinglyLinkedNode getNext() {
    return next;
  }

  public void setNext(MySinglyLinkedNode next) {
    this.next = next;
  }
}
