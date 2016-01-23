/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.azure;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Defines a page template in Azure responses. This class implements the
 * required methods from {@link List}.
 *
 * @param <E> the element type.
 */
public abstract class PagedListTemplate<E> implements PagedList<E> {
    /**
     * Gets the list of items.
     *
     * @return the list of items.
     */
    protected abstract List<E> getItems();

    @Override
    public int size() {
        return this.getItems().size();
    }

    @Override
    public boolean isEmpty() {
        return this.getItems().isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.getItems().contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return this.getItems().iterator();
    }

    @Override
    public Object[] toArray() {
        return this.getItems().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.getItems().toArray(a);
    }

    @Override
    public boolean add(E e) {
        return this.getItems().add(e);
    }

    @Override
    public boolean remove(Object o) {
        return this.getItems().remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.getItems().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return this.getItems().addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return this.getItems().addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.getItems().removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.getItems().retainAll(c);
    }

    @Override
    public void clear() {
        this.getItems().clear();
    }

    @Override
    public E get(int index) {
        return this.getItems().get(index);
    }

    @Override
    public E set(int index, E element) {
        return this.getItems().set(index, element);
    }

    @Override
    public void add(int index, E element) {
        this.getItems().add(index, element);
    }

    @Override
    public E remove(int index) {
        return this.getItems().remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return this.getItems().indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return this.getItems().lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        return this.getItems().listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return this.getItems().listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return this.getItems().subList(fromIndex, toIndex);
    }
}
