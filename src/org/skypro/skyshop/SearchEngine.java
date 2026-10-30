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
}
