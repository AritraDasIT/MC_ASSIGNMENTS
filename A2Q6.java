/* Implement a class for stack of integers using an array. Please note that the
operations defined for a stack data structure are as follows: "push". "pop"."print".
There should be a constructor to create an array of integers; The size of the
array is provided by the user.
Write a "main" function to (i) create a stack to hold maximum of 30
integers: (ii) push the numbers 10, 20, 30. 15, 9 to the stack:(iii) print the
stack: (ii) pop thrice and (iv) print the stack again. 
*/









// Stack class using array
class Stack {
    private int[] arr;
    private int top;
    private int maxSize;

    // Constructor
    public Stack(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        arr[++top] = value;
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return;
        }
        System.out.println("Popped: " + arr[top--]);
    }

    // Print stack elements
    public void print() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack contents (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Step (i): Create a stack of size 30
        Stack stack = new Stack(30);

        // Step (ii): Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(15);
        stack.push(9);

        // Step (iii): Print the stack
        System.out.println("Stack after pushing 5 elements:");
        stack.print();

        // Step (iv): Pop three times
        stack.pop();
        stack.pop();
        stack.pop();

        // Step (v): Print the stack again
        System.out.println("Stack after popping 3 elements:");
        stack.print();
    }
}
