package entity;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class student {

    private AtomicReference<String> name;
    private AtomicInteger age;

    public AtomicReference<String> getName() {
        return name;
    }

    public void setName(AtomicReference<String> name) {
        this.name = name;
    }

    public AtomicInteger getAge() {
        return age;
    }

    public void setAge(AtomicInteger age) {
        this.age = age;
    }
}
