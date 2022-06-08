package HashMap;

import java.util.LinkedList;
import java.util.List;

public class HashTable {

    class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }


    private LinkedList<Entry>[] entries;

    public HashTable() {
        entries = new LinkedList[5];
    }

    @Override
    public String toString() {
        String s = "";

        for (LinkedList<Entry> list : entries) {
            if (list != null) {
                for (Entry r : list) {
                    s = s + " " + r.value + " ";
                }
            }
            s = s + '\n';
        }
        return s;
    }

    public int hash(int key) {
        return key % entries.length;
    }

    public void put(int key, String value) {
        int index = hash(key);
        if (entries[index] == null) entries[index] = new LinkedList<>();

        var list = entries[index];
        for (Entry entry : list) { // Check if key is already exist
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        Entry entry = new Entry(key, value);
        list.addLast(entry);
    }

    public String get(int key) {
        Entry entry = getEntry(key);
        return entry != null ? entry.value : null;
    }

    private Entry getEntry(int key) {
        int index = hash(key);
        var list = entries[index];
        if (list != null) {
            for (Entry entry : list) {
                if (entry.key == key) return entry;
            }
        }
        return null;
    }

    public boolean remove(int key) {
        int index = hash(key);

        Entry entry = getEntry(key);

        if (entry != null) {
            entries[index].remove(entry);
            return true;
        }
        return false;
    }

    public int size() {
        int size = 0;
        for (LinkedList<Entry> list: entries) {
            if (list != null) {
                size = size + list.size();
            }
        }
        return size;
    }

}
