/*
 * Copyright © 2025 laien.io 成都莱嗯信息技术有限公司  All rights reserved.
 */
package cn.renxinblog.jdk21.practice.dto;

import com.alibaba.cola.dto.Command;
import lombok.Data;

/**
 * <p>TODO </p>
 *
 * @author buck
 * @email buck@laien.io
 */
@Data
public class CreatePaperAuthorCommand extends Command {

    private String name;

    private String email;
}