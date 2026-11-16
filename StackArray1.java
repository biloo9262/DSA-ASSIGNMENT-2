public class StackArray1 {
    int stack[] = new int[5];
    int top = -1;

    void push(int value) {
        if (top == 4) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackArray1 s = new StackArray1();

        s.push(10);
        s.display();

        s.push(20);
        s.display();

        s.push(30);
        s.display();

        s.pop();
        s.display();

        s.push(40);
        s.display();

        s.pop();
        s.display();

        System.out.println("Top Element: " + s.stack[s.top]);
    }

}
