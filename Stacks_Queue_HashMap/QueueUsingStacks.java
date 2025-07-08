import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack1; // For enqueue
    private Stack<Integer> stack2; // For dequeue
    
    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void enqueue(int x) {
        stack1.push(x);
    }
    
    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.peek());   // 2
        System.out.println(queue.dequeue()); // 2
        System.out.println(queue.dequeue()); // 3
    }
}