package com.haerolog.domain.post.repository;

import com.haerolog.domain.post.application.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long>, PostRepositoryCustom {

}
