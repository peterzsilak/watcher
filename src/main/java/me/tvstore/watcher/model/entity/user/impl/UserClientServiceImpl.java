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

    @Value("${apikey0}")
    private String apikey;

    private String service="user";

    @Override
    public UserDTO getUserDetails() {
        RestTemplate restTemplate = new RestTemplate();

        UserDTO userDTO = restTemplate.getForObject(url+"?apikey="+apikey+"&service="+service, UserDTO.class);
        return userDTO;
    }
}
