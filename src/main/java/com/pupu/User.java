package com.pupu;

import java.io.Serializable;

/**
 * @author : lipu
 * @since : 2020-08-17 21:07
 */
public class User implements Serializable {

    private static final long serialVersionUID = 7053086413194731442L;

    //transient，jdk原生序列化，有这个修饰符，则不会参与序列化，会被置成默认值，string是null，int是0
    private /*transient*/ String name;
    private int age;


    //如下的两个方法writeObject，readObject可以绕过transient首先是
    private void writeObject(java.io.ObjectOutputStream s)
            throws java.io.IOException {
        s.defaultWriteObject();
        s.writeObject(name);
    }

    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {
        s.defaultReadObject();
        name = (String) s.readObject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
