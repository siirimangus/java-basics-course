package com.bcs.todolist.todoitem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todoitem")
public class TodoItemController {
    private TodoItemService todoItemService;

    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @GetMapping
    public List<TodoItem> getAllTodoItems() {
        return todoItemService.getAllTodoItems();
    }

    @GetMapping("/{id}")
    public TodoItem getTodoItemById(@PathVariable("id") Integer id) {
        return todoItemService.getTodoItemById(id);
    }

    @PostMapping
    public void saveTodoItem(@RequestBody TodoItem todoItem) {
        todoItemService.saveTodoItem(todoItem);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable("id") Integer id) {
        todoItemService.deleteTodoItem(id);
    }
}
