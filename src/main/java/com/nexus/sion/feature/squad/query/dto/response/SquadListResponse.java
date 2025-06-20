package com.nexus.sion.feature.squad.query.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class SquadListResponse {
    private String squadCode;
    private String squadName;
    private List<MemberInfo> members;
    private String estimatedPeriod;
    private String estimatedCost;

    public record MemberInfo(String name, String role) {}
}