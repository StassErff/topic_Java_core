package org.skypro.skyshop;
import java.util.Objects;

public class Article implements Searchable{
    private final String name;
    private final String text;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(name, article.name) && Objects.equals(text, article.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, text);
    }
}
