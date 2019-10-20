import java.util.*;

public class DIYarrayList<T> implements List<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private int size;
    transient Object[] objects;


    //конструктор с заданным размером
    public DIYarrayList(int size) {
        if (size >= 0) {
            this.size = size;
            objects = new Object[size];
        }
        else {
            throw new IllegalArgumentException("Wrong size");
        }
    }

    //конструктор с defaul размером
    public DIYarrayList() {
        this.objects = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    @Override
    public boolean add(T t) {
        add(t, objects, size);
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) objects[index];
    }

    @Override
    public T set(int index, T element) {
        Objects.checkIndex(index, size);
        T oldValue = (T) objects[index];
        objects[index] = element;
        return oldValue;
    }

    @Override
    public ListIterator<T> listIterator() {
        return new ListItr(0);
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(objects, size);
    }

    private void add(T t, Object[] obj, int n) {
        if (n == obj.length){
            obj = increase(size + 1);
        }
        obj[n] = t;
        size = n + 1;
    }

    private Object[] increase(int minSize) {
        return objects = Arrays.copyOf(objects,
                newSize(minSize));
    }

    private int newSize(int minCapacity) {
        int oldSize = objects.length;
        int newSize = oldSize + (oldSize >> 1);
        if (newSize - minCapacity <= 0) {
            if (objects == DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
                return Math.max(DEFAULT_CAPACITY, minCapacity);
            if (minCapacity < 0)
                throw new OutOfMemoryError();
            return minCapacity;
        }
        return (newSize - MAX_ARRAY_SIZE <= 0)
                ? newSize
                : superCapacity(minCapacity);
    }

    private static int superCapacity(int minCapacity) {
        if (minCapacity < 0)
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE)
                ? Integer.MAX_VALUE
                : MAX_ARRAY_SIZE;
    }

    @Override
    public boolean isEmpty() {
       return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
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
    public void add(int index, T element) {
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
    public void clear() {
        throw new UnsupportedOperationException();
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
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    private class ListItr implements ListIterator<T> {

        int cursor;
        int lastRet = -1;

        public ListItr(int index) {
            this.cursor = index;
        }

        @Override
        public T next() {
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] elementData = DIYarrayList.this.objects;
            cursor = i + 1;
            return (T) elementData[lastRet = i];
        }

        @Override
        public void set(T t) {
            if (lastRet < 0)
                throw new IllegalStateException();

            try {
                DIYarrayList.this.set(lastRet, t);
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }

        }

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public boolean hasPrevious() {
            throw new UnsupportedOperationException();
        }

        @Override
        public T previous() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int nextIndex() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int previousIndex() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void add(T t) {
            throw new UnsupportedOperationException();
        }
    }
}
