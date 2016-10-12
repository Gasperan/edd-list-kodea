import java.util.List;

public class LinkedList<AnyType> {
    public ListNode<AnyType> header;

    public LinkedList() {
        header = new ListNode<AnyType>(null);
    }

    public void insert(ListNode<AnyType> element, LinkedListIterator<AnyType> itr) {
        itr.current.next = element;
    }
/*
    public AnyType remove(AnyType element) {

    }

    public AnyType get(int i) {

    }
*/
    public void clear() {
        header.next = null;
    }


    public int size() {
        int count=0;
        LinkedListIterator itr = new LinkedListIterator(header);
        while (itr.isValid()){
            count++;
            itr.advance();
        }
        return count;
    }

    public boolean contains(AnyType e) {
return true;
    }


}
