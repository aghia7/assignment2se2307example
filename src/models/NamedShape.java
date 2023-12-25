package models;

import interfaces.Shape;

public abstract class NamedShape implements Shape {
    private String name;

    public NamedShape() {}

    public NamedShape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
