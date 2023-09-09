package adt;

//Name: NG WAI HEEI
//Stud ID: 22WMR04095
public class HashMap<K, V> implements  HashMapInterface<K, V>{
    public static final int CAPACITY = 20;
    private int size;
    private Entry<K, V>[] table;

    public static class Entry<K, V>{
        private K key;
        private V value;
        private Entry<K,V> next;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }

        //Getter
        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        //Setter
        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public HashMap(){
        this.table = new Entry[CAPACITY];   //size of mapping table = 20
    }

    @Override
    public void put(K key, V value) {
        int hash = key.hashCode() % CAPACITY;
        Entry<K, V> e = table[hash];

        while (e != null){
            if (e.getKey().equals(key)){
                e.setValue(value);
                return;
            }
            e = e.next;
        }

        table[hash] = new Entry<K, V>(key, value);
        size ++;
    }

    @Override
    public V get(K key) {
        int hash = key.hashCode() % CAPACITY;
        Entry<K, V> e = table[hash];

        while (e != null){
            if (e.getKey().equals(key)){
                return e.getValue();
            }
            e = e.next;
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int hash = key.hashCode() % CAPACITY;
        Entry<K, V> e = table[hash];
        Entry<K, V> prev = null;

        while (e != null){
            if (e.getKey().equals(key)){
                if (prev == null) {
                    table[hash] = e.next;
                }else{
                    prev.next = e.next;
                }
                size--;
                return e.getValue();
            }
            prev = e;
            e = e.next;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean containsKey(K key) {
        int hash = key.hashCode() % CAPACITY;
        Entry<K, V> e = table[hash];

        while (e != null){
            if (e.getKey().equals(key)){
                return true;
            }
            e= e.next;
        }
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        for (int i = 0; i<= CAPACITY; i++){
            Entry<K, V> e = table[i];

            while (e != null) {
                if (e.getValue().equals(value)) {
                    return true;
                }
                e = e.next;
            }
        }
        return false;
    }

    @Override
    public void clear() {
            for (int i =0; i<= CAPACITY; i ++){
                table[i] = null;
            }
            size = 0;
        }

}

