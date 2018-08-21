### 项目架构
       #1 core 业务无关的通用代码
       #2 dal 数据库层  
       #3 biz 业务层
       #4 web web层
   
   
   
### 项目启动方式 
        采用tomcat，抛弃springboot自带tomcat
       （boot自带tomcat和apach tomcat有点不一样，
        response的生命周期会延长，其他原因继续探索）
### mybatis相关文件生成方式
    采用mybatis-generator-maven-plugin
    （https://gitee.com/free/Mybatis_Utils/blob/master/MybatisGeneator/MybatisGeneator.md）
### DEMO代码
    （cn.tongdun.kraken.web.test.Test1）
### 参考文档

1. [spring boot 默认配置](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)
2. [spring boot官方文档](https://docs.spring.io/spring-boot/docs/1.5.10.RELEASE/reference/htmlsingle/)
3. [mybatis&springboot集成](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
4. [通用mapper](http://www.mybatis.tk/)
    

