/*
 * Copyright © 2025 laien.io 成都莱嗯信息技术有限公司  All rights reserved.
 */
package cn.renxinblog.jdk21.practice.repository;

import cn.renxinblog.jdk21.practice.entity.PaperAuthor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * <p>UserRepository </p>
 *
 * @author buck
 * @email buck@laien.io
 */
public interface PaperAuthorRepository extends ReactiveCrudRepository<PaperAuthor, Long> {
}