package com.sample.demo.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.demo.api.model.User;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://3.131.160.11")
public class UserController {

    @GetMapping("/api/users")
    public List<User> getUsers() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream = getClass().getResourceAsStream("/users.json");
        return mapper.readValue(inputStream, new TypeReference<List<User>>() {});
    }
}

