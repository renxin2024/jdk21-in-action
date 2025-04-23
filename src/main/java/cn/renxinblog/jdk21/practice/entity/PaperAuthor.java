/*
 * Copyright © 2025 laien.io 成都莱嗯信息技术有限公司  All rights reserved.
 */
package cn.renxinblog.jdk21.practice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * <p>User entity </p>
 *
 * @author buck
 * @email buck@laien.io
 */
@Data
@Table("paper_author")
public class PaperAuthor {

    @Id
    private Long id;

    private String name;

    private String email;

}