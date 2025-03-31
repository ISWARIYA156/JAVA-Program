public class BinarySearchTree{
class node{
  int key;
  node left,right;
  public node(int item){
   key=item;
   left=right=null;
  }
}
Node root;
BinarySearchTree(){
   root=null;
}
void insert(int key){
   root=insertRec(root,key);
}
Node insertRec(Node root,int key){
  if(root==null){
     root=new node(key);
     return root;
  }
if(key<root.key){
  root.left=insert(root.left,key);
}else if(key>root.key){
 root.right=insert(root,right,key);
}
 return root;
}
void printTree(){
   printTree(root);
}
void printTree(Node node)
{
  if(node!=null){
    printTree (Node.left);
    System.out.print(node.key+" ");
    printTree (Node.right);
  }
}
Public static void main(String[]args){
  BinarySearchTree tree=new BinarySearchTree();
       tree.insert(50);
       tree.insert(30);
       tree.insert(20);
       tree.insert(40);
       tree.insert(70);
       tree.insert(60);
       tree.insert(80);
   system.out.println("BinarySearchTree:");
       tree.printTree();
   }
}
      

 
  