

public class ListNode<AnyType> {
    public AnyType element;
    public ListNode<AnyType> next;

    public ListNode(AnyType e) {
        this(e,null);
    }

    public ListNode(AnyType element, ListNode<AnyType> next) {
        this.element = element;
        this.next = next;
    }
}
