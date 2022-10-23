package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {


    //  3. Common Fields

    public int id;
    public static int nextId = 1;
    public String value;


    //  4. Constructors

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }



    //  5. Use Generate for Getters & Setters


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    //---------

    public void setValue(String value) {
        this.value = value;
    }


    //  public void setHashCode(Job hashCode) {
  //     this.hashCode = hashCode;
 //   }

    //  6. Custom Methods

//hashCode
 //   toString


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return value;
    }



    //  7. Make Class Abstract








}
