## 第一章 web前端

### 一. HTTP协议（超文本格式）

1. 网页上使用<br>换行；
2. 协议：有其他人或者其他组织提前制定的规范；	
3. HTTP协议：由W3C制定的一种超文本传输协议（通讯协议：发送消息的模板）；
4. 超文本：不是普通文本，包含流媒体；
5. 请求（request）协议：

  - 规定了发送的数据的具体格式；
  - 请求行

  	* 请求方式：
  		
  		- get
  		- psot；
  		- delete；
  		- put；
  		- head；
  		- options；
  		- trace；
  		
  	* URI；
  		
  		- 统一资源标识符；
  		- URL：统一资源定位符；
  			
  			* 可以对资源进行定位；
  			* URL包含URI；
  			* URI不能对资源进行定位；
  		
  	* 协议版本号；

  - 请求头；

  	* 请求的主机；
  	* 主机的端口；
  	* 浏览器信息
  	。。。

  - 空白行；

  	* 分隔请求头与正文

  - 请求正文；

  	* 传输的数据；

6. 响应（response）协议：

  - 规定了响应的数据的具体格式；
  - 状态行

  	* 协议版本号（HTTP/1.1）
  	* 状态码（规定的相应状态号）
  		
  		- 200：相应成功，正常结束；
  		- 404：前端出现错误；
  		- 405：前端发送的请求方式与后方的处理方式不一致；
  		- 500：服务器端出现了异常；
  		- 4开始：一般为浏览器端出现问题；
  		- 5开头：一般为服务器端出现问题；
  		
  	* 状态的描述信息
  	
  		- ok：正常；
  		- not found：资源找不到；

  - 响应头；

  	* 响应的内容类型；
  	* 响应的内容长度；
  	。。。

  - 空白行；

  	* 分隔响应头与响应正文；

  - 响应正文；

7. get与post区别

  - 选择

  	* 只有当form表单中method属性值为“post”时使用post；
  	* 其余情况全部使用get

  - 区别

  	* get请求发送数据时，数据会挂在URI后面，URI与数据之间使用“？”分隔，回显在浏览器上；
  	* post发送的数据时请求体中发送，不会回显在浏览器上；
  	* 发送数据格式为：“name = value”；
  	* name：以Form表单为例put标签的name；
  	* value：以Form表单为例put标签的value；
  	* get 请求只能发送字符串，post所有对象都能发；
  	* get请求适合服务器向浏览器传输数据，post适合浏览器向服务器传输数据；
  	* get请求是安全的，因为只是从服务器中取数据；
  	* post相对不够安全，因为向服务器传输数据； 
  	* get请求支持缓存，post不支持缓存；
  	* 任何get请求最终的“响应结果”都会被浏览器缓存起来；

8. 浏览器访问的书写格式

  - 访问规则（HTTP：//）+ IP地址 + 端口号 + 资源路径（项目 + 操作） + 参数；

9. 特点：

  - 支持客户/服务器模式；
  - 简单快速：只需传输请求方法与路径；
  - 灵活：HTTP允许传输任意类型的数据对象；
  - 无连接：每次连接只处理一个请求；
  - 无状态：对于事务处理没有记忆能力；

### 二. HTML文件(<html></html>根标签 又叫dom树)

1. 每个节点都拥有id属性，是节点对象唯一标识，js可以通过id对节点对象进行操作以完成网页动态效果；

2. 每个节点都拥有class元素，用来指定节点的类名；

3. 开始标签与结束标签之间无内容时结束标签可省略，并在开始标签末尾加上/代替；

4. html语法是松散的，特殊标签丢掉后会出现问题；

5. 不区分大小写；

6. <!doctype html>：语言版本控制，最开头加上表示语言为html5，没加上表示html4；		

7. <head>网页头</head>头；

  - <title></tille>:网页标题，显示在浏览器左上角；

8. <body>网页主题</body>体（显示在浏览器页面中的内容）：

  - bgcolor属性设置背景颜色；

  - background属性指定背景图片路径；

  - 基本标签

  	- 段落标记

  	```html
  	<p>段落内容</p> 
  	```
  	
  	- 标题字
  	  - 独占一行
  	  - h1最大，h6最小;
  	
  	```
  	<h1></h1>~<h6></h6>:
  	```
  	
  	- （独目标记，没有结束标签）换行；
  	
  	  ```html
  	  <br>
  	  ```
  	
  	- （独目标记，没有结束标签）水平线；
  	
  	  ```html
  	  <hr>
  	  ```


  	
  	  - color属性值设置水平线颜色；
  	  - width属性指定水平线的宽度（可以使用像素或者百分数）；
  	
  	- <pre></pre>(预留格式标记)：保留源代码格式；
  	
  	- <b></b>粗体字；
  	
  	- <i></i>斜体字；
  	
  	- <ins></ins>插入字；
  	
  	- <del></del>删除字；
  	
  	- <sup></sup>右上角加字；
  	
  	- <sub></sub>右下角加字；
  	
  	- <font></font>可以调整文字；

  - 实体标签（语法规则 都是以&开头;结尾）

    * &nbsp;:一个空格标签；
    * &lt;：小于号；
    * &gt;：大于号；

  - 表格<table></table>

    * border属性值用来设置边框宽度（像素）；
    * width属性值设置表格宽度；
    * height属性值设置表格宽度；
    * align设置对其方式（center）；
    * <tr></tr>行；

    	- align设置对其方式（center）；
    	
    * <td></td>单元格；

    	- align设置对其方式（center）；
    	- 行合并：
    	
    		* rowspan属性，值为合并的行数
    		* 取消被合并的后方单元格；

    	- 列合并
    	
    		* colspan列合并；
    		* 取消被合并表格只剩下有colspan属性值得单元格；
    	
    * <th></th>标题单元格
    	
    	- 自动居中与加粗；

    * <thead></thead>表头；
    * <tbody></tobody>表体；
    * <tfoot></tfoot>表脚；

  - <img></img>设置浮动于浏览器窗口的图片

    - src属性指定图片路径；
    - width属性值设置图片宽度（高度不需要设置，会等比缩放）；
    - title属性值设置鼠标悬停图片上方时的提示信息；
    - alt属性提示图片加载之后显示的信息；

  - <a></a>超链接标签；

    * href属性来指定连接的路径（请求路径）；
    * 可以是绝对路径和相对路径也可以是网络路径；
    * target属性用来设定目标资源最终显示位置；
    	
    	-_blank 在新窗口中显示；
    	-_self在当前窗口中打开（默认）；
    	-_parent在父窗口中显示；

  - <iframe></iframe>内嵌窗口；

    * src属性指定图片路径；

  - <meta>中charset属性设置编码方式（需与文本软件编码方式相同）；

  - 列表

    * <ul></ul>无序列表（li标签设置表文字）；
    * <ol></ol>有序列表有编号（li标签设置表文字）；
    * type属性指定标签的形式；
    * 标签可以嵌套；

  - 表单<form></form>标签

    * 表单可以收集用户的数据，提交表单时发送请求同时可以发送数据给服务器；
    * action属性用来指定请求路径（href属性相同）；
    * method属性用来指定表单提交的方式/方法（默认采取get方式提交）；
    * enctype属性表示设置表单格式：值为multipart/form-data时可以上传文件；
    * <input></input>标签为输入域（接收或者收集数据）；

    	- 在标签前部设置标签前面显示的文字；					
    	- type属性
    		
    		* submit值表示提交按钮（提交当前表单）；
    		* button值表示按钮；
    		* text值表示文本框；
    		* checkbox值表示复选框；
    		* redio值表示单选按钮（必须指定value属性值，默认选中增加check属性）；
    		* password值表示密码框；
    		* reset值表示重置表单；
    		* file文件上传控件；
    		* hidden（隐藏域控件）提交不希望用户看见的固定数据；
    	
    	- readonly属性表示只读，可以被用户看到但用户无法修改；
    	- disabled属性表示只读，可以被用户看到但用户无法修改同时不会被提交；
    	- maxlength属性表示最大的输出长度；
    	- value属性值表示输入域中显示值；
    	- name属性值用于表示数据名称，提交格式为?name=value&name=value;
    	- 不需要提交的属性不写name属性；

  - <select></select>表示下拉选择框指定name；

    * multiple属性用来设置支持多选；
    * size属性用来支持下拉列表选择条目数量；
    * <option></option>表示选项，指定value（增加selected属性表示默认选中）；

  - <textarea></textarea>文字域；

  - <div></div>图层,用来对网页进行布局；

    - 可以通过左上角点坐标进行定位；
    - 默认独自占用一行；

  - <span></span>也是盒子，也可以用来布局；

    * span不独占行，是一个块；

  - href后面属性为javascript:void(0)表明页面不跳转，仍然保持超链接样式；

  - href后面属性为onclick为单击事件表示单击超链接时执行回调函数；

### 三. CSS(层叠样式表语言)（在head标签页中设置）

1. 用来修饰HTML页面。
2. 在html文件中引入CSS语言；

  - 内联定义方式

  	* 语法格式标签中设置Style属性（样式名:样式值:样式名:样式值）

  - 定义内部样式块对象(<style></style>)

  	* type属性设置为text/css
  	* id选择器#id{设置样式}
  	* 标签选择器作用于当前页面的所有标签（标签{设置样式}）
  	* 类选择器（.类名{设置样式}）
  	* 优先级：id选择器>类选择器>标签选择器；

  - 引用外部独立的样式表文件<link></link>

  	* type属性设置为text/css
  	* href属性设置样式文件路径；

### 四. Javascript（JS文件）

1. 概述

  - JavaScript是一种脚本语言（脚本语言运行程序是以普通文本的形式保存的）；
  - HTML文件是主体，CSS是修饰HTML页面，JS用来操作hTML页面；
  - JS是事件驱动型的编程语言，一般依靠事件来触发的；
  - JavaScript是一种弱类型语言，Java是一个强类型语言
2. 事件句柄都是在事件名称前加上on；
3. console中的log（）方法可以将数据输入到控制台上；
4. 引用Js代码块方式
   - 在HTML文件中使用内联定义方式写入JS代码
     - 所有事件句柄都是以“标签的属性”的形式存在；
     - window对象
       - 浏览器中的内置隐藏窗户对象；
       - alert(String)方法弹出对话框；
   - 在HTML文件中插入JS脚本块；
     - 脚本块可以卸载任何位置，没有限制；
   - 引用外部独立的样式表文件<script></script>；
     - type属性设置为text/javascript
     - src属性设置js文件路径；
5. 变量

  - 语法格式：var 变量名；
  - 该变量可以是任何类型的数据；
6. 函数

  - 定义函数的语法格式：

  	* function 函数名（形式参数列表）{函数体}
  	* 函数名 = function（形式参数列表）{函数体}

  - ?	JS的函数不需要指定返回值类型和形式参数列表不需要指定值类型；
    - JS的函数必须手动调用才能执行；
    - 定义函数的优先级是最高的；
    - JS代码中一个函数可以当作多个函数使用；
7. 事件

     - 失去焦点blur；
     - 下拉列表选中项改变或文本框内容改变change；
     - 鼠标单击click；
     - 鼠标双击dblclick；
     - 获取焦点focus；
     - 键盘按下keydown；
     - 键盘弹起keyup；
     - 页面加载完毕load（body标签中设置，在页面全部元素加载完毕发生）；
     - 鼠标按下mousedown；
     - 鼠标经过mouseover；
     - 鼠标移动mousemove；
     - 鼠标移开mouseout；
     - 鼠标弹起mouseup；
     - 表单重置reset；
     - 文本被选中select；
     - 表单提交submit；

8. 获取节点对象

     - document对象为JS内置对象（页面中的所有内容就是document对象）；
     - document中的getElementById（）函数通过id获取对象；
     - document中的getElementByName（）函数通过name获取对象；

9. innerHTML属性

     - 可以获取或者操作元素内部内容；
     - 会将内容当作HTML代码执行；

10. 节点对象的innerText属性只会将内容当作文本输出（更新文本内容）；
11. 可以通过节点.属性获取任何标签中已经定义的属性；
12. 复选框的check属性可以获取复选框的选取状态；
13. 通过循环遍历将所有标签绑定事件；
14. trim()函数去除字符串的前后空白；

### 五. ajax（做局部刷新的方法）

1. 全局刷新
     - 整个浏览器页面内容全部改变；


2. 局部刷新；
     - 浏览器页面中部分数据变化 


3. 异步对象（XMLHttpRequest）

     - 创建异步对象语法格式（JS代码）：var 异步对象名 = new XMLHttpRequest();

     - 全局刷新是同步行为，局部刷新是异步行为；

     - 异步对象用于后台与服务器交换数据；

     - responseText()方法获取响应数据;


4. 网络中使用XML文件进行数据传输（现阶段使用json替换了xml）；

5. 异步对象的使用

     - 创建异步对象；

     - 给异步对象绑定事件（onreadstatechange：异步对象获取数据时都会触发该事件）；

     - onreadstatechange事件触发函数；

     - 异步对象中readstate属性的五个状态值
       - 创建异步对象时为0；
       - 初始异步对象时为1；
       - 发送请求方法时为2；
       - 从服务器端获取数据时为3；
       - 异步对象把接收的数据处理完成后为4；
       - 一般使用4状态时的数据（更新当前页面，刷新数据）；


  - 异步对象中status属性表示网络请求的状态；
    - 当status属性==200时网络请求是成功的；


  - 异步对象的初始化
    - 异步对象中的open（请求方式，“服务器端访问地址”，同步|异步请求（默认为true））方法；
  - 使用异步对象发送请求（send（）方法）
    - 使用异步对象的responseText属性来获取服务器端返回的数据；	

  ```jsp
  <script type="text/javascript">
      //创建异步对象
  	var xmlHttp = new xmlHttpRequest();
      //绑定事件
      xmlHttp.onreadystatechange = function(){
          if(xmlHttp.readState = 4 and xmlHttp.status = 200){
              //获取对象响应数据；
              var data = xmlHttp.responseText;
              //局部刷新文本数据为data；
              document.getElementById(需更新对象id).inertext = data；
          }
      }
      //初始请求参数；
      var 对象名称 = document.getElementById(对象id)；
      //拼接请求与请求参数
      var msg = 拼接"服务器端访问地址？name=value&name=value";
      xmlHttp.open("get(请求方式)", "msg(使用服务器端访问地址？name=value&name=value发送请求)", true(同步|异步请求（默认为true）));
      //发起请求
      xmlHttp.send();
  </script>
  ```

6. json对象

   - 分类：json对象（名称:值的方式）；json数据（json对象数组）；

   - json格式数据的优势

     - 格式易于理解；
     - 多种语言中都便于处理；
     - 占用空间小，传输块；

   - jacksion jason工具库

     - ObjectMapper对象；

       - writeValueAsString(java对象)方法：将java对象转化为jason格式的字符串（属性为名称，值为属性值）；

     - 设置响应格式reponse.setContentType("application/json:charset=utf-8");

     - jsp处理json对象

       - 将json格式的字符串转化为json对象；

       ```jsp
       <script type="text/javascript">
           //创建异步对象
       	var xmlHttp = new xmlHttpRequest();
           //绑定事件
           xmlHttp.onreadystatechange = function(){
               if(xmlHttp.readState = 4 and xmlHttp.status = 200){
                   //获取对象响应数据；
                   var data = xmlHttp.responseText;
                   //bajson字符串转化为jason对象
                   var jsonobj = eval("(" + data + ")");
                   //局部刷新数据；
                   document.getElementById(需更新对象id).value = jsonObj.属性名；
               }
           }
           //初始请求参数；
           var 对象名称 = document.getElementById(对象id)；
           //拼接请求与请求参数
           var msg = 拼接"服务器端访问地址？name=value&name=value";
           xmlHttp.open("get(请求方式)", "msg(使用服务器端访问地址？name=value&name=value发送请求)", true(同步|异步请求（默认为true 为异步行为）));
           //发起请求
           xmlHttp.send();
       </script>
       ```

   - 异步和同步的区别

     - 异步行为表示发起请求后，不用等待数据处理完毕就可以执行其他操作（可以同时处理多个异步对象）；
     - 同步行为表示发起请求后，需要等待数据处理完毕才执行其他操作（同一时刻只能处理一个请求）；

### 六. JQuery(优化js页面处理dom,封装javaScript相关方法)

1.  JQuery是一个js的外部库（放的是js函数库）；

2.  优势

   - 代码少；
   - 兼容浏览器；
   - 开源，轻量级插件；

3.  dom对象（js对象）和jquery对象

   - 使用Javascript语法创建的对象叫做dom对象；

   ```jsp
   var obj = document。getElementById（"对象id"）
   ```

   - 使用jquery语法表示的对象叫做jquery对象；
   - dom对象与jquery对象相互转换；
     - dom对象转换为jquery对象语法为${dom对象}
     - jquery对象转换为dom对象语法为
       - 从数组中获取第一个对象，就是dom对象；
     - 命名区别，jquery对象一般以$开头；

4.  选择器（字符串）

   - 用来定位dom对象，通过该方法对jquery对象进行操作；

   - 基本选择器

     - id选择器，使用dom对象的id来定位dom对象；
     - class选择器，使用样式的名称来定位doom对象；
     - 标签选择器，使用标签名称来定位doom对象；
     - 组合选择器，可以多个元素组合选择；

     ```jsp
     <script>  
     	<!%--id选择器--%>
         $("#dom对象的id值")
         <!%--class选择器--%>
         $(".dom对象的class值")
         <!%--标签选择器--%>
         $("标签名称")
         <!%--选择全部的元素--%>
         $("*")
     </script>  	
     ```

   - 表单选择器

     - 使用input标签中的type属性值，进行doom的定位
     - 选定多个对象时，jquery对象为数组；
     - 使用循环进行遍历；
     - 可以使用jquery对象.value的方式获取value值；

     ```jsp
     <script>
         <!%--表单选择器--%>
         $("：type属性值")
     </script>  
     ```

5.  过滤器

   - 过滤器是对选择的对象筛选；

   - 过滤器筛选顺序是按照对象的定义顺序进行过滤；

   - 过滤器必须和选择器一起使用；

   - 基本过滤器

     - 保留数组中首个对象；
     - 保留数组中最后一个对象；
     - 选择数组中小于指定索引的dom对象；
     - 选择数组中大于指定索引的dom对象；
     - 获取指定下标的dom对象l

     ```jsp
     <script>
         <!%--保留数组中首个对象--%>
         $("选择器：frist")
         <!%--保留数组中最后一个对象--%>
         $("选择器：last")
         <!%--选择数组中小于指定索引的dom对象--%>
         $("选择器：lt(数组索引)")
         <!%--选择数组中大于指定索引的dom对象--%>
         $("选择器：gt(数组索引)")  
         <!%--获取指定下标的dom对象--%>
         $("选择器：eq(数组索引)")  
     </script>  
     ```

   - 表单属性过滤器

     - 根据表单中dom的状态情况定位doom对象；
       - enabled状态：选中的
       - disabled状态：不可用的
       - checked状态：复选框选中的；
       - select状态：下拉列表中选中的元素；
     - 只找到符合状态条件的dom对象；

     ```jsp
     <script>
         <!%--选择可用的文本框--%>
         $(text:enabled)
         <!%--选择不可用的文本框--%>
         $(text:disabled)
         <!%--选择复选框选中的数据--%>
         $(checkbox:checked)
         <!%--选择下拉列表中选中的元素--%>
         $(选择器>option:selected)
     </script> 
     ```

6.  Jquery中给dom对象绑定事件

   - $(选择器)中有多个事件，都全部都绑定；
   - on的方式绑定事件;
     - 实现动态的事件处理；

   - 事件名称，就是js中事件去掉on的部分，如click；
   - 事件的处理函数：就是一个function，事件发生时执行该函数的内容；

   ```jsp
   <script>
       <!%--绑定事件--%>
       $(选择器).事件名称（事件处理函数）
       <!%--绑定事件--%>
       $(选择器).on（事件名称事件处理函数）
   </script> 
   ```

7.  函数

   - $(选择器).val()：无参形式，获取第一个dom对象值；
   - $(选择器).val(值)：有参形式，给对象中所有dom对象赋统一值；
   - $(选择器).text()：无参形式，获取对象中所有dom对象显示内容，然后拼接为一个字符串输出；
   - $(选择器).text(值)：有参形式，给对象中所有dom对象的显示内容赋统一值；
   - $(选择器).attr(属性名)：获取第一个dom对象的属性值；
   - $(选择器).attr(属性名，值)：给对象中所有dom对象的属性设置为统一新值；
   - $(选择器).remove()：将数组中所有dom对象及其子对象全部删除；
   - $(选择器).empty()：将数组中所有dom对象的子对象删除；
   - $(选择器).append()：为所有dom对象添加子对象；
   - $(选择器).html()：获取Dom数组中第一个元素的文本值（）；
   - $(选择器).html(值)：有参形式，给对象中所有dom对象赋统一值；
   - each函数（循环函数，每个成员都会调用一次处理函数）
     - $.each(需要遍历的对象, function(index,element){处理程序})：获取Dom数组中第一个元素的文本值（）；
     - JQuery对象.each( function(index,element){处理程序})：
     - index为数组下标，element为数组的对象；

8.  使用Jquery完成ajax；

   - Jquery简化了ajax请求的处理过程；

   - 实现过程中三个函数；

      - $.ajax():核心函数；
      - $.post():使用post方式处理ajax请求；
      - $.get():使用get方式处理ajax请求；
      - $.post()与$.get()内部都是调用$.ajax()；

   - $.ajax()核心函数的使用；

      - $.ajax()函数的参数是一个json的结构；

      - json结构的参数说明

         - {名称：值，名称：值.....}
         - async：boolean类型的值，表示是否为异步请求（可以不写该配置项，默认为true）；
         - contentType:字符串格式，表示从浏览器发送服务器的参数的类型，可以不写。
         - data：可以是字符串，数组，json，表示请求参数值，通常为json格式数据；
         - dataType：表示从服务器端返回的数据格式，可选的有：xml, html, text,json;
         - error:一个函数，表示请求发生错误时执行的函数；
         - sucess：一个函数，function（data）data表示服务器端返回的数据，表示请求成功时执行的函数；
         - url：请求的地址；
         - type：请求的方式（默认get）；3
         - 主要使用url，data，dataType，sucess；

         ```jsp
         <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
         <%--设置Bmi计算函数--%>
         <script type="text/javascript">
             <%--入口函数，在页面加载完成后即执行，与onload事件一致
             	将Jquery所有函数都写在该例子中
             --%>
             $(function(){
                 $("#btn").click(function (){
                     var name = $("#name").val();
                     var height = $("#h").val();
                     var weight = $("#w").val();
                     $.ajax({
                         url:"bmiCompute",
                         data:{"name":name,"height":height,"weight":weight},
                         dataType:"text",
                         success:function (data){
                             $("#BmiResult").text(data)
                         }
                     }
                   )
                 }
                                )
             }
              )
         </script>
         ```

   - $.get() 语法规则：$.get(url，data，dataType，sucess)

      - 直接写参数的值；
      - 参数顺序是固定的；

   - $.post() 语法规则：$.post(url，data，dataType，sucess)

      - 直接写参数的值；
      - 参数顺序是固定的；


# 第二章. web后端

### 一. Servlet（单例多线程）

1. 系统架构

  * C/S架构

  	- Client/Server（客户端/服务器）；
  	- 特点：需要安装特定的客户端软件；

  * B/S架构

  	- Browser/Server（浏览器/服务器）；
  	- B/S是一个特殊的C/S系统；
  	- 通信原理：
  		
  		* 域名解析器会将域名解析成一个具体的ip地址端口号等等；
  		* ip地址：计算机在网络中的身份证号；
  		* 端口号：代表一个软件（唯一性）；
  		* 资源；
  	
  	- web 服务器软件
  	
  		* Tomcat（WEB服务器）、jetty（WEB服务器）、JBOSS（应用服务器）、WebLogic（应用服务器）、WebSphere（应用服务器）
  		* 应用服务器实现了javaEE所有规范；
  		* WEB服务器实现了javaWeb的Servlet+JSP两个核心规范；

2. 域属空间

  * request（请求域）；其作用于单个请求；
  * HttpSession（会话域）：其作用于整个会话范围；
  * servletContext即application（应用域）：其作用于整个应用范围；

3. Servlet执行原理

  * 两个map，key均为URL-patern Value均为Servlet的引用；
  * 其中存储已实例化Servlet对象的为map1；
  * 其中存储未被实例化Servlet对象的为map2；
  * 在程序发送请求到相关Servlet时会先从map1中寻找；
  * 未找到再到map2寻找，找到过后利用反射机制实例化Servlet对象放入Map1中；

4. 创建Servlet的webapp

  * 在webapp目录下新建crm目录（webapp的名字，根目录）；
  * 在webapp的根目录下新建WEB-INF目录（Servlet规定的，必须一模一样）；
  * 在WEB-INF目录下新建一个classes目录（Servlet规定的，必须一模一样）；
  * 在WEB-INF目录下新建一个lib目录（不是必须的，用来存放第三方jar包，Servlet规定的，必须一模一样）；
  * 在WEB-INF目录下新建一个web.xml文件（webapp配置文件）；
  * 编写java程序（必须实现Servlet接口）；

  	- Servlet接口不在JDK中；
  	- servlet接口是由Oracle提供的；
  	- 实现了Servlet服务器中存在该接口；

  * 在编译之前需要配置classpath环境变量；
  * 编写web.xml文件，将“请求路径”与”Servlet类名“关联在一起（注册Servlet）；
  * 启动Tomcat服务器；
  * 浏览器上的请求路径必须与web.xml文件中的Url-pattern属性一致；
  * 可以使用超链接进行访问；

5. 使用集成开发工具开发Servlet

  * 创建空工程；
  * 新建模块（java SE）；
  * 让模块变成javaEE（添加Webapp模块支持）

  	- 注意：在IDEA工具web目录代表webapp的根；

  * 编写Servlet；

  	- 将Servlet-api.jar和jsp-api.jar添加库中的依赖到项目中；

  * 在Servlet实现类中编写service方法中编写代码；
  * 将需要外部jar包（JDBC等）加入Web-INF目录下的lib目录中；
  * 在web.xml文件中完成实现类的注册（请求路径与Servlet之间对应起来）；
  * 使用IDEA中添加配置去关联Tomcat服务器
  * 以debug的模式启动Tomcat

6. Servlet对象的生命周期

  * Servlet对象的创建，方法的调用，对象最终的销毁都是由服务器全权负责的；
  * Tomcat服务器通常又被称为：web容器；
  * Web容器是通过集合（Hashmap）来存储被管理的Servlet对象，自己创建的对象不受web容器管控；
  * Servlet中将设置load-on-startup参数（整数，越小优先级越高）可以在启动服务器时创建Servlet对象；
  * 用户第一次发送请求时创建Servlet对象；
  * 随后立即执行init方法，然后调用Service方法；
  * 用户在之后发送请求只调用service方法；

  	- Servlet对象是单实例模式；
  	- 无参构造方法、init方法只有在第一次发送请求时才调用；
  	- 后续只会调用Service方法；

  * Servlet只有在Tomcat服务器关闭时调用destroy方法销毁Servlet对象；

7. Servlet接口中的方法

  * 无参构造方法（不建议写，建议在init方法中设置初始条件）：只执行一次；
  * void init():初始化操作，只有第一次发送请求时才调用该方法，只执行一次；
  * void service():处理用户请求的核心方法，每次发送请求时都会执行该方法；
  * void destroy():web容器只有在销毁对象之前执行该方法，在执行之后，容器就会销毁对象，只执行一次； 

8. ServletConfig接口（Servlet配置参数）

  * Servlet规范中的一员；
  * ServletConfig对象包装了Web.xml中Serlet标签中的信息；
  * web容器实现了ServletConfig接口；
  * ServletConfig对象对应一个Servlet对象；
  * web容器创建ServletConfig对象；
  * 在创建Servlet对象时同时创建ServletConfig对象；
  * 方法：

    - String getInitParameter(name):通过初始化参数的名称获取Servlet初始化信息；
    - Enumeration<String> getInitParameternames():获取Servlet初始化信息的所有名称；
    - getServletContext()：获取ServletContext对象；
    - getServletName()：获取Servlet对象名字；

9. ServletContext接口(应用域)

   - Servlet规范中的一员；
   - Servlet环境对象或者上下文对象(即其对应的是整个web.xml)；
   - 放在ServletContext中的内容是所有Servlet对象共享的；
   - web容器实现了ServletContext接口；
   - web容器创建ServletContext对象；
   - 在webapp启动时创建；
   - 在webapp关闭时销毁；
   - 一个webapp对应一个ServletContext对象；
   - 通过ServletConfig对象的getServletContext方法获取该对象；
   - 通过GenericServlet对象的getServletContext方法获取该对象；
   - 放在ServletContext中的数据特点：所有用户共享，很少被修改且数据量很少；
   - 方法：

     - String getInitParameter(name):通过Context初始化信息的名称获取Context初始化信息（全局配置信息）；
     - Enumeration<String> getInitParameternames():获取Context初始化信息的所有名称；
     - String getContextPath():获取应用的根路径（动态获取应用的根路径）；
     - String getRealPath(String path):获取文件的绝对路径（path默认起点为根目录“/”作为分隔）；
     - void log（String message）：记录日志；
     - void log（String message，Throwable t）：记录日志与异常（记录在Catalina目录下的logs目录下的Localhost.log文件下）；
     - void setAttribute（String name, Object value）:向ServletContext中存储数据；
     - Object getAttribute（String name）:获取ervletContext中存储的数据；
     - void removeAttribute（String name）:删除ervletContext中存储的数据；

10. 适配器设计模式（GenericServlet）

    - 也属于Servlet规范；
      * 运用抽象类作为中间类来设计适配器
      * 其中需要经常使用的方法设置为抽象方法，子类必须实现；
      * web容器提供了GenericServlet适配器（也实现了ServletConfig接口）；
      * 子类中设计初始条件时应当重写init()方法；
      * 方法

      	- getServletName()：获取Servlet对象名字；
      	- log（）记录日志；
      	- getServletContext()：获取ServletContext对象；
      	- getServletConfig()：获取ServletConfig对象；
      	- String getInitParameter(name):通过初始化参数的名称获取Servlet初始化信息（对象配置信息）；
      	- Enumeration<String> getInitParameternames():获取Servlet初始化信息的所有名称；
      	

    - HttpServlet抽象类

    	* 继承GenericServlet类；
    	* 专门为Http协议设计的Servlet类；
    	* Servlet/http包中的类；
    		
    		- HttpServlet抽象类；
    		- HttpServletRequest类；
    			
    			* 封装了请求协议全部内容；
    			
    		- HttpServletResponse类；
    		
    			* 专门用来响应HTTP协议到浏览器上的；
    		
    	* void Service（HttpServletRequest request， HttpServletRespond respond）：适用于Http协议的service方法（判断请求方式的类型，根据相关请求方式执行相应方法）；
    	* void Service（ServletRequest request， ServletRespond respond）：重写Servlet类中的service方法，调用适用于Http协议的service方法；
    	* void do请求方式（ServletRequest request， ServletRespond respond）：供子类重写的非核心方法（需要前端发送哪个请求方式重写响应的方法）；

11. 模板方法设计模式

   * 设计模式：

   	- 某个问题的固定的解决方案
   	- GoF设计模式：
   	
   		* 23种设计模式（创建型，结构型，行为型）；
   		
   	- javaEE设计模式
   	
   		* DAO
   		* DTO

   * 模板方法设计模式：模板类的模板方法中定义核心算法股价，具体步骤可以延迟到子类当中完成；
   * 模板类通常是一个抽象类，模板方法定义核心算法，这个方法通常是final的；
   * 模板类当中不确定怎么实现的方法定义为抽象方法。

   - Webapp欢迎页面

     * 在根目录下设置欢迎页面（可以使用html（静态页面）和Servlet（动态页面））文件； 
     * 在配置文件中设置Welcome-file-list属性下welcome-file选项（文件默认从根目录下进行查找）；
     * 在浏览器中直接访问Webapp项目时直接跳转欢迎页；
     * 可以设置多个欢迎页，从上往下依次查找；
     * 局部配置：在webapp的目录下配置的欢迎页面；
     * 全局配置：在CATALINA_HOMe/conf/web.xml中配置的欢迎页面；
     * 优先局部，再全局；

   - WEB-INF目录下的资源是受保护的，不能通过路径的方式去访问；
   - request与response对象生命周期为一次请求；
   - HttpServletRequest接口（请求域对象）

     * 是Servlet规范的一员；
     * 封装了Http的请求协议；
     * 常用方法

     	- String getParameter（String name）：获取Value这个一维数组中的第一个元素；
     	- Map<String,String[]> getParameterMap():获取Map；
     	- Enumeration<> getParamenterNames():获取Map集合中所有的Key；
     	- String[] getParamenterValues(name):根据Kry获取全map集合的Values；
     	- Session getSession(boolean x):若需要往Session里面存储数据x为true（存在既有Session使用既有的，不存在既有的新建），即无参构造；取数据x为false（只能获取到既有Session使用既有的，不能新建Session对象）；
     	
     	- void setAttribute（String name, Object value）:向请求域中存储数据；
     	- Object getAttribute（String name）:获取请求域中存储的数据；
     	- void removeAttribute（String name）:删除请求域中存储的数据；
     	
     	- String getRemoteAddr（）：获取客户端的Ip地址；
     	- void setCharacterEncoding(String Type)：设置请求体的字符集（只能处理Post请求的乱码问题）
     	- String getContextPath（）：动态获取应用的根路径；
     	- String getMethod（）：获取请求方式；
     	- String getRequestURI（）：获取请求的URI；
     	- String getServletPath（）：获取Servlet路径；
     	- Cookie[] getCookies():获取请求中所有cookie；
     	- Session getSession()
     	
     		* 获取与当前请求相关的Session，没有就创建新Session；
     		* 向Session存储数据中使用该方法；
     		
     	- Session getSession(boolean create):
     	
     		* 获取与当前请求相关的Session，没有的话，实参为true创建新Session，false不创建新的；
     		* 从Session取出数据时使用带false的该方法；
     		* 随后判断session是否为空后再进行数据提取操作；
     		
     	- ServletInputStream getInputStream（）；获取multipart/form-data请求的输入流（使用完需要关闭）；

   - 使用请求转发机制在不同Servlet对象之间传递请求（也可以转发到Html文件中）

     * 获取请求转发器对象：
     	
     	- request中的方法：ResquestDispather getRequestDispather(String path);
     	- 将需要转发request请求的Servlet对象的路径path包装到请求转发器中；
     	
     * 调用ResquestDispather对象中的 void forword（request req， respond red）

   - HttpResponse接口

     * 常用方法：

     	- Writer getWriter（）：获取向浏览器输出的输出流；
     	- void setContentType（String type（text/html;charset = UTF-8；））：设置响应的内容类型以及字符集；
     	- void SendRedirect（String 带项目名的地址）；将路径响应给重定向后的访问对象；
     	- String encodeRedirectURL(String uri):重编码重定向路径，使之加上JSessionID，解决禁止cookie后重定向中Session的会话跟踪问题；
     	- String encodeURL(String uri):重编码超链接路径，使之加上JSessionID，解决禁止cookie后非重定向跳转页面方式中Session的会话跟踪问题；

   - 转发与重定向

     * 都可以完成资源的跳转；
     * 区别
     	
     	- 转发（一次请求）
     	
     		* 代码：request中的方法RequestDispather getRequestDispather(String path);
     		* 不管转发多少次都是同一个请求；
     		* 形式上在请求结束之后地址栏上的地址不变；
     		* 转发是由web容器控制的；
     		* 只有在Servlet中绑定了数据时才使用转发；
     		* RequestDispather类中方法
     			
     			- forward（response，request）表示直接转发请求，当前对象不能开启标准输出流；
     			- include（response，request）表示将转发对象包含进当前Servlet中，当前对象能够开启标准输出流；
     	
     	- 重定向
     	
     		* 代码：Response 中的方法：Redirect SendRedirect（String 带项目名的地址）；
     		* 重定向一次重新发送一次新请求；
     		* 形式上在每次重定向之后地址栏上的地址都会改变；
     		* 重定向是由web浏览器控制的；
     		* 几乎所有需要多次请求都使用重定向；
     		* 可以重定向到任何合法文件之中；

   - 监听器（Lisener）

     * 监听器设计模式时观察者设计模式中的一种；
     * 观察者设计模式：

     	- 一个观察者与多个被观察者之间建立的“一对多的观察与被观察关系”；
     	- 观察者与被观察者指的都是具有某一类功能的类；
     	
     * 监听器设计模式
     	
     	- 被监听者对象向监听者发送的为类（事件）；
     	- 被监听器称为事件源；
     	- 对监听器的通知称为触发监听器；
     	
     * 一般能从事件对象中获取事件源对象；
     * 使用Servlet自带的八个监听器之前需要在web.xml文件中进行注册
     	
     	- <listener><listener-class>监听器类实现类</listener-class></listener>
     	
     * ServletRequestListener接口

     	- 监听请求；			
     	- 方法
     		
     		* void requestInitialized（ServletRequestEvent sre）：请求发生时触发；
     		* void requestDestroyed（ServletRequestEvent sre）：请求被销毁时触发；
     	
     * ServletRequestAttributeListener接口

     	- 监听request中属性操作；
     	- 方法
     		
     		* void attributeAdded（ServletRequestAttributeEvent sre）：当向request域中添加属性时触发；
     		* void attributeRmoved（ServletRequestAttributeEvent sre）：删除request域中的属性时触发；
     		* void attributeReplaced（ServletRequestAttributeEvent sre）：更改request域中的属性时触发；
     		
     	- ServletRequestAttributeEvent对象
     		
     		* 可以获取之前request中存储的数据；
     	
     * HttpSessionListener接口
     	
     	- 监听Session中的创建与销毁；
     	- 方法	
     		
     		* void requestCreated（HttpSession sre）：Session被创建时触发；
     		* void requestDestroyed（HttpSession sre）：Session被销毁时触发；
     	
     * HttpSessionAttributeListener接口

     	- 监听request中属性操作；
     	- 方法
     		
     		* void attributeAdded（HttpSessionAttributeEvent sre）：当向HttpSession域中添加属性时触发；
     		* void attributeRmoved（HttpSessionAttributeEvent sre）：删除HttpSession域中的属性时触发；
     		* void attributeReplaced（HttpSessionAttributeEvent sre）：更改HttpSession域中的属性时触发；
     		
     	- HttpSessionAttributeEvent对象
     		
     		* 可以获取之前HttpSession中存储的数据；

     * ServletContextListener接口

     	- 监听ServletContext创建与销毁；			
     	- 方法
     		
     		* void ContextInitialized（ServletContextEvent sre）：请求发生时触发；
     		* void ContextDestroyed（ServletContextEvent sre）：请求被销毁时触发；
     	
     * ServletContextAttributeListener接口

     	- 监听request中属性操作；
     	- 方法
     		
     		* void attributeAdded（ServletContextAttributeEvent sre）：当向request域中添加属性时触发；
     		* void attributeRmoved（ServletContextAttributeEvent sre）：删除request域中的属性时触发；
     		* void attributeReplaced（ServletContextAttributeEvent sre）：更改request域中的属性时触发；
     		
     	- ServletContextAttributeEvent对象
     		
     		* 可以获取之前Context中存储的数据；
     	
     * HttpSessionBindingListener接口 

     	- 实体类实现该接口；
     	- 监听当前实体类的对象与Session的绑定与解绑；
     	- 该监听器不需要注册；
     	- 方法
     		
     		* void valueBound（HttpSessionBindingEvent sre）：当前对象与HttpSession绑定时触发（即向Session添加该类时触发）
     		* void valueUnbound（HttpSessionBindingEvent sre）：当前对象与HttpSession解绑时触发（即从Session删除该类时触发）
     	
     * HttpSessionActivationListener接口 

     	- 实体类实现该接口同时还需要实现序列化接口；
     	- 监听Session中当前实体类的钝化（存储到硬盘）与活化（将数据从硬盘存储到Session中）；
     	- 该监听器不需要注册；
     	- 方法
     		
     		* void sessionDidActivate（HttpSessionEvent sre）：当前对象活化时触发该方法（即将数据从硬盘存储到Session中）；
     		* void sessionWillPassivate（HttpSessionEvent sre）：当前对象将被钝化时触发该方法（存储到硬盘）；

   - 过滤器（Fliter接口）

     * Fliter生命周期（实例化（应用启动时创建）-> 初始化（应用启动时初始化） -> doFliter()（每次发送请求都会执行该方法，请求一次执行一次） -> 销毁（在应用被停止时销毁））

     * Filter对象是单例多线程的；

     * 在Fliter接口的实现类中重写doFliter（）方法；

     * 为避免线程安全问题，一般不会为Filter添加可添加成员变量； 

     * 注册Fliter（web-app.xml）
     	
     	- 与Servlet注册相似，其中servlet标签换成filter标签；
     	- <url-pattern>标签之中匹配的是需要拦截资源的路径（ /*表示全路径拦截）；
     	- 在不使用<url-pattern>标签时可以使用<servlet-name>代替拦截指定servlet；
     	- <dispatcher>标签
     		
     		* 值为Forward时，只拦截转发方式为forward时的请求；
     		* 值为include时，只拦截转发方式为include时的请求；
     		* 值为request时，只拦截普通请求（也是默认取值）；
     		* 值为error时，当跳转到指定的错误页面时，表示当前请求会被拦截；				
     	
     * 请求从客户端发送到服务器之前，先经过过滤器（Filter）；

     * 通过FiltererChain类中的void doFilter（Request request，Response response）方法将请求放行给下一个资源；

     * 响应从服务器发送到客户端之前，先经过过滤器（Filter）；

     * FilterConfig接口（Filter配置信息域）

     	- String getInitParameter(name):通过初始化参数的名称获取Fliter初始化信息；
     	- Enumeration<String> getInitParameternames():获取Fliter初始化信息的所有名称；
     	- getServletContext()：获取ServletContext对象；
     	- getFilterName()：获取Fliter对象名字；
     	
     * Filter的执行顺序与注册顺序一致；

     * Filter执行原理；
     	
     	- 一个数组与一个map；
     	- map是以url-patern为key，Filter实例对象的引用为value存储数据的；
     	- 数组中存放着与请求匹配着的Filter；
     	- 收到请求后先再map集合中查找相匹配的对象，查找到后将其引用放入数组中，然后继续指导查找完整个map；
     	- 随后按照数组的顺序执行响应的Filter；
     	
     * 装饰者设计模式
     	
     	- 在不修改目标类也不适用继承的情况下，动态的扩展下个类的功能；
     	- 装饰者类
     	
     		* 装饰者类与目标类实现相同的接口；
     		* 装饰者类要有目标类的引用作为成员变量（目标对象的赋值一般通过带参构造函数默认赋值）；
     	
     	-装饰者基类

     		* 一定要有无参构造函数；
     		* 重写目标函数，不采用任何增强；
     	
     	- 具体装饰者
     		
     		* 要继承自装饰者基类；
     		* 要有带参构造器；
     		* 具体装饰者只对装饰者基类业务方法进行某一种单一的增强；
     		
     	- 使用时采用装饰者链的形式进行使用；
     	
     * 代理设计模式

     	- 为其他对象提供代理以控制对这个对象的访问；
     	- 客户端通过代理对象来实现对目标类的访问；	
     	- 代理设计为了保护和隐藏目标对象从而进行权限控制；
     	- 代理设计同时也可以增强原本目标类的功能；
     	- 代理类功能：实现目标类方法的调用以及增强功能；
     	- 静态代理类
     		
     		* 代理类是自己手工实现的，同时代理的目标是确认的；
     		* 静态代理类与目标类实现相同的接口；
     		* 静态代理类要有目标类的引用作为成员变量（目标对象的赋值一般通过无参构造函数默认赋值）；
     		* 优点：便于理解，简单；
     		* 缺点
     			
     			- 代理类的数量伴随着目标类增加而成倍增加；
     			- 接口变化或者功能增加了之后，影响较大，维护麻烦；
     		
     	- 动态代理
     		
     		* 在程序执行过程之中利用反射机制动态创建代理类对象；
     		* JDK动态代理
     			
     			- 使用java反射包中的类和接口实现动态代理的功能；
     			- java.lang.reflect.InvocationHandler接口；
     				
     				* invoke（Object proxy，Method method，Objext[] args）方法
     					
     					- 表示代理对象执行的功能方法（调用目标方法，执行目标方法的功能，同时增加目标方法的功能）；
     					- Object proxy JDK创建的代理对象，无需赋值；
     					- Method method：目标类中的方法，jdk提供method对象；
     					- Objext[] args：目标方法中的参数；
     					- 使用：
     						
     						* 创建接口的实现类；
     						* 重写invoke方法，将代理类需要实现的方法写在该方法中；
     				
     			- java.lang.reflect.Method类；
     			
     				- 表示方法，通过method可以执行某个方法；
     				- 通过Method类可以执行某个目标类的方法（Object ret = method.invoke（目标类对象，“方法参数”））；
     				
     			- java.lang.reflect.Proxy类；
     				
     				- 用来创建对象；
     				- 创建代理对象方法：Static Object newProxyInstance（ClassLoader classLoader，Class[] interfaces,InvocationHandler h）方法
     				- ClassLoader classLoader:类加载器）（利用反射机制创建的类的getClassLoader（）方法获取）：
     				- Class[] interfaces：接口，通过反射方式获取的目标对象所实现的接口；
     				- InvocationHandler h：我们实现的InvocationHandler类
     				- 返回代理对象；
     			
     		* cglib（code Generation Library）动态代理
     			
     			- cglib是第三方的工具库，创建代理对象；
     			- 原理是继承，通过继承目标类，创建他的子类，子类重写父类中的同名方法；
     			
     		* 优点
     		
     			- 代理类数量可能很少；
     			- 修改接口中的方法不会影响代理类；
     			- 使用过程之中不用创建代理类；
     			- 可以给不同的目标随时创建代理对象；
     	
     * 装饰者设计模式与静态代理设计模式的区别

     	- 使用目的
     		
     		* 装饰者设计模式是为了增强目标对象；
     		* 静态代理设计模式是为了隐藏和保护目标对象；
     		
     	- 目标对象获取方式
     		
     		* 装饰者类利用带参构造器进行创建；
     		* 静态代理类利用无参构造器直接创建；
     		
     	- 功能增强实现者不同；
     	
     		* 装饰者设计模式存在基类，存在父子类的关系；
     		* 静态代理设计模式不存在父子类的关系；

     * 解决post请求的乱码问题可以使用过滤器设置，request.setCharacterEncoding("UTF-8);

     * 也属于Servlet规范；
     	* 运用抽象类作为中间类来设计适配器
     	* 其中需要经常使用的方法设置为抽象方法，子类必须实现；
     	* web容器提供了GenericServlet适配器（也实现了ServletConfig接口）；
     	* 子类中设计初始条件时应当重写init()方法；
     	* 方法
     	
     		- getServletName()：获取Servlet对象名字；
     		- log（）记录日志；
     		- getServletContext()：获取ServletContext对象；
     		- getServletConfig()：获取ServletConfig对象；
     		- String getInitParameter(name):通过初始化参数的名称获取Servlet初始化信息（对象配置信息）；
     		- Enumeration<String> getInitParameternames():获取Servlet初始化信息的所有名称；
     		

     - HttpServlet抽象类

     	* 继承GenericServlet类；
     	* 专门为Http协议设计的Servlet类；
     	* Servlet/http包中的类；
     		
     		- HttpServlet抽象类；
     		- HttpServletRequest类；
     			
     			* 封装了请求协议全部内容；
     			
     		- HttpServletResponse类；
     		
     			* 专门用来响应HTTP协议到浏览器上的；
     		
     	* void Service（HttpServletRequest request， HttpServletRespond respond）：适用于Http协议的service方法（判断请求方式的类型，根据相关请求方式执行相应方法）；
     	* void Service（ServletRequest request， ServletRespond respond）：重写Servlet类中的service方法，调用适用于Http协议的service方法；
     	* void do请求方式（ServletRequest request， ServletRespond respond）：供子类重写的非核心方法（需要前端发送哪个请求方式重写响应的方法）；

     - 模板方法设计模式

     	* 设计模式：
     		
     		- 某个问题的固定的解决方案
     		- GoF设计模式：
     		
     			* 23种设计模式（创建型，结构型，行为型）；
     			
     		- javaEE设计模式
     		
     			* DAO
     			* DTO
     		
     	* 模板方法设计模式：模板类的模板方法中定义核心算法股价，具体步骤可以延迟到子类当中完成；
     	* 模板类通常是一个抽象类，模板方法定义核心算法，这个方法通常是final的；
     	* 模板类当中不确定怎么实现的方法定义为抽象方法。
     	
     - Webapp欢迎页面

     	* 在根目录下设置欢迎页面（可以使用html（静态页面）和Servlet（动态页面））文件； 
     	* 在配置文件中设置Welcome-file-list属性下welcome-file选项（文件默认从根目录下进行查找）；
     	* 在浏览器中直接访问Webapp项目时直接跳转欢迎页；
     	* 可以设置多个欢迎页，从上往下依次查找；
     	* 局部配置：在webapp的目录下配置的欢迎页面；
     	* 全局配置：在CATALINA_HOMe/conf/web.xml中配置的欢迎页面；
     	* 优先局部，再全局；
     	
     - WEB-INF目录下的资源是受保护的，不能通过路径的方式去访问；
     - request与response对象生命周期为一次请求；
     - HttpServletRequest接口（请求域对象）

     	* 是Servlet规范的一员；
     	* 封装了Http的请求协议；
     	* 常用方法
     	
     		- String getParameter（String name）：获取Value这个一维数组中的第一个元素；
     		- Map<String,String[]> getParameterMap():获取Map；
     		- Enumeration<> getParamenterNames():获取Map集合中所有的Key；
     		- String[] getParamenterValues(name):根据Kry获取全map集合的Values；
     		- Session getSession(boolean x):若需要往Session里面存储数据x为true（存在既有Session使用既有的，不存在既有的新建），即无参构造；取数据x为false（只能获取到既有Session使用既有的，不能新建Session对象）；
     		
     		- void setAttribute（String name, Object value）:向请求域中存储数据；
     		- Object getAttribute（String name）:获取请求域中存储的数据；
     		- void removeAttribute（String name）:删除请求域中存储的数据；
     		
     		- String getRemoteAddr（）：获取客户端的Ip地址；
     		- void setCharacterEncoding(String Type)：设置请求体的字符集（只能处理Post请求的乱码问题）
     		- String getContextPath（）：动态获取应用的根路径；
     		- String getMethod（）：获取请求方式；
     		- String getRequestURI（）：获取请求的URI；
     		- String getServletPath（）：获取Servlet路径；
     		- Cookie[] getCookies():获取请求中所有cookie；
     		- Session getSession()
     		
     			* 获取与当前请求相关的Session，没有就创建新Session；
     			* 向Session存储数据中使用该方法；
     			
     		- Session getSession(boolean create):
     		
     			* 获取与当前请求相关的Session，没有的话，实参为true创建新Session，false不创建新的；
     			* 从Session取出数据时使用带false的该方法；
     			* 随后判断session是否为空后再进行数据提取操作；
     			
     		- ServletInputStream getInputStream（）；获取multipart/form-data请求的输入流（使用完需要关闭）；
     	
     - 使用请求转发机制在不同Servlet对象之间传递请求（也可以转发到Html文件中）

     	* 获取请求转发器对象：
     		
     		- request中的方法：ResquestDispather getRequestDispather(String path);
     		- 将需要转发request请求的Servlet对象的路径path包装到请求转发器中；
     		
     	* 调用ResquestDispather对象中的 void forword（request req， respond red）
     	
     - HttpResponse接口

     	* 常用方法：
     	
     		- Writer getWriter（）：获取向浏览器输出的输出流；
     		- void setContentType（String type（text/html;charset = UTF-8；））：设置响应的内容类型以及字符集；
     		- void SendRedirect（String 带项目名的地址）；将路径响应给重定向后的访问对象；
     		- String encodeRedirectURL(String uri):重编码重定向路径，使之加上JSessionID，解决禁止cookie后重定向中Session的会话跟踪问题；
     		- String encodeURL(String uri):重编码超链接路径，使之加上JSessionID，解决禁止cookie后非重定向跳转页面方式中Session的会话跟踪问题；
     	
     - 转发与重定向

     	* 都可以完成资源的跳转；
     	* 区别
     		
     		- 转发（一次请求）
     		
     			* 代码：request中的方法RequestDispather getRequestDispather(String path);
     			* 不管转发多少次都是同一个请求；
     			* 形式上在请求结束之后地址栏上的地址不变；
     			* 转发是由web容器控制的；
     			* 只有在Servlet中绑定了数据时才使用转发；
     			* RequestDispather类中方法
     				
     				- forward（response，request）表示直接转发请求，当前对象不能开启标准输出流；
     				- include（response，request）表示将转发对象包含进当前Servlet中，当前对象能够开启标准输出流；
     		
     		- 重定向
     		
     			* 代码：Response 中的方法：Redirect SendRedirect（String 带项目名的地址）；
     			* 重定向一次重新发送一次新请求；
     			* 形式上在每次重定向之后地址栏上的地址都会改变；
     			* 重定向是由web浏览器控制的；
     			* 几乎所有需要多次请求都使用重定向；
     			* 可以重定向到任何合法文件之中；
     	
     - 监听器（Lisener）

     	* 监听器设计模式时观察者设计模式中的一种；
     	* 观察者设计模式：
     	
     		- 一个观察者与多个被观察者之间建立的“一对多的观察与被观察关系”；
     		- 观察者与被观察者指的都是具有某一类功能的类；
     		
     	* 监听器设计模式
     		
     		- 被监听者对象向监听者发送的为类（事件）；
     		- 被监听器称为事件源；
     		- 对监听器的通知称为触发监听器；
     		
     	* 一般能从事件对象中获取事件源对象；
     	* 使用Servlet自带的八个监听器之前需要在web.xml文件中进行注册
     		
     		- <listener><listener-class>监听器类实现类</listener-class></listener>
     		
     	* ServletRequestListener接口
     	
     		- 监听请求；			
     		- 方法
     			
     			* void requestInitialized（ServletRequestEvent sre）：请求发生时触发；
     			* void requestDestroyed（ServletRequestEvent sre）：请求被销毁时触发；
     		
     	* ServletRequestAttributeListener接口
     	
     		- 监听request中属性操作；
     		- 方法
     			
     			* void attributeAdded（ServletRequestAttributeEvent sre）：当向request域中添加属性时触发；
     			* void attributeRmoved（ServletRequestAttributeEvent sre）：删除request域中的属性时触发；
     			* void attributeReplaced（ServletRequestAttributeEvent sre）：更改request域中的属性时触发；
     			
     		- ServletRequestAttributeEvent对象
     			
     			* 可以获取之前request中存储的数据；
     		
     	* HttpSessionListener接口
     		
     		- 监听Session中的创建与销毁；
     		- 方法	
     			
     			* void requestCreated（HttpSession sre）：Session被创建时触发；
     			* void requestDestroyed（HttpSession sre）：Session被销毁时触发；
     		
     	* HttpSessionAttributeListener接口
     	
     		- 监听request中属性操作；
     		- 方法
     			
     			* void attributeAdded（HttpSessionAttributeEvent sre）：当向HttpSession域中添加属性时触发；
     			* void attributeRmoved（HttpSessionAttributeEvent sre）：删除HttpSession域中的属性时触发；
     			* void attributeReplaced（HttpSessionAttributeEvent sre）：更改HttpSession域中的属性时触发；
     			
     		- HttpSessionAttributeEvent对象
     			
     			* 可以获取之前HttpSession中存储的数据；
     	
     	* ServletContextListener接口
     	
     		- 监听ServletContext创建与销毁；			
     		- 方法
     			
     			* void ContextInitialized（ServletContextEvent sre）：请求发生时触发；
     			* void ContextDestroyed（ServletContextEvent sre）：请求被销毁时触发；
     		
     	* ServletContextAttributeListener接口
     	
     		- 监听request中属性操作；
     		- 方法
     			
     			* void attributeAdded（ServletContextAttributeEvent sre）：当向request域中添加属性时触发；
     			* void attributeRmoved（ServletContextAttributeEvent sre）：删除request域中的属性时触发；
     			* void attributeReplaced（ServletContextAttributeEvent sre）：更改request域中的属性时触发；
     			
     		- ServletContextAttributeEvent对象
     			
     			* 可以获取之前Context中存储的数据；
     		
     	* HttpSessionBindingListener接口 
     	
     		- 实体类实现该接口；
     		- 监听当前实体类的对象与Session的绑定与解绑；
     		- 该监听器不需要注册；
     		- 方法
     			
     			* void valueBound（HttpSessionBindingEvent sre）：当前对象与HttpSession绑定时触发（即向Session添加该类时触发）
     			* void valueUnbound（HttpSessionBindingEvent sre）：当前对象与HttpSession解绑时触发（即从Session删除该类时触发）
     		
     	* HttpSessionActivationListener接口 
     	
     		- 实体类实现该接口同时还需要实现序列化接口；
     		- 监听Session中当前实体类的钝化（存储到硬盘）与活化（将数据从硬盘存储到Session中）；
     		- 该监听器不需要注册；
     		- 方法
     			
     			* void sessionDidActivate（HttpSessionEvent sre）：当前对象活化时触发该方法（即将数据从硬盘存储到Session中）；
     			* void sessionWillPassivate（HttpSessionEvent sre）：当前对象将被钝化时触发该方法（存储到硬盘）；
     	
     - 过滤器（Fliter接口）
     	
     	* Fliter生命周期（实例化（应用启动时创建）-> 初始化（应用启动时初始化） -> doFliter()（每次发送请求都会执行该方法，请求一次执行一次） -> 销毁（在应用被停止时销毁））
     	* Filter对象是单例多线程的；
     	* 在Fliter接口的实现类中重写doFliter（）方法；
     	* 为避免线程安全问题，一般不会为Filter添加可添加成员变量； 
     	* 注册Fliter（web-app.xml）
     		
     		- 与Servlet注册相似，其中servlet标签换成filter标签；
     		- <url-pattern>标签之中匹配的是需要拦截资源的路径（ /*表示全路径拦截）；
     		- 在不使用<url-pattern>标签时可以使用<servlet-name>代替拦截指定servlet；
     		- <dispatcher>标签
     			
     			* 值为Forward时，只拦截转发方式为forward时的请求；
     			* 值为include时，只拦截转发方式为include时的请求；
     			* 值为request时，只拦截普通请求（也是默认取值）；
     			* 值为error时，当跳转到指定的错误页面时，表示当前请求会被拦截；				
     		
     	* 请求从客户端发送到服务器之前，先经过过滤器（Filter）；
     	* 通过FiltererChain类中的void doFilter（Request request，Response response）方法将请求放行给下一个资源；
     	* 响应从服务器发送到客户端之前，先经过过滤器（Filter）；
     	* FilterConfig接口（Filter配置信息域）

     		- String getInitParameter(name):通过初始化参数的名称获取Fliter初始化信息；
     		- Enumeration<String> getInitParameternames():获取Fliter初始化信息的所有名称；
     		- getServletContext()：获取ServletContext对象；
     		- getFilterName()：获取Fliter对象名字；
     		
     	* Filter的执行顺序与注册顺序一致；
     	* Filter执行原理；
     		
     		- 一个数组与一个map；
     		- map是以url-patern为key，Filter实例对象的引用为value存储数据的；
     		- 数组中存放着与请求匹配着的Filter；
     		- 收到请求后先再map集合中查找相匹配的对象，查找到后将其引用放入数组中，然后继续指导查找完整个map；
     		- 随后按照数组的顺序执行响应的Filter；
     		
     	* 装饰者设计模式
     		
     		- 在不修改目标类也不适用继承的情况下，动态的扩展下个类的功能；
     		- 装饰者类
     		
     			* 装饰者类与目标类实现相同的接口；
     			* 装饰者类要有目标类的引用作为成员变量（目标对象的赋值一般通过带参构造函数默认赋值）；
     		
     		-装饰者基类

     			* 一定要有无参构造函数；
     			* 重写目标函数，不采用任何增强；
     		
     		- 具体装饰者
     			
     			* 要继承自装饰者基类；
     			* 要有带参构造器；
     			* 具体装饰者只对装饰者基类业务方法进行某一种单一的增强；
     			
     		- 使用时采用装饰者链的形式进行使用；
     		
     	* 代理设计模式
     	
     		- 为其他对象提供代理以控制对这个对象的访问；
     		- 客户端通过代理对象来实现对目标类的访问；	
     		- 代理设计为了保护和隐藏目标对象从而进行权限控制；
     		- 代理设计同时也可以增强原本目标类的功能；
     		- 代理类功能：实现目标类方法的调用以及增强功能；
     		- 静态代理类
     			
     			* 代理类是自己手工实现的，同时代理的目标是确认的；
     			* 静态代理类与目标类实现相同的接口；
     			* 静态代理类要有目标类的引用作为成员变量（目标对象的赋值一般通过无参构造函数默认赋值）；
     			* 优点：便于理解，简单；
     			* 缺点
     				
     				- 代理类的数量伴随着目标类增加而成倍增加；
     				- 接口变化或者功能增加了之后，影响较大，维护麻烦；
     			
     		- 动态代理
     			
     			* 在程序执行过程之中利用反射机制动态创建代理类对象；
     			* JDK动态代理
     				
     				- 使用java反射包中的类和接口实现动态代理的功能；
     				- java.lang.reflect.InvocationHandler接口；
     					
     					* invoke（Object proxy，Method method，Objext[] args）方法
     						
     						- 表示代理对象执行的功能方法（调用目标方法，执行目标方法的功能，同时增加目标方法的功能）；
     						- Object proxy JDK创建的代理对象，无需赋值；
     						- Method method：目标类中的方法，jdk提供method对象；
     						- Objext[] args：目标方法中的参数；
     						- 使用：
     							
     							* 创建接口的实现类；
     							* 重写invoke方法，将代理类需要实现的方法写在该方法中；
     					
     				- java.lang.reflect.Method类；
     				
     					- 表示方法，通过method可以执行某个方法；
     					- 通过Method类可以执行某个目标类的方法（Object ret = method.invoke（目标类对象，“方法参数”））；
     					
     				- java.lang.reflect.Proxy类；
     					
     					- 用来创建对象；
     					- 创建代理对象方法：Static Object newProxyInstance（ClassLoader classLoader，Class[] interfaces,InvocationHandler h）方法
     					- ClassLoader classLoader:类加载器）（利用反射机制创建的类的getClassLoader（）方法获取）：
     					- Class[] interfaces：接口，通过反射方式获取的目标对象所实现的接口；
     					- InvocationHandler h：我们实现的InvocationHandler类
     					- 返回代理对象；
     				
     			* cglib（code Generation Library）动态代理
     				
     				- cglib是第三方的工具库，创建代理对象；
     				- 原理是继承，通过继承目标类，创建他的子类，子类重写父类中的同名方法；
     				
     			* 优点
     			
     				- 代理类数量可能很少；
     				- 修改接口中的方法不会影响代理类；
     				- 使用过程之中不用创建代理类；
     				- 可以给不同的目标随时创建代理对象；
     		
     	* 装饰者设计模式与静态代理设计模式的区别
     	
     		- 使用目的
     			
     			* 装饰者设计模式是为了增强目标对象；
     			* 静态代理设计模式是为了隐藏和保护目标对象；
     			
     		- 目标对象获取方式
     			
     			* 装饰者类利用带参构造器进行创建；
     			* 静态代理类利用无参构造器直接创建；
     			
     		- 功能增强实现者不同；
     		
     			* 装饰者设计模式存在基类，存在父子类的关系；
     			* 静态代理设计模式不存在父子类的关系；

     	* 解决post请求的乱码问题可以使用过滤器设置，request.setCharacterEncoding("UTF-8);

   - ?		

	?	

Cookie
	
	- 会话跟踪器；
	- 用户在提交第一次请求时，由服务器端创建，保存在浏览器端，在用户发送同类请求时将cookie一起发送（资源路径相同）；
	- javaee中的cookie类在Servlet.http包中；
	- 使用response的addCookie（）方法向响应中添加cookie；
	- 未设置过期时间的cookie在会话结束时就会被销毁；
	- Cookie类中常用方法
	
		* void setPath(String path)：绑定请求路径；
		* void setMaxAge(int time)：设置cookie的有效期；
		* String getName（）：获取cookie名称；
		* String getValue（）：获取cookie值；

Session（会话跟踪器）

	- 在Servlet类被创建时一起创建；
	- Session一般与资源路径绑定或者项目根路径绑定；
	- 一组请求和响应的结合就是会话；
	- Session保存在服务器端；
	- HttpSession类中常用方法
		
		* void setAttribu te（String name, Object value）:向请求域中存储数据；
		* Object getAttribute（String name）:获取请求域中存储的数据；
		* void removeAttribute（String name）:删除请求域中存储的数据；
		* void invalidate():使Session失效（不为空）；
	
	- Session的工作原理
		
		* 在创建Session后，服务器调用request.getSession方法时：服务器将其放到一个Map结构的Session列表中；
		* Key为生成32为随机串JSessionID，value为Session的引用；
		* 在发送请求时，会以name=JSessionID，Value=Session的引用的形式包装到cookie中发送给浏览器；
		* 再次发送请求时会取缓存中寻找响应的Session对象cookie；
	
	- Session的失效
		
		* 默认超时时间为30分钟；
		* 设置Session超时时限
			
			- web.xml文件中设置<seesion-config><seesion-timeout>失效时间（以分钟为单位）</seesion-timeout></seesion-config>
			
	- 只有Session失效了之后服务器端会话才会结束；

### 二. java sever page（JSP动态网页技术）

- JSP文件本质是servlet，用于展示数据；	

- 服务器在第一次访问JSP页面时会将JSP文件翻译为JAVA源文件；

- JSP注释<%--注释内容--%>（JSP注释不会被翻译到java源文件中）；

- HTML注释<!--注释内容-->（html注释会被翻译到java源文件中）；

- 插入java片段的方式

	* java代码块
	
		- 以<%java代码%>形式呈现；
		- 以java语句的形式出现在service方法中；
		- 出现的顺序与JSP文件中一致；
		- 不可以添加访问权限；
		- 不能够定义方法；
		- 不能够定义静态代码块；
		
	* 申明语句块
		
		- 以<%!java代码%>形式呈现；
		- 以java语句的形式直接出现在类中；
		- 可以添加访问权限；
		- 能够定义方法；
		- 能够定义静态代码块；

	* 表达式块
	
		- 以<%=java代码%>形式呈现；
		- 尾部不加分号；
		- 作用是将内容输出到页面上；
	
- 内置对象
	
	* pageContext：
	
		- 第四个域为page；
		- 可以通过get方法取得其余八个内置对象；
		
	* request
	* session：用于重定向传递数据；
	* application
	* response
	* config
	* out： 将参数内容显示到页面的输出流；
	* page：代表当前Servlet对象；
	* exception：获取错误信息；
	
- JSP指令
	
	* 语法规则：<%@指令名称 属性名=属性值 属性名=属性值...%>
	* page指令
	
		- pageEncoding属性：指定当前页面编码方式，默认文本类型为text/html；
		- contentType属性：指定当前页面编码方式，同时可以修改文本类型；
		- import属性：导入所使用的类；
		- errorPage属性：指定错误出现时进入的页面（路径名前加/）；
		- isErrorPage属性：指定为true时会构建一个exception对象，使用exception.getMessage方法可以获得错误信息；
		- Session属性：指定内置Session对象是否存在默认为true（默认），false（从session中读取数据时使用）时不存在；
		
	* include指令
	
		- 静态联编：文件的包含发生在服务器翻译jsp文件之前；		
		- 静态联编中不同文件中的数据是共享的；
		- file属性：指定包含文件所在路径；
		- 注意：变量不需要共享时，需在不同文件使用不同的变量名；

	* taglib指令
	
		- 注册El函数
		- uri属性指定tlb文件中函数的URI；
		- prefix属性指定标签库名；
	
- action（JSP动作）
	
	* 使用系统定义的标签来取代java代码快的功能；
	* 语法规则（<jsp：动作名称 属性名=属性值 属性名=属性值...></jsp：动作名称>）或（<jsp：动作名称 属性名=属性值 属性名=属性值.../>）
	* forword动作
		
		- forword动作是将页面直接转发到目标页面，发起页面无法向标准输出流中输入数据；
		- 动作发生后是由目标页面向浏览器发出响应；
		- page属性：指定目标页面文件；
	
	* includ动作（动态联编）
	
		- 动态联编不共享变量，在静态与动态联编均可以使用时首先使用静态联编可以减少内存消耗以及提升执行效率；
		- include动作是将目标页面内容包含到当前页面，发起页面可以向标准输出流中输入数据；
		- 动作发生后是由当前页面向浏览器发出响应；
		- page属性：指定目标页面文件；
	
- EL表达式
	
	* 只能获取数据值；
	* JSP页面静态部分（非java代码块部分）使用${变量名表达式}的形式获取到指定表达式的值；
	* 只能从四大域中获取数据（pageContext，request，session，application）；
	* 查找数据数据依次由小到大范围依次查找；
	* 可以访问对象属性（访问对象的get函数）；
	* 查找范围内置对象（pageScope，requestScope，sessionScope，applicationScope）：查找对应域中数据变量名表达式为：对应Scope.变量名；
	* 注意：
	
		- 访问为null对象属性时不会抛出空指针异常；
		- 访问数组下标越界时出现异常不会出现越界异常；
		- 可以通过索引访问list，不能访问set；
		- 通过(map名.key值)的方式访问map中的属性值；
		- 不支持++以及--运算符；
		
	* empty运算符表示属性是否为空
		
		- 空返回true否则返回false；
		- empty放在需要判断的属性前；
		- 对空字符串的判断为true；
		- 对于没有元素的数组或集合对象判断也为true；
		
	* 内置对象（pageScope，requestScope，sessionScope，applicationScope，pageContext，param，paramValues，initParam）
	
		- 除了pageContext对象外所有内置对象类型均为map；					
		- pageContext与JSP中的内置pagecontext一样的；
			
			* 用于定义访问绝对路径时指定资源根路径：pageContext.request.contextPath；
			
		- param.属性值：获取请求中的指定参数值（底层调用request中的getParameter（String name）方法）；
		- paramValues.属性值：获取请求中的指定所有参数值（底层调用request中的getParameterValues（String name）方法）；
		- initParam.属性值：获取初始化参数（底层调用ServletContext中的getInitParameter（String name）方法）；
		
	* EL表达式不支持对字符串的处理；
	* 自定义EL函数
		
		- 注册类与函数；
			
			* 自定义的类与他的函数需要在扩展名为.tld（tag library definition 标签库定义）的XML文件中先进行注册；
			* 头部约束在\apache-tomcat-10.0.16\webapps\examples\WEB-INF\jsp2文件中拷贝；
			* 文件定义在web-INF目录下；
			* 定义标签库信息
				
				- 标签库版本<tilb>版本号</tilb>
				- 一个标签库（标签库名<short-name>标签库名</short-name>一般与标签名字相同）定义一个标签；
				- <uri></uri>标签体
				
			* 注册函数<function></function>
				
				- <name></name>函数名称；
				- <function-class>类名（完全）</function-class>注册类；
				- <function-signation>empty</function-signation>定义标签体；
			
		- 在JSP中使用自定义EL函数
		
			* 使用taglib指令在JSP文件中完成注册；
			* 使用时变量表达式为：标签库名：函数名称（实参数据）；
			* 实参数据也需要放在四大域中才能使用；
		
	* JSTL（JSP Standard Tag Library）JSP标准标签库；
	
- 自定义标签
	
	* 自定义继承SimpleTagSupport类的标签处理器；

		- 标签的属性反应到标签处理类中是set方法；
	* 重写类中的dopag方法
			
		- JspBody为标签体对象；
		- 采用getJspBody（）方法获取标签体；
		- JspBody中的void invoke(Writer writer)可以将标签体内容写入到输出流中，当实参设置为null时，是与标准输出流绑定的；
	* 在tld文件中注册标签(文件放在Web-INF目录下tlbs目录下)
	
		- 自定义的类与他的函数需要在扩展名为.tld（tag library definition 标签库定义）的XML文件中先进行注册；
		- 头部约束在\apache-tomcat-10.0.16\webapps\examples\WEB-INF\jsp2文件中拷贝；
		- 文件定义在web-INF目录下；
		- 定义标签库信息
			
			* 标签库版本<tilb>版本号</tilb>
			* 一个标签库（标签库名<short-name>标签库名</short-name>一般与标签名字相同）定义一个标签；
			* <uri></uri>
		- 注册标签<tag></tag>
			
			* <name></name>标签名称；
			* <tag-class>类名（完全）</tag-class>注册类；
			* <body-content></body-content>定义标签体
				
				- 无标签体时定义empty；
				- sceiptless：表示当前标签具有标签体，标签体不能出现java脚本（java代码块，JSP表达式），但可以出现EL表达式；
				- jsp（已过时，不能使用）：表示当前标签具有标签体，标签体内容直接显示到浏览器中；
				- tagdependent：表示当前标签具有标签体，标签体内容直接显示到浏览器中；
				
			* 注册标签属性<attribute></attribute>
				
				- <name></name>属性名称；
				- <required></required>属性是必须的时设置为true；
				- <rtexprvalue></rtexprvalue>支持EL与JSP表达式时设置为true
		- 在JSP中使用自定义EL函数
		
			* 使用taglib指令在JSP文件中引入标签库；
			* <标签库名:标签名称>表达式使用标签；
	
- jsp与html中地址的使用

  - 绝对地址：带有协议名称的地址都是绝对地址；

  - 相对地址

    - 没有协议开头的地址；
    - 相对地址不能独立使用，必须和参考地址联合使用；

  - jsp所使用的地址都是相对地址；

  - 当地址没有斜杠开头时，访问地址为当前页面地址加上连接的地址；

  - 以“/”开头的地址，访问地址为服务器地址加上连接的地址；

  - 在jsp中head标签中加入base子标签设置参考地址；

    ```jsp
    <!--获取参考地址-->
    <%
    	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + 	
        request.getContextPath() + "/";
    %>
    <head>
        <!--设置参考地址-->
    	<base href="<%=basePath%>"/>    
    </head>
    ```

### 三. 系统开发模型

- javaBean

* 广义JavaBean
	
	- 数据承载bean；
	- 业务处理Bean；
	
* 狭义JavaBean；
	
	- 符合JavaBean规范；
		
		* 类需要是公开的；
		* 属性需要被封装同时提供公开的set和get函数；
		* 类需要继承Serializable接口；
		* 必须要有无参构造函数；

- model1模型为JSP+javaBean；
- modle2模型就是MVC模型（视图层（JSP）+控制层（Servlet）+模型层）；
- 三层架构
	
	* 视图层（view层主要是Servlet类）：表现层，接收用户提交请求是在该层编写；
	* 服务层（service）：业务层，逻辑层；系统的主要业务逻辑编写层；
	* 持久层（dao）：数据访问层；直接操作数据库的代码有该层编写；
	
- MVC+三层架构开发步骤
	
	* 第一步：定义实体类以及数据库中相应表格（从持久化层开始写）；
	* 第二步：从dao层开始写；

