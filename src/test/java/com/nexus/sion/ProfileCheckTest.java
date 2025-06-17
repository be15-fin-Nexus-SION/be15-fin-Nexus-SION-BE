package com.nexus.sion;

import com.nexus.sion.config.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Import(SecurityConfig.class) // 테스트용 SecurityConfig 임포트
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