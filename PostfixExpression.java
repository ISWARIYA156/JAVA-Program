import java.util.stack;
public class PostfixEvaluation{
public static int evaluatepostfix(string expression){
  stack<integer>stack=new stack<>();
  for(int i=0;i<expression.length();i++){
  char ch=expression.charat(i);
  if(character.isdigit(ch)){
     stack.push(ch-'0');
     int operand2=stack.pop();
     int operand1=stack.pop();
     switch(ch){
     case'+':
       stack.push(operand1+operand2);
       break;
     case'-':
       stack.push(operand1-operand2);
       break;
     case'*':
       stack.push(operand1*operand2);
       break;
     case'/':
       stack.push(operand1/operand2);
       break;
     }
   }
}
   return stack.pop();
}
public static void main(string[]args){
  string postfixexpression="231*+9-";
  int result=evaluatepostfix(postfixexpression);
  system.out println(the result of the postfixexpression \" "+ postfixexpression + "/" is:"+ result");
  }
}

