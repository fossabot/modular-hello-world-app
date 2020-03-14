package org.example.module.hello.world.producer;

import org.apache.commons.text.WordUtils;

import java.util.function.Supplier;

public class HelloWorldProducer implements Supplier<String> {
    @Override
    public String get() {
        return WordUtils.capitalize("hello world!");
    }
}
