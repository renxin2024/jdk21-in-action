/*
 * Copyright © 2025 laien.io 成都莱嗯信息技术有限公司  All rights reserved.
 */
package cn.renxinblog.jdk21.practice.utils;

import com.alibaba.cola.dto.MultiResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * <p>dto转换util </p>
 *
 * @author buck
 * @email buck@laien.io
 */
public class DTOUtil {

    public static <T> Mono<MultiResponse<T>> wrapMulti(Flux<T> flux){
        return flux.collectList().map(MultiResponse::of);
    }
}