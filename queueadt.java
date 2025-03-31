class Node{
   int data;
   Node next;
   public Node (int data){
     this.data=data;
     this.next=null;
   }
}
class Queue{
  Node front;
  Node rear;
  int size;
public queue(){
  front=rear=null;
  size=0;
}
public void enqueue(int data){
  Node newNode=new Node(data);
  if (rear==null){
     front=rear=newNode;
  }else{
     rear.next=newNode;
     rear=newNode;
}
size++;
}
public int dequeue(){
  if(isempty()){
    throw new RuntimeException("queue is empty");
  }
  int data=front.data;
  front=front.next;
  if(front==null){
   rear=null;
  }
  size--;
  return data;
}
public Boolean isempty(){
  return front==null;
}
public int peek(){
  if(isempty()){
    throw new RuntimeException("queue is empty");
  }
  return front.data;
}
public int size(){
  return size;
  }
}
public static void main(String[] args){
   Queue queue=new Queue();
   queue.enqueue(10);
   queue.enqueue(20);
   queue.enqueue(30);
   Sysyem.out.println("Queue size:"+queue.size());
   System.out.println("front element:"+queue.peek());
   System.out.println("dequeued element:"+queue.dequeue());
   System.out.println("Queue size:"+queue.size());
   }
}
