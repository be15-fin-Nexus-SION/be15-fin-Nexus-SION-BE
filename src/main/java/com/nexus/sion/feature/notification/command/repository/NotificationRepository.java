package com.nexus.sion.feature.notification.command.repository;

import com.nexus.sion.feature.notification.command.domain.aggregate.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {}
