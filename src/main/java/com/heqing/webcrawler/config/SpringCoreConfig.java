package com.heqing.webcrawler.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author heqing
 * @since 2021-07-21
 *
 * @EnableAspectJAutoProxy : 启动AspectJ自动代理
 * @ComponentScan : 启动自动扫描bean
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.heqing.webcrawler.*")
public class SpringCoreConfig {
}
