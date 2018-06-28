package me.tvstore.watcher;

import me.tvstore.watcher.model.entity.user.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Watcher {

    @Value("${url}")
    private String url;

    @Autowired
    UserClientService userClientService;

    public void run(){
        System.out.println(userClientService.getUserDetails());
    }
}
