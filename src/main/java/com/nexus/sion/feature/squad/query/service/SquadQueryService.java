package com.nexus.sion.feature.squad.query.service;

import com.nexus.sion.feature.squad.query.dto.request.SquadListRequest;
import com.nexus.sion.feature.squad.query.dto.response.SquadListResponse;

import java.util.List;

public interface SquadQueryService {
    List<SquadListResponse> findSquads(SquadListRequest request);
}
