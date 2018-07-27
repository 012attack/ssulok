package com.joonang.ssulok.comment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository  extends JpaRepository<Comment, Long> {
}
