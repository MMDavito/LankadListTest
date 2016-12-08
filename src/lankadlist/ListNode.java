package lankadlist;

/**
 *
 * @author daca97002
 */
public class ListNode<T>{

    private T data;
    private ListNode next;

    public ListNode(T d, ListNode n) {
        data = d;
        next = n;
    }

    public ListNode setData(T newData) {
        data = newData;
        return next;        
    }
    /*public ListNode insertWhere(ListNode current, T values){
    
    }*/

    public T getData() {
        return data;
    }

    public void setNext(ListNode newNext) {
        next = newNext;
    }

    public ListNode getNext() {
        return next;
    }
    public int deleteInList(ListNode list, T delete){    
    return -1;
    }
    //public int changeList(ListNode list)
}
//se om du kan sortera listan.