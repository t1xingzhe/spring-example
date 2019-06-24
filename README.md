# spring-example

### 背景
使用spring boot创建的简单web工程，提供API接口

### 技术栈
1、内嵌的jetty web容器<br>
2、mybatis 数据库中间件<br>
3、API接口使用json交互<br>

### 接入说明
1、首先得有java 1.8的开发环境，https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html 下载jdk-8u，记得点选Accept License Agreement<br>
2、还得有maven环境，下载和配置直接看 https://www.yiibai.com/maven/maven_environment_setup.html 这里吧 <br>
3、使用IDE导入项目即可，推荐intelliJ，这里有注册码 http://idea.lanyus.com/ 还要安装lombok插件 <br>
4、运行DemoApplication的main方法即可启动项目 <br>
5、访问 http://localhost:60888/question/1 可以看到API接口<br>
6、日志路径logs下面

### 接口说明 
知乎那类的问答系统，question 问题类， author 作者类， answer 答案类，接口返回question和提问的author，answers是list，返回针对这个问题的答案列表，每个答案也有对应的author