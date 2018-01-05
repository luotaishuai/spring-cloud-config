package com.springcloud.config.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author luoxuri
 * @create 2017-12-06 15:54
 **/
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
