import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListTest {

    @Test
    public void shouldInsertElements() throws Exception {
        LinkedList<Integer> lista = new LinkedList<Integer>();

        LinkedListIterator<Integer> itr = new LinkedListIterator<Integer>(lista.header);

        lista.insert(new ListNode<Integer>(3),itr);

        Assert.assertEquals(new Integer(3),(Integer)lista.header.next.element);

    }

    @Test
    public void shouldInsertTwhoElements() throws Exception {
        LinkedList<Integer> lista = new LinkedList<Integer>();

        LinkedListIterator<Integer> itr = new LinkedListIterator<Integer>(lista.header);

        lista.insert(new ListNode<Integer>(3),itr);

        LinkedListIterator<Integer> itr2 = new LinkedListIterator<Integer>(lista.header.next);

        lista.insert(new ListNode<Integer>(4),itr2);

        Assert.assertEquals(new Integer(4),lista.header.next.next.element);
    }
}