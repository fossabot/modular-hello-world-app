module hello.world.app {
    requires hello.world.consumer;
    requires hello.world.producer;

    exports org.example.module.hello.world.app;
}