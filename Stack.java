import java.util.*;

public class Stack {
    public final int max =  5;
   public int []arr = new int[max];
   public int top = -1;
   
   public void push(int data){
    if(top == max-1){
        System.out.println("Overflow condition is arrived");
        return;
    }
    top++;
    arr[top]= data;
     System.out.println("Push :"+data);
   }

   public void pop(){
    if(top == -1){
        System.out.println("underflow condition is arrived");
        return;
    }
    top--;
    int popd=arr[top];
     System.out.println("Pop :"+popd);
     return;
   }
    
   public void peep(int data){
    arr[top]= data;
    System.out.println("Peep :"+data);
     return;

   }
public static void main(String[] args) {
   Stack st = new Stack();
   st.push(10); 
   st.push(20); 
   st.push(30); 
   st.push(40); 
   st.push(50); 
   st.push(60); 
   st.pop();
   st.peep(50);
   st.pop();
   st.pop();
   st.peep(40); 
}
}
