package com.bcs.todolist.common;

import java.util.List;
import java.util.Optional;

public interface FileProcessor {
    <D> boolean update(String fileName, D data);

    <D> Optional<D> read(String fileName, Class<D> clazz);

    <D> List<D> readAsList(String fileName, Class<D[]> clazz);
}
