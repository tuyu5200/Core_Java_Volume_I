package treeSet;

import java.util.Objects;

/**
 * Program is use
 * Version: 2016/7/20
 * Author: Tuyu
 */
public class Item implements Comparable<Item>{
    private String description;
    private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[description: "+description+", partNumber= "+partNumber+"]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null) return false;
        if (getClass()!=obj.getClass()) return false;
        Item other= (Item) obj;
        return Objects.equals(description, other.description)&&partNumber==other.partNumber;
    }

    @Override
    public int compareTo(Item o) { //默认排序方式
        return Integer.compare(partNumber, o.partNumber);
    }
}
