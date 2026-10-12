package Stacks_Queues.Implementation;

public class ImplementStackUsingArrays {
    static class ArrayStack{
        private int[] arr ;
        private int capacity ;
        private int top ;

        public ArrayStack(int capacity){
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.top = -1;
        }

        public void push(int x){
            if(top == capacity-1){
                System.out.println("Stack overflow");
                return ;
            }
            top++;
            arr[top] = x ;
        }

        public int pop(){
            if(top == -1 ){
                System.err.println("Stack underflow");
                return -1;
            }
            int val = arr[top];
            top--;
            return val;
        }

        public int top(){
            if(top == -1){
                return -1;
            }
            return  arr[top];
        }

        public boolean isEmpty(){
            return top == -1;
        }
    }
    public static void main(String[] args) {
         ArrayStack st = new ArrayStack(5);
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element: " + st.top()); // 30
        System.out.println("Popped element :" + st.pop());       // 30
        System.out.println("Top element: " + st.top()); // 20
        System.out.println("Is empty: " + st.isEmpty()); // false
    }
}
