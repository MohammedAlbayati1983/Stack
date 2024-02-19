public class Main {
    public static void main(String[] args) {
        Stack s =new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.pop();
        s.push(7);
        s.print();
        s.getTop();
    }
}