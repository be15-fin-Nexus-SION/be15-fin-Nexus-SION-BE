package com.nexus.sion;

import com.nexus.sion.config.SecurityConfig;
import com.nexus.sion.security.jwt.JwtTokenProvider;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class SionApplicationTests {

    @Test
    void contextLoads() {
    }
}
