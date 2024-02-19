public class Stack {
    final int MAX_SIZ = 100;
    int top;
    int[] item = new int[MAX_SIZ];

    public Stack() {
        top = -1;
    }

    public void push(int Element) {
        if (top >= MAX_SIZ - 1)
            System.out.println("Stack full on push");
        else {
            top++;
            item[top] = Element;
        }
    }

    public Boolean isEmpty() {
        return (top < 0);
    }

    public void pop() {
        if (isEmpty())
            System.out.println("Stack empty on pop");
        else
            top--;
    }


    public void getTop() {
        if (isEmpty())
            System.out.println("Stack empty on getTop");
        else
            System.out.println(item[top]);
    }

    public void print() {
        System.out.print('[');
        for (int i = top; i >= 0; i--) {
            System.out.print(item[i] + " ");
        }
        System.out.println("\b" + ']');
    }
}
