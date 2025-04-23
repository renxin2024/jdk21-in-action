/*
 * Copyright © 2025 laien.io 成都莱嗯信息技术有限公司  All rights reserved.
 */
package cn.renxinblog.jdk21.practice.controller;

import cn.renxinblog.jdk21.practice.dto.CreatePaperAuthorCommand;
import cn.renxinblog.jdk21.practice.entity.PaperAuthor;
import cn.renxinblog.jdk21.practice.repository.PaperAuthorRepository;
import cn.renxinblog.jdk21.practice.service.IPaperAuthorService;
import com.alibaba.cola.dto.MultiResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import static cn.renxinblog.jdk21.practice.utils.DTOUtil.wrapMulti;

/**
 * <p>UserController </p>
 *
 * @author buck
 * @email buck@laien.io
 */
@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class PaperAuthorController {

    private final PaperAuthorRepository repo;

    private final IPaperAuthorService paperAuthorService;

    @GetMapping("/all")
    public Mono<MultiResponse<PaperAuthor>> all() {

        return wrapMulti(repo.findAll());
    }

    @PostMapping("/create")
    public Mono<PaperAuthor> create(@RequestBody CreatePaperAuthorCommand createPaperAuthorCommand) {
        return paperAuthorService.create(createPaperAuthorCommand);
    }

}