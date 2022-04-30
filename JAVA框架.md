

# Maven #

## 第一章 简介

### 一.项目管理软件 ###
### 二.功能 ###
1. 可以管理jar包
2. 自动帮你下载jar和他的文档与源代码；
3. 管理jar直接的依赖；
4. 管理需要的jar版本；
5. 帮你编译程序；
6. 测试代码是否正确
7. 打包文件
8. 部署文件
### 三.构建 ###
1. 清理：把之前项目编译的东西删掉，为新代码编译做准备；
2. 编译：把源程序编译为可执行的文件；
3. 测试：执行程序代码，验证功能；
4. 报告：生成测试结果的文件，测试通过没有；
5. 打包：把项目所有文件打包为jar文件（普通java程序）或者war文件（web程序）；
6. 安装：将生成的打包文件安装到本机仓库；
### 四.核心概念 ###
1. POM：一个名称为pom.xml文件，pow翻译过来叫做项目对象模型；
2. 约定的目录结构：maven项目的目录和文件位置都是规定的；
3. 坐标：唯一一个字符串，是用来表示资源；
4. 依赖管理：管理项目可以使用jar文件；
5. 仓库管理：资源存放位置；
6. 生命周期：构建项目的过程；
7. 插件和目标：执行maven构件用的工具；
8. 继承：
9. 聚合：
### 五.安装 ###
1. 配置环境变量M2_HOME值为Maven安装目录；
2. 在所有路径之前增加path值：%M2_HOME%/bin；
3. 也需要配置JAVA_HOME属性；
## 第二章 核心概念 ##
### 一.约定的目录结构 ###
1. src文件夹：源代码；.
2. pom.xml核心文件；
3. src.mian文件夹：主程序；
4. src.mian.java文件夹：程序要使用的包和包中java文件；
5. src.mian.resource文件夹：程序要使用的配置文件；
6. src.text文件夹：测试程序（非强制）；
7. src.text.java文件夹：测试要使用的包和包中java文件；
8. src.text.resource文件夹：测试要使用的配置文件；
9. src.target文件夹：maven编译所有文件夹放在该文件夹下
### 二.常用命令 ###
1. mvn compile编译src.main目录下所有java文件，随后拷贝到src.target目录下；
2. 修改本机仓库位置：conf/setting.xml文件下的localRepository标签更改本地仓库位置；
3. mvn clean完成清理工作；
3. mvn compile-test编译test目录下的所有java文件；
3. mvn test执行测试代码；
3. mvn package执行打包命令生成压缩文件（只生成main文件下的文件）；
3. mvn install执行安装命令将项目安装到仓库中去（每个坐标都是一个文件夹）；
### 三.仓库 ###
1. 存放maven使用的插件与项目所使用的的jar包；
2. 分类
	- 本地仓库：个人计算机上的文件夹；
	- 远程仓库：互联网上的仓库，又称为中央仓库； 
3. 仓库的使用：首先本地仓库-->私服-->镜像-->中央仓库；
3. 自定义本地仓库位置

![image-20220208232732142](C:\Users\小哥哥\AppData\Roaming\Typora\typora-user-images\image-20220208232732142.png)  

### 四.pom.xml文件 ###
1. 坐标（项目的唯一标识）
	- modelVersion：模型版本，现阶段都是4.0.0；
	- groupId：组织名称（公司域名倒写）；
	- artifactId：项目名称
	- version：项目版本号；
2. packaging：指定打包后压缩文件的扩展名（可以不写，默认为jar）；
3. dependencies（大标签）与dependency（小标签）：添加依赖项，写依赖对象的坐标；
4. properties：设置属性；
5. build：进行项目构建时的配置信息；
### 五.单元测试
1. 使用junit工具

   - 添加junit工具依赖；

   ```xml
   <dependency>
       <groupId>junit</groupId>
       <artifactId>junit</artifactId>
       <version>4.11</version>
       <!--表示依赖的范围-->
       <scope>test</scope>
   </dependency>
   ```

   - 在test文件下建立测试类；
   - 类名命名为test+被测试类名；
   - 方法名命名为test+被测试方法名；

2. Maven执行一个阶段时会将之前所有阶段都重新执行一遍；

3. 配置build

```xml
<build>
    <!--控制配置maven构建项目的参数设置-->
	<plugins>
        <!--配置插件-->
    	<plugin>
            <!--配置具体插件-->
        	坐标
            <configuration>
                <!--本项目所使用的版本-->
            	<source></source>
                <!--目标版本-->
                <target></target>
            </configuration>
        </plugin>
	</plugins>
</build>
```

### 六.IDea中使用maven

1. 配置入口

<img src="C:\Users\小哥哥\AppData\Roaming\Typora\typora-user-images\image-20220208231752627.png" alt="image-20220208231752627" style="zoom:50%;" />

<img src="C:\Users\小哥哥\AppData\Roaming\Typora\typora-user-images\image-20220208235849470.png" alt="image-20220208235849470" style="zoom:50%;" />

2. 使用模板创建项目

   - 普通的java项目：maven-archetype-quickstart;
   - web项目：maven-archetype-webapp;

3. 依赖范围（scope）

   - 表示依赖在哪个阶段中起作用（默认为compile）；
   - compile表示所有阶段都需要，都起作用；
   - test表示只在测试阶段起作用；
   - provide表示只有编写程序与测试阶段才会使用，程序运行时不需要提供；

4. 常用设置

   - 属性设置

   ```xml
   <!--设置maven常用属性-->
   <properties>
       <!--设置maven构建项目指定的编码格式-->
   	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
       <!--编译代码使用版本-->
       <maven.compiler.source>1.8</maven.compiler.source>
       <!--目标代码使用版本-->
       <maven.compiler.target>1.8</maven.compiler.target>
       <!--自定义属性的申明-->
       <spring-version>5.22</spring-version>
   </properties>
   ```

   - 全局变量（自定义属性）
     - 自定义变量一般用来定义依赖版本号，在xml文件其余使用位置通过${自定义变量名}的样式使用；

   - 资源插件
     - 默认情况下会将resource文件下的文件拷贝到target文件夹下的classes文件夹中；
     - 默认情况下java文件夹下的非class文件不处理；


   ```xml
   <build>
   	<resource>
           <!--需要拷贝的文件目录-->
       	<directory>src/main/java</directory>
           <includes>
           	<include>需要拷贝的文件</include>
               <include>需要拷贝的文件</include>
           </includes>
           <!--false表示不启动过滤器-->
           <Filtering>false</Filtering>
       </resource>
   </build>
   ```

# 框架

## 第一章 三层架构

### 一. 界面层（Servlet，springMVC框架）

1. 和用户交互，接收用户请求参数，显示处理结果（jsp,html,servlet）;
2. controller包(servlet);

### 二.业务逻辑层（spring框架）

1. 加工数据；
2. 接收界面层传递的数据，计算逻辑，调用数据库，获取数据；
3. service包(xxxService类)；

### 三.数据访问层（mabatics框架）

1. 访问数据库，执行对数据的增删改查；
2. dao包(xxxDao类);

### 四.界面层 --> 业务逻辑层 --> 数据访问层（持久层） -->数据库；

## 第二章 框架概念

### 一. 框架基本概念

1. 规定好了一些条款，内容
2. 框架定义好了一些我们可以使用的功能；
3. 可以向框架中加入需要的功能；
4. 框架只是一个定义好了基本功能的半成品软件；

### 二. 特点

1. 框架不是全能的，不能做所有事情；
2. 框架只是针对某一方面，不全面
3. 框架是一个软件；


## 第三章 Mybatis

### 一. 定义

1. 持久层框架，早期叫ibatis，代码在gitHub上；
2. mybatis是一个sql映射框架；
3. sql mapper:sql映射
   - 可以将数据库表中的一行数据映射为一个java对象；
   - 通过操作对象来对数据库数据进行操作；
4. data Access Objezxts(DAOs):数据访问，不用手写sql语句；
5. mybatis功能
   - 提供创建Connection，Statement，ResultSet的能力，不用开发人员自己创建这些对象；
   - 提供执行sql语句的能力，不用sql；
   - 提供循环sql，将sql结果转化为java对象，list集合的能力；
   - 提供关闭资源的能力，不需要用户手动关闭Connection，Statement，ResulttSet；
   - 用户只需要提供sql语句进行执行即可得到List集合；

### 二. 搭建Mybatis开发环境

1. 在pom.xml文件之中加入mybatis，mysql驱动；

2. 创建数据库操作接口；

3. 一个表创建一个.xml的用来写sql语句的sql映射文件(在pom.xml中利用source标签拷贝到target目录之下)；
   - 写在接口所在的目录中；
   - 名称与接口名称一致；
   
   ```xml
   <?xml version="1.0" encoding="UTF-8" ?>
   <!--指定约束文件-->
   <!DOCTYPE mapper
     PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
     "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
   <!--根标签-->
   <!--namespace叫命名空间，唯一值，可以自定义的字符串，一般使用dao接口的全限定名称-->
   <mapper namespace="org.mybatis.example.BlogMapper">
      <!--
   		查询语句，id是该语句的唯一标识，一般使用接口中的方法名
   		resultType表示最终遍历得到java对象的类型；
   		值为对象类型的全限定名称；
   	-->
     <select id="selectBlog" resultType="Blog">
       select * from Blog where id = #{id}
     </select>
   </mapper>
   ```
   
   - namespace属性叫做命名空间，要使用dao接口的全限定名称；
   - 使用<select>标签表示执行select语句；
   - 使用<update>标签表示执行update语句；
   - 使用<insert>标签表示执行insert语句；
   - 使用<delete>标签表示执行delete语句；

4. 在resource文件夹下创建Mybatis的主配置文件，配置数据库连接信息与sql映射文件的位置；

   ```xml
   <?xml version="1.0" encoding="UTF-8" ?>
   <!DOCTYPE configuration
     PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
     "http://mybatis.org/dtd/mybatis-3-config.dtd">
   <configuration>
       <!--环境配置 default表示当前使用的数据库，值与使用的库id相同-->
     <environments default="development">
       <environment id="development">
           <!--环境 id是唯一值-->
         <transactionManager type="JDBC"/>
         <dataSource type="POOLED">
             <!--注册信息-->
           <property name="driver" value="${driver}"/>
           <property name="url" value="${url}"/>
           <property name="username" value="${username}"/>
           <property name="password" value="${password}"/>
         </dataSource>
       </environment>
     </environments>
     <mappers>
       <mapper resource="org/mybatis/example/BlogMapper.xml"/>
     </mappers>
   </configuration>
   ```

   - transactionManager表示事物处理类型：

     - type属性值为JDBC：表示使用JDBC中的commit，rollback进行事务处理；
     - type属性值为MANAGED：表示把事物处理委托给其他容器；

   - dataSource 表示数据源：

     - type属性值为POOLED：表示使用连接池；
     - type属性值为UPOOLED：表示不使用连接池；
     - type属性值为JNDI：java命名和目录服务（windows注册表）；

   - mappers指定sql应用文件；

     - 语法格式

     ```xml
     <mapppers>
     	<mapper resource="sql应用文件(以classes根路径为起点)"/>
     </mapppers>
     ```

     - mapper标签一次指定一个文件；
     - 使用package标签指定多个sql应用文件；

     ```xml
     <mapppers>
         <!--package使用要求：mapper文件名称与接口名称一样（区分大小写），且在同一目录下-->
     	<package name="sql应用文件所在包(以classes根路径为起点)"/>
     </mapppers>
     ```

   - 数据库的属性配置文件；

     - 将数据库的连接信息放在单独的文件中，与住配置文件分开；
     - 再resources目录下创建xxx.properties的属性配置文件；
     - key一般使用多级，如jdbc.driver;
     - mapper中指定配置文件
     ```xml
     <propperties resource="resource根路径开始的路径"/>
     ```
     - 使用时property标签中的value="${配置文件中的key}"; 

5. 类中调用mybatics

```java
//定义mybatis主配置文件名称（从类路径的根路径开始classes目录）
String config = “mybatis.xml”;
//读取config代表的该文件；
InputStream in = Resources.getResourceAsStream();
//创建sqlSessionFactoryBuilder对象
SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//创建SqlSessionFactory对象
SqlSessionFactory factory = builder.builder(in);
//获取SqlSession对象
SqlSession sqlSession = factory.openSession;
//指定要执行的sql语句的标识。sql映射文件中的namespace + “.” + 标签的id值；
String sqlID = namespace + “.” + 标签的id值;
//执行sql语句，通过sqlId找到语句，返回值为List集合
List<Student> Studentlist = sqlSession.selectList(sqlId);
//手动提交事物；
sqlSession.commit();
//关闭Session对象
sqlSession.close();
```

### 三. 不同操作方法的执行

1. 查询方法（select）
   - 返回对象为被查询的实体类对象

```xml
  <select id="selectBlog" resultType="Blog">
    select * from Blog where id = #{id}
  </select>
```

```java
//执行sql语句，通过sqlId找到语句，返回值为List集合
List<Student> Studentlist = sqlSession.selectList(sqlId);
```

1. 插入方法（insert）
   - 返回对象为int

```xml
  <insert id="insertStudent">
    插入语句
  </select>
```

```java
//执行sql语句，通过sqlId找到语句，返回值为执行插入语句执行数
int num = sqlSession.insert(sqlId);
```

### 四. 主要类的介绍

1. resources对象：读取主配置文件；
2. sqlSessionFactoryBuilder对象：创建sqlSessionFactory对象；
3. sqlSessionFactory对象：重量级对象，整个项目中只需要一个就够用了；
   -  实现类DefaultsqlSessionFactory
   - 获取sqlSession对象；
   - 常用方法
     - sqlSession openSession():无参数的方法表示获取非自动提交Session对象；
     - sqlSession openSession(boolean)：true表示获取Session对象为自动提交的，false与无参方法作用一致；
4. sqlSession对象
   -  实现类DefaultsqlSession；
   - dao实现类 getMapper(dao接口名.class):获取dao接口对象；
   - 使用要求
     - 该对象是非线程安全对象；
     - 只能在方法内部使用该对象；
     - 需要在执行sql语句之前获取；
     - 在执行SQL语句之后应该将其关闭；

### 五. Mybatis动态代理进行数据库操作

1. 创建dao实现类，
2. 实现相应的方法；
   - 将mytatis相关操作写入该类之中；
   - 实现相应的行为；
3. Mybatis动态代理
   - 根据dao的方法调用，获取执行sql语句信息；
   - 根据dao接口，创建dao接口的实现类；
   - 完成sqlSession调用方法，访问数据库；
   - 通过sqlSession对象的getMapper(dao接口名.class)方法获取dao实现类对象；
   - 调用dao中的方法直接执行相应的方法；

### 六. 向mapper文件中传入参数

1. parameterType属性
   - mapper文件中的一个属性；
   - 表示dao接口方法参数的数据类型；
   - 数值是参数值的全限定名称；
   - 不是强制属性，mybatis中可以不写；
2. 单个参数传入：
   - myBatis中将基本数据类型与String都叫做简单类型；
   - mapper文件中的sql语句获取简单数据类型值的方式#{任意字符}；
   - #{变量名}在preparedStatement 中以？的方式表示；
3. 多个参数传入
   - 使用@param的方式（简单类型）
     - 使用@param("mappers中的参数名") 参数类型 参数名的方式创建操作函数形参；
     - 在mappers的sql语句中使用#{mappers中的参数名}调用相应的参数；
   - 利用对象传入参数（使用最多）
     - 将形参设置为java对象；
     - 使用java对象的属性值，作为sql传入参数实际值；
     - 语法格式：#{属性名,javaType=类型名称,jdbcType=数据类型}；
     - javaType表示java中的数据类型；
     - jdbcType表示数据库中的数据类型；
     - 简化方式#{属性名}：类型可以通过反射的方式获取；
   - 按照参数位置传值（不常用）
     - 位置时从0开始的；
     - 语法格式：#{arg参数位置}；
   - 使用map传值（不推荐，可读性太差）
     - 使用map存放多个值；
     - 将参数map作为形参；
     - 语法格式：#{map的key}；
     - 通过key值获取相应的value值；
4. #和$区别
   - 使用#的地方都可以使用$进行替换；
   - 使用#表示的是使用占位符？(使用preparedStatement对象，能有效防止sql注入)；
   - 使用$则表示的是替换(使用Statement对象，无法有效防止sql注入)；
   - 在保证数据安全的情况下，一般可以使用$来替换表名是列名；

### 七. 封装mybatis输出结果

1. mybatis输出结果（resultType属性）
   - 列的值赋给同名属性；
   - mybatis执行了sql语句得到的java对象；
   - resultType属性的值可以是任意的java类型；
   - resultType属性的值应该和接口方法中的返回值一致；
   - resultType属性可以使用别名，也可以使用对象的全限定名称（包装类，推荐使用全限定名称，更安全）；
   - 自定义类型的别名
     - 主配置文件中使用typeAliases标签定义别名；
     - typeAliases标签中的typeAlias标签中设置属性type值为全限定名称，alias值为别名；
     - typeAliases标签中package 中name属性设置为包名，其包中类的名字就是别名（不区分大小写）；
   - 列名与属性名不一致时，可以使用列别名与属性名对应的方式进行使用；
   - 返回值为map
     - 列名为key，列值为value；
     - 只能最多返回一行记录；
2. 结果映射（ResultMap属性）
   - 指定列名和java对象的属性对应关系；
   - 列名与属性名不一致时，通过map指定列名于属性名的对应关系；
   - 先定义ResultMap标签
     - type值为类的全限定名称；
     - 主键列使用id标签，column属性指定列名，property指定类的属性名；
     - 其余使用result标签，column属性指定列名，property指定类的属性名；
   - select语句中引用；
     - select标签中设置resultMap属性，值为ResultMap标签的id属性值；
3. 模糊查询
   - 在java代码中指定like的内容；
     - 直接指定带%的模糊查询对象作为传入参数；
   - 在mapper中使用；
     - 在sql语句中加入%符号；

### 八. 动态sql

1. select标签中使用的标签；

2. sql语句是变化的，主要是where部分发生变化；

3. if标签为判断条件

   - 语法：<if test="判断java对象的属性值（属性名 = xxx值）">部分sql语句</if>;
   - test属性值为真时，会将部分sql语句加入主sql语句中；

4. where标签

   - 用来包含多个<if>的；
   - 当多个if只有一个成立时，会自动增加where关键字，同时删除多余的and，or等连接词；

5. foreach标签

   - 循环java中数组，list结合的，主要用在sql的in语句中的；
   - 语法规则；

   ```xml
   <foreach collection="" item="对象名" open="" close="" separator="">
   	#{对象名.属性名}
   </foreach>
   ```

   - collection属性值表示集合类型；
   - item属性值是自定义的，表示数组和集合成员变量；
   - open属性值表示循环开始时的字符；
   - close属性值表示循环结束时的字符；
   - separator属性值表示集合成员之间的分隔；
   
6. 代码片段

   - sql代码的复用；
   - 先定义sql代码片段：

   ```xml
   <sql id="">sql代码片段</sql>
   ```

   - 再使用sql代码片段：

   ```xml
   <include refid="sql代码片段id属性值"/>
   ```

### 九. pageHelper（数据分页功能）

1. 实现数据分页功能的插件；
2. 首先加入pegeHelper的依赖；
3. 在主配置文件的环境标签之前加入pageHelper插件；
```xml
<plugins>
	<plugin interceptor="com.github.pageheiper.PageInterceptor"/>
</plugins>
```
4. 在查询语句之前调用PageHelper类中的静态方法startPage（int pageNum，int pageSize）
   - pageNum表示显示第几页，从一开始；
   - pageSize表示每页显示数据条数；

### 十. Mybatis自动生成代码插件

1. pom.xml插件的配置

   ```xml
           <!--mybatis代码自动生成插件-->
               <plugin>
                   <groupId>org.mybatis.generator</groupId>
                   <artifactId>mybatis-generator-maven-plugin</artifactId>
                   <version>1.3.6</version>
                   <configuration>
                       <!--配置文件的位置-->
                       <configurationFile>GeneratorMapper.xml</configurationFile>
                       <verbose>true</verbose>
                       <overwrite>true</overwrite>
                   </configuration>
               </plugin>
   ```

2. 配置文件放在根目录之下与src文件同级



## 第四章 Spring

### 一. 基本概念

1. 核心技术ioc与aop；
2. 管理对象之间的关系；
3. 实现模块之间和类之间的解耦合；
4. 特点
   - 轻量
   - 面向接口编程：ioc；
   - aop编程支持；
   - 方便继承各种优秀框架；

### 二. ioc控制反转（inversion of control）

1. 控制反转基本概念

   - 控制：创建对象，对象的属性赋值，对象之间的关系管理；
   - 正转：由开发人员在代码中使用new构造方法创建对象，开发人员主动管理对象；
   - 反转：把管理、创建对象的权力转移给代码之外的容器实现；
   - 容器：一个服务器软件，一个框架；
   - 目的：减少对代码的改动也能实现不同的功能，实现解耦合；
   - 技术实现：依赖注入DI（dependency injection）；
   - 实现DI的底层原理是反射机制；

2. spring的实现步骤

   - 创建maven项目；
   - 加入spring依赖；

   ```xml
       <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-context</artifactId>
         <version>5.3.15</version>
       </dependency>
   ```

   - 创建类（接口和它的实现类）；

   - 创建spring需要使用的配置文件（一般使用applicationContext.xml进行命名）；
     - beans是根标签
     - bean标签声明bean
       - id属性指的是bean的唯一标识；
       - class是类的全限定名称；

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
   <bean id="" class=""></bean>
   </beans>
   ```

   - 使用spring创建的对象
     - ApplicationContext对象表示spring容器，通过容器可以获取对象；
     - ClassPathXmlApplicationContext表示从类路径加载spring配置文件
     - spring在读取配置文件时，会创建配置文件中所有对象；
     - spring也可以创建非用户自定义对象；
     - spring创建对象默认调用无参构造方法；

   ```java
   //指定spring配置文件名称
   String config = "beans.xml";
   //创建spring容器的对象，applicationContext
   ApplicationContext ac = new ClassPathXmlApplicationContext(config);
   //获取对象
   对象 = （对象接口名）ac.getbean("配置文件中bean的id值");
   ```

3. ApplicationContext类中的方法

   - int getBeanDefinitionCount():获取容器创建的对象数量；
   - String[] getBeanDefinitionNames():获取容器创建的对象的名称；
   - Bean ac.getbean（"配置文件中bean的id值"）：获取bean

4. 给java对象属性赋值（di设置注入）

   - spring是采用set方法对属性进行赋值；

   - 基于xml的di实现（set 注入即设置注入）；

     - 注入就是赋值的意思
     - 在spring的配置文件中，使用标签和属性完成属性赋值；
     - 利用property标签完成属性赋值；
     - 一个property标签只能对一个属性进行赋值；
     - 引用类型的赋值；
       - 先创建引用类型的bean；
       - 在使用ref属性调用引用；

     ```xml
     <bean id="" class="">
     	<property name="name（属性名字）" value="属性值"/><!--setName（属性值）-->
         <property name="age（属性名字）" value="属性值"/><!--setAge（属性值）-->
          <property name="age（应用类型属性名字）" ref="应用类型bean的id"/><!--setAge（属性值）-->
     </bean>
     ```

   - 在构造方法中完成赋值（构造注入）；

     - spring调用类的有参构造创建对象，完成赋值；
     - 使用constructor-arg标签设置参数属性，一个标签只能设置一个参数；
     - index属性表示构造方法参数的位置，从0开始；
     - name属性表示构造方法形参名；
     - value属性是在为简单类型时赋值使用；
     - ref属性是在为引用类型时赋值使用；

     ```xml
     <bean id="myService" class="service.ServiceImpl" scope="prototype">
         <constructor-arg index="" name="" value=""/>
     </bean>
     ```

5. 引用类型的自动注入

   - 不需要用户进行赋值，spring自动进行赋值；

   - 按名称进行注入（byname）

     - java类中引用类型的属性名和spring容器中配置文件bean标签中id的值一致，且数据类型是一致的；
     - 这样情况下就能赋值给引用数据类型；

     ```xml
     <bean id="myService" class="service.ServiceImpl" autowire="byName">
     
     </bean>
     ```

   - 按类型注入（bytype）

     - java类中引用类型的数据类型和配置文件中bean标签是同源关系，这样可以自动赋值；
     - 同源关系
       - 引用数据类型和bean中class属性值一致；
       - 引用数据类型（父类）和bean中class属性值（子类）为父子关系；
       - 引用数据类型（接口）和bean中class属性值（实现类）为接口和实现关系；


```xml
 <bean id="myService" class="service.ServiceImpl" autowire="byType">
 
 </bean>
```

6. 多配置文件优势

   - 每个文件的大小比一个文件要小的多，效率高；

   - 避免多人竞争带来的冲突；

   - 多配置文件的配置方式

     - 按功能模块分配：一个模块一个配置文件；
     - 按类的功能分配：数据库相关一个配置文件，事物功能一个配置文件，service功能一个配置文件；

   - 主配置文件用来包含其他配置文件（包含关系配置文件）；

     - 语法格式：<import resource="classpath其他配置文件的路径"/>
     - 其中classpath关键字表示类路径（classes文件夹目录）；
     - 通配字符*：可以替换任意字符（主配置文件名称不能包含在通配符的范围内）；

     ```xml
     <import resource="classpath:以classes文件夹目录文件全限定名称"/>
     ```

7. 基于注解的注入

   - 使用注解的步骤

     - 加入maven的依赖：context（间接加入spring-aop依赖）；
   
     - 在类中加入注解；
   
     - 在spring配置文件中，加入主键扫描器标签；
       - componernt-scan工作方式：spring遍历base-package包中的类，按照类的注解创建对象，或给属性赋值；
       - 指定多个包的三种方式：指定多个扫描器；
       - 使用；或者，分隔多个包名；
       - 指定父包；
       
       ```xml
        <context:component-scan base-package=""/>
       ```
   
     - 使用applicationContext对象的getBean（”bean的id值“）方法从容器中获取对象；
   
   - 注解类别
   
        - @Component，@Respotory，@Service，@Controller都有同样的基本功能，但@Respotory，@Service，@Controller对业务进行分层，都有自己的特定功能；
   
        - @Component:
   
          - 创建对象，等同于<bean>功能；
          - value就是对象的名称，也就是bean的id值；
          - value中的值是唯一的，在整个spring容器中只有一个；
          - 可以省略value；
          - 也可以直接只写@Component：其默认id为类首字母小写；
   
          ```java
          @Component(value = "myStudent")
          @Component("myStudent")
          public class Student（）{}
          ```
   
        - @Respotory（用在持久层类上的）：放在dao类上面，表示创建dao对象访问数据库；
   
        - @Service（用在业务层类的）：放在service实现类上面，创建service对象来进行业务处理，可以有事务功能；
   
        - @Controller（用在控制器类的）：放在控制器（处理器）类的上面，创建控制器对象来接受用户提交的参数，显示请求的处理结果；
   
        - @Value
   
          - 给简单属性赋值；
          - 使用方法：直接在属性上面（最常使用）或者放在set方法上面；
   
          ```java
          @Component("myStudent")
          public class Student {
              @Value("01")
              //或者@Value(value = "01")
              private Integer num;
              @Value("01")
              //或者@Value(value = "01")
              public void setNum(Integer num) {
                  this.num = num;
              }
          ```
   
        - @Autowired
   
          - 给引用类型的赋值；
          - spring框架提供的注解，使用的自动注解的原理赋值，默认使用byType，也可以使用byName的形式；
          - 设置Autowired中requeired属性值（默认为true）为假表示赋值失败时返回为null；
          - 使用方法：直接在属性上面（最常使用）或者放在set方法上面；
   
          ```java
          @Component(value = "myStudent")
          public class Student {
              @Autowired（Value=false）
              private School school;
          }
          //使用byname方式
          @Component(value = "myStudent")
          public class Student {
             	@Autowired
              @Qualifier("mySchool")
              private School school;
          }
          ```
   
        - @Resource
   
          - 给引用类型的赋值；
          - 是jdk提供的注解，功能与Autowire相似，默认使用byName，失败后再使用ByType；
          - 只使用ByName方式时需增加name属性；
   
          ```java
          @Component(value = "myStudent")
          public class Student {
             	@Resource(name="id")
              private School school;
          }
          ```


   ### 三. 面向切面编程（AOP）

   1. CGLIB（Code Generation Library）动态代理是使用继承的方式实现动态代理；

   2. AOP底层实现就是动态代理；

   3. Aop就是动态代理规范化，将动态代理的实现步骤与方式标准化；

   4. Aop常用术语

      - 切面(Aspect)
        - 给目标类增加的功能就叫切面；
        - 一般都是非业务方法，能够独立使用；
        - 常见的切面功能有日志，事物，统计信息，参数检查，权限验证等；

      - 连接点（JoinPoint）
        - 连接业务方法和切面的位置；
        - 要加入切面方法的某类中的业务方法；

      - 切入点（PointCut）：多个连接点方法的集合；
      - 通知（advice）：表示切面功能的执行时间；

   5. 切面三个因素

      - 切面的功能代码；
      - 切面的执行位置；
      - 切面的执行时间；

   6.  理解面向切面编程

      - 分析项目功能时，找出切面；
      - 合理的安排切面的执行时间；
      - 合理的安排切面的执行位置；

   7. Aop的实现

      - aspectJ框架（常用）与Spring框架；
      
      - 实现AOP的两种方式；
        - 注解方式；
        - xml配置文件；
      
      - 与切面执行时间相关的注解：
        - @before
        - @AfterReturning；
        - @Around
        - @AfterThrowing
        - @After;
      
      - 使用切入点表达式来表示切面执行位置；
        - 不可获取的参数为方法返回值与方法声明；
        
        - 通配符*表示0至多个任意字符；
        
        - 通配符..用在方法参数中，表示任意多个参数用在包名后，表示当前包及其子包路径；
        
        - excution（方法的访问权限 方法返回值 方法声明（参数）（加上类的全限定类名） 异常类型）
        
            ![image-20220211112828879](C:\Users\小哥哥\AppData\Roaming\Typora\typora-user-images\image-20220211112828879.png)
        

   8. 使用aspectJ框架实现aop步骤

      - 加入aspectj依赖

      ```xml
          <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aspects</artifactId>
            <version>5.3.15</version>
          </dependency>
      ```

      - 添加注解

        - @Aspect注解
          - 表示该类为切面类；
          - 用来给业务方法增加功能的类；

        ```java
        @Aspect
        public class MyAspect {
        }
        ```

        - 定义切面方法

          - 公共方法（public）；
          - 方法没有返回值；
          - 方法名称自定义；
          - 方法可以有参，也可以无参；

        - 给方法添加@before注解

          - 属性：value，切入点表达式，表示切面功能执行的位置；
          - 再方法执行之前执行的；
          - 不会改变目标方法的执行结果；
          - 不会影响目标方法的执行；

          ```java
          @Before(value = "execution(public void service.com.ServiceImpl.doSome(String,String))")
              public void myBefore(){
                  System.out.println("切面方法执行时间:" + new Date());
              }
          
          //public 可以省略,*..替换包名，*替换返回值类型
          @Before(value = "execution(* *..ServiceImpl.doSome(..))")
              public void myBefore(){
                  System.out.println("切面方法执行时间:" + new Date());
              }
          ```

        - 在配置文件中生成自动代理生成器；

          - 会将spring容器中所有对象都生成代理对象；

          ```xml
          <aop:aspectj-autoproxy/>
          ```

        - 给方法添加@AfterReturning注解

          - 后置通知；
          - 方法必须是有参数的；
          - value属性：切入点表达式；
          - returning 属性为自定义变量，表示目标方法的返回值的；
          - 自定义变量名必须和通知方法的形参名一致；
          - 在方法执行之后执行的；
          - 可以修改目标方法的返回值；
          - 不能改变目标方法的执行结果；

          ```java
          @AfterReturning(value = "execution(* *..ServiceImpl.doSome(..))",returning = "res")
          //res时目标方法执行后的返回值,等同于doSome()；
              public void myAfterReturning(Object res){
                  System.out.println("切面方法执行时间:" + new Date());
              }
          ```

        - 给方法添加@Around注解

          - 有返回值；
          - value属性：切入点表达式；
          - 功能最强的通知，在目标方法的前后都能增强功能；
          - 控制目标方法是否执行；
          - 可以改变目标方法的执行结果；
          - 等同于JDK动态代理；
          - ProceedingJoinPoint自定义变量；
          - 调用pjp.proceed()（jdk动态代理中的invoke()）;
          - ProceedingJoinPoint继承JoinPoint接口，可以获取到切面方法参数；
          - 可以再之前和之后对切面方法进行加强；
          - 环绕通知经常做事物处理；

          ```java
              @Around(value = "execution(* *..ServiceImpl.doOther(..))")
              public Object myAround(ProceedingJoinPoint pjp){
                  Object result = null;
          //      实现目标方法的调用，相当于method.invoke（）；
                  try {
                      result = pjp.proceed();
                  } catch (Throwable e) {
                      e.printStackTrace();
                  }
              }
          ```

        - 给方法添加@AfterThrowing注解

          - value属性：切入点表达式；
          - throwing自定义变量表示目标方法抛出的异常对象；
          - 实现trycatch；

        - 给方法添加@After注解

          - 方法没有参数，有的话就是JointPoint；
          - 总是会执行；
          - 再目标方法执行之后执行；

      - JoinPoint参数值

        - 可以通过JoinPoint参数获取切面方法的所有属性；
        - 必须位于通知方法的参数列表的第一位；
        - Object[] getArgs():获取切面方法中所有参数；

        ```java
        @Before(value = "execution(public void service.com.ServiceImpl.doSome(String,String))")
            public void myBefore(JoinPoint jp){
                System.out.println("切面方法执行时间:" + new Date());3
                Object[] args = jp.getArgs();
                for(Object arg:args)
                    System.out.println("参数=" + arg);
            }
        ```

      - 采用cglib动态代理的方式

      ```
      <aop:aspectj-autoproxy proxy-target-class="true"/>
      ```

### 四. spring集成mybatis

1. 使用ioc技术继承spring与mybatis；

2. 使用spring创建的独立连接池类（阿里的druid连接池）；

3. 使用步骤（参考项目：SpringAndMybatis）
   - 加入mybatis与spring相关依赖与mybatis与spring集成依赖；
   - 创建mybatis核心配置文件（不设置数据库程序源信息）
   
   ```xml
   <?xml version="1.0" encoding="UTF-8" ?>
   <!DOCTYPE configuration
           PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
           "http://mybatis.org/dtd/mybatis-3-config.dtd">
   <configuration>
       <!--设置mybatis全局行为-->
       <settings>
           <!--设置mybatis输出日志-->
           <setting name="logImpl" value="STDOUT_LOGGING"/>
       </settings>
       <!--设置别名-->
       <typeAliases>
           <!--包下的类名就是别名-->
           <package name="domain"/>
       </typeAliases>
       <!--设置sql mapper文件映射位置-->
       <mappers>
           <mapper package="dao"/>
       </mappers>
   </configuration>
   ```
   
   - 创建spring配置文件
     - 设置数据源
     - 声明sqlSessionFactory对象；
     - 声明其他所需对象；
     
     ```xml
      <!--引入数据库属性配置信息文件-->
         <context:property-placeholder location="classpath:jdbc.properties"/>
         <!--申明数据源，作用是连接数据库，代替mybatis中的数据源-->
         <bean id="myDataSource" class="com.alibaba.druid.pool.DruidDataSource"
               init-method="init" destroy-method="close">
             <!--set注入给DruidDataSource提供连接数据库的信息-->
             <!--使用${jdbc.url}key值对数据连接进行赋值-->
             <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
             <property name="url" value="${jdbc.url}"/>
             <property name="username" value="${jdbc.username}"/>
             <property name="password" value="${jdbc.password}"/>
         </bean>
         <!--创建sqlSessionFactory类并给其赋值-->
         <bean id="SessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
             <property name="dataSource" ref="myDataSource"/>
             <property name="configLocation" value="classpath:mybatis.xml"/>
         </bean>
         <!--创建dao对象使用sqlSession的get(StudentDao.class)
             mapperScannerConfigurer:在内部调用getMapper（）生成每个dao接口的代理对象；
         -->
         <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
             <!--指定sqlSessionFactory对象的id-->
             <property name="sqlSessionFactoryBeanName" value="SessionFactory"/>
             <!--指定包名，包名时dao接口所在的包名
                 mapperScannerConfigurer会扫描这个包中所有接口，把每个接口都执行一遍getMapper()方法得到每个接口的dao对象。
                 创建好的dao对象放入到spring容器中。dao对象的默认名称时首字母小写的类名；
             -->
             <property name="basePackage" value="dao"/>
         </bean>
         <context:component-scan base-package="service.impl"/>
     ```

### 五. spring的事务处理

1. 当操作涉及到多个表或者多个语句的增删改时使用事务；

2. 多种数据库的访问技术，有不同的事务处理的方式与机制；

3. spring提供了处理事务的统一模型，能使用统一的方式完成多种不同数据库的访问技术的事务处理；

4. 声明式事务：将事务相关的资源和内容都提供给spring，spring就能完成事务的处理；

5. spring事务处理步骤

   - 通过事务管理器完成事务的内部提交，回滚事务；
     - 事务管理器是一个接口（PlatformTransactionManager）和他的实现类；
     - mybatis访问数据库实现类为：DataSourceTransactionManager；
     - Hibernate访问数据库实现类为：HibernateTransactionManager；
   - 当要使用，直接bean中声明就可以了；
   - 事务的隔离级别
     - READ_UNCOMMITTED  ：读未提交。 解决任何并发问题读未提交。
     - READ_COMMITTED  ：读已提交。 解决脏，存在不可重复与幻读已提交。
     - REPEATABLE_READ  ：可重复读 。解决脏、不，存在幻可重复读 。
     - SERIALIZABLE ：串行化。 不存在并发问题串行化。 
   - 事务的超时时间
     - 表示一个方法的最长执行时间，默认为-1
   - 事务的传播行为
     - 控制业务方法是否有事务 是什么样的事务；
     - PROPAGATION_REQUIRED 
       - 指定的方法 必须在事务内执行。若当前存在事务，就加入当前事务中；若当前没有事务，则创建一个新事务。这种传播行为是最常见的选择。
     - PROPAGATION_REQUIRES_NEW 
     - PROPAGATION_SUPPORTS 
     - PROPAGATION_MANDATORY 
     - PROPAGATION_NESTED
     - PROPAGATION_NEVER
     - PROPAGATION_NOT_SUPPORTED

6. spring提交事务，回滚事务的时机

   - 当业务方法执行成功，没有异常抛出，方法执行完毕后，spring方法提交事务；
   - 当业务方法抛出运行时异常，spring执行回滚；
   - 当业务方法抛出非运行时异常，主要是受查异常，提交事务；

7. 实现事务的基本步骤

   - 加入maven依赖；

     - spring的依赖；
     - mybatis的依赖；
     - mysql驱动；
     - spring的事务依赖；
     - mybatis和spring的集成依赖；

   - 创建实体类

   - 创建Dao接口与mapper文件；

   - 创建mybatis主配置文件；

   - 创建service接口和实现类，属性是dao；

   - 创建spring的配置文件：声明mybatis的对象交给spring创建

     - 数据源；
     - sqlSessionFactory；
     - Dao对象；
     - 声明自定义的Service；

   - spring框架使用@Transactional注解来管理事务（适用于大型项目）；

     - 声明事务管理器对象；

       ```xml
           <!--声明事务管理器类-->
           <bean id="transactionManager" 							class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
               <!--连接数据库，指定数据源-->
               <property name="dataSource" value="myDataSource"/>
           </bean>
       ```

     - 开启事务注解驱动；

       ```XML
           <!--开启事务注解，告诉spring使用注解进行事务管理-->
           <tx:annotation-driven transaction-manager="transactionManager"/>
       ```

     - 方法上加入注解@Transactional

     ```JAVA
         @Transactional(
     //          设置事务传播级别（默认设置Propagation.REQUIRED，可以省略）
                 propagation = Propagation.REQUIRED,
     //          设置隔离级别（默认设置Isolation.DEFAULT，可以省略）
                 isolation = Isolation.DEFAULT,
     //          设置是否为只读（默认设置false，可以省略）
                 readOnly = false,
     //          表示发生指定异常时，肯定回滚（默认设置运行时异常，可以省略）
                 rollbackFor = {
                       NullPointerException.class
                 }
         )
         public void buy(Goods good) {}
     ```

   - 使用spring配置文件进行事务配置实现步骤（aop方式适用于大型项目）

     - 加入aspectj依赖；

     ```xml
     <!--spring的aspectj事务依赖；-->
         <dependency>
           <groupId>org.springframework</groupId>
           <artifactId>spring-aspects</artifactId>
           <version>5.3.15</version>
         </dependency>
     ```

     - 声明事务管理器对象；

     ```xml
         <!--声明事务管理器类-->
         <bean id="transactionManager" 							class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
             <!--连接数据库，指定数据源-->
             <property name="dataSource" value="myDataSource"/>
         </bean>
     ```

     - 声明方法需要的事务的类型（配置方法的事务的属性）

     ```xml
         <tx:advice id="myAdvice" transaction-manager="transactionManager">
             <tx:attributes>
                 <!--tx:method给具体的方法配置事务属性
                     name为方法名称：不带包名类名的完整方法名；
                                   可以使用通配符*表示任意字符；
                 -->
                 <tx:method name="buy" propagation="REQUIRED" isolation="DEFAULT"/>
             </tx:attributes>
         </tx:advice>
     ```

     - 配置aop：那些类需要创建代理；

     ```xml
         <!--配置aop-->
         <aop:config>
             <!--配置切入点表达式：指定哪些包中类需要使用事务
                 id：切入点表达式的名称，唯一值
                 expression：切入点表达式，指定哪些类需要事务，aspectj会创建代理对象
             -->
             <aop:pointcut id="servicePt" expression="execution(* *..service..*.*(..))"/>
             <!--配置增强器：关联advice和pointcut
                 advice-ref：通知，上面tx：advice那里的配置；
                 pointcut-ref：切入点表达式的id
             -->
             <aop:advisor advice-ref="myAdvice" pointcut-ref="servicePt"/>
         </aop:config>
     ```

### 六. web项目中怎么使用容器

1. 实现步骤

   - 创建maven，web项目

   - 加入依赖

     - spring的依赖；
     - mybatis的依赖；
     - mysql驱动；
     - spring的aop依赖；
     - mybatis和spring的集成依赖；
     - Servlet依赖；
     - Jsp依赖

     ```xml
         <!--Servlet依赖-->
         <dependency>
           <groupId>javax.servlet</groupId>
           <artifactId>javax.servlet-api</artifactId>
           <version>3.1.0</version>
           <scope>provided</scope>
         </dependency>
         <!--jsp依赖-->
         <dependency>
           <groupId>javax.servlet.jsp</groupId>
           <artifactId>jsp-api</artifactId>
           <version>2.2.1-b03</version>
           <scope>provided</scope>
         </dependency>
     ```

   - web项目中容器对象（SqlApplicationContext）只需要创建一次，将容器对象放入全局域ServletContext之中；

     - 使用监听器实现该功能；
     - 监听器作用
       - 创建容器对象；
       - 把容器对象放到ServletContext之中；
     - 监听器已经在框架中创建好的（ContextLoaderListener）

   - 使用监听器步骤

     - 添加监听器依赖

     ```xml
       <dependency>
           <groupId>org.springframework</groupId>
           <artifactId>spring-web</artifactId>
           <version>5.2.5.RELEASE</version>
         </dependency>
     ```

     - web.xml文件使用context-param标签设置Application配置文件路径

     ```xml
         <context-param>
             <!--contextConfigLocation表示配置文件的路径-->
             <param-name>contextConfigLocation</param-name>
             <!--自定义配置文件的路径-->
             <param-value>classpath:ApplicationContext.xml</param-value>
         </context-param>
     ```

     

     - web.xml文件中注册监听器

     ```xml
         <listener>
             <!--配置监听器类-->
             <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
         </listener>
     ```

     - 获取监听器创建的容器对象

     ```java
     //WebApplicationContext是web中的容器对象
     WebApplicationContext ctx = null;
     //获取ServletContext中的容器对象
     String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
     Object attr = getServletContext().getAttribute(key);
     if(attr != null)
         ctx = (WebApplicationContext)attr; 
     
     //也可以使用框架中的工具方法获取容器对象
     ServletContext sc = getServletContext();
     WebApplicationContext ctx = WebApplicationContextUtil.getRequiredWebApplicationContext(sc);
     ```

## 第五章 Springmvc

### 一. 基本概念

1. 基于spring框架，spring的一个模块，专门做web开发的；

2. 底层是servlet；

3. 利用@controller注解创建控制器对象；

4. springmvc中央调度器（DispatherServlet）接受用户所有请求，然后把所有的请求转发给相关调度器；

5. 实现步骤
   - 加入依赖（spring-webmvc依赖）
   
   ```xml
       <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-webmvc</artifactId>
         <version>5.2.5.RELEASE</version>
       </dependency>
   ```
   
   - 在web.xml中注册springmvc的中央调度器（DispatherServlet）；
     - DispatherServlet也叫做前端控制器；
   
     - DispatherServlet负责接受用户提交的请求；
   
     - 使用/配置url-pattern表示所有静态资源与未映射资源全部交给该Servlet来进行处理，导致所有静态资源都无法处理；
   
     - 使用/配置url-pattern时springmvc.xml文件配置；
   
       - 使用mvc：default-servlet-handler标签，建立默认的能处理静态资源访问的问题（需要tomcat存在defalutservlet）；
       - 加入<mvc:resources>标签使用框架提供的ResourceHttpRequestHandler处理器对象对静态资源进行处理；
         - mapping属性表示访问静态资源的uri地址，使用通配符**
         - location属性表示静态资源在项目中的目录位置；
         - 可以将所有静态资源放置在同一目录（static）下
   
       ```xml
       <!--images/**表示static目录下的所有子目录与文件-->
       <mvc:resources mapping="/static/**" location="/static/"/>
       ```
   
     - 同时要加上注解驱动；
   
     ```xml
         <servlet>
             <servlet-name>springMvc</servlet-name>
             <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
             <init-param>
                 <param-name>contextConfigLocation</param-name>
                 <!--指定自定义springmvc配置文件位置-->
                 <param-value>classpath:springmvc.xml</param-value>
             </init-param>
     
             <!--在tomcat启动后创建实例：数字越小，创建越早-->
             <load-on-startup>1</load-on-startup>
         </servlet>
         
         <servlet-mapping>
             <servlet-name>springMvc</servlet-name>
             <!--使用框架是，url-pattern可以使用两种方式
                 使用扩展名的方式：*.xxxx,xxxx自定义的扩展名；
                 使用斜杠“/”
             -->
             <url-pattern>*.do</url-pattern>
         </servlet-mapping>
     
     ```
   
   - 创建发起请求的页面；
   
   - 创建控制器类
     - 在类的上面加上@controller注解；
     - 在方法上面加上@ReqiestMapping(请求映射，将方法和请求地址绑定在一起)注解，属性value表示请求的名称，以/开头；
     - 方法返回值为ModelAndView；
     - 在设置视图解析器之后，setViewName()中可以直接指定逻辑名称指定视图；
   
   - 创建springmvc的配置文件；
   
     - 申明视图解析器：设置视图文件的路径；
     - 设置组件扫描器；
   
     ```xml
         <!--配置组件扫描器-->
         <context:component-scan base-package="example.controller"/>
         <!--指定视图解析器-->
         <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
             <!--前缀:视图文件的路径-->
             <property name="prefix" value="/WEB-INF/view/"/>
             <!--后缀:视图文件的扩展名-->
             <property name="suffix" value=".jsp"/>
         </bean>
     ```
   
6. mvc请求处理流程

   - tomcat获取请求，将*.do的请求发送给中央调度器（DispatherServlet）；
   - 中央调度器（DispatherServlet）通过初始化扫描springmvc配置文件，创建controller对象；
   - 中央调度器（DispatherServlet）将请求转发给相应的Controller；
   - Controller对象处理完请求后，然后返回modelandView；

7. 将受保护的视图放在Web-Inf目录下

8. 解决页面乱码问题

```xml
 <!--配置编码过滤器-->
    <filter>
        <filter-name>characterEncodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>

        <!--设置编码格式-->
        <init-param>
            <param-name>encoding</param-name>
            <param-value>utf-8</param-value>
        </init-param>

        <!--更改请求编码格式-->
        <init-param>
            <param-name>forceRequestEncoding</param-name>
            <param-value>true</param-value>
        </init-param>

        <!--更改响应编码格式-->
        <init-param>
            <param-name>forceResponseEncoding</param-name>
            <param-value>true</param-value>
        </init-param>
    </filter>

    <filter-mapping>
        <filter-name>characterEncodingFilter</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```

### 二. springmvc使用注解开发

1. @RequestMapping注解的使用

   - @RequestMapping注解中的value属性可以指定多个请求；
   - 同一controller对象中所有请求都具有公共路径时，可以在类上添加@ReqiestMapping注解；
   - @ReqiestMapping注解中的value属性在类上表示请求路径公共部分；
   - @ReqiestMapping注解中的value属性在方法上表示请求路径的私有部分；
   - value属性之前不需要加上/；
   - @ReqiestMapping注解中的method属性表示请求方式，值为请求方式的枚举（get请求为 ReqiestMethod.get）；

2. Controller类中获取参数

   - 方法定义形参（HttpServletRequest request, HttpServletResponse response, HttpSession session）;
   - 使用相应的形参方法可以获取相应参数；
   - 逐个接收接收用户提交的参数；
     - 处理器方法的方法的形参名必须和请求中参数名必须一致；
     - 直接使用参数名就可以获取相应参数数据；
     - @Requestparam注解解决服务器中参数与形参参数名不一致的情况；
       - 直接放在形参之前；
       - value属性值表明形参对应的传参名；
       - required属性为真时，表明必须有该参数（默认为真）；
   - 使用java对象接收服务器中的多个参数
     - java对象中属性名必须与请求中参数名一致
     - 处理器方法形参是接受对象的参数名；

3. 处理方法的返回值

   - ModelAndView对象：

     - 该对象有数据也有视图；
     - 适合同时获取视图与数据的情况；
     - setView（String path）：表示视图；

   - String

     - 表示返回值为视图；
     - 逻辑视图名称（需要配置视图解析器）；
     - 也可以使用完整路径名称；

   -  void处理ajax时使用

   - 返回对象Object（String，list，以及对象）

     - 表示返回值是数据；

     - 实现处理ajax的步骤；

       - 加入json的工具库依赖，springmvc默认使用jackson；

       ```xml
           <!--jackson依赖，用来处理ajax-->
           <dependency>
             <groupId>com.fasterxml.jackson.core</groupId>
             <artifactId>jackson-core</artifactId>
             <version>2.13.1</version>
           </dependency>
       
           <dependency>
             <groupId>com.fasterxml.jackson.core</groupId>
             <artifactId>jackson-databind</artifactId>
             <version>2.13.1</version>
           </dependency>
       ```

       - 在springmvc配置文件中加入<mvc:annotation-driven>（头部为mvc）的注解驱动；
         - 该标签会自动创建七个消息转换器的实现类；
       - 在处理器方法上面加入@ResponseBody注解；
         - 将返回对象转换为json数据；
         - 通过HttpServletResponse完成数据的输出；
       - 利用Jquery技术进行打印；

     - 通过@ResponseBody注解区分String为视图还是数据；

       - String数据不需要转换为json；
       - 解决该乱码问题使用@RequestMapping注解中的produces属性设置为：text/plain;charset=utf-8;

### 三. springmvc核心技术

1. 转发与重定向

   - forward和redirect都是关键字，不受视图解析器限制；

   - 转发可以访问受保护的资源（WEB-INF目录下的资源）；

   - 重定向不能访问受保护的资源（WEB-INF目录下的资源）；

   - 转发操作语法：ModelAndView对象中setViewName(”forward:视图文件的完整路径“)；

   - 重定向操作语法：ModelAndView对象中setViewName(”redirect:视图文件的完整路径“)；
     - 框架在重定向时，将model中参数作为get请求的参数传到下一个参数中；
     - 需要使用${param.参数名取出数据}（代表reuqest.getParam()）;

2. 异常处理

   - 采用统一全局的异常处理方案（aop思想）；
   - @ExceptionHandler注解；
     - 必须让框架知道该注解所在的类，要建立对象的组件扫描器；
   - @ControllerAdvice注解
     - 定义方式与控制器方法的定义方式一致；
     - 方法形参Exception表示controller对象抛出的异常；
     - value属性表示哪些异常由该类进行处理；
     - value不赋值时，处理所有没有被处理的异常；
   - 全局异常处理步骤
     - 自定义异常类MyUserException；
     - 在Controller中抛出NameException，AgeException
     - 创建普通类作为全局异常处理类；
       - 在类上加上@ControllerAdvice注解；
       - 在类中定义方法加上@ExceptionHandler注解；
     - 创建处理异常视图页面；
     - 创建springmvc的组件扫描器；
       - 创建扫描@ControllerAdvice注解的组件扫描器；
     - 声明注解驱动；
   - 异常发生处理逻辑
     - 需要把异常记录下来，记录到数据库，日志文件；
     - 发送通知，把异常信息通过相关手段发送给相关人员；
     - 给用户发送友好信息；

3. 拦截器

   - 拦截器可以由0或多个；
   
   - 拦截器需要实现HandlerInterceptoy接口；
   
   - 和过滤器类似，侧重点不同，拦截器是拦截用户的请求，做请求判断；
   
   - 拦截器时全局的；
   
   - 通常功能：用户登录处理，权限检查，记录日志；
   
   - 使用步骤
     - 定义类实现HandlerInterceptoy接口；
     - springmvc配置文件中声明拦截器；
   
     ```xml
         <!--声明拦截器：拦截器可以有0或多个-->
         <mvc:interceptors>
             <!--声明第一个拦截器-->
             <mvc:interceptor>
                 <!--指定拦截的请求的uri地址
                     path：就是uri地址，可以使用通配符“**”，表示文件或者多级目录中的文件
                 -->
                 <mvc:mapping path="/user/**"/>
                 <!--指定拦截器对象-->
                 <bean class="handler.MyInterceptor"/>
             </mvc:interceptor>
         </mvc:interceptors>
     ```
   
   - 执行时间
     - 请求处理之前（controller方法执行之前）；
     - 控制器方法执行之后也会实行拦截器；
     - 请求处理完成后也会执行拦截器；
   
   - HandlerInterceptor接口中方法
     - preHandler（）：预处理方法；
       - 整个项目的入口与门户；·
       - 参数：Object hanler（被拦截的控制对象）；
       - 返回值为boolean，true为放行请求，false为拦截请求；;
       - 方法在控制器执行之前先执行，用户请求首先到达这里；
       - 可以获取请求的信息，验证要求是否符合要求；
     - postHandler（）：后处理方法；
       - preHandler（）返回结果必须为真；
       - 参数
         - Object hanler（被拦截的控制对象）；
         - MedelAndView mv：处理器方法的返回值；
       - 在处理方法之后执行；
       - 可以修改MedelAndView 中数据与视图；
       - 可以对执行结果进行修正；
     - afterCompletion（）：最后执行的方法
       - 参数
         - Object hanler（被拦截的控制对象）；
         - Expection ex程序中发生的异常；
       - 在请求处理完成后执行(当视图处理完成后)；
       - 一般做资源回收工作（删除请求中创建的对象，清空内存）；
   
   - 多个拦截器执行顺序是按照声明顺序执行；
   
4. 拦截器与过滤器的区别

   - 拦截器是框架中的对象，过滤器为Servlet规范中的一员；
   - 过滤器实现Filter接口，拦截器是实现HandlerInterceptor；
   - 过滤器用来设置request，response的参数；
   - 过滤器是在拦截器之前执行；
   - 过滤器是由Tomcat创建，拦截器是springmvc容器创建；
   - 过滤器是一个执行时间点，拦截器有三个执行点；
   - 过滤器可以处理所有对象，拦截器侧重处理Controller对象；

5. springmvc中请求处理过程

   - 用户发起请求到中央调度器；
   - 中央调度器把请求转发给j处理器映射器（实现了HandlerMapping的类）
      - 处理器映射器作用：根据请求获取springmvc中相关的Controller类，并将找到的类放到处理器执行链（HandlerExecutionChain）中保存；
      - 处理器执行链（HandlerExecutionChain）中保存有：处理器对象、项目中所有的拦截器对象；
      - 将处理器执行链（HandlerExecutionChain）返回给中央调度器；

   - 中央调度器将处理器执行链中的处理器对象交给处理器适配器对象（多个）；
      - 处理器适配器（实现了HandlerAdapter的类）：作用是调用Controller类中相关方法执行请求；
      - 将处理过后的ModelAndView返回给中央调度器；

   - 中央调度器将ModelAndView对象交给视图解析器对象进行处理；
      - 框架中使用View及其实现类表示视图；

   - 中央调度器将视图解析器对象返回的View视图作为相应返回给浏览器；


## 第六章. SSM框架整合开发

### 一. 整合开发思路

1. SpringMVC：视图层，界面层，负责接收请求，显示处理结果；
2. Spring：业务层，管理service，dao工具类对象的；
3. MyBatis：持久化层，访问数据库；
4. 相关文件定义在相关的配置文件中；
   - controller类放在springmvc容器中；
   - service，dao对象放在spring容器中；
5. springmvc容器为spring容器的子容器，子容器可以访问父容器中内容

### 二. 实现步骤

1. 加入所有依赖
   - Servlet依赖；
   - springmvcy依赖；
   - Mybatis依赖；
   - 数据库依赖；
   - druid连接池依赖；
   - spring-mysql依赖；
   - jackson依赖；
2. 写web.xml
   - 注册DispatcherServlet中央控制器对象；
     - 创建springmvc容器对象，来创建controllar对象；
     - 创建Servlet来接收用户的请求；
   - 注册spring的监听器；
     - 创建spring容器对象，来创建dao，Service等对象；
   - 注册字符集过滤器，解决post请求乱码问题；
3. 创建包：controller包，service包，dao包，实体类包（domain）；
4. 设置配置文件（将配置文件放在conf子文件夹下）
   - springmvc配置文件（使用dispatcherServlet作为配置文件名称）；
     - 配置组件扫描器；
     - 配置视图扫描器；
     - 配置注解驱动；
   - spring配置文件（使用applicationContext作为配置文件名称）；
     - 声明数据源文件；
     - 申明数据源，连接数据库；
     - 声明SessionFactory对象来获取数据连接；
     - 声明MapperScannerConfigurer对象来服务器中创建Dao类；
   - myBatis配置文件；
     - 设置全局参数：日志功能；
     - 设置别名；
     - 设置dao文件所在包名；
   - 数据库的属性配置文件；
5. 写相应的代码；

## 第七章. Dubbo架构

#### 一 . 分布式架构

1. 分布式架构：分布式系统是若干系统集合；
2. 单一架构：
3. 垂直架构：扩展容易；
4. 分布式架构（基于RPC：远程过程调用）：将业务拆分后，用某种方式事项各个业务模块的远程调用；
5. Dubbo是一个高性能的RPC框架，
   - 优点：解决了分布式中的调用问题；
   - 缺点：缺少统一的调度中心，需要其他框架帮忙实现；

#### 二. Dubbo框架底层原理

1. 序列化：dubbo采用的效率最高的二进制序列化；
2. 网络通信：dubbo采用socket通信机制；
3. 三大核心功能：
   - 面向接口的远程方法调用；
   - 智能容错和负载均衡；
   - 服务自动注册和发现；
4. Dubbo支持的协议：推荐dubbo协议（默认端口号：20880）；

#### 三.  使用dubbo进行开发（customs客户端与服务端直连，不需要注册端）

1. 添加spring，dubbo，zookeeper，接口工程依赖 ；

   ```xml
   	<dependencies>
           
           <!--dubbo依赖-->
          <dependency>
               <groupId>com.alibaba</groupId>
               <artifactId>dubbo</artifactId>
               <version>2.6.2</version>
           </dependency>
           
           <!--zookeeper依赖-->
           <dependency>
               <groupId>org.apache.curator</groupId>
               <artifactId>curator-framework</artifactId>
               <version>5.1.0</version>
           </dependency>
       </dependencies>
   ```

2. 服务提供者项目中创建服务提供者dubbo核心配置文件（最后创建service服务类提供服务）

   - 服务提供者声明名称：必须保证服务名称的唯一性；
   - 访问服务协议的名称及端口号：默认dubbo协议，端口号：20880；
   - 暴露服务接口：dubbo：service
     - interface属性：暴露接口的全限定类名；
     - ref属性：接口引用的实现类在spring容器中的标识；
     - registry属性：
       - 不使用注册中心，值为：N/A；
       - 使用zookeeper注册中心不需要该属性；
     - version属性：service实现类的版本号；
     - timeout属性：连接超时（单位为ms）
   - 将接口实现类加载到spring容器中；
   - 配置contextConfigLocation监听器在服务器启动时，直接创建spring容器；

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:dubbo="http://code.alibabatech.com/schema/dubbo"
          xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://code.alibabatech.com/schema/dubbo http://code.alibabatech.com/schema/dubbo/dubbo.xsd">
       <!--服务提供者声明名称：必须保证服务名称的唯一性-->
       <dubbo:application name="001-link-userService-provider"/>
   
       <!--访问服务协议的名称及端口号：默认dubbo协议，端口号：20880-->
       <dubbo:protocol name="dubbo" port="20880"/>
   
       <!--暴露服务接口：dubbo：service
           interface属性：暴露接口的全限定类名；
           ref属性：接口引用的实现类在spring容器中的标识；
           registry属性：如果不使用注册中心，值为：N/A；
   		version属性：service实现类的版本号；
       -->
       <dubbo:service interface="暴露接口的全限定类名" ref="接口引用的实现类的id" register="N/A" version="service实现类的版本号"/>
       
       <!--声明zookeeper端口号-->
       <dubbo:registry address="zookeeper://localhost:2181"/>
   
       <!--将接口实现类加载到spring容器中-->
       <bean name="接口引用的实现类在spring容器中的标识" class="接口引用的实现类全限定类名"/>
   </beans>
   ```

3. 服务消费者项目中创建服务消费者dubbo核心配置文件（最后创建controller控制类提供服务）

   - 添加spring，dubbo，zookeeper，接口工程依赖；

   - 声明消费者名称：保证唯一性；

   - 引用远程服务接口：

     - id属性：远程服务接口对象名称；
     - interface：调用远程接口的全限定类名；
     - url：
       - 访问服务接口的地址；
       - 使用zookeeper注册中心不需要该属性

     - registry属性
       - 不使用注册中心，值为：N/A；
       - 使用zookeeper注册中心不需要该属性；

     - version属性：service实现类的版本号；
     - check属性：检测服务是否启动（消费者中上线时使用）；
     - timeout属性：连接超时（单位为ms）

   - 添加注册中心标签dubbo:registery

     - adress属性表示注册中心端口号；

     ```xml
     <?xml version="1.0" encoding="UTF-8"?>
     <beans xmlns="http://www.springframework.org/schema/beans"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:dubbo="http://code.alibabatech.com/schema/dubbo"
            xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://code.alibabatech.com/schema/dubbo http://code.alibabatech.com/schema/dubbo/dubbo.xsd"> 
         
     	<!--服务消费者声明名称：必须保证服务名称的唯一性-->
         <dubbo:application name="002-link-comsumer"/>
     
         <!--引用远程服务接口：dubbo:reference
             id属性：远程服务接口对象id
             interface：调用远程接口的全限定类名；
             url：访问服务接口的地址；
             registry属性：如果不使用注册中心，值为：N/A；
     		version属性：service实现类的版本号；
         -->
         <dubbo:reference id="userservice"
                          interface=""
                          url="http://localhost:20880"
                          registry="N/A"
                          version="service实现类的版本号"
                          />
         
         <!--指定注册中心-->
         <dubbo:registry address="zookeeper://localhost:2181"/>
     </beans>
     ```

4. dubbo官方要求必须有接口工程；

   - 添加spring，zookeeper，dubbo依赖
   - 对外暴露的service服务接口（服务工程中实现）；
   - 实体bean对象（需要序列化）；
   - 粒度
     - 服务接口尽可能最大粒度，每个服务方法代表一个功能；
     - 服务接口建议以业务场景为单位划分，并对相近业务做抽象（防止接口数量爆炸）；
     - 不建议使用过于抽象的接口（要有确定的意义，便于后期维护）；
   - 版本：每一个接口都应定义版本号，区分统一接口；
   - 接口工程实现步骤
     - 添加spring与dubbo依赖；
     - 创建dubbo核心配置文件（与服务提供者一致）；
     - 创建对外保留的服务实现类；
     - 实体bean对象；
   
5. 工程编辑完毕后启动zookeeper；

## 第八章. Redis数据库

#### 一. Nosql数据库

1. Nosql（not only SQL）特点
   - 关系型数据库（RDBMS）；
   - 非关系型数据库；
   - 在Nosql数据库中数据之间时无联系的，无关系的；
   - 数据的结构是松散的，可变的；
2. 关系型数据库的瓶颈
   - 无法应对每秒上万次的读写操作；
   - 表中存储记录数据邮箱，横向扩展能力有限；
   - 无法简单的通过增加硬件、服务节点来提高系统性能；
   - 关系型数据库大多是收费的，对硬件要求较高；
3. Nosql的特点
   - 处理大量数据具有高性能，
   - 灵活的数据模型；
   - 拥有自己的高可用解决方案；
   - 低成本：免费且对硬件需求小；
4. Nosql的劣势
   - 无关系，数据之间没联系；
   - 不支持标准的SQL，没有公认的NOSQL的标准；
   - 没有关系型数据库的约束；
   - 没有事务，不能依靠事务实现ACID；
   - 没有丰富的数据类型；

#### 二. redis基本信息

1. redis是当今非常流行的基于KV结构（map）的作为Cache（缓存）使用的NOSQL数据库；
2. 放在service与dao之间，作为内存中间件（cache）；
3. redis主要是减轻数据库的查询压力；
4. linux中安装redis；
   - 使用tar -zxvf gz包将redis压缩包解压到目标文件夹中；
   - 在解压后的redis文件夹下使用make命令对源文件进行编译；
   - 编译后使用cd命令进入src文件夹中；
   - 使用后台启动./redis-server&的方式启动redis服务器；
   - 可以使用 ps -ef | grep redis的命令查看redis执行情况；
   - 使用前台启动./redis-cli的方式启动客户端，然后就能够使用redis了；
   - 关闭redis
     - 执行./redis-cli shutdown命令关闭redis服务器；
     - 可以使用 ps -ef | grep redis的命令查看redis进程号；
     - 然后使用kill pid（进程号） 或者kill-9 pid（进程号）的方式杀掉进程；

   - 采用./redis-cli -h 服务器域名 -p 端口号 可以链接到任意机器上的redis服务器；
   - 更改配置文件
     - 注释掉 bind ip对绑定ip进行注释；
     - 将protected-mode yes 保护模式改为no；
     - 配置文件更改后，启动时应指定配置文件（redis -server ../redis.conf）；
     - 使用systemctl status firewalld

5. redis命令
   - redis基本命令
     - 沟通命令：ping；
     - 返回当前库中数据条数：dbsize；
     - 切换库命令：select 库索引值；
     - 删除当前库中所有数据：flushdb；
     - 推出客户端：exit或者q；

   - redis操作key的命令
     - 查找符合条件的所有pattern信息（）：keys *；
       - *表示0-多个字符，
       - ？则表示单个字符；

     - 判断key在当前库中是否存在：exists key[key...]
       - 使用多个key，可以判断其中有多少个key存在；

     - 设置key的存活时间：expire key time
       - 时间以s为单位；

     - 查询key存在的剩余时间：ttl key；
       - -1表示key永久存在；
       - -2表示key不存在；
       - 正整数表示剩余时间；

     - 查询key所存储的数据是什么类型：type key
     - 删除当前库中指定key的key与value值：del key[key...] ；

6. redis中的5中数据类型
   - 字符串类型 String；
   - 哈希类型（其中value是一个map（key名叫field））：存储java对象信息；
   - 列表类型：list；
   - 集合类型：set；
   - 有序集合：zset；


#### 三. 数据类型对应命令

1. 字符串类型 String
   -  基本命令
     - set key value：
       - 当前库中创建一对新值；
       - 已存在key时则是执行覆盖；
     - get key：获取当前key所对应的值；
     - incr key（value值为整型值）
       - 将key中存储的数字整型值加1
       - key不存在时，先赋值0，再加1；
     - decr key（value值为整型值）
       - 将key中存储的数字整型值减1；
       - key不存在时，先赋值0，再减1；
     - append key value
       - 向key中值追加value；
       - 库中没有key，相当于执行set；
   - 常用命名
     - strlen key：获取字符串长度值；
     - getrange key 整数值 整数值
       - 获取从第一个整数值下标开始，到第二个下标结束的字段；
       - 整数值为正时，表示从第一个开始；
       - 整数值为负时，表示从最后一个开始；
       - 第二个整数值的位置需在第一个后面；
     - setrange key 整数值 value
       - 表示从整数值开始，将值替换为value；
       - 返回值为修改后字符串总长度；
     - mset key value key value...
       - 一次性创建多个key和value；
     - mget key key...
       - 一次性获取多个key所对应的值，顺序和语句中key的顺序一致；
2. 哈希类型
   - 基本命令
     - hset hash表中的key field value
       - 将哈希表key中的域field的值设为value；
       - 如果key不存在，则新建哈希表；
       - 如果field存在，则覆盖值；
       - field为新field，返回1；
       - 覆盖则是返回0；
     - hget hash表中的key field：获取key 中field对应的值；
     - hmset hash表中的key field value field value.... :同时创建一个key中多对field-value值；
     - hmget hash表中的key field field....：获取一个哈希中一个field或多个field对应值；
     - hgetall hash表中的key ：获取哈希中所有值；
     - hdel hash表中的key field field....：删除哈希中指定field；
   - 常用命令
     - hkeys  hash表中的key ：获取哈希中所有field值；
     - hvalues  hash表中的key：获取哈希中所有value值；
     - hexists hash表中的key field：检测哈希中指定field是否存在；
3. 列表类型
   - redis列表时简单的字符串列表。按照插入的顺序排序；
   - l代表头部操作，r代表尾部操作；
   - 基本命令
     - lpush key value value....
       - key没有时创建一个列表；
       - 向列表左侧依次插入数据；
       - 返回值为插入后列表的长度；
     - rpush key value value....
       - key没有时创建一个列表；
       - 向列表右侧依次插入数据；
       - 返回值为插入后列表的长度；
     - Irange key start stop
       - 获取指定区间值（包含边界）；
     - lindex key index
       - 获取指定下标的值；
       - 不存在返回空（nil）；
     - llen key：返回列表成员个数；
   - 常用命令
     - lrem key count value
       - count为正时表示顺序从左至右；
       - count为负时表示顺序从右至左；
       - 以count索引为起点，删除匹配元素；
       - 返回删除数据的个数；
     - lset key count value
       - 将指定下标的值替换为value；
     - linsert key BEFORE|AFTER pivot value
       - 将值value插入到列表key当中位于值pivot 之前或之后的位置；
       - key或者pivot不存在时，不做任何操作；
       - 返回操作后列表长度；
4. 集合类型
   - 基本命令
     - sadd key member...：
       - 向集合中添加一个或者多个对象（无序）；
       - 新建集合；
     - smembers key：显示集合的所有成员；
     - sismember key member: 检查集合中是否存在成员；
     - scard key：计算集合中有多少个成员；
     - srem key member...：删除集合中的一个或多个元素；
   - 常用命令
     - srandmember key [count]
       - 随机从集合中显示count个成员；
       - count可以省略，默认为1；
     - spop key [count]
       - 随机从集合中删除count个成员；
       - count可以省略，默认为1；
       - 返回删除的元素；
5. 有序集合类型
   - 每个成员都可以关联分数，根据分数进行排序；
   - 分数值可以重复；
   - 默认按照分数升序排序；
   - 分数相同按照成员的字典顺序排；
   - 基本命令
     - zadd key score value score value....
       - 向集合中添加一对或者分数：value对值；
     - zrange key start stop[WITHSCORES]
       - 查询指定区间内（包含边界）的所有元素；
       - 默认只返回value；
       - WITHSCORES表示value和score一起返回；
     - zrevrange key start stop[WITHSCORES]
       - 与zrange命令一致；
       - 但返回结果按照降序呈现；
     - zrem key member...
       - 从集合中删除一个或多个成员；
       - 返回删除成员个数；
     - zcard key：统计集合中成员个数；
   - 常用命令
     - zrangebyscore key min max[WITHSCORES] [LIMIT offset count]
       - 按照分数来获取min和max区间之间的所有成员；
       - WITHSCORES表示value和score一起返回；
       - LIMIT offset count表示分页数据；
       - 在min或者max前面添加(表示不包含该边界；
       - +inf表示最高；
       - -inf表示最低；
     - zrevrangebyscore key max min [WITHSCORES] [LIMIT offset count]
       - 用法和zrangebyscore一致；
       - 数据显示是降序；
     - zcount key min max
       - 寻找min和max区间之间成员数；

#### 四. 服务器端的管理

1. redis事务

   - redis事务是一组命令的集合，保证该组命令能够正确执行；
   - 操作的命令
     - multi
       - 作用：开启事务；
     - exec
       - 作用：执行所有事务块内的命令；
       - 返回值：事务内的所有执行语句内容，事务被打断返回nil；
     - discard
       - 作用：取消事务；
     - watch
       - 语法：watch key...;
       - 开始事务之前进行设置；
       - 监控key值是否被其他事务改变，如果被改变，则取消事务；
     - unwatch
       - 取消对事物的监控；
   - 事务的异常
     - 事务执行exec之前，语句存在语法问题（事务被取消）；
     - 事务执行exec之中，语句在执行时出错（事务正常提交）；
     - 使用discard放弃事务（事务被取消）；
2. 持久化

   - RDB（redis DataBase）方式
     - 在固定的时间间隔下，将内存中的数据快照写入磁盘中；
     - 写入到dumpr.db二进制文件;
     - 在redis.conf中配置
       - 配置格式：save  <seconds>  <changes>
         - 可以配置多个；
       - 指定在n秒内右m个key的改动才会触发存储；
       - dbfilename：设置RDB文件名，默认dump.rdb；
       - dir:指定rdb文件位置，默认./当前位置；
     - 有数据丢失的可能性；
   - AOF（append-only File）方式
     - 将每次接收到的修改命令全部写入aof文件中去；
     - 在redis.conf中配置
       - appendonly：默认时no，改成yes开启aof持久化；
       - appendfilename：指定AOF文件名，默认为appendonly.aof;
       - dir:指定rdb文件位置，默认./当前位置；
       - appendfsync:配置向aof文件写命令数据的策略；
         - no：不主动进行同步操作，由系统来做，每30秒一次（不是很安全）；
         - always：每次执行写入都会同步（慢一些，但是安全）；
         - everysec：每秒执行一次同步，介于速度与安全之间；
       - auto-aof-rewrite-min-size：允许重写的最小aof文件大小，默认时64M，超过时，整理文件；
3. 主从复制（主服务器的数据实时同步到从服务器中）

   - 单台主服务器作为数据的修改；
   - info replication命令查看连接的服务器信息；
   - 一台或多台从服务器执行查操作；
   - 通过主从复制完成读写分离；
   - 实现主从复制的方式
     - 修改redis.conf配置文件
       - 自定义端口号（1025-65535之间的数字）
       - 主服务器配置文件
         - include 包含原来的redis.conf;
         - daemonize yes；（配置后台启动）
         - port 主服务器端口号；
         - pidfile /var/run/redis_6380.pid
         - logfile 6380.log(指定主服务器日志文件)
         - dbfilename dump.rdb(指定主服务器rdb文件)
       - 从服务器配置文件
         - include 包含原来的redis.conf;
         - daemonize yes；（配置后台启动）
         - port 从服务器端口号；
         - pidfile /var/run/redis_6380.pid
         - logfile 6380.log(指定从服务器日志文件)
         - dbfilename dump.rdb(指定从服务器rdb文件)
       - 客户端连接从服务器后输入命令：slaveof （主服务器的ip 端口号）
       - 客户端使用info replication查看服务器角色
   - 主服务器挂掉时，
     - slaveof no one ：将一台从服务器升级为主服务器；
     - slaveof 升级为主服务器的ip地址 端口号；
   - 哨兵（Sentinel）
     - 用来监控多个Redis服务实例的运行情况；
     - 哨兵的个数至少是三个，必须是奇数个；
     - 使用心跳机制，监控主服务器；
     - 三个主要任务：
       - 监控：不断检查，主从服务器是否正常工作；
       - 提醒：当被监控的服务器出现问题，通知管理员或其他应用程序；
       - 自动故障转移：监控的主服务器不能正常工作时，会开始进行故障迁移操作；
     - sentinel.conf为哨兵的配置文件（默认端口号：26379）；
     - redis-sentinel为哨兵服务器启动文件；
4. 安全设置

   - 设置密码
     - requirepass 后面设置密码；
     - ./redis-cli -a 密码 ：对服务器进行访问；
     - ./redis-cli：进入客户端后，使用auth 密码：的方式访问数据；
   - 绑定ip
     - bind 后面设置绑定的ip；
     - 可以设置多个ip，ip之间用空格间隔；
     - 只有指定ip能访问；
   - 修改端口号


#### 五. jedis 操作Redis

1. jedis 操作Redis的命令与redis本身命令一致；

1. 与commons-Pool（线程池）一起使用，提高线程安全；

3. jedis使用步骤

   - 创建Jedis对象，指定连接的redis服务器的ip和端口号；
   - 调用Jedis对象的方法，操作Redis数据；

   ```java
   // 创建Jedis对象，指定连接的redis服务器的ip和端口号；
   String host = "localhost";
   String port = "6379";
   Jedis jedis = new Jeids(host, 6379);
   
   // 从JedisPool中获取Jeids对象
   Jedis jedis = JedisUtil.getJedisPool().getResouce();
   ```

4. 使用commons-Pool线程池；

   - 创建工具类

     - 创建静态参数JedisPool对象；
     - 工具方法中创建JedisPoolConfig对象；
     - 给config设置连接池参数（连接池最大线程数）；
     - 设置最大的空闲数；
     - 设置检查项为true:表示从线程池中取出的连接一定是受检查可用的；
     - 创建JedisPool对象

     ```java
     public class JedisUtil{
         //创建静态参数JedisPool对象
         private static JedisPool jedisPool;
         
         public static JedisPool getJedisPool(){
             if(jedisPool == null){
                 //工具方法中传教JedisPoolConfig对象
                 JedisPoolConfig jpc = new JedisPoolConfig();
     
                 //给config设置连接池参数（连接池最大线程数）
                 jpc.serMaxTatol(20);
     
                 //设置最大的空闲数
                 jpc.serMaxIdle(2);
     
                 //设置检查项为true
                 jpc.TestOnBorrow(true);
     
                 /*创建JedisPool对象
                 *jpc为JedisPoolConfig对象；
                 *host为服务器ip地址；
                 *port为服务器端口号；
                 *6000为连接超时时间；
                 * 123456为访问密码
                 */
                 jedisPool = new JedisPool(jpc,host,port,6000,"123456");
             } 
             return jedisPool;
         }
         
         //关闭线程池
         public static void close(){
             if(jedisPool != null){
                 jedisPool.close();
             } 
         }
     }
     ```

## 第九章. SpringBoot框架

#### 一. Xml与javaConfig

1. javaConfig是一种使用java类作为xml配置文件的替代，是配置spring容器的纯java模式；
   - 使用两个注解
     - @Configuration:放在一个类的上，表示该类为spring配置文件；
     - @Bean:放在方法上，作用相当于<bean>标签；
     
   - @Configuration类
     - @Bean加上方法上面：相当于<bean>标签；
     - @Bean不指定对象名称：默认名称为方法名；
     - 使用@Bean的name属性指定对象的名称；
     - bean方法的返回值应该为需要被spring框架管理的类；
     
   - 通过创建AnnotationConfigApplicationContext（Configuration类名）类的方式创建spring容器；
   
   - @ImportResource注解
     - 作用是导入其他的xml配置文件；
     - 放在@Configuration类的上面；
     - value属性指定xml配置文件位置；
     - value属性可以为数组，可以通过属性指定多个配置文件；
     
     ```java
     @Configuration
     @ImportResource(value="classpath：指定xml文件路径")
     public class Configuration类类名{
     }
     ```
     
   - @PropertyResource注解
   
     - 作用是读取properties配置文件；
   
     - properties配置文件可以实现外部化配置文件；
   
     - 使用步骤
   
       - 在resources目录下创建配置文件；
       - 在@Configuration类类名之上指定PropertyResource配置文件；
       - PropertyResource配置文件为配置文件类路径；
       - 在spring管理类中使用@value(@{配置文件中key的值})导入配置文件参数值；
       - 在@Configuration类类名之上使用CompentScan注解启用配置文件扫描器；
   
       ```java
       @Configuration
       @PropertyResource(value="classpath：配置文件路径")
       @CompentScan(basePackages="类所在目录")
       public class Configuration类类名{
       }
       ```

#### 二. springBoot基本概念

1. springBoot可以简化spring，springmvc的使用。核心是IOC容器；

2. 特性

   - 创建spring应用；
   - 内嵌tomcat，jetty，undertow服务器；
   - 提供starter起步依赖，简化应用配置；
     - 使用springBoot通过mybatis-spring-boot-starter依赖可以直接简化Mybatis依赖；
   - 尽可能配置spring和第三方库(Mybatis)；
   - 提供健康检查，统计，外部化配置等功能；
   - 不用生成代码，也不用使用xml配置文件；

3. springBoot项目的创建

   - 第一种方式：spring提供的初始化器进行创建；

     - resources包中文件夹含义
       - static：静态资源（js, css, 图片等）；
       - templates：模板文件；
       - application.properties: springBoot重要的配置文件；
     - pom.xml文件

     ```xml
     <?xml version="1.0" encoding="UTF-8"?>
     <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
         <modelVersion>4.0.0</modelVersion>
         <!--springBoot的父项目-->
         <parent>
             <groupId>org.springframework.boot</groupId>
             <artifactId>spring-boot-starter-parent</artifactId>
             <version>2.6.3</version>
             <relativePath/> <!-- lookup parent from repository -->
         </parent>
         <!--项目信息-->
         <groupId>com.example</groupId>
         <artifactId>springBootExample</artifactId>
         <version>0.0.1-SNAPSHOT</version>
         <!--java版本-->
         <properties>
             <java.version>1.8</java.version>
         </properties>
     
         <dependencies>
     
             <!--spring初始化器-->
             <dependency>
                 <groupId>org.springframework.boot</groupId>
                 <artifactId>spring-boot-starter-web</artifactId>
             </dependency>
     
             <dependency>
                 <groupId>org.springframework.boot</groupId>
                 <artifactId>spring-boot-starter-test</artifactId>
                 <scope>test</scope>
             </dependency>
         </dependencies>
     
         <build>
             <plugins>
                 <plugin>
                     <groupId>org.springframework.boot</groupId>
                     <artifactId>spring-boot-maven-plugin</artifactId>
                 </plugin>
             </plugins>
         </build>
     
     </project>
     ```
     
   - 第二种方式：将浏览器中构建的项目导入到idea中；

   - 第三种方式：创建maven项目的方式创建springboot项目；

   - @springbootApplication注解；

     - 放在springBoot的主包之上
     - 包含@Configuration注解：可以作为配置文件使用；
     - 包含@EnableAutoConfiguration注解：启动自动配置；
       - 如可以把myBatis的对象创建好；
     - 包含@CompentScan注解：可以启动组件扫描器；
       - 默认扫描的包：@CompentScan注解所在的包和子包下相关的类；
   
4. application主配置文件

   - properties格式（k=v）
     - server.port属性设置端口号；
     - server.servlet.context-path属性设置访问应用的上下文路径；
     - 在主配置文件（无环境名配置文件）中设置spring.profiles.active:指定使用配置文件（值为配置文件环境名）；

   - yml格式（k: v）

     - 存在层级关系；
     - 更清晰，更具有可读性；

     ```yml
     server:
       #配置端口号
       port: 8080
       servlet:
         #配置应用的上下文路径
         context-path: /myboot2
     spring:
       profiles:
       	#指定使用配置文件
         active: dev
     ```

   - 两者同时存在时默认使用properties格式文件；

   - 多环境配置

     - 创建多个配置文件；
     - 配置文件名称为：application-环境名；
     - 开发环境：名称为：application-dev；
     - 测试环境：名称为：application-test；
     - 上线环境：名称为：application-test；

   - 自定义配置文件

     - 可以将项目中需要的数据可以放置到配置文件中；
     - controller类的属性上使用@value(@{配置文件中key的值})获取配置文件参数值；
     - 能获取默认设置的key与自定义配置文件中的值；
     - 将@ConfigurationProperties设置在类上，prefix属性设置该类中属性的配置文件中的前缀；
     - 使用依赖项获取处理ConfigurationProperties类有关的源数据信息；

     ```xml
     		<dependency>
                 <groupId>org.springframework.boot</groupId>
                 <artifactId>spring-boot-configuration-processor</artifactId>
                 <optional>true</optional>
             </dependency>
     ```

   - 在springboot中使用jsp

     - springboot中不推荐使用jsp，推荐使用模板技术替代jsp；

     - 实现步骤

       - 添加相关的依赖（处理jsp的依赖：tomcat-embed-jsaper）；

       ```xml
          		<!--处理jsp的依赖-->
               <dependency>
                   <groupId>org.apache.tomcat.embed</groupId>
                   <artifactId>tomcat-embed-jasper</artifactId>
               </dependency>
       ```

       - 创建用来存在jsp文件的目录（webapp）；
       - 需要在pom.xml中指定jsp文件编译后存放的目录（Web-INF/resources）；

       ```xml
           <build>
       		<resources>
                   <resource>
                       <!--jsp原来的目录-->
                       <directory>src</directory>
                       <!--编译后的目标目录-->
                       <targetPath></targetPath>
                   </resource>
               </resources>
           </build>
       ```

       - 添加视图解析器；

       ```yml
       spring:
         mvc:
           view:
             #配置前缀名      
             prefix:
             #配置后缀名 
             suffix: 
       ```

5. 手工使用容器

   - 通过springApplication.run(Application,args)方法的返回值获取容器;
   - springApplication.run(Application,args)方法的返回值为ConfigurationApplicationContext是ApplicationContext的子类；

6. CommandLineRunner接口，ApplicationRunner接口；

   - 两个接口中都有run方法，都是在容器对象创建好后自动执行run()方法；
   - run()方法中的参数为String[] args;
   - 可以使用run()方法执行自定义容器创建好的操作；

#### 三. Web组件

1. 自定义创建拦截器

   - 创建实现HandlerInterceptor接口的类；

   - 创建实现WebMvcConfigurer接口的类（相当于springmvc配置文件）；

     - 重写addInterceptorRegistry（InterceptorRegistry registry）方法；
     - 创建拦截器对象；
     - 调用registry.addInterceptor(拦截器对象).addPathPatterns(需要拦截的路径（可使用通配符）)。excludePathPatterns(需要拦截的路径中的不拦截的路径)方法将拦截器加入到容器中去；

     ```java
     // 创建springmvc配置文件类
     public class MyConfig implements WebMvcConfigurer {
     
         @Override
         public void addInterceptors(InterceptorRegistry registry) {
             // 创建拦截器对象
             HandlerInterceptor hai = new MyHandlerInterceptor();
     
             // 创建拦截路径
             String path = "/user/**";
             // 将拦截器加入到springmvc容器中
             registry.addInterceptor(hai).addPathPatterns(path).excludePathPatterns("/user/controller/MyController");
        
         }
     }
     ```

2. 自定义创建Servlet对象

   - 创建Servlet类，继承HttpServlet；
   - 注册Sercvlet
     - 定义configuration类，定义返回值为ServletRegistrationBean的注册Servlet的方法（加入@Bean注解）；
     - 在方法中创建利用有参构造方法ServletRegistrationBean(Servlet对象，Servlet对象访问路径)创建ServletRegistrationBean对象；
     - 返回创建好的ServletRegistrationBean对象；
     - 可以使用单个参数的构造方法ServletRegistrationBean(Servlet对象）创建ServletRegistrationBean对象；
     - 然后调用ServletRegistrationBean对象的addURLMappings方法绑定访问路径；

   ```java
   @Configuration
   public class MyConfiguration {   
   
       @Bean
       public ServletRegistrationBean myServletRegistrationBean(){
           //创建CharacterEncodingFilter对象
           Servlet myServlet = new MyServlet();
           //创建ServletRegistrationBean对象
           ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(myServlet,"/myServlet");
   
           return servletRegistrationBean;
       }
   }
   ```

3. 自定义创建过滤器对象

   - 创建过滤器类（实现Servlet中的Filter接口）；
   - 注册过滤器对象；
     - 定义configuration类，定义返回值为FilterRegistrationBean的注册Servlet的方法（加入@Bean注解）；
     - 在方法中创建利用无参构造方法FilterRegistrationBean()创建FilterRegistrationBean对象；
     - 调用FilterRegistrationBean对象中的setFilter(Filter对象)的方法，向对象中加入过滤器；
     - 调用FilterRegistrationBean对象中的addUrlPatterns(需要过滤的地址)的方法添加需要过滤的路径；

4. 字符集过滤器

   - 注册CharacterEncodingFilter过滤器；
   - 在主配置文件中设置server.servlet.encoding.enabled=false（关闭默认配置好的过滤）；

   ```java
   @Configuration
   public class MyConfiguration {
   
       @Bean
       public FilterRegistrationBean myFilterRegistrationBean(){
           //创建FilterRegistrationBean对象
           FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
           //创建CharacterEncodingFilter对象
           CharacterEncodingFilter filter = new CharacterEncodingFilter();
           //设置编码格式为utf-8
           filter.setEncoding("utf-8");
           //更改请求编码格式
           filter.setForceRequestEncoding(true);
           //更改响应编码格式
           filter.setForceResponseEncoding(true);
           //将过滤器加入到FilterRegistrationBean对象中
           filterRegistrationBean.setFilter(filter);
           //将过滤路径加入到FilterRegistrationBean对象中
           filterRegistrationBean.addUrlPatterns("/*");
   
           return filterRegistrationBean;
       }
   }
   ```

   - 利用主配置文件处理乱码问题；

   ```properties
   #启用默认配置编码格式
   server.servlet.encoding.enabled=true
   #设置编码格式为utf-8
   server.servlet.encoding.charset=utf-8
   #更改请求与响应编码格式
   server.servlet.encoding.force=true
   ```

#### 四. ORM操作Mysql

1. 使用步骤

   - 加入Mybatis起步依赖，Mysql驱动依赖；
   - 在主配置文件配置连接数据库信息；

   ```properties
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.datasource.url=jdbc:mysql:localhost:3306/testing?userUnicode=true&characterEncoding=UTF-8&ServerTimeZone=GMT%2B8
   spring.datasource.username=root
   spring.datasource.password=85854753
   ```

   - 创建dao接口上加上@mapper注解（让mybatis能够识别该dao类）；
     - 第一种方式 基于mapper注解（每个接口都需要放@mapper注解）
     - 第二种方式 在SpringBootApplication类上加上@MpperScan注解；
     - @MpperScan注解basePackages属性值为一个数组，可以放入多个包名；
     
   - 配置dao同名配置文件；
     - 将dao.xml文件移动到resources子目录之下；
     -  在主配置文件中配置mybatis.mapper-locations=mapper文件的位置；
     
     ```yml
     #设置mysqlMapper文件位置
     mybatis:
       mapper-locations: classpath:mapper/*.xml
     ```
     
     
     
   - pom.xml文件将src/main/java文件夹包含到classpath中；

   - 配置日志信息；
     - 主配置文件中设置mybatis.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl；
     - 将日志输出到控制台上；

2. 事务处理方式

   - 事务的处理方式与spring框架中一致；
   - spring框架事务管理器来管理事务；
   - 声明式事务：使用xml配置文件或者注解说明事务控制的内容；
   - springboot中使用事务
     - 在业务方法上加入@Trasnsactional注解，开启业务方法的事务功能；
     - 明确的在主启动类上：加入@EnableTrasnsactionManager注解；


#### 五. 接口架构风格——RESTful

1. 接口：api（application Programming Interface 应用程序接口）是一些预先定义的接口（如函数、Http接口），或指软件系统不同组成部分衔接的约定；

2. 架构风格：api组织方式;

3. REST(客户端与服务器交互的样式，表现层状态转移)

   - 是一种接口的建构风格和设计的理念，不是标准；
   - 表现层状态转移
     - 表现层就是视图层；
     - 状态：就是资源变化；
     - 转移：资源可以变化的；
   - 优点：更简洁，更有层次；
   - REST中的要素
     - 用REST表示资源和对资源的操作；
     - 在互联网中，表示一个资源或一个操作；
     - 对资源的操作（请求方式）
       - get：查询资源；
       - post：创建资源；
       - put：更新资源；
       - delete：删除资源；
   - REST是用URL表示资源，Http表示动作操作资源；

4. 注解

   - @pathVariable注解：

     - 从URL中获取数据；
     - value属性用来定义路径变量：
     - 放在控制方法的形参前面；
     - 在路径中使用{路径变量名}可以定义路径变量；
     - value属性值就是路径变量名表示将路径变量值赋给形参对象；

   - 设置支持的请求方式

     - @GetMapping：支持的get请求方式；
     - @PostMapping：支持的post请求方式；
     - @PutMapping：支持的put请求方式；
     - @DeleteMapping：支持的delete请求方式；
     - 放置在方法名上前；
     - value属性值表示请求路径，可以用{路径变量名}进行定义；

   - @RestController：是@Controller和@ResponseBody的组合方式，当前类中方法全部加了ResponseBody；

   - springmvc中HiddenHttpMethodFilter过滤器可以将post请求转换为put或者delete请求；

     - 在主配置文件中：开启使用HiddenHttpMethodFilter过滤器；

       ```properties
       spring.mvc.hiddenmethod.filter.enabled=true
       ```

     - 请求页面中，包含_method参数，值为put，delete，请求方式为post；

5. 保证url地址和请求方式加在一起具有唯一性；

#### 六.springBoot集成redis

1. Redis是一个中间件：是一个独立的服务器；

2. 常用java客户端：jedis，lettuce，Redisson；

3. spring，springboot中的RedisTemplate与StringRedisTemplate类处理与Redis的交互；

4. 使用Redis步骤

   - 加入redis的起步依赖（springboot中使用lettuce客户端）；

     ```xml
     <!--Redis起步依赖-->
             <dependency>
                 <groupId>org.springframework.boot</groupId>
                 <artifactId>spring-boot-starter-data-redis</artifactId>
             </dependency>
     
     ```

   - 主配置文件中配置Redis服务器信息；

     ```properties
     #指定redis（host, ip, password）
     spring.redis.host=192.168.172.128
     spring.redis.port=6379
     #spring.redis.password=
     ```

   - 使用RedisTemplate（默认jdk的序列化）：把key和value直接使用序列化进行处理，不能直接被软件识别，可读性较差；

     - 设置key的序列化机制：使用RedisTemplate对象的setkeySerializer(new StringRedisSerializer(不同序列化方式对象))的方法改变序列化方式；
     - 设置value的序列化机制：使用RedisTemplate对象的setValueSerializer(new StringRedisSerializer(不同序列化方式对象))的方法改变序列化方式；；

   - 使用StringRedisTemplate（默认String的序列化）：把key和value通通作为String来处理，时使用String的序列化进行存储；

     ```java
     @RestController
     public class Controller {
         //注入RedisTemplate
         @Resource
         private RedisTemplate redisTemplate;
     
         //添加数据到redis
         @GetMapping("/redis/addstring")
         public String addToRedis(){
     
             //设置key的序列化机制（存取数据之前）
             redisTemplate.setKeySerializer(new StringRedisSerializer());
             
             //设置key的序列化机制为json，Student.class表示需要转化为json的java类
             redisTemplate.setKeySerializer(new Jackson2JsonRedisSerializer(Student.class));
     
             //操作String类型的数据，先获取ValueOperations对象
             ValueOperations valueOperations = redisTemplate.opsForValue();
     
             //添加数据到redis
             valueOperations.set("Myname","lisi");
     
             return "向redis中添加数据成功";
         }
     
         //从redis中取出数据
         @GetMapping("/redis/getstring")
         public String getFromRedis(){
     
             //操作String类型的数据，先获取ValueOperations对象
             ValueOperations valueOperations = redisTemplate.opsForValue();
     
             //从redis中取出数据
             String myName = (String) valueOperations.get("Myname");
     
             return myName;
         }
     }
     ```

5. 常见序列化的方式

   - 序列化是将对象转化为二进制字符串的形式在网络中进行传输；
   - jdk序列化（不支持跨语言）；
   - JSON序列化（转化为JSON对象）；
   - XML序列化（转化为xml文件）；
   - Kryo（不支持跨语言：性能最好）；

#### 七. springBoot集成dubbo

1. 公共接口项目

   - 定义实体类与服务接口；

2. 服务提供者项目

   - 加入公共项目、dubbo、zookeeper依赖；

   ```xml
           <!--公共接口依赖-->
           <dependency>
               <groupId>org.example</groupId>
               <artifactId>dubbo-public</artifactId>
               <version>1.0-SNAPSHOT</version>
           </dependency>
           <!--dubbo起步依赖-->
           <dependency>
               <groupId>org.apache.dubbo</groupId>
               <artifactId>dubbo-spring-boot-starter</artifactId>
               <version>3.0.2.1</version>
           </dependency>
           <!--dubbo-zookeeper起步依赖
   			由于slf4j加入多次所以zookeeper中要排除slf4j的启动
   		-->
           <dependency>
               <groupId>org.apache.dubbo</groupId>
               <artifactId>dubbo-dependencies-zookeeper</artifactId>
               <version>3.0.2.1</version>
               <exclusions>
                   <exclusion>
                       <groupId>org.slf4j</groupId>
                       <artifactId>slf4j-log4j12</artifactId>
                   </exclusion>
               </exclusions>
           </dependency>
   ```

   - 实现公共接口项目中的service接口；

   ```java
   /*使用dubbo注解暴露服务
   *interface值表示实现的服务接口；
   * version是版本号；
   * timeout表示超时时间
    */
   @DubboService(interfaceClass = StudentService.class, version = "1.0", timeout = 500)
   public class StudentServiceImpl implements StudentService {
   
       @Override
       public List<Student> findStudent() {
           return null;
       }
   
       @Override
       public Integer insertStudent() {
           return null;
       }
   }
   ```

   - 定义主配置文件

   ```properties
   #配置服务名称
   spring.application.name=studentservice-provider
   
   #扫描的包 扫描@DubboService
   dubbo.scan.base-packages=dubboprovider.provider.service
   
   #配置dubbo协议
   #dubbo.protocol.name=dubbo
   #dubbo.protocol.port=20881
   
   #配置注册中心
   dubbo.registry.address=zookeeper://localhost:218
   ```

   - 并在主启动类中加上@EnableDubbo注解

   ```java
   /*
   * @EnableDubbo表明启用dubbo
   * 包含@EnableDubboConfig
   * 包含@EnableComponentScan
   * */
   @SpringBootApplication
   @EnableDubbo
   public class DubboProviderApplication {
   
       public static void main(String[] args) {
           SpringApplication.run(DubboProviderApplication.class, args);
       }
   
   }
   ```

3. 消费者项目

   - 加入公共项目、dubbo、zookeeper、web启动依赖；
   - 创建Controller类；

   ```java
   @RestController
   public class ConsumerController {
   
       /*
       * 引用远程服务，将创建好的代理对象，诸如给studentService
       * interfaceClass可以省略，默认是引用数据类型数据
       * */
       @DubboReference(interfaceClass = StudentService.class,version = "1.0")
       private StudentService studentService;
   
       @GetMapping("/query")
       public String queryStudent(){
           Student student = new Student();
           student = studentService.findStudent();
           return "调用远程接口，获取对象" + student;
       }
   }
   ```

   - 定义主配置文件

   ```properties
   spring.application.name=consumer-application
   
   #配置注册中心
   dubbo.registry.address=zookeeper://localhost:2181
   
   #扫描的包 扫描@Cpntroller类（可以不加）
   dubbo.scan.base-packages=dubboprovider.provider.service
   
   ```
   
   - 并在主启动类中加上@EnableDubbo注解

#### 八. 项目的打包

1. 项目打包为war

   - 创建了包含了jsp文件的项目
   - 修改pom.xml文件
      - 指定打包后的文件名称

   ```xml
   <build>
   	<filename>打包后的文件名称</filename>
   </build>
   ```

      - 
        - 指定jsp打包目录
   
   
   ```xml
       <!--SpringBoot解析JSP页面依赖-->
       <dependency> 
           <groupId>org.apache.tomcat.embed</groupId> 
           <artifactId>tomcat-embed-jasper</artifactId> 
       </dependency>
       <!-- SpringBoot要求jsp文件必须编译到指定的META-INF/resources目录下，否则不能访问 --> 
   <resources> 
       <resource> 
           <!--源文件位置--> 
           <directory>src/main/webapp</directory> 
           <!--指定编译到META-INF/resources目录下，该目录不能随便编写--> 
           <targetPath>META-INF/resources</targetPath> 
           <!--指定包含文件--> 
           <includes> 
               <include>**/*.*</include> 
           </includes> 
       </resource> 
   </resources>
   ```

   - 
     - 指定打包类型
   

   ```xml
   <packaging>war</packaging>
   ```

   - 项目在独立的tomcat上使用
   
     - 主启动类需要继承SpringBootServletInitialkizer类，使用嵌入式Servlet，默认不支持jsp；
   
     - 然后重写configure方法；
       - 使用builder对象的sources方法绑定（主启动类）；


```java
 @SpringBootApplication
 public class ConsumerApplication extends SpringBootServletInitializer {
 
     @Override
     protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
         builder.sources(ConsumerApplication.class);
         return builder;
     }
 
     public static void main(String[] args) {
         SpringApplication.run(ConsumerApplication.class, args);
     }
 
 }
```

   - 
     - 将打包后的war文件放在tomcatwebapps文件夹中；
     - 启动tomcat，网址上下文为项目名；



2. 项目打包为jar

   - 创建了包含了jsp文件的项目


   - 修改pom.xml文件

      - 指定打包后的文件名称

      ```xml
      <build>
      	<filename>打包后的文件名称</filename>
      </build>
      ```

      - 指定springboot-maven-plugin版本编译插件版本为1.4.2.RELEASE；


   - 执行打包命令；


   - 执行独立springboot项目：java -jar 项目的jar包名称.jar


#### 九. Thymeleaf模板技术

1.  Thymeleaf介绍

   - Thymeleaf是使用java开发的模板技术；

   - Thymeleaf是在服务器端运行的，将处理后的数据发送给浏览器；

   - 模板是作视图层工作的，视图层；

   - springBoot框架集成了Thymeleaf，代替了jsp；

   - Thymeleaf基于html语言，Thymeleaf语法是应用在html标签中；


2. Thymeleaf模板引擎的使用

   - 模板页面使用html文件；
   - 模板页面放在resources文件夹的templates目录之下；
   - 需要加入模板引擎起步依赖；
   - 模板引擎的默认设置；
     - 模板引擎的默认关闭缓存（开发时设置为假）：spring.thyeleaf.cach=false；
     - 模板引擎的默认编码格式为utf-8：spring.thyeleaf.encoding=UTF-8；
     - 模板引擎的类型默认为HTML文件：spring.thyeleaf.mode=HTML；
     - 模板引擎前缀默认为类路径下的templates文件夹：spring.thyeleaf.prefix=classpath：/templates/；
     - 模板引擎后缀默认为.html：spring.thyeleaf.suffix=.html;
   
3. 模板的使用语法


   - 表达式


      - 标准变量表达式


         - 语法：${key}；
         - 作用：获取key对应的文本数据，key是request作用域中的key；
         - 在页面的标签中使用th:text="${key}"来显示文本数据;
         - 也可以直接通过"对象.属性的方式"获取对象的属性；
         - 也可以直接通过"对象的get方法"获取对象的属性；
    
      - 选择变量表达式


         - 语法：*{key}；
         - 作用：获取对象的属性值；
         - 在父标签中使用th:text="${对象名}"绑定对象；
         - 在子标签中使用th:text="*{属性名}"来显示对象的属性值;
         - 也可以直接使用*{对象.属性的方式}的方式直接获取属性值；
    
      - 链接表达式


         - 语法：@{url}
         - 作用：表示链接,url可以用绝对路径也可以使用相对路径
    
         ```html
         <script th:src="@{url}"></script> <a th:href="@{url}"></a> <img th:src="@{url}"></img>....
         ```


         - 在页面的标签中使用th:href="@{url}"来指定链接地址;
         - 传参方式
    
            - 链接后面使用"(参数名=参数值), (参数名=参数值)"进行传参（推荐）；
            - 使用字符串拼接的方式传参；

   - 属性


      - 属性是放在html文件之中的，就是html文件加入了th前缀；
    
      - 属性作用不变，加上th表示该属性的值右模板引擎处理；
    
      - 几乎所有属性都可以加上th前缀；
    
      - each属性


         - 语法：在一个html标签中，使用th:each
    
         ```html
         <!--集合循环成员，循环的状态变量是自定义的，循环的状态变量可以不定义，默认值是"集合循环成员Stat"-->
         <div th:each="集合循环成员,循环状态变量:${key}">
             <p th:text="${集合循环成员}"></p>
         </div>
         ```


​         


         - 表示对当前标签进行循环；
    
         - 循环的状态变量是循环体信息；


            - index属性表达当前迭代对象的index（从0开始）；
            - count属性表达当前迭代对象的个数（从1开始计算）；
            - size属性表达被迭代对象的大小；
            - curent属性表示当前迭代的变量；
            - even/odd属性为布尔值，表示当前循环数是否为奇数/偶数；
            - frist属性表示当前循环数是否为第一个；
            - last属性表示当前循环数是否为最后一个；
    
         - if属性


            - 语法：在一个html标签中，使用th:if;
            - 作用：判断语句，为真时，执行操作，反之不执行；
    
         - uless属性


            - 语法：在一个html标签中，使用th:unless;
            - 作用：判断语句，为假时，执行操作，反之不执行；
    
         - switch case属性


            - 语法：与java中的switch case一致；
            - 若能匹配时，执行当前语句；
            - 值为*时表示全匹配；
    
            ```html
            <div th:switch="${判断属性}">
                <div th:case="值1"></div>
                <div th:case="值2"></div>
                <div th:case="*"></div>
            </div>
            ```


​            

         - inline属性


            - 内联文本：在html标签外，可以获取表达式的值；


               - 内联文本可以不用依赖标签而存在，普通文本需要在标签内部作为属性来显示；
               - "th:inline="text""语句可以忽略；
    
               ```html
               <div th:inline="text">
                   <p>
                       我是：[[${key}]]，年龄是：[[${key}]]
                   </p>
               </div>
               ```
    
            - 内敛脚本：可以在脚本中获取模板数据；


               - "th:inline="text""语句不可以忽略；
               - 可以直接和java程序互动；
    
               ```html
               <sciprt th:inline="text">
                   var name = [[${key}]];
                   var age = [[${key}];
               </sciprt>
               ```
    
      - 字面量


        - 文本字面量
    
           - 用单引号括起来的字符串，可以与变量表达式直接进行字符串拼接；
           - 使用双竖线：|字符串和表达式|；
        - 数字字面量：${20>5}数字表达式；
    
           - 运算符：>(gt), <(lt) , >=(ge), <=(le) ,  ==(eq), !=(ne)
           - 支持三目运算符（可以嵌套）；
        - bolean字面量：${属性 == true}bolean表达式；
        - null字面量：${属性 ！= null}空值表达式；

   - 内置对象


      - 基本内置对象
    
         - #request：表示HttppRequest对象；
         - #Session（3.0）、#HttpSession（2.0）：表示HttpSession对象；
         - session：表示map对象，简化版session用来获取session中指定key的值；
    
      - 内置工具类对象
    
         - #dates：日期操作对象；
         - #members：操作数字；
         - #lists:操作list集合；

   - 自定义模板内容


      - 模板是内容复用，定义一次，在其他模板文件中多次使用；
    
      - 使用步骤


         - 定义模板；
    
         ```html
         th:fragment="模板自定义名称"
         
         <div th:fragment="head">
             <p>
                 1111
             </p>
             <p>
                 156468
             </p>
         </div>
         ```


         - 使用模板；
    
            - 插入模板(将源标签中的内容全部替换)：th:insert;
            - 包含模板(模板内容完全替换标签所在位置)：th:include;
    
         ```html
         1） ~{模板名称::模板名}
         	模板名称：文件名称
         	模板名：自定义模板名称
         
         2） 模板名称::模板名
         	模板名称：文件名称
         	模板名：自定义模板名称
         ```
    
      - 引用完整文件


         - 语法：模板名称
    
      - 使用其他目录中的模板文件；


         - 语法：在模板名称中使用相对目录；






​	
