package org.skypro.skyshop;
import java.util.Comparator;

public class SortByName implements Comparator<Searchable> {
    @Override
    public int compare(Searchable  s1, Searchable  s2) {
        String name1 = s1.getSearchTerm();
        String name2 = s2.getSearchTerm();

        int length1 = name1.length();
        int length2 = name2.length();

        int lengthCompare = Integer.compare(length2, length1);

        if (lengthCompare != 0) {
            return lengthCompare;
        }
        return name1.compareTo(name2);
    }
}
