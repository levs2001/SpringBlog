package com.levs2001.blog.repo;

import com.levs2001.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

// CrudRepository - интерфейс для работы с таблицами БД
public interface PostRepository extends CrudRepository<Post, Long> {
}
