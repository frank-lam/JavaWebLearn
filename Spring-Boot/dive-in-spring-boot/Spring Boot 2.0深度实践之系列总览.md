# Spring Boot 2.0深度实践之系列总览 

## Spring Boot核心特性
### 组件自动装配
激活: @EnableAutoConfiguration

配置: /META-INF/spring.factories

实现: XXXAutoConfiguration

[boot-features-spring-mvc-auto-configuration](https://docs.spring.io/spring-boot/docs/2.0.5.RELEASE/reference/htmlsingle/#boot-features-spring-mvc-auto-configuration)

### Web MVC
#### 依赖

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```  

### 嵌入式Web容器
* Web Servlet 容器
* Web Reactive 容器

### 生产准备特性
* 指标(Metrics)
* 健康检查(Health Check)
* 外部化配置(Externalized Configuration)  

## Web 应用  
### 传统 Servlet 应用
依赖
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
### Servlet 组件
* Servlet
* Filter
* Listener
### Servlet 注册
#### Servlet 注解
* @ServletComponentScan +
* @WebServlet
* @WebFilter
* @WebListener

#### Spring Bean
* @Bean +
* Servlet
* Filter
* Listener

#### RegistrationBean
* ServletRegistrationBean
* FilterRegistrationBean
* ServletListenerRegistrationBean

### 异步非阻塞
#### 异步Servlet
* javax.servlet.ServletRequest#startAsync()
* javax.servlet.AsyncContext

#### 非阻塞Servlet
javax.servlet.ServletInputStream#setReadListener
javax.servlet.ReadListener
javax.servlet.ServletOutputStream#setWriteListener
javax.servlet.WriteListener

## Spring Web MVC应用
### Web MVC视图
* ViewResolver
* View  

### 模版引擎
* Thymeleaf
* Freemarker
* JSP

### 内容协商
* ContentNegotiationConfigurer
* ContentNegotiationStrategy
* ContentNegotiatingViewResolver

### 异常处理
* @ExceptionHandler
* HandlerExceptionResolver
* BasicErrorController(SpringBoot)

### Web MVC REST
#### 资源服务
* @RequestMapping
* @ResponseBody
* @RequestMapping

#### 资源跨域
* CrossOrigin
* WebMvcConfigurer#addCorsMappings
* 传统解决方案 (IFrame && JSONP)

#### 服务发现
* HATEOS


## Web MVC 核心
### 核心架构
### 处理流程
### 核心组件
* DispatcherServlet
* HandlerMapping
* HandleAdapter
* ViewResolver

## Spring Web Flux 应用
* Reactor 基础
* Java Lambda
* Mono
* Flux

### Web Flux核心
### Web MVC注解兼容
* @Controller
* @RequestMapping
* @ResponseBody
* @ResquestBody
* ..

### 函数式声明
* RouterFunction

### 异步非阻塞
* Servlet 3.1+
* Netty Reactor

### 使用场景
* 页面渲染
* REST应用
* [性能测试](http://blog.ippon.tech/spring-5-webflux-performance-tests/)






## 参考：  
[Spring Boot 深度实践 – 系列总览](https://www.jianshu.com/p/d703b1544346)

[小马哥](https://mercyblitz.github.io/about/)