package org.spring.boot.example.servlet.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.spring.boot.example.servlet.controller.UserResource;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig()
    {
        register(UserResource.class);
    }
}
