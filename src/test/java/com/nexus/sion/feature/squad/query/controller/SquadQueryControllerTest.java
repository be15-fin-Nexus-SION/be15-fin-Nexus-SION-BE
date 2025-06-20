package com.nexus.sion.feature.squad.query.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nexus.sion.feature.squad.query.dto.request.SquadListRequest;
import com.nexus.sion.feature.squad.query.dto.response.SquadListResponse;
import com.nexus.sion.feature.squad.query.service.SquadQueryService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(SquadQueryController.class)
class SquadQueryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SquadQueryService squadQueryService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("프로젝트 코드로 스쿼드 리스트 조회 성공")
    void getSquads_Success() throws Exception {
        // given
        String projectCode = "ha_1_1";
        SquadListResponse.MemberInfo member = new SquadListResponse.MemberInfo("김개발", "Backend");
        SquadListResponse squad = new SquadListResponse("ha_1_1_s1", "SQUAD 1", List.of(member), "3개월", "1,000만원");

        when(squadQueryService.findSquads(new SquadListRequest(projectCode)))
                .thenReturn(List.of(squad));

        // when & then
        mockMvc.perform(get("/api/v1/squads/project/{projectCode}", projectCode)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].squadCode").value("ha_1_1_s1"))
                .andExpect(jsonPath("$[0].squadName").value("SQUAD 1"))
                .andExpect(jsonPath("$[0].members[0].name").value("김개발"))
                .andExpect(jsonPath("$[0].members[0].role").value("Backend"));
    }
}
