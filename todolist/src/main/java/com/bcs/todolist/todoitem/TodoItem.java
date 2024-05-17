package com.bcs.todolist.todoitem;

public class TodoItem {
    private Integer id;
    private String item;
    private Boolean completed;
    private Integer personId;

    public TodoItem(Integer id, String item, Boolean completed, Integer personId) {
        this.id = id;
        this.item = item;
        this.completed = completed;
        this.personId = personId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }
}
