package com.nexus.sion.feature.notification.command.application.controller;

import org.springframework.web.bind.annotation.*;

import com.nexus.sion.feature.techstack.command.application.service.TechStackCommandService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/notifications")
@Tag(name = "NotificationCommand", description = "기술 스택 관련 API")
public class NotificationCommandController {

  private final TechStackCommandService techStackCommandService;
}
