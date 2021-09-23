package com.example.kuzmichevjsp.exception;

public class EmptyDataFileException extends Exception {

    public static final String ERROR_MESSAGE_EMPTY = "Файл [%s] для чтения %s";


    public EmptyDataFileException(String fileName, String message) {
        super(String.format(ERROR_MESSAGE_EMPTY ,fileName, message));
    }

}