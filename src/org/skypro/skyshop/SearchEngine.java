package org.skypro.skyshop;
import java.util.*;

public class SearchEngine {
    private final Set<Searchable> searchables;

    public SearchEngine() {
        this.searchables = new HashSet<>();
    }

    public Set<Searchable> search(String searchBar) {
        Set<Searchable> results = new TreeSet<>(new SortByName());

        for (Searchable current : searchables) {
            if (current.getSearchTerm().contains(searchBar)) {
                results.add(current);
            }
        }

        return results;
    }

    public void add(Searchable searchableItem) {
        searchables.add(searchableItem);
    }

    public Searchable searchable(String search) throws BestResultNotFound {
        Searchable bestResult = null;
        int maxCount = 0;

        for (Searchable s : searchables) {
            int count = 0;
            int index = 0;
            int indexString = s.getSearchTerm().indexOf(search, index);

            while (indexString != -1){
                count++;
                index = indexString + search.length();
                indexString = s.getSearchTerm().indexOf(search, index);
            }
            if (count > maxCount) {
                maxCount = count;
                bestResult = s;
            }
        }
        if (maxCount == 0) {

            throw new BestResultNotFound(search);
        }
        return bestResult;
    }
}
