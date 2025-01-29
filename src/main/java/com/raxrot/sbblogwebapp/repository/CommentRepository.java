package com.raxrot.sbblogwebapp.repository;

import com.raxrot.sbblogwebapp.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
