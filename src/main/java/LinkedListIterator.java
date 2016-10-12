
public class LinkedListIterator<AnyType> {
    ListNode<AnyType> current;

    public LinkedListIterator( ListNode<AnyType> node ) {
        this.current = node;
    }

    public boolean isValid() {
        return this.current != null;
    }

    public void advance() {
        if (isValid())
            current = current.next;
    }

    public AnyType retrieve() {
        return isValid() ? current.element : null ;
    }
}
