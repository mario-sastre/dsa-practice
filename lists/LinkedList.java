
class ListNode{
  ListNode next; 
  Integer val; 

  public ListNode(){
    this.val = 0; 
    this.next = null; 
  }
  public ListNode(Integer val){
    this.val = val; 
    this.next = null;
  }
}


class List{
  private ListNode head;

  public List(){
    this.head = null;
  }

  public List(int[] values){
    for(int x : values){
      insert(x);
    }
  }

  public ListNode insert(int value){
    // what do we do to insert a value into a linked list??
    // we have to return a list node pointing to the head, that's easy
    ListNode newNode = new ListNode(value);
    
    if(head == null){  
      head = newNode; 
    } else {
      ListNode cur = head;
      while(cur != null && cur.next != null){
        cur = cur.next; // we advance over the list
      }
      cur.next = newNode; 
    }
    return this.head;
  }

  public void traverseList(){
    ListNode cur = head; 
    while(cur  != null){
      System.out.print(cur.val + " ");
      cur = cur.next;      
    }
  }

  public boolean  deleteNode(int value){
    // we want to delete a given value
    ListNode cur = head;
    ListNode prev = null; // keeping the prev in order to do the re inserting

    while(cur != null && cur.val != value){
      prev = cur; 
      cur = cur.next; 
    }
    
    if(cur == null) return false; // value does not exist 

    if(prev == null){
      // we can't just skip it, we have to re link
      head = head.next; 
      return true; 
    } 
    // if we are not in any of the above scenarios, then we did find the value, and we have to replace
    prev.next = cur.next; 

    return true;

  }

  public void reverse(){
    ListNode cur = head; 
    ListNode prev = null; 

    while(cur != null){
      ListNode next = cur.next; 
      cur.next = prev; 
      prev = cur; 
      cur = next;
    }
    head = prev; 
  }
}


public class LinkedList{
  public static void main(String[] args){
    System.out.println("Hello");
    List list = new List();
    int[] numbers = {1,2,3,4,5};
    for(int i = 0; i < 10; ++i){
      list.insert(i);
    }

    list.traverseList();
    
    List list2 = new List(numbers);
    System.out.println( "\nCreated a new list: ");
    list2.traverseList();

    System.out.println("\nDeleting a value 4");
    // let's delete some values
    list.deleteNode(4);
    list.traverseList();
    System.out.println("\nDeleting a value 8");
    // let's delete some values
    list.deleteNode(8);
    list.traverseList();
    
    System.out.println("\nDeleting a value 0");
    // let's delete some values
    list.deleteNode(0);
    list.traverseList();

    System.out.println("\nReverse list");
    // let's delete some values
    list.reverse();
    list.traverseList();



  }
}
