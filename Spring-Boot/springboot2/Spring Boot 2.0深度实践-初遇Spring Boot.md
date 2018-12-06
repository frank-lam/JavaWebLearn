# Spring Boot 2.0深度实践-初遇Spring Boot  

### 准备
[下载postman](https://www.getpostman.com/apps)  
postman操作：http://localhost:8080/person/save?name=hugo


[Spring Boot 2.0深度实践-初遇Spring Boot - github Demo](https://github.com/bjchen2/SpringBoot2.0)   

### 第一个Spring Boot项目 
#### 场景说明
* 定义用户模型，包括属性：用户ID和名称  
* 客户端发送POST请求，创建用户（Web MVC）  
* 客户端发送GET请求，获取所有用户（Web Flux）  

#### 构建项目  
* 图形化方式 [SPRING INITIALIZR](https://start.spring.io/)  
  idea里面 File-new-Module...-Spring Initializr
* 命令行方式（Maven）

```
mvn archetype:generate -DinteractiveMode=false -DgroupId=com.imooc -DartifactId=first-app-by-maven -Dversion=1.0.0-SNAPSHOT
```  

#### Spring Boot多模块  
主工程的package调整为pom模式，管理公共的项目依赖。  
子工程管理代码模块，分为多部分。  
要从下向上调整子工程之间的模块依赖。    
打包方式：修改成 pom（默认为jar）
  
 * 模型层：model  
 * 持久层：persistence  
 * 表示层：web  
		
web 依赖 persistence 依赖 model，所以要在各层中分别添加依赖  


#### Spring Boot 打包命令
```
mvn -Dmaven.test.skip -U clean package
```
其中 -Dmaven.test.skip 表示过滤吊test代码部分

默认打包是jar，如果打war包，需要配置

<packaging>war</packaging>
并且创建项目结构为标准web项目，需要添加webapp-->WEB-ING--->web.xml文件(webapp/WEB-INF/web.xml)

什么时候需要打成war包？

当我们想要通过Tomcat启动的时候

#### Spring Boot 运行模式
Springboot项目的3种运行模式：

* idea方式
* jar/war方式
* maven插件方式

```
如果是在开发过程中，会使用idea方式

如果是在线上的服务器上，会使用jar/war方式，作为启动脚本

如果开发环境是Linux环境，会使用maven插件方式。

mvn spring-boot:run
```
```
先把各模块进行clean install，

然后再在main所在的模块目录下clean package，

否则依赖模块不会在本地仓库中找。

注意要把maven的插件放在main所在模块的pom文件中。
```


#### Servlet && Spring5.0

Servlet:

    请求接口：ServletRequest 或者 HttpServletResponse

    响应接口：ServletResponse 或者 HttpServletResponse

Spring5.0重新定义了服务请求和响应接口：

    请求接口：ServerRequest，响应接口：ServerResponse

    优点：既可支持Servlet规范，也可支持自定义，比如Netty（Web Server）  
    
#### Flux && Mono    
Flux 和 Mono 是 Reactor 中的流数据类型，其中Flux会发送多次，Mono会发送0次或一次

使用webflux需要具备的基础是Reactive programming 的理解,即：Reactor 的基础 和 熟练的java8 lambda使用

Flux是0-N的集合（类似于集合类，最少0个，最多N个）   
Mono是0-1的集合,他们均是Publisher（发布器）类的子类  

为什么不使用集合类和Optional？  
因为 Reactive中 Flux和Mono是异步处理的（非阻塞）    而普通的集合是同步的（阻塞）

#### Springboot介绍之3大特性

* 自动装配：springmvc，jdbc，事务等spring组件

* 嵌入式容器：tomcat，jetty

* 为生产而准备的特性：这块是springboot针对运维做的优化  

#### Springboot总结
springboot应用，很简化了项目配置的流程，包括xml文件的配置，DAO层的注入，事务的复杂配置都大大简化了，针对对模块的开发，各个模块互不影响，但是对于当前的配置的属性来讲，只是对各种细节的变做了相应的优化和升级，整体觉得在spring5.0的支持度上，可能还有慢慢去用，就目前来看，springboot达到普遍使用还需要些时间


## 附：  

[小马哥](https://mercyblitz.github.io/about/)