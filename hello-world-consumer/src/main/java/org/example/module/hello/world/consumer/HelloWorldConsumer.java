package org.example.module.hello.world.consumer;

import java.util.function.Consumer;

public class HelloWorldConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
