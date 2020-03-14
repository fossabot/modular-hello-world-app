package org.example.module.hello.world.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class HelloWorldConsumer implements Consumer<String> {
    private static final Logger log = LoggerFactory.getLogger(HelloWorldConsumer.class);

    @Override
    public void accept(String s) {
        log.info(s);
    }
}
