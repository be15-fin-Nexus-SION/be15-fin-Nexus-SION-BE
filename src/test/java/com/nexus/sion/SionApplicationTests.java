package com.nexus.sion;

import com.nexus.sion.config.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@Import(SecurityConfig.class) // 테스트용 SecurityConfig 임포트
@SpringBootTest
class SionApplicationTests {

  @Test
  void contextLoads() {}
}
