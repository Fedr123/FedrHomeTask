package com.company;

/**
 * Created by vakula on 11.6.2016.
 */
public class Dog {
    private String name;
    private String says;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", says='" + says + '\'' +
                '}';
    }

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }
}
