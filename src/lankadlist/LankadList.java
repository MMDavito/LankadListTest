/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lankadlist;

/**
 *
 * @author daca97002
 */
public class LankadList<T> {

    private ListNode first;

    public LankadList() {
        first = null;
    }

    public void insert(T a) {
        first = new ListNode(a, first);
    }

    public int change(T what, int at) {
        //OBS TOTALT OSÄKER/OTESTAD!!!!
        System.out.println("Du kommer till change");
        int size = 0;
        int compare = 0;
        ListNode temp = first;
        ListNode temp2 = first;

        System.out.println("\n\n");
        while (temp != null) {
            compare = size + 1;
            System.out.println(size + " " + compare);
            if (compare == at) {
                System.out.println("IFFFFF");
                System.out.println(temp);
                System.out.println(temp + " " + temp2);

                temp2 = temp.getNext();

                System.out.println("+");
                ListNode ins = new ListNode(what, temp2);

                System.out.println(temp.getNext());
                temp.setNext(ins);
                System.out.println("HELLpOK " + ins + " Fjanten " + ins.getNext());
                System.out.println(temp + " HEJ   " + temp.getNext());

                temp.getNext().setNext(temp2);
                return 1;
            }

            temp2 = temp.getNext();
            temp = temp.getNext();
            size++;
        }
        return -1;
    }

    public int sortList(int a) throws Exception {
        /*MASSA SKIT OM SORTERA
int size = 0;
        ListNode temp = first;
        while (temp != null) {
            size++;
            temp = temp.getNext();
        }

        System.out.println(size + "\n");
        if (size == 0) {
            throw new NullPointerException();
        } else if (size == 1) {
            temp = first;
            int b = temp.getData();
            if (b == a) {
                System.out.println("A och B är lika");
                return 0;
            } else if (b < a) {
                System.out.println("A är större än B");
                return 1;
            } else {
                System.out.println("A är mindre än B");
                return -1;
            }
        } else if (size > 1) {
            if (size % 2 == 0) {
                System.out.println("Listan har jämn längd");
                
                int sort = (size/2)-1;
                if(sort<a){
                    System.out.println("A är i andra halvan av listan");}
                return 2;
            } else {
                System.out.println("Listan har udda längd");
                return 3;
            }
        }
         */
        return -2;

    }

    public void showList() {
        ListNode temp = first;
        while (temp != null) {
            System.out.println(temp.getData() + " ");
            System.out.println(temp.getNext());
            temp = temp.getNext();
        }
    }

    public static void main(String[] args) {
        LankadList<Integer> li = new LankadList<>();
        li.insert(4);
        li.insert(6);
        li.insert(8);
        li.insert(2);
        li.insert(9);
        li.insert(9);
        li.showList();
        System.out.println("\n");
        li.change(523, 3);
        li.showList();

    }
}
