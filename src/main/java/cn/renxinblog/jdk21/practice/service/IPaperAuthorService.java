/*
 * Copyright © 2025 laien.io 成都莱嗯信息技术有限公司  All rights reserved.
 */
package cn.renxinblog.jdk21.practice.service;

import cn.renxinblog.jdk21.practice.dto.CreatePaperAuthorCommand;
import cn.renxinblog.jdk21.practice.entity.PaperAuthor;
import reactor.core.publisher.Mono;

/**
 * <p>IPaperAuthorService </p>
 *
 * @author buck
 * @email buck@laien.io
 */
public interface IPaperAuthorService {

    Mono<PaperAuthor> create(CreatePaperAuthorCommand createPaperAuthorCommand);
}