public class myList<Item> {
    private Node first = null;                //ссылка на первый элемент списка
    private Node last = null;                 //ссылка на последний элемент списка
    private int n = 0;                        //число элементов в списке

    private class Node {                      //узел
        Item value;
        Node next;
        Node(){                                //конструктор
        }
        Node(Item val) {                       //конструктор копирования
            value = val;
            next = null;
        }
    }

    public int size() {                        //число элементов в списке
        return n;
    }

    public void addFirst(Item val) {           //добавить элемент в начало списка
        Node a = new Node(val);
        if (first == null){                    //если список пуст
            first = a;
            last = a;
        } else {
            a.next = first;
            first = a;
        }
        n++;
    }

    public void addLast(Item val) {             //добавить элемент в конец списка
        Node a = new Node(val);
        //a.value = val;
        if (last == null){                      //если список пуст
            first = a;
            last = a;
        } else {
            last.next = a;
            last = a;
        }
        n++;
    }

    public void delFirst() {                     //удалить элемент из начала списка
        if (n == 0) {
            System.out.println("No!");
            return;
        }
        if (n > 0) {
            first = first.next;
            n--;
        }
    }

    public void delEl(Item val) {
        Node temp = first, prev = null;
            if (temp != null && temp.value == val) { //если нужный элемент стоит первым в списке
                first = temp.next;
                n--;
                return;
            }

            while (temp != null && temp.value != val) {
                prev = temp;
                temp = temp.next;
                //n--;
            }

            if (temp == null)                           //если данного элемента не было в списке
                return;

            prev.next = temp.next;
            n--;
    }


    public void delAll(){                               //удалить все элементы
        while(n!=0) {
            delFirst();
        }
    }

    public void printing(){                             //вывод на экран
        Node t = first;
        while (t != null)
        {
            System.out.println(t.value);
            t = t.next;
        }
    }
}