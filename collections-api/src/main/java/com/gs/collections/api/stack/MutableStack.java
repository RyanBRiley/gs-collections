/*
 * Copyright 2013 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.api.stack;

import java.util.Collection;

import com.gs.collections.api.block.function.Function;
import com.gs.collections.api.block.predicate.Predicate;
import com.gs.collections.api.list.ListIterable;
import com.gs.collections.api.multimap.list.MutableListMultimap;
import com.gs.collections.api.partition.stack.PartitionStack;
import com.gs.collections.api.tuple.Pair;

public interface MutableStack<T> extends StackIterable<T>
{
    /**
     * Adds an item to the top of the stack.
     */
    void push(T item);

    /**
     * Removes and returns the top element of the stack.
     */
    T pop();

    /**
     * Removes and returns a ListIterable of the number of elements specified by the count, beginning with the top of the stack.
     */
    ListIterable<T> pop(int count);

    /**
     * Removes and returns a ListIterable of the number of elements specified by the count,
     * beginning with the top of the stack and puts them into the targeted collection type.
     */
    <R extends Collection<T>> R pop(int count, R targetCollection);

    /**
     * Removes and returns a ListIterable of the number of elements specified by the count,
     * beginning with the top of the stack and puts them into a new stack.
     */
    <R extends MutableStack<T>> R pop(int count, R targetStack);

    void clear();

    MutableStack<T> asUnmodifiable();

    MutableStack<T> asSynchronized();

    ImmutableStack<T> toImmutable();

    MutableStack<T> select(Predicate<? super T> predicate);

    MutableStack<T> reject(Predicate<? super T> predicate);

    PartitionStack<T> partition(Predicate<? super T> predicate);

    <V> MutableStack<V> collect(Function<? super T, ? extends V> function);

    <V> MutableStack<V> collectIf(Predicate<? super T> predicate, Function<? super T, ? extends V> function);

    <V> MutableStack<V> flatCollect(Function<? super T, ? extends Iterable<V>> function);

    <V> MutableListMultimap<V, T> groupBy(Function<? super T, ? extends V> function);

    <V> MutableListMultimap<V, T> groupByEach(Function<? super T, ? extends Iterable<V>> function);

    <S> MutableStack<Pair<T, S>> zip(Iterable<S> that);

    MutableStack<Pair<T, Integer>> zipWithIndex();
}
