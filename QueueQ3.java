public class QueueQ3 {
    int queue[] = new int[5];
    int front = -1;
    int rear = -1;

    void enqueue(int value) {
        if (rear == 4) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(value + " Inserted");
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " Removed");
            front++;

            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    void showFront() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Element: " + queue[front]);
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueQ3 q = new QueueQ3();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.showFront();

        q.dequeue();
        q.display();
    }
}
