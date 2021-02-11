package com.reddit.simpleReddit.API.repositories;

import com.reddit.simpleReddit.API.models.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Long> {
}
