import java.util.*;
class MicrosoftQue1 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i]=="+"){
                int a1 = stk.pop();
                int a2 = stk.pop();
                stk.push(a1+a2);
            }else if(tokens[i]=="-"){
                int a1 = stk.pop();
                int a2 = stk.pop();
                stk.push(a1-a2);
            }else if(tokens[i]=="*"){
                int a1 = stk.pop();
                int a2 = stk.pop();
                stk.push(a1*a2);
            }else if(tokens[i]=="/"){
                int a1 = stk.pop();
                int a2 = stk.pop();
                stk.push(a2/a1);
            }else{
                int a=Integer.parseInt(tokens[i]);
                stk.push(a);
            }
        }
        return stk.pop();
    }
    public static void main(String[] args) {
        String tokens[]={"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));
    }
}