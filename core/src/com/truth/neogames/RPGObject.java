package com.truth.neogames;

/**
 * Created by Adam on 3/2/2016.
 * Class Description: Superclass of all core classes.
 */
public abstract class RPGObject {
    protected String name;
    protected String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RPGObject{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
