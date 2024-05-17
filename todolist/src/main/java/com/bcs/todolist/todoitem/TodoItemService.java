package com.bcs.todolist.todoitem;

import com.bcs.todolist.common.FileProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TodoItemService {
    private final static String DATA_FILE_NAME = "todoitem.json";
    private FileProcessor fileProcessor;

    @Autowired
    public TodoItemService(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }

    public List<TodoItem> getAllTodoItems() {
        return fileProcessor.readAsList(TodoItemService.DATA_FILE_NAME, TodoItem[].class);
    }

    public TodoItem getTodoItemById(Integer id) {
        List<TodoItem> todoItems = getAllTodoItems();

        for (TodoItem todoItem : todoItems) {
            if (todoItem.getId().equals(id)) {
                return todoItem;
            }
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public void saveTodoItem(TodoItem todoItem) {
        List<TodoItem> todoItems = getAllTodoItems();

        todoItems.add(todoItem);

        fileProcessor.update(TodoItemService.DATA_FILE_NAME, todoItems);
    }

    public void deleteTodoItem(Integer id) {
        List<TodoItem> todoItems = getAllTodoItems();

        for (TodoItem todoItem : todoItems) {
            if (todoItem.getId().equals(id)) {
                todoItems.remove(todoItem);
                break;
            }
        }

        fileProcessor.update(TodoItemService.DATA_FILE_NAME, todoItems);
    }
}
