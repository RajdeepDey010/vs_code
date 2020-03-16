import java.util.Scanner;

class stack_in_java {
    int arr[];
    int l;
    int top;

    stack_in_java(int len) {
        arr = new int[len];
        l = len;
        top = -1;
    }

    void push(int data) {
        if (top == l - 1) {
            System.out.println("Overflow");
        } else {
            arr[++top] = data;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            // System.out.println("Poped element is"+arr[top]);
            top--;
        }
    }

    int topelement() {
        return arr[top];
    }
}

class stack_call {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        stack_in_java s1 = new stack_in_java(10);
        stack_in_java s2 = new stack_in_java(10);
        System.out.println("Enter the 1st stack");
        for (int i = 0; i < 10; i++) {
            a = sc.nextInt();
            s1.push(a);
        }
        System.out.println("Enter the 2nd stack");
        for (int i = 0; i < 10; i++) {
            a = sc.nextInt();
            s2.push(a);
        }
        for (int i = 1; i <= 10; i++) {
            if (s1.topelement() == s2.topelement()) {
                System.out.println("equal");
            } else if (s1.topelement() > s2.topelement()) {
                System.out.println("s1");
            } else {
                System.out.println("s2");
            }
            s1.pop();
            s2.pop();
            sc.close();
        }
    }
}
