package com.joonang.ssulok.history;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
