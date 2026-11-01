package org.skypro.skyshop;

public class SearchEngine {
    private final Searchable[] searchable;
    private int size = 0;

    public SearchEngine(int dimension) {
        this.searchable = new Searchable[dimension];
    }

    public Searchable[] search(String searchBar) {
        Searchable[] results = new Searchable[5];
        int count = 0;

        for (int i = 0; i < searchable.length; i++) {
            Searchable current = searchable[i];

            if (current != null && current.getSearchTerm().contains(searchBar)) {
                results[count] = current;
                count++;

                if (count == 5) {
                    break;
                }
            }
        }

        return results;
    }

    public void add(Searchable searchables) {
        if (size < searchable.length) {
            searchable[size] = searchables;
            size++;
        } else {
            System.out.println("Массив заполнен, добавление невозможно");
        }
    }

    public Searchable searchable(String search) throws BestResultNotFound {
        Searchable searchable1 = null;
        int maxCount = 0;
        for (Searchable s : searchable) {
            if (s == null) {
                continue;
            }
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
                searchable1 = s;
            }
        }
        if (maxCount == 0) {

            throw new BestResultNotFound(search);
        }
        return searchable1;
    }
}
