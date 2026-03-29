class ListNode{
  ListNode next; 
  int val; 

  public ListNode(int val){
    this.val = val;
    this.next = null; 
  }
}


class MyStack{
  private ListNode head; 

  public MyStack(){
    this.head = null; 
  }

  public void push(int val){
    ListNode node = new ListNode(val);
    node.next = head; 
    head = node; 
  }

  public void pop(){
    if(head == null) return; 
    head = head.next; 
  }
  
  public int peek(){ return head.val;  }

  public boolean isEmpty() { return head == null; }
}


public class Stack{
  public static void main(String[] args){
    System.out.println();

    MyStack stack = new MyStack();
    
    for(int i = 0; i < 10; ++i){
      stack.push(i);
    }

    while(!stack.isEmpty()){
      System.out.println(stack.peek());
      stack.pop();
    }
  }
}
