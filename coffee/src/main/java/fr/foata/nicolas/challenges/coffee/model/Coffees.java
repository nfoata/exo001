package fr.foata.nicolas.challenges.coffee.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Coffees implements Iterable<ICoffee> {

	private List<ICoffee> list = null;
	
	public Coffees() {
		this( new ArrayList<ICoffee>() );
	}
	
	public Coffees( List<ICoffee> list ) {
		super();
		this.setList(list);
	}
	
	private void setList( List<ICoffee> list  ) {
		this.list = list;
	}

	public void forEach(Consumer<? super ICoffee> action) {
		list.forEach(action);
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public boolean contains(Object o) {
		return list.contains(o);
	}

	public Iterator<ICoffee> iterator() {
		return list.iterator();
	}

	public Object[] toArray() {
		return list.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return list.toArray(a);
	}

	public boolean add(ICoffee e) {
		return list.add(e);
	}

	public boolean remove(Object o) {
		return list.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return list.containsAll(c);
	}

	public boolean addAll(Collection<? extends ICoffee> c) {
		return list.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends ICoffee> c) {
		return list.addAll(index, c);
	}

	public boolean removeAll(Collection<?> c) {
		return list.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return list.retainAll(c);
	}

	public void replaceAll(UnaryOperator<ICoffee> operator) {
		list.replaceAll(operator);
	}

	public boolean removeIf(Predicate<? super ICoffee> filter) {
		return list.removeIf(filter);
	}

	public void sort(Comparator<? super ICoffee> c) {
		list.sort(c);
	}

	public void clear() {
		list.clear();
	}

	public boolean equals(Object o) {
		return list.equals(o);
	}

	public int hashCode() {
		return list.hashCode();
	}

	public ICoffee get(int index) {
		return list.get(index);
	}

	public ICoffee set(int index, ICoffee element) {
		return list.set(index, element);
	}

	public void add(int index, ICoffee element) {
		list.add(index, element);
	}

	public Stream<ICoffee> stream() {
		return list.stream();
	}

	public ICoffee remove(int index) {
		return list.remove(index);
	}

	public Stream<ICoffee> parallelStream() {
		return list.parallelStream();
	}

	public int indexOf(Object o) {
		return list.indexOf(o);
	}

	public int lastIndexOf(Object o) {
		return list.lastIndexOf(o);
	}

	public ListIterator<ICoffee> listIterator() {
		return list.listIterator();
	}

	public ListIterator<ICoffee> listIterator(int index) {
		return list.listIterator(index);
	}

	public List<ICoffee> subList(int fromIndex, int toIndex) {
		return list.subList(fromIndex, toIndex);
	}

	public Spliterator<ICoffee> spliterator() {
		return list.spliterator();
	}
}
