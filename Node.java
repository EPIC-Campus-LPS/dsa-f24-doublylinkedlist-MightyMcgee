class Node<E>{
    private E obj;
    private Node<E> nextNode;
    private Node<E> firstNode;

    /**
     * creates a new empty node
     */
    public Node(){
        obj = null;
        nextNode = null;
        firstNode = null;
    }

    /**
     * creates a new node with value
     * @param value whatever value you want in the node
     */
    public Node(E value){
        obj = value;
        firstNode = null;
        nextNode = null;
    }

    /**
     * creates a new node with value and prev
     * @param value the value of the node
     * @param prev value of the node before
     */
    public Node(E value, Node<E> prev){
        obj = value;
        firstNode = prev;
        nextNode = null;
    }

    /**
     * gets the value of the node
     * @return value
     */
    public E getValue(){
        return this.obj;
    }

    /**
     * sets the value of the node to whatever you want
     * @param obj2 the value you are setting the node to
     */
    public void setValue(E obj2){
        obj = obj2;
    }

    /**
     * sets the next node
     * @param nextNode the node to set it to
     */
    public void setNext(Node<E> nextNode){
        this.nextNode = nextNode;
    }

    /**
     * sets the previous node
     * @param firstNode the node to set it to
     */
    public void setPrev(Node<E> firstNode){
         this.firstNode = firstNode;
    }

    /**
     * gets the next node
     * @return the next node
     */
    public Node<E> getNext(){
        return nextNode;
    }

    /**
     * gets the previous node
     * @return the previous node
     */
    public Node<E> getPrev(){
        return firstNode;
    }

    /**
     * turns the value of the nodes into a string
     * @return the value as a string
     */
    public String toString(){
        return obj + "";
    }
}

