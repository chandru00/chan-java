package dev.chan.chancontentcalendar.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void name() {
        var person = new Person("David", 19);
        Assertions.assertEquals("David", person.getName());
    }

    @Test
    void animalName() {
        var animal = new Animal("Dog", 23);
        Assertions.assertEquals("Dog", animal.name());
    }
}