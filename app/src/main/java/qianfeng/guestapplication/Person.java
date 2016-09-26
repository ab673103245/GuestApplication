package qianfeng.guestapplication;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/29 0029.
 */
public class Person implements Serializable {

    public  String name;
    public String guesture;

    public Person(String name, String guesture) {
        this.name = name;
        this.guesture = guesture;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "guesture='" + guesture + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
