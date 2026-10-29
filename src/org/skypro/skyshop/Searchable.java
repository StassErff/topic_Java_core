package org.skypro.skyshop;

public interface Searchable {
    String getSearchTerm();
    default String getStringRepresentation() {
        return getName() + " - " + getContentType();
    };
    String getName();
    String getContentType();
}
