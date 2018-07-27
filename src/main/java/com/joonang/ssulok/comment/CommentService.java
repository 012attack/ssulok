package com.joonang.ssulok.comment;

import com.joonang.ssulok.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public Comment createComment(Comment comment){

        return commentRepository.save(comment);
    }

    public Comment updateComment(Long id, Comment comment){
        Comment commentBeforeUpdate = commentRepository.getOne(id);
        if(commentBeforeUpdate == null){
            throw new NotFoundException(id + " not found");
        }

        return commentBeforeUpdate;
    }

    public void deletePost(Long id) {
        Comment commentBeforeUpdate = commentRepository.getOne(id);
        if(commentBeforeUpdate == null){
            throw new NotFoundException(id + " not found");
        }
    }


}
