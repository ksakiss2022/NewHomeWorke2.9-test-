import java.util.*;

public class Queue implements java.util.Queue<String> {
    private static final List<String> NAMES = List.of(
            "Иванова Елена Евгеньевна",
            "Чибисова Анна Сергеевна",
            "Дубова Марина Владимировна",
            "Резникова Ирина Борисовна",
            "Гадалкина Ольга Владимировна",
            "Лапкина Татьяна Юрьевна",
            "Лободина Светлана Александровна",
            "Рыбкина Ольга Юрьевна"
    );
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        java.util.Queue<String> queue2 = new ArrayDeque<>();
        java.util.Queue<String> queue1 = new ArrayDeque<>();
        randomFilling((Queue) queue1);
        randomFilling((Queue) queue2);
        System.out.println("Очередь 1" + queue1);
        System.out.println("Очередь 2" + queue2);
        System.out.println();
        add("Рыбкина Ольга Юрьевна", (Queue) queue1, (Queue) queue2);
        System.out.println("Очередь 1" + queue1);
        System.out.println("Очередь 2" + queue2);
        System.out.println();
        remove((Queue) queue1, (Queue) queue2);
        System.out.println("Очередь 1" + queue1);
        System.out.println("Очередь 2" + queue2);
        System.out.println();
    }

    private static void add(String name,
                            Queue queue1,
                            Queue queue2) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("Нужно позвать Галю!");
            return;
        }
        if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        } else {
            queue2.offer(name);


        }
    }

    private static void remove(Queue queue1,
                               Queue queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    private static void randomFilling(Queue queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String s) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(String s) {
        return false;
    }

    @Override
    public String remove() {
        return null;
    }

    @Override
    public String poll() {
        return null;
    }

    @Override
    public String element() {
        return null;
    }

    @Override
    public String peek() {
        return null;
    }
}
