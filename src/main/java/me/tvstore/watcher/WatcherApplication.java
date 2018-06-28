package me.tvstore.watcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WatcherApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WatcherApplication.class, args);
        Watcher watcher = context.getBean(Watcher.class);
        watcher.run();
        System.exit(0);
    }
}
