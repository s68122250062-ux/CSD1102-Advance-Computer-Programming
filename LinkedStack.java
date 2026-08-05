// Class สำหรับ Node ของ Linked List
class Node {
    Object element;
    Node next;

    public Node(Object element) {
        this.element = element;
        this.next = null;
    }
}

// Class สำหรับการจัดการ Stack ด้วย Linked List
public class LinkedStack {
    private Node top; // ตัวชี้ไปยัง Node บนสุดของ Stack
    private int size; // ตัวแปรเก็บจำนวนข้อมูล

    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    // 1. push: เพิ่มข้อมูลเข้า Stack (ต่อไว้ที่ตำแหน่ง top)
    public void push(Object x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // 2. pop: ดึงและลบข้อมูลจากส่วนบนสุดของ Stack
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return null;
        }
        Object removedData = top.element;
        top = top.next; // ขยับ top ไป Node ถัดไป
        size--;
        return removedData;
    }

    // 3. peek: ดูข้อมูลบนสุดของ Stack โดยไม่ลบออก
    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return null;
        }
        return top.element;
    }

    // 4. isEmpty: ตรวจสอบว่า Stack ว่างหรือไม่
    public boolean isEmpty() {
        return top == null;
    }

    // 5. getSize: รับค่าจำนวนข้อมูลใน Stack
    public int getSize() {
        return size;
    }

    // เมธอดสำหรับแสดงข้อมูลทั้งหมดใน Stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        Node current = top;
        System.out.print("Stack (Top -> Bottom): ");
        while (current != null) {
            System.out.print(current.element + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // ทดสอบการทำงานใน main
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        // ทดสอบ Push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // แสดง: 30 -> 20 -> 10 -> null

        // ทดสอบ Peek
        System.out.println("Top element: " + stack.peek()); // 30

        // ทดสอบ Pop
        System.out.println("Popped: " + stack.pop()); // 30
        stack.display(); // แสดง: 20 -> 10 -> null

        // ตรวจสอบว่าว่างหรือไม่
        System.out.println("Is empty: " + stack.isEmpty()); // false
    }
}