package org.example.module.hello.world.producer;

import java.util.function.Supplier;

public class HelloWorldProducer implements Supplier<String> {
    @Override
    public String get() {
        return "Hello world!";
    }
}
