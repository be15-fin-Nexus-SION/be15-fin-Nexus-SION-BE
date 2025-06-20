package com.nexus.sion.feature.squad.query.service;

import com.nexus.sion.feature.squad.query.dto.request.SquadListRequest;
import com.nexus.sion.feature.squad.query.dto.response.SquadListResponse;
import com.nexus.sion.feature.squad.query.repository.SquadQueryRepository;
import com.nexus.sion.exception.BusinessException;
import com.nexus.sion.exception.ErrorCode;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SquadQueryServiceImpl implements SquadQueryService {

    private final SquadQueryRepository squadQueryRepository;

    @Override
    public List<SquadListResponse> findSquads(SquadListRequest request) {
        List<SquadListResponse> squads = squadQueryRepository.findSquads(request);

        if (squads == null || squads.isEmpty()) {
            throw new BusinessException(ErrorCode.SQUAD_NOT_FOUND);
        }

        return squads;
    }
}
