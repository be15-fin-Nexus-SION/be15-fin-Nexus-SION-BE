package com.nexus.sion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ProfileCheckTest {

    @Autowired
    Environment env;

    @Test
    void springProfileIsActive() {
        String activeProfile = env.getProperty("spring.profiles.active");
        System.out.println("Active profile: " + activeProfile);
        assertThat(activeProfile).isEqualTo("test");
    }
}