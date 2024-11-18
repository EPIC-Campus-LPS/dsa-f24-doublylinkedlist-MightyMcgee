public class Main {
    public static void main(String[] args) {
        Node<String> first = new Node<>("obtuse");

        Node<String> next = new Node<>("rubber goose");
        first.setNext(next);
        next.setPrev(first);

        Node<String> after = new Node<>("guava juice", next);
        next.setNext(after);
        System.out.println(after.getPrev().getValue()); // "rubber goose"

        Node<String> last = new Node<>("giant snake");
        System.out.println(next.equals(last));

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.toString()); // [10, 20, 30]

        list.add(1, 40);
        list.add(0, 5);
        list.set(2, 50);
        System.out.println(list.toString()); // [5, 10, 50, 20, 30]
        System.out.println(list.get(0));
        list.remove(4);
        list.remove(1);
        System.out.println(list.size()); // 3
        System.out.println(list.toString()); // [5, 50, 20]
        list.isEmpty();
        list.add(100,0);
        list.remove(100);
        list.set(100,0);
        list.get(100);
        list.get(1);
        list.remove();
    }
}