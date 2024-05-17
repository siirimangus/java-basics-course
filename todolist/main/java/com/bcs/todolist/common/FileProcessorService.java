package com.bcs.todolist.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class FileProcessorService implements FileProcessor {
    private final ObjectMapper objectMapper;

    @Autowired
    public FileProcessorService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public <D> Optional<D> read(String fileName, Class<D> clazz) {
        Path path = this.getFilePath(fileName);

        try {
            return Optional.of(this.objectMapper.readValue(path.toFile(), clazz));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    @Override
    public <D> List<D> readAsList(String fileName, Class<D[]> clazz) {
        Optional<D[]> result = this.read(fileName, clazz);

        if (result.isEmpty()) {
            return new ArrayList<>();
        }

        return new ArrayList<>(Arrays.asList(result.get()));
    }

    @Override
    public <D> boolean update(String fileName, D data) {
        Path path = this.getFilePath(fileName);

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data));
        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }

        return true;
    }

    private Path getFilePath(String fileName) {
        return Path.of(String.format("src/main/resources/%s", fileName));
    }
}