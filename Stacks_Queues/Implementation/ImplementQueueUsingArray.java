package Stacks_Queues.Implementation;

public class ImplementQueueUsingArray {
    static class ArrayQueue{
        private int[] array ;
        private int capacity ;
        private  int count ;
        private  int front ;
        private  int rear ;

        public  ArrayQueue(int capacity){
            this.capacity = capacity;
            this.array = new int[capacity];
            this.front = 0 ;
            this.rear = 0 ;
            this.count = 0 ;
        }

        public void push(int x){
            if(count == capacity){
                System.out.println("Queue is Full");
                return ;
            }
            array[rear] = x;
            rear = (rear+1) % capacity ;
            count ++;
        }

        
        public int pop() {
             if (count == 0) {
                System.err.println("Queue is empty");
                return -1;
            }
            int val = array[front];
             front = (front + 1) % capacity; // wraps around to 0
            count--;
            return val;
        }


        public int peek() {
            // Check if empty, else return arr[front]
            if(count == 0){
                return  -1;
            }
            else{
                return  array[front];
            }
        }

        public boolean isEmpty() {
            return count == 0;
        }
    
    }
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);
        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front: " + q.peek()); // Expected: 10
        System.out.println("Popped: " + q.pop());   // Expected: 10
        System.out.println("Front: " + q.peek()); // Expected: 20
    }
}
