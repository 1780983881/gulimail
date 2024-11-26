package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合MyBatis-Plus
 *      1). 创建Maven模块common(在该组件中加入了mysql-connect,servlet-api等依赖)并导入依赖
 *          <dependency>
 *             <groupId>com.atguigu.gulimall</groupId>
 *             <artifactId>gulimall-common</artifactId>
 *             <version>0.0.1-SNAPSHOT</version>
 *         </dependency>
 *      2). 配置
 *          1. 配置数据源
 *              1.导入数据库驱动
 *              2.在application.yml中配置数据源
 *          2. 配置mybatis-plus
 *              1. 使用@Mapperscan设置mapper具体位置(听B站弹幕说Mapper类上有@Mapper可以不用@Mapperscan)
 *              2. 告诉Mybatis-Plus的sql眏射文件位置（xml文件位置）：
 *                  mybatis-plus:
 *                      mapper-locations: classpath://mapper//**//*.xml(在yml文件中将'//'替换为'/')
 *                      global-config:
 *                          db-config:
 *                              id-type: auto
 *
 */
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
