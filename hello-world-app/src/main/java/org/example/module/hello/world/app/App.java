package org.example.module.hello.world.app;

import org.example.module.hello.world.consumer.HelloWorldConsumer;
import org.example.module.hello.world.producer.HelloWorldProducer;

public class App {
    public static void main(String[] args) {
        var consumer = new HelloWorldConsumer();
        var producer = new HelloWorldProducer();

        consumer.accept(producer.get());
    }
}
