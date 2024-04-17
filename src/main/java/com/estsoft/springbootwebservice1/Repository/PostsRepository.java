package com.estsoft.springbootwebservice1.Repository;

import com.estsoft.springbootwebservice1.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
