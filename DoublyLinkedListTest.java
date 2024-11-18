import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class DoublyLinkedListTest {
    @org.junit.jupiter.api.Test
    void add() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        assertEquals(list.toString(),"10");
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1,15);
        assertEquals(list.toString(), "10152030");
    }

    @org.junit.jupiter.api.Test
    void remove() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.remove();
        assertEquals(list.size(),0);
    }

    @org.junit.jupiter.api.Test
    void testRemove() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        assertEquals(list.toString(),"1030");
    }

    @org.junit.jupiter.api.Test
    void get() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(30);
        assertEquals(list.get(1).getValue(),30);
    }

    @org.junit.jupiter.api.Test
    void set() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.set(0,20);
        assertEquals(list.toString(),"20");
    }

    @org.junit.jupiter.api.Test
    void size() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        assertEquals(list.size(), 1);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertEquals(list.isEmpty(),true);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        assertEquals(list.toString(),"10");
    }
}
