package org.spring.boot.example.servlet.config;

import org.spring.boot.example.servlet.process.CustomService;

/**
 * @ClassName LauncherService
 * @Author huyaxi
 * @DATE 2020/3/6 15:18
 */
@CustomService(LauncherService.class)
public class LauncherService {

    public void launcher() {
        System.out.println("LauncherService: launcher");
    }
}
