import java.util.*;

public class DIYarrayList<T> implements List<T> {
      private int size;
      Object[] objects;
      private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};


    //если хотим задать с заданным размером
    public DIYarrayList(int size) {
        if(size >= 0){
            this.size = size;
             objects = new Object[size];
        }
        else{
            throw new IllegalArgumentException("wrong size");
        }
     }

     //тут размер по дефолту DEFAULTCAPACITY_EMPTY_ELEMENTDATA
     public DIYarrayList(){
           objects = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
     }

//todo что возвращать и как заменить существующий массив
    @Override
    public boolean add(T t){
        if(objects.length+1<size){
            objects[objects.length+1]=t;
            return true;
        }
        else {
            size++;
            objects[objects.length+1]= t;
            return true;
        }
    }

    @Override
    public int size() {
        return this.size();
    }

    @Override
    public boolean isEmpty() {
        return 0 == size();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();

    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(objects, size);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void sort(Comparator<? super T> c) {

    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();

    }

    @Override
    public T get(int index) {
       Objects.checkIndex(index,size());
       return (T) objects[index];
    }

    @Override
    public T set(int index, T element) {
        Objects.checkIndex(index,size());
        T obj = (T) objects[index];
        objects[index] = element;
        return obj;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();

    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();

    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException();

    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();

    }
}
