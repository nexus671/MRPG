package com.truth.neogames;

/**
 * Created by Adam on 3/2/2016.
 * Class Description: Superclass of all core classes.
 */
public abstract class RPGObject {
    /**
     * The Name.
     */
    protected String name;
    /**
     * The Description.
     */
    protected String description;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
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
