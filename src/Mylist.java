public class Mylist<E> {
    int size = 0;
    static final int DEFAULT_CAPACYTI = 10;
    Object elements[];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACYTI];
    }
    public void ensureCapacity(int minCapacity){
        Object[] elemens2 = new Object[elements.length +minCapacity];
        System.arraycopy(elements,0,elemens2,0,size);
        elements = elemens2;
    }

    public void add(int index, E element) {
        if (size >= elements.length) {
            ensureCapacity(15);
        }
        System.arraycopy(elements, index, elements, index + 1, elements.length - index - 1);
        elements[index] = element;
        size++;
    }
    E remove(int index){
        E temp = (E) elements[index];
        System.arraycopy(elements,index+1,elements,index,size-index-1);
        elements[size=1] = null;
        size--;
        return temp;
    }
    public int size(){
        return size;
    }
    public Mylist<E> clone(){
        Mylist<E> elementClone = new Mylist<>();
        System.arraycopy(elements,0,elementClone,0,size);
        return elementClone;
    }
    public boolean contains(E o){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o){
                return true;
            }
        }return false;
    }
    public int indexOf(E o){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] ==o){
                return i;
            }
        }return -1;
    }
    public boolean add(E e){
        add(e);
        return true;
    }
    public Object get(int i) {
        if (0 <= i && i < size) {
            return elements[i];
        }
        return null;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACYTI];
    }



}
