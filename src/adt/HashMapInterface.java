package adt;

import java.util.Iterator;

//Name: Ng Wai Heei
//Student ID: 22WMR04095
public interface HashMapInterface<K, V> {
    //Associates value to the specified key
    void put(K key, V value);

    //Return the values when specified key is mapped, return null if no mapping for the key
    V get(K key);

    //Remove the mapping and return the value for specified key if present, return null if key not found
    V remove(K key);

    //Return true if map contains no key-value mappings
    boolean isEmpty();

    //Return the number of key-value mappings
    int size();

    //Return true if the key contains a mapping
    boolean containsKey(K key);

    //Return true if the value is mapped with one or more keys
    boolean containsValue(V value);

    //Remove all the mapping
    void clear();

    public Iterator<HashMap.Entry<K, V>> iterator();


}
