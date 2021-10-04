package com.company;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @org.junit.jupiter.api.Test
    void testGetDogNameMethod() {
        Dog dog = new Dog("Dima",3);
        assertEquals("Dimom", dog.getName());

    }

    @org.junit.jupiter.api.Test
    void testGetDogAgeMethod() {
        Dog dog = new Dog("Fasa",3);
        assertEquals(3, dog.getAge());
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}
