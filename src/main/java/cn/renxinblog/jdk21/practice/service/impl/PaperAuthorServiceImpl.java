/*
 * Copyright © 2025 laien.io 成都莱嗯信息技术有限公司  All rights reserved.
 */
package cn.renxinblog.jdk21.practice.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.renxinblog.jdk21.practice.dto.CreatePaperAuthorCommand;
import cn.renxinblog.jdk21.practice.entity.PaperAuthor;
import cn.renxinblog.jdk21.practice.repository.PaperAuthorRepository;
import cn.renxinblog.jdk21.practice.service.IPaperAuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * <p>PaperAuthorServiceImpl </p>
 *
 * @author buck
 * @email buck@laien.io
 */
@Service
@AllArgsConstructor
public class PaperAuthorServiceImpl implements IPaperAuthorService {

    private final PaperAuthorRepository repo;

    @Override
    public Mono<PaperAuthor> create(CreatePaperAuthorCommand createPaperAuthorCommand) {

        PaperAuthor paperAuthor = BeanUtil.toBean(createPaperAuthorCommand, PaperAuthor.class);
        return repo.save(paperAuthor);
    }
}