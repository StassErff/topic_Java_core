package org.skypro.skyshop;

public class BestResultNotFound extends Exception {
    public BestResultNotFound(String message) {
        super("Не удалось найти подходящий элемент для запроса: " + message);
    }
}
