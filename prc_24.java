import java.util.PriorityQueue;

public class prc_24 {
    public static void main(String[] args) {
        MyPriorityQueue<String> queue = new MyPriorityQueue<>();
        queue.offer("11");
        queue.offer("12");
        queue.offer("13");
        queue.offer("14");
        queue.offer("15");

        MyPriorityQueue<String> queue1 = null;
        try {
            queue1 = (MyPriorityQueue<String>) (queue.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.print(queue1);
    }

    static class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {
        @Override
        public Object clone() throws CloneNotSupportedException {
            MyPriorityQueue<E> clone = new MyPriorityQueue<>();
            this.forEach(clone::offer);
            return clone;
        }

    }
}