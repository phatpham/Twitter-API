package com.phatpham.data.repository;

import com.phatpham.data.entity.TweetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends CrudRepository<TweetEntity, Long> {
}
