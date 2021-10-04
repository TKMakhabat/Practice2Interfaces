package com.makhabatusen.person;

public interface Person {
    String getName();

    default String sayHello() {
        return "Hello " + getName();
    }

}
