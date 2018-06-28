package me.tvstore.watcher.model.entity.user.impl;

import me.tvstore.watcher.model.entity.user.UserClientService;
import me.tvstore.watcher.model.entity.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserClientServiceImpl implements UserClientService {

    @Value("${url}")
    private String url;

    @Override
    public UserDTO getUserDetails() {
        RestTemplate restTemplate = new RestTemplate();

        UserDTO userDTO = restTemplate.getForObject(url, UserDTO.class);
        return userDTO;
    }
}
