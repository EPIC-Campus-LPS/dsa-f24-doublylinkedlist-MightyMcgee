public class DoublyLinkedList<E> implements List{
    private int size;
    private Node firstNode;
    private Node lastNode;

    /**
     * make a list of 0 length
     */
    public DoublyLinkedList(){
        size = 0;
    }

    /**
     * make a list of specified length
     * @param length
     */
    public DoublyLinkedList(int length){
        size=length;
        firstNode = null;
    }

    /**
     * add a node to the end of the list
     * @param element value of the node being added
     */
    @Override
    public void add(Object element) {
        Node newNode = new Node(element);
        if(size == 0){
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNext(newNode);
            newNode.setPrev(lastNode);
            lastNode = newNode;
        }
        size++;
    }

    /**
     * add an element at a specified index of the list
     * @param i index of the element being added
     * @param element value of the element
     * @throws IndexOutOfBoundsException if i is outside of the list, error
     */
    @Override
    public void add(int i, Object element) throws IndexOutOfBoundsException {
        try {
            Node<E> currNode = firstNode;
            for (int j = 1; j < i; j++) {
                currNode = currNode.getNext();
            }
            Node<E> newNode = new Node(element);
            newNode.setNext(currNode.getNext());
            newNode.setPrev(currNode);
            currNode.getNext().setPrev(newNode);
            currNode.setNext(newNode);
            size++;
        }
        catch (Exception IndexOutOfBoundsException){
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * gets rid of all nodes in the list
     */
    @Override
    public void remove() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    /**
     * gets rid of a node at a specified index
     * @param i index of the element to remove
     * @return the value of the element being rmeoved
     * @throws IndexOutOfBoundsException if i is outside of the list, error
     */
    @Override
    public Node remove(int i) throws IndexOutOfBoundsException {
        try {
                Node<E> currNode = firstNode;
                for (int j = 0; j < i; j++) {
                    currNode = currNode.getNext();
                }
                Node<E> temp2 = new Node(currNode);
                currNode.getPrev().setNext(currNode.getNext());
                currNode.getNext().setPrev(currNode.getPrev());
                size--;
                return temp2;
        }
        catch (Exception IndexOutOfBoundsException){
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * returns the value of the node at index i
     * @param i index of the element
     * @return the value of i
     * @throws IndexOutOfBoundsException if i is outside of the list, error
     */
    @Override
    public Node get(int i) throws IndexOutOfBoundsException {
        try {
            Node<E> currNode = firstNode;
            for (int j = 0; j < i; j++) {
                currNode = currNode.getNext();
            }
            return currNode;
        }
        catch(Exception IndexOutOfBoundsException){
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * sets the value of the node at index i
     * @param i index of the element to set
     * @param element new value of the element
     * @throws IndexOutOfBoundsException if i is outside of the list, error
     */
    @Override
    public void set(int i, Object element) throws IndexOutOfBoundsException {
        try {
            Node<E> currNode = firstNode;
            for (int j = 0; j < i; j++) {
                    currNode = currNode.getNext();
                }
            currNode.setValue((E) element);
        }
        catch(Exception IndexOutOfBoundsException){
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * gets how many nodes are in the list
     * @return the amount of nodes
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * checks if the list is empty or not
     * @return true if the list has no nodes or false if there are nodes
     */
    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        else {return false;}
    }

    /**
     * turns all values of the list to a string
     * @return all values in the list as a string
     */
    @Override
    public String toString(){
        String s = "";
        Node<E> n = firstNode;
        for (int x = 0; x < size; x++) {
            s+=n+"";
            n = n.getNext();
        }
    return s;
    }
}
