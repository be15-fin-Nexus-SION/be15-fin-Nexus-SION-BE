package com.nexus.sion.feature.notification.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexus.sion.feature.notification.command.domain.aggregate.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {}
