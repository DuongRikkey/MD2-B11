package Collection.EX7;

public class MyList<E> {
    private int size=0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements [];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index, E element) {
        if(index<0 || index>size){
            System.out.println("Chỉ số không đúng");
            return;
        }
        for(int i=size;i>index;i--){
            elements[i]=elements[i-1];//Gian cac phan tu
        }
        elements[index]=element;
        size++;
    }
    public E remove(int index) {
        if(index<0 || index>size){
            System.out.println("Chỉ số không đúng");
            return null;
        }
        Object temp=elements[index];
        for(int i=index;i<size-1;i++){
            elements[i]=elements[i+1];
            //Dồn các phần tử về phía trước

        }
        size--;
        return (E) temp;
    }

    public int size(){
        return size;
    }
    public boolean contains(E o) {
        for(Object elem:elements){
            if(elem==null){
                break;
            }
            E obj=(E) elem;
            if(obj.equals(o)){
                return true;
            }
        }
        return false;
    }
    public int IndexOf(E o) {
        for(int i=0;i<size;i++){
            E elem=(E) elements[i];
            if(elem.equals(o)){
                return i;
            }
        }
        return -1;
    }
    public boolean add(E e) {
        if(size>=elements.length){
            return false;
        }
        elements[size++]=e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if(elements.length-size>minCapacity){
            System.out.println("Sure capacity");
        }
        else {
            System.out.println("Can't capacity!");
        }
    }
    public E get(int i) {
        if(i<0 || i>size){
            return null;
        }
        return (E) elements[i];
    }
    public void clear(){
        for(int i=size-1;i>=0;i--){
            elements[i]=null;
        }
        size=0;
    }

}
