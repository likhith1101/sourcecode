package tuplesandpairs;

import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import java.util.Arrays;

public class Pair<T> extends Tuple<T> {
	
	private Object[] elements;

    public Pair(T first, T second) {
        super();
        add(first);
        add(second);
    }

    public T getFirst() {
        return (T) this.toArray(new Object[0])[0];
    }

    public T getSecond() {
        return (T) this.toArray(new Object[0])[1];
    }

    //extra methods
    public void swap() {
        T temp = getFirst();
        elements[0] = getSecond();
        elements[1] = temp;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Pair<?> pair = (Pair<?>) obj;
        
        return getFirst().equals(pair.getFirst()) && getSecond().equals(pair.getSecond());
    }

    public String toString() {
        return "(" + getFirst() + ", " + getSecond() + ")";
    }
    
    

    //overridden methods
    @Override
    public boolean add(T element) {
        throw new UnsupportedOperationException("Adding elements to a Pair is not supported.");
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Adding a collection to a Pair is not supported.");
    }

    @Override
    public boolean remove(Object element) {
        throw new UnsupportedOperationException("Removing elements from a Pair is not supported.");
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Removing a collection from a Pair is not supported.");
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Retaining elements in a Pair is not supported.");
    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException("Setting elements in a Pair is not supported.");
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Iterating over a Pair is not supported.");
    }

   
}
