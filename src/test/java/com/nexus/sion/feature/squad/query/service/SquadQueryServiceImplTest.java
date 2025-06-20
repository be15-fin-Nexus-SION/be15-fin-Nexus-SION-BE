package com.nexus.sion.feature.squad.query.service;

import com.nexus.sion.feature.squad.query.dto.request.SquadListRequest;
import com.nexus.sion.feature.squad.query.dto.response.SquadListResponse;
import com.nexus.sion.feature.squad.query.repository.SquadQueryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class SquadQueryServiceImplTest {

    private SquadQueryRepository squadQueryRepository;
    private SquadQueryServiceImpl squadQueryService;

    @BeforeEach
    void setUp() {
        squadQueryRepository = Mockito.mock(SquadQueryRepository.class);
        squadQueryService = new SquadQueryServiceImpl(squadQueryRepository);
    }

    @Test
    @DisplayName("스쿼드 목록을 정상적으로 조회한다")
    void findSquads_returnsSquadList() {
        // given
        SquadListRequest request = new SquadListRequest();
        request.setProjectCode("PROJ-001");

        List<SquadListResponse> mockResponse = List.of(
                new SquadListResponse("SQD-1", "백엔드팀", List.of(), "2024-01-01 ~ 2024-04-01", "₩3000000")
        );

        when(squadQueryRepository.findSquads(request)).thenReturn(mockResponse);

        // when
        List<SquadListResponse> result = squadQueryService.findSquads(request);

        // then
        assertThat(result).isEqualTo(mockResponse);
        verify(squadQueryRepository, times(1)).findSquads(request);
    }
}
