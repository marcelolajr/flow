package com.marcelo.flow.data;

import java.util.List;

/**
 * Created by projeto on 11/10/2016.
 */
public class Mission {
    private String description;
    private String name;
    private User creator;
    private boolean completed;

    public Mission() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
