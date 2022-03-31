
数据库

	- 行：被称为数据/记录
	- 列：被称为字段；
	- 通用SQL语句（包括增删改查）
	
		* DQL（数据查询语言）： 查询语句，凡是select语句都是数据查询语言；
		* DML（数据操作语言）：inert delete update，对表当中的数据进行增删改；
		* DDL（数据定义语言）：create drop alter：对表结构进行增删改；
		* TCL（事务控制语言）；commit提交事务，rollback回滚事务（TCL中的T是Transaction）。
		* DCL（数据控制语言）：grant授权、revoke撤销权限等。
		
	- 导入数据
	
		* 第一步：登录mysql数据库管理系统
			
			dos命令窗口：mysql -uroot -p；
			
		* 第二步：查看有哪些数据库；
			
			show databases；
			
		* 第三步：创建我们的数据库；
			
			create database bjpowernode；
			
		* 第四步： 使用bjpowernode数据；
			
			use bjpowernode；
			
		* 第五步：查看当前数据库中的表格；
			
			show tables；
			
		* 第六步：初始化数据库
			
			mysql>数据文件；
			
	- 类型为sql的文件是sql脚本；
		
		直接使用source命令可以执行sql脚本；
		
	- 删除数据库 drop database bjpowernode；
	- 查看表结构：desc 表名；
	- 查看表中数据：select*from 表名；
	- 常用命令
	
		* 查看当前数据库：select database（）；
		* 查看数据库版本号：select version（）；
		
	- 查看创建表的语句：
		
		* show create table temp；
		
	- 简单的查询语句（DQL）
		
		* 语法格式：select 字段名，字段名2，字段名3.......from 表名；
		* 提示：
			
			- 任何一条sql语句都是以“；”结尾；
			- sql语句不区分大小写；
			- sql语句中字符串用单引号括起来；
		
		* 字段支持四则运算；
		* 字段重命名语法格式：select 字段名，字段名2，字段名3.......as 新字段名 from 表名；
	
	- 语句从前到后执行；		
	- 条件查询
		
		* 语法格式：select 字段名，字段名2，字段名3.......from 表名 where 条件；
		* between....and:表示[], 使用时必须左小右大
			
			- 等同于>= and <=;
			- 用于字符时左闭右开；
			
		* 数据库中null不能用=
		* 只能使用is null或者is not null；
		* and 比 or的优先级高；
		* in 后面括号中不是区间，表示具体值；
		
	- 模糊查询（like）
	
		* 支持%或者_匹配；
		* %匹配任意个字符；
		* 一个下划线匹配一个字符；
		
	- 排序（升序、降序）
	
		* 语法格式 ：select 字段名，字段名2，字段名3.......from 表名 order by 排序字段名 升序或降序，后置排序字段；
		* 默认是升序排列；
		* asc表示升序，desc表示降序；
		* 当前一排序字段相同时，采采取后置排序字段进行排序；
		
	- 日期差值计算
	
		* 语法规则：timestampdiff（间隔类型，计算起始，计算结束）
		* 间隔类型可以采用年月日；
		* 现在时间可以采用 now（）计算；
		
	- 分组查询
	
		* 分组函数关键字：
			
			- count： 计数；
			- sum：求和；
			- avg：平均值；
			- max：最大值；
			- min 最小值；
			
		* 多行处理函数：一次处理多行数据，输出一行；
		* 语法结构：select 关键字（字段名） from 表名；
		* 分组函数自动忽略null；
		* where后面不能使用分组函数（group by 在where之后执行）；
		* count（*）统计总记录数，count（字段名）字段中记录数；
		* group by 和 having 
	
			- group by：按照某个字段或者某些字段进行分组。
			- having：对分组之后的数据进行再次过滤；
			
		* 分组函数一般和group by联合使用且始终在group by后执行，未使用分组函数时，默认将所有数据列为一个组；
		* 当语句中有group by时 selec后只能跟分组字段；
		* 多字段联合分组(将多个字段当做一个字段)：不同字段中加"，"；
		* 空值处理函数：ifnull（可能是null的数据，被当做什么处理）；
		* distinct（放在所有去重字段最前面）：去除查询的重复记录；
		
	- 连接查询
		
		* 内连接
			
			- 连接的两张表没有主副之分，查询所有匹配的数据；
			- 内连接语法结构：select 表1名.字段名1, 表2名.字段名2 from 表1 表1名 （inner）join 表2 表2名 on 连接条件； 
			- 笛卡尔积现象：两张表连接查询时没有条件限制，数据量为两张表数据数乘积；
			- 加条件不能减少匹配次数；
			- 等值连接（连接条件为等量关系）：		
			- 非等值连接：
			
				- 连接条件为非等量关系；
				- 使用between 判断；
			
			- 自连接
			
				- 一张表看作两张表；
				- 表名不能省略（为同一张表为两个表名）；
		
		* 外连接
		
			- 连接的两张表有主副之分，需要显示主表所有数据，副表和a表没匹配上时 ，副表使用null与主表进行匹配；
			- 左外连接：
				
				* 左边为主表；
				* 语法格式：select 表1名.字段名1, 表2名.字段名2 from 表1 表1名 left (outer) join 表2 表2名 on 连接条件；
				* 表1为主表；
				
			- 右外连接：
			
				* 右边为主表；
				* 语法格式：select 表1名.字段名1, 表2名.字段名2 from 表1 表1名 right (outer) join 表2 表2名 on 连接条件；
				* 表2为主表；
				
		* 三张表以上的表查询
		
			- 语法规则：a join b on ... join c on ....；
			- 解释： a依次连接b、c....；
			- 内外链接位置要正确；
			
	- 子查询
	
		* 定义：select 语句中嵌套select语句；
		* 使用位置
			
			- select 之后；
			- from 之后；
			- where 之后；
			
		* select 语句查询的结果为一张表；
		
	- union（将查询结果相加）
	
		* 在两个查询结果之间使用，将查询结果相加；
		* 主要是将两张不相干的表中结果相连；
		* 两个查询结果列数量需要一致；
		
	- limit（分页查询，mysql特有的）
	
		* 取结果集中的部分数据；
		* 语法结构：limit startIndex，length；
		* startIndex表示取值起点下标；
		* length取值长度；
		* limit顺序是在语句最后；
		
	- 创建表
		
		* 语法格式
			
			- creat table 表名（字段名1 数据类型，字段名2 数据类型，.....）；
		
		* 表名一般以t开头；
		* 字段的数据类型
		
			- int：整数型
			- bigint：长整数
			- float：浮点型
			- char： 定长字符串；
			- varchar：可变长字符串型；
			- date：日期类型；
			- BLOB：二进制大对象（存储图片、视频等流媒体文件）；
			- CLOB：字符大对象（存储较大文本）
				
		* 插入数据
			
			- 语法格式： insert into 表名（字段名1， 字段名2..........）values（值1， 值2...............）；
			- 除插入字段外其余字段插入null；
			- 建表时可以使用default语句指定默认值；
			- insert 语句执行时，表中肯定会多一行数据；
			- 一次插入多行数据时，在values后面加上用“，”隔开的多个值组；
			
	- 表的复制
	
		* 语法格式：create table 表名 as select sql语句；
		* 将查询结果当做新表创建出来；
		
	- 修改数据
	
		* 语法格式： update 表名 set 字段名1 = 值1，字段名2 = 值2，......... where 条件；
		* 没有where条件语句 ：整张表格数据全部更新；
		
	- 删除数据
	
		* 语法格式：delete from 表名 where 条件；
		* 没有条件删除所有数据；
		* 删除大表：truncate table 表名（只留下表头）；
		
	- 约束（constraint） 
	
		* 创建表时添加；
		* 添加约束的目的是保证数据的合法性、有效性和完整性；
		* 非空约束（not null）：数据不能为空；
		* 唯一约束（unique）：数据不能重复但可以为null；
			
			- 表级约束 
				
				* 给多个字段添加唯一性约束：在创表语句最后加unique（字段名1，字段名2.......）；
				* 多个字段联合起来具有唯一性；
				
			- 列级约束
			
				* 字段后加上unique；
				* 单个字段具有唯一性；
				
		* 主键约束（primary key）：数据不能重复也不能为null；
		
			- 这行记录在这张表上的唯一标识；			
			- 一张表的主键约束只能有一个；
			- 是列级约束；
			- 主键字段：带有主键约束的字段；
			- 主键值：主键字段中的值；
			- 主键分类
			
				* 字段数量划分：单一主键（推荐），复合主键（表级约束）；
				* 主键性质：自然主键（推荐），业务主键；
				
			- mysql的主键值自增：在主键后面加上auto_increment；
			- oracle的主键值自增：序列（sequence）；
			
		* 外键约束（foreign key）：指定外键字段引用哪个字段
		
			- 表级约束：foreign key（子键）references 父表（被引用字段）；		
			- 表1 中字段引用表2中字段时：表1为子表，表2为父表
			- 删表时先删子再删父；
			- 创表时先父后子；
			- 外键值可以为null；
			- 外键所引用的字段必须存在唯一性（一般引用主键）； 
			
	- 存储引擎：
		
		* 存储引擎就是表的存储方式；
		* 默认存储引擎：InnoDB
		* 默认字符集：UTF8；
		* 完整建表语句：最后设置存储引擎 Engine = 存储引擎 default  charset 字符集名；
		* 在mysql中标识符可以使用‘括起来；
		* 主要存储引擎：
			 
			- MyISAM：
			
				* 三个文件组成一张表；
					
					- 格式文件：存储表结构的定义
					- 数据文件：存储表行的内容；
					- 索引文件：存储表上的索引；
					
				* 优点： 可被压缩节省空间，同时可以转换为只读表；
				* 缺点：不支持事务
				
			- InnoDB
				
				* 优点：.
				
					- 支持事务，行级锁，外键。
					- 存储引擎最安全；
					- 数据库崩溃后提供自动恢复；
					
			- momery
			
				* 数据存储在内存之中；
				* 缺点：不支持事务，数据容易丢失；
				* 优点：速度快；
	
	- 事务（TCL）
	
		* 定义：一个事务是一个完整的业务单元，不可再分；
		* 事务是将多条DML语句整合到一起
		* 和事务相关的语句只有DML语句（update、insert、delete）
		* 开启事务机制：将所有执行语句存储在事务缓存中到提交事务（执行事务中所有操作）或者回滚事务（取消事务中的所有操作）；
		* 事务语句：提交事务（commit），回滚事务（rollback），保存点（savepoint）；
		* 四大特性
		
			- A（原子性）：事务是最小的工作单元，不可再分；
			- C（一致性）：事务必须保证多条DML语句同时执行；
			- I（隔离性）：事务A与事务B之间存在隔离；
			- D（持久性）：最终数据必须持久化到硬盘文件中，事务才算成功；
			
		* 事务的隔离级别
		
			- 第一级别：读未提交（read uncommitted）
				
				* 可以读到对方未提交的数据；
				* 读未提交存在脏读（Dirty read）现象
				
			- 第二级别：读已提交（read committed）
			
				* 解决了脏数据；
				* 对方事务提交数据我方可以读到；
				* 读已提交会导致不可重复读；
				
			- 第三级别：可重复读（repeatable read）
			
				* 只要事务未关闭，读取的数据不变；
				* 解决了不可重复读；
				* 存在读取到的数据是幻象问题；
				
			- 第四级别：序列化读（serializable）
			
				* 解决了所有问题
				* 效率低，需要事务排队
			
		* mysql 默认事务级别为3；
		* oracle 默认为级别2；
		* mysql事务默认情况下是自动提交的；
		* 使用 start transaction 关闭自动提交机制；
		* 设置全局事务隔离级别：set global transaction isolation level 隔离级别；
		* 查看事务的全局级别：select @@global.tx isolation；
		
	- 索引（index）
	
		* 索引相当于目录；
		* 数据库查询的方式
		
			- 全表扫描；
			- 通过索引扫描；
			
		* 索引最根本的作用是减少扫描范围；
		* 添加索引的条件
		
			- 数据量庞大（实际需求）；
			- 该字段很少的DML操作（字段进行修改操作时，索引也需要维护）；
			- 该字段经常出现在where子句中（经常根据哪个字段查询）；
			
		* 主键与unique字段自动添加索引；
		* 创建索引对象：create index 索引名 on 表名（字段名）；.
		* 删除索引对象：drop index 索引名 on 表名（字段名）；
		* 实现原理：通过B tree 缩小扫描范围，直接根据索引定位物理地址；
		* 索引的分类：单一索引，复合索引（多个字段联合添加一个索引），主键索引，唯一索引；
		
	- 视图（view）
	
		* 可以通过视图操作原表数据；
		* 创建视图对象：create view 视图名 as DQL语句；.
		* 删除视图对象：drop view 视图名；
		* 只能以DQL语句创建视图；
		* 视图的作用是隐藏表的实现细节；
		
	- DBA命令
	
		* 导出数据；mysqldump 数据库名 > 目标文件 -账号 -密码；
		* 导入数据
		
			- 创建数据库；
			- use 数据库；
			- 使用source 数据库文件；
			
	- 数据库设计三范式
	
		* 使用三范式创建的表格不会产生数据冗余；
		* 第一范式：每张表都应该有主键，且每个主键具有原子性，不可再分；
		* 第二范式：所有非主键字段完全依赖主键，不能产生部分依赖；
		
			- 多对多：三张表，关系表两个外键；
			
		* 第三范式：所有非主键字段只能产生直接依赖，不能产生传递依赖；
		
			- 一对多：两张表，多的表加外键；
			
		* 提醒：在实际开发中，客户至上；

JDBC

	- 通讯协议是提前订好的通讯格式（HTTP，jdbc:mysql:）；
	- localhost 表示本机IP地址；
	- 配置数据库驱动：使用classpath导入驱动文件jar包；
	- 编程六步
	
		* 第一步：注册驱动；
		
			- 第一种方式：Driver driver = new com.mysql.cj.jdbc.Driver();DriverManager.registerDriver(driver);
			- 第二种方式（使用类加载动作调用com.mysql.cj.jdbc.Driver类中的静态代码块）：class.forname（“com.mysql.cj.jdbc.Driver”）；
			
		* 第二步：获取连接；
			
			- DriverManager中的静态方法getConnection(url, user, password)返回连接对象（Connection）;
			
		* 第三步：获取数据库操作对象；
	
			- Connection中的对象方法createStatement()获取对象Statement;
			
		* 第四步：执行SQL语句；
		
			- Statement类中的executeUpdate（静态增删改语句）方法（返回处理数据条数）执行增删改操作；
			- Statement类中的executeQuery（静态select sql语句）方法（返回处理结果集：ResultSet）执行查操作；
			
		* 第五步：处理查询结果集；
		
			- 使用ResultSet中的next（）方法（返回boolean值）进行行的遍历；
			- 使用ResultSet中的getString（index（从1开始，也可以使用列名））方法（返回代表每个数据的字符串）进行列的遍历；
		
		* 第六步：关闭资源；
		* 使用属性配置文件
		
			- 账号密码采用属性配置文件进行配置；
			- 绑定属性配置文件：ResourceBundle bundle = ResourceBundle.getBundle（“属性配置文件名”）；
			- 使用ResourceBundle类中的getString（key）方法获取相应的字符串；
			
		* 解决sql注入的方法：让用户提供的信息不参与sql语句的编译（使用PreparedStatement类代替Statement类）；
		
			- 在数据库操作对象时进行sql语句进行预编译（？表示占位符）；
			- 使用Connection中prepareStatement创建目标预编译操作；
			- 向占位符中传值的方法：PreparedStatement对象方法set数据类型（下标，数据）；
			
		* PreparedStatement的优点
		
			- PreparedStatement解决了SQL注入的问题；
			- PreparedStatement只需编译一次便可一直执行，Statement则是每执行一次都需要进行编译；
			- PreparedStatement会在编译阶段进行安全检查；
			
		* 事务
			
			- 开启事务：Connection类中的setAutocommit（false）方法将自动提交改为手动提交；
			- 提交事务：Connection类中的commit（）方法；
			- 提交事务：Connection类中的rollback（）方法；
			
		* 工具类中的构造方法一般都是私有的；
		* 行级锁（悲观锁）
			
			- 在select语句后加上for update；
			- 在当前事务执行过程中，其他事务无法对锁住事务进行修改；

Hibernate

	- Session 类
	
		* save()与persist()方法
			
			- 不应对游离与持久化对象重复调用save()与persist()方法；
			- save()无论在事物内外调用都会转化为持久态；
			- persist()在事务外无法持久化对象；
			
		* load()与get()方法；
		
			- 都是从数据库中查找持久化对象；
			- load()方法
			
				* 不能返回数据库中没有的数据；
				* 执行延时检索策略，除非lazy属性设置为false；
				* 操作对象时调用；
				
			- get()方法
			
				* 检索不存在的数据会返回null；
				* 执行立即检索策略；
				* 访问对象数据是调用；
			
		* update()方法
		
			- 将当前游离对象与当前session关联；
			- 计划执行update语句；
			- 只有session清理缓存时才会根据当前对象执行一条update语句；
			- 对更新频率不大的数据库，可以在映射文件中设置select-before-update = “true”；
			
		* saveOrUpdate()方法
		
			- 如果对象为游离对象，则更新对象；
			- 如果对象为临时对象，则持久化对象；
			- 临时对象特征：
			
				* 对象OID取值为null；
				* 对象具有version版本控制属性且取值为null；
				* 对象与预设unsaved-value属性相匹配；
				
		* merge()方法
			
			- 将一个游离对象的属性复制到一个持久化对象之中；
			- 属性：
			
				* 所有值类型的属性；
				* 对象中集合类型属性中的元素；
				
		* delete()方法
		
			- 从数据库中删除持久化或者游离对象；
			- 该方法一次只能删除一个对象；
			
		* replicate(对象，常数)方法
			
			- 把一个数据库中的对象复制到另一个对象之中；
			- 常数决定的复制模式
			
				* ReplicationMode.IGNORE：如果在目标数据库中已经存在OID相同的Customer对象，那就什么也不做；
				* ReplicationMode.OVERWRITE：如果在目标数据库中已经存在OID相同的Customer对象，那就覆盖原有数据；
				* ReplicationMode.EXCEPTION：如果在目标数据库中已经存在OID相同的Customer对象，那就抛出异常；
				* ReplicationMode.LAST_VERSION：如果在目标数据库中已经存在OID相同的Customer对象，比较两对象的版本，选用更新版本的对象；
				
		* flush()方法
		
			- 立即清除Session缓存；
			
		* refresh()方法
		
			- 从Session缓存数据与数据库中数据同步；
			
	- 拦截器（Interceptor）
	
		* 激发拦截器运行的事件：插入记录事件（save()）；更新记录事件（update()）；删除记录事件（delete()）；
		* findDirty()方法
			
			- 查找脏对象；
			- flush()调用findDirty()方法；
			
		* instantiate（Class clazz，Serializable id）
		
			- 创建实体类的实例；
			- Session构造实体类的实例前调用本方法；
			
		* isUnsaved（Object entity）
		
			- saveAndUpdate()方法调取此方法；
			- 返回true时，就调用save()方法；
			- 返回false时，就调用upDate()方法；
			
		* onDelete()
			
			- 删除对象时调取此方法；
			
		* onFlushDirty()
		
			- flush()检查到脏函数时使用此方法；
			
		* onLoad()
			
			- 初始化对象时调用此方法；
			- 修改了持久化对象的数据时，返回true；
			- 未修改了持久化对象的数据时，返回null；
			
		* onSave()
			
			- 保存对象之前调用此方法；
			- 修改了本对象的数据时，返回true；
			- 未修改了本对象的数据时，返回null；
			
		* postFlush(Iterator entities)
		
			- flush()执行完所有SQL语句后调取本方法；
			
		* preFlush(Iterator entities)
		
			- flush()执行前调取本方法；
			
		* Auditable接口
		
			- 需要审计的持久化类都需要实现本接口；
		
		* AuditLogRecord类
		
			- 本类代表具体的审计日志；
			- 本类与AUDIT_LOGS相对应；
			
		* AuditLogInterceptor类
		
			- 代表具体拦截器，是EmptyInterceptor接口的具体实现；
			- 实现了onFlushDirty()，onSave()，postFlush(Iterator entities)三个方法；
			
		* AuditLog类
		
			- 静态方法logEvent()生成日志；
			
		* Interceptor与Session对象相关联的两种方式
			
			- SessionFactory.openSession（Interceptor）：将Interceptor存放在Session范围内；
			- Configuration.setInterceptor（Interceptor）：将Interceptor存放在SessionFactory范围内；
			
	- 监听器
	
		* 通过监听器来实现Session中大部分方法触发的事件；
		* org.hiberanate.event包中提供了与Session各个方法对应的事件类和监听类；
		* org.hiberanate.event.def包中提供了监听接口的默认实现类；
		* 创建客户化监听器
		
			- 实现特定的监听器接口；
			- 继承监听器接口的基础实现类；
			- 继承监听器接口的默认实现类；
			
		* 注册客户化监听器
		
			- 配置文件中静态注册；
			- 程序中动态注册；
			
	- 批量操作
		
		* 在存储过程来完成批量操作；
		* 在应用层进行批量操作
		
			- 通过Session来进行批量操作；
			
				* 通过Session来处理大量持久化对象后，应及时清空缓存；
				* 需要在配置文件中设置批量处理数据的数目；
				* 无法批量处理identity标识符标记的对象；
				* 批量操作时建议关闭二级缓存；
				* 批量插入数据
					
					- 使用flush()函数触发插入操作；
					- 然后使用clear()函数清理内存；
					
				* 批量更新数据
				
					- 利用ScrollableResults对象来加载所有对象（ScrollableResults sc = session。createQuery("from customer").scroll(ScrollMode.FORWARD_ONLY)）；
					- 使用flush()函数触发更新操作；
					- 然后使用clear()函数清理内存；
				
			- 通过StateSession来进行批量操作；
			
				* StatelessSession没有缓存；
				* 不会与Hibernate二级缓存交互；
				* 不会对加载的对象进行脏检查；
				* 不会对关联的对象进行任何联级操作；
				* 所做的操作可以被拦截器拦截，但会被事件处理系统处理；
				* 两次加载OID相同对象时，分配的地址不同；
				
			- 通过HQL来进行批量操作；
	
				* 使用Query接口中executeUpdate()执行HQL语句；
				
			- 直接通过JDBC API进行批量操作；