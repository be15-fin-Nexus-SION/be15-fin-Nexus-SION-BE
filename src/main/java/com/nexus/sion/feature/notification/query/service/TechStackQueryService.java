package com.nexus.sion.feature.notification.query.service;

import java.util.List;

public interface TechStackQueryService {
  List<String> findAllStackNames();

  List<String> autocomplete(String keyword);
}
