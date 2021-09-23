package com.example.kuzmichevjsp.data.reader;

import com.example.kuzmichevjsp.exception.EmptyDataFileException;

import java.util.List;

public interface FileDataReader<T> {

    List<T> read() throws EmptyDataFileException, EmptyDataFileException;
}
