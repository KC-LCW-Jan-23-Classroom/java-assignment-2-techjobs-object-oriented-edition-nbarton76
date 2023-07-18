package org.launchcode.techjobs.oo;


import java.util.Objects;

public abstract class JobField {

    //  Shared Fields:
    private int id;
    private static int nextId = 1;
    private String value;

//  Shared Constructors

    public JobField() {
        this.id = nextId;
        nextId ++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

//  Shared Getters/Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



//  Shared Custom Methods

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) { //if the objects have the same ID they are equal
        if (this == o) {
            return true;
        }
        if (o == null || getClass()!= o.getClass()) {
            return false;
        }
        JobField theJobField = (JobField) o;
        return getId() == theJobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}