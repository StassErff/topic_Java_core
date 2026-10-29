package org.skypro.skyshop;

public class Article implements Searchable{
    private String name;
    private String text;

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Название: " + name + "\nТекст: " + text + "\n";
    }

    @Override
    public String getSearchTerm() {
        return toString();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }
}
