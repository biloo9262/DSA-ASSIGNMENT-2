public class QueueQ4 {
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
        }
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
        } else {
            front++;

            if (front > rear) {
                front = rear = -1;
            }
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
        QueueQ4 q = new QueueQ4();

        q.enqueue(10);
        q.display();

        q.enqueue(20);
        q.display();

        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.display();

        q.dequeue();
        q.display();

        System.out.println("Front Element: " + q.queue[q.front]);
    }
}
