package tuplesandpairs;

import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;

public class Tuple<T> implements Collection<T> {

	private Object[] elements;
    private int size;

    public Tuple() {
        elements = new Object[10];
        size = 0;
    }
    
    

    @Override
    public boolean add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        elements[size++] = element;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        for (T element : collection) {
            add(element);
        }
        return true;
    }

    @Override
    public void clear() {
        elements = new Object[10];
        size = 0;
    }

    @Override
    public boolean contains(Object element) {
        return Arrays.asList(elements).contains(element);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return Arrays.asList(elements).containsAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                return (T) elements[currentIndex++];
            }
        };
    }

    @Override
    public boolean remove(Object element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        boolean modified = false;
        for (Object element : collection) {
            modified |= remove(element);
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return Arrays.asList(elements).retainAll(collection);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    @Override
    public <T> T[] toArray(T[] array) {
        return (T[]) Arrays.copyOf(elements, size, array.getClass());
    }

	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}
}
