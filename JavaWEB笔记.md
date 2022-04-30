## ��һ�� webǰ��

### һ. HTTPЭ�飨���ı���ʽ��

1. ��ҳ��ʹ��<br>���У�
2. Э�飺�������˻���������֯��ǰ�ƶ��Ĺ淶��	
3. HTTPЭ�飺��W3C�ƶ���һ�ֳ��ı�����Э�飨ͨѶЭ�飺������Ϣ��ģ�壩��
4. ���ı���������ͨ�ı���������ý�壻
5. ����request��Э�飺

  - �涨�˷��͵����ݵľ����ʽ��
  - ������

  	* ����ʽ��
  		
  		- get
  		- psot��
  		- delete��
  		- put��
  		- head��
  		- options��
  		- trace��
  		
  	* URI��
  		
  		- ͳһ��Դ��ʶ����
  		- URL��ͳһ��Դ��λ����
  			
  			* ���Զ���Դ���ж�λ��
  			* URL����URI��
  			* URI���ܶ���Դ���ж�λ��
  		
  	* Э��汾�ţ�

  - ����ͷ��

  	* �����������
  	* �����Ķ˿ڣ�
  	* �������Ϣ
  	������

  - �հ��У�

  	* �ָ�����ͷ������

  - �������ģ�

  	* ��������ݣ�

6. ��Ӧ��response��Э�飺

  - �涨����Ӧ�����ݵľ����ʽ��
  - ״̬��

  	* Э��汾�ţ�HTTP/1.1��
  	* ״̬�루�涨����Ӧ״̬�ţ�
  		
  		- 200����Ӧ�ɹ�������������
  		- 404��ǰ�˳��ִ���
  		- 405��ǰ�˷��͵�����ʽ��󷽵Ĵ���ʽ��һ�£�
  		- 500���������˳������쳣��
  		- 4��ʼ��һ��Ϊ������˳������⣻
  		- 5��ͷ��һ��Ϊ�������˳������⣻
  		
  	* ״̬��������Ϣ
  	
  		- ok��������
  		- not found����Դ�Ҳ�����

  - ��Ӧͷ��

  	* ��Ӧ���������ͣ�
  	* ��Ӧ�����ݳ��ȣ�
  	������

  - �հ��У�

  	* �ָ���Ӧͷ����Ӧ���ģ�

  - ��Ӧ���ģ�

7. get��post����

  - ѡ��

  	* ֻ�е�form����method����ֵΪ��post��ʱʹ��post��
  	* �������ȫ��ʹ��get

  - ����

  	* get����������ʱ�����ݻ����URI���棬URI������֮��ʹ�á������ָ���������������ϣ�
  	* post���͵�����ʱ�������з��ͣ����������������ϣ�
  	* �������ݸ�ʽΪ����name = value����
  	* name����Form��Ϊ��put��ǩ��name��
  	* value����Form��Ϊ��put��ǩ��value��
  	* get ����ֻ�ܷ����ַ�����post���ж����ܷ���
  	* get�����ʺϷ�������������������ݣ�post�ʺ��������������������ݣ�
  	* get�����ǰ�ȫ�ģ���Ϊֻ�Ǵӷ�������ȡ���ݣ�
  	* post��Բ�����ȫ����Ϊ��������������ݣ� 
  	* get����֧�ֻ��棬post��֧�ֻ��棻
  	* �κ�get�������յġ���Ӧ��������ᱻ���������������

8. ��������ʵ���д��ʽ

  - ���ʹ���HTTP��//��+ IP��ַ + �˿ں� + ��Դ·������Ŀ + ������ + ������

9. �ص㣺

  - ֧�ֿͻ�/������ģʽ��
  - �򵥿��٣�ֻ�贫�����󷽷���·����
  - ��HTTP�������������͵����ݶ���
  - �����ӣ�ÿ������ֻ����һ������
  - ��״̬������������û�м���������

### ��. HTML�ļ�(<html></html>����ǩ �ֽ�dom��)

1. ÿ���ڵ㶼ӵ��id���ԣ��ǽڵ����Ψһ��ʶ��js����ͨ��id�Խڵ������в����������ҳ��̬Ч����

2. ÿ���ڵ㶼ӵ��classԪ�أ�����ָ���ڵ��������

3. ��ʼ��ǩ�������ǩ֮��������ʱ������ǩ��ʡ�ԣ����ڿ�ʼ��ǩĩβ����/���棻

4. html�﷨����ɢ�ģ������ǩ�������������⣻

5. �����ִ�Сд��

6. <!doctype html>�����԰汾���ƣ��ͷ���ϱ�ʾ����Ϊhtml5��û���ϱ�ʾhtml4��		

7. <head>��ҳͷ</head>ͷ��

  - <title></tille>:��ҳ���⣬��ʾ����������Ͻǣ�

8. <body>��ҳ����</body>�壨��ʾ�������ҳ���е����ݣ���

  - bgcolor�������ñ�����ɫ��

  - background����ָ������ͼƬ·����

  - ������ǩ

  	- ������

  	```html
  	<p>��������</p> 
  	```
  	
  	- ������
  	  - ��ռһ��
  	  - h1���h6��С;
  	
  	```
  	<h1></h1>~<h6></h6>:
  	```
  	
  	- ����Ŀ��ǣ�û�н�����ǩ�����У�
  	
  	  ```html
  	  <br>
  	  ```
  	
  	- ����Ŀ��ǣ�û�н�����ǩ��ˮƽ�ߣ�
  	
  	  ```html
  	  <hr>
  	  ```


  	
  	  - color����ֵ����ˮƽ����ɫ��
  	  - width����ָ��ˮƽ�ߵĿ�ȣ�����ʹ�����ػ��߰ٷ�������
  	
  	- <pre></pre>(Ԥ����ʽ���)������Դ�����ʽ��
  	
  	- <b></b>�����֣�
  	
  	- <i></i>б���֣�
  	
  	- <ins></ins>�����֣�
  	
  	- <del></del>ɾ���֣�
  	
  	- <sup></sup>���ϽǼ��֣�
  	
  	- <sub></sub>���½Ǽ��֣�
  	
  	- <font></font>���Ե������֣�

  - ʵ���ǩ���﷨���� ������&��ͷ;��β��

    * &nbsp;:һ���ո��ǩ��
    * &lt;��С�ںţ�
    * &gt;�����ںţ�

  - ���<table></table>

    * border����ֵ�������ñ߿��ȣ����أ���
    * width����ֵ���ñ���ȣ�
    * height����ֵ���ñ���ȣ�
    * align���ö��䷽ʽ��center����
    * <tr></tr>�У�

    	- align���ö��䷽ʽ��center����
    	
    * <td></td>��Ԫ��

    	- align���ö��䷽ʽ��center����
    	- �кϲ���
    	
    		* rowspan���ԣ�ֵΪ�ϲ�������
    		* ȡ�����ϲ��ĺ󷽵�Ԫ��

    	- �кϲ�
    	
    		* colspan�кϲ���
    		* ȡ�����ϲ����ֻʣ����colspan����ֵ�õ�Ԫ��
    	
    * <th></th>���ⵥԪ��
    	
    	- �Զ�������Ӵ֣�

    * <thead></thead>��ͷ��
    * <tbody></tobody>���壻
    * <tfoot></tfoot>��ţ�

  - <img></img>���ø�������������ڵ�ͼƬ

    - src����ָ��ͼƬ·����
    - width����ֵ����ͼƬ��ȣ��߶Ȳ���Ҫ���ã���ȱ����ţ���
    - title����ֵ���������ͣͼƬ�Ϸ�ʱ����ʾ��Ϣ��
    - alt������ʾͼƬ����֮����ʾ����Ϣ��

  - <a></a>�����ӱ�ǩ��

    * href������ָ�����ӵ�·��������·������
    * �����Ǿ���·�������·��Ҳ����������·����
    * target���������趨Ŀ����Դ������ʾλ�ã�
    	
    	-_blank ���´�������ʾ��
    	-_self�ڵ�ǰ�����д򿪣�Ĭ�ϣ���
    	-_parent�ڸ���������ʾ��

  - <iframe></iframe>��Ƕ���ڣ�

    * src����ָ��ͼƬ·����

  - <meta>��charset�������ñ��뷽ʽ�������ı�������뷽ʽ��ͬ����

  - �б�

    * <ul></ul>�����б�li��ǩ���ñ����֣���
    * <ol></ol>�����б��б�ţ�li��ǩ���ñ����֣���
    * type����ָ����ǩ����ʽ��
    * ��ǩ����Ƕ�ף�

  - ��<form></form>��ǩ

    * �������ռ��û������ݣ��ύ��ʱ��������ͬʱ���Է������ݸ���������
    * action��������ָ������·����href������ͬ����
    * method��������ָ�����ύ�ķ�ʽ/������Ĭ�ϲ�ȡget��ʽ�ύ����
    * enctype���Ա�ʾ���ñ���ʽ��ֵΪmultipart/form-dataʱ�����ϴ��ļ���
    * <input></input>��ǩΪ�����򣨽��ջ����ռ����ݣ���

    	- �ڱ�ǩǰ�����ñ�ǩǰ����ʾ�����֣�					
    	- type����
    		
    		* submitֵ��ʾ�ύ��ť���ύ��ǰ������
    		* buttonֵ��ʾ��ť��
    		* textֵ��ʾ�ı���
    		* checkboxֵ��ʾ��ѡ��
    		* redioֵ��ʾ��ѡ��ť������ָ��value����ֵ��Ĭ��ѡ������check���ԣ���
    		* passwordֵ��ʾ�����
    		* resetֵ��ʾ���ñ���
    		* file�ļ��ϴ��ؼ���
    		* hidden��������ؼ����ύ��ϣ���û������Ĺ̶����ݣ�
    	
    	- readonly���Ա�ʾֻ�������Ա��û��������û��޷��޸ģ�
    	- disabled���Ա�ʾֻ�������Ա��û��������û��޷��޸�ͬʱ���ᱻ�ύ��
    	- maxlength���Ա�ʾ����������ȣ�
    	- value����ֵ��ʾ����������ʾֵ��
    	- name����ֵ���ڱ�ʾ�������ƣ��ύ��ʽΪ?name=value&name=value;
    	- ����Ҫ�ύ�����Բ�дname���ԣ�

  - <select></select>��ʾ����ѡ���ָ��name��

    * multiple������������֧�ֶ�ѡ��
    * size��������֧�������б�ѡ����Ŀ������
    * <option></option>��ʾѡ�ָ��value������selected���Ա�ʾĬ��ѡ�У���

  - <textarea></textarea>������

  - <div></div>ͼ��,��������ҳ���в��֣�

    - ����ͨ�����Ͻǵ�������ж�λ��
    - Ĭ�϶���ռ��һ�У�

  - <span></span>Ҳ�Ǻ��ӣ�Ҳ�����������֣�

    * span����ռ�У���һ���飻

  - href��������Ϊjavascript:void(0)����ҳ�治��ת����Ȼ���ֳ�������ʽ��

  - href��������ΪonclickΪ�����¼���ʾ����������ʱִ�лص�������

### ��. CSS(�����ʽ������)����head��ǩҳ�����ã�

1. ��������HTMLҳ�档
2. ��html�ļ�������CSS���ԣ�

  - �������巽ʽ

  	* �﷨��ʽ��ǩ������Style���ԣ���ʽ��:��ʽֵ:��ʽ��:��ʽֵ��

  - �����ڲ���ʽ�����(<style></style>)

  	* type��������Ϊtext/css
  	* idѡ����#id{������ʽ}
  	* ��ǩѡ���������ڵ�ǰҳ������б�ǩ����ǩ{������ʽ}��
  	* ��ѡ������.����{������ʽ}��
  	* ���ȼ���idѡ����>��ѡ����>��ǩѡ������

  - �����ⲿ��������ʽ���ļ�<link></link>

  	* type��������Ϊtext/css
  	* href����������ʽ�ļ�·����

### ��. Javascript��JS�ļ���

1. ����

  - JavaScript��һ�ֽű����ԣ��ű��������г���������ͨ�ı�����ʽ����ģ���
  - HTML�ļ������壬CSS������HTMLҳ�棬JS��������hTMLҳ�棻
  - JS���¼������͵ı�����ԣ�һ�������¼��������ģ�
  - JavaScript��һ�����������ԣ�Java��һ��ǿ��������
2. �¼�����������¼�����ǰ����on��
3. console�е�log�����������Խ��������뵽����̨�ϣ�
4. ����Js����鷽ʽ
   - ��HTML�ļ���ʹ���������巽ʽд��JS����
     - �����¼���������ԡ���ǩ�����ԡ�����ʽ���ڣ�
     - window����
       - ������е��������ش�������
       - alert(String)���������Ի���
   - ��HTML�ļ��в���JS�ű��飻
     - �ű������ж���κ�λ�ã�û�����ƣ�
   - �����ⲿ��������ʽ���ļ�<script></script>��
     - type��������Ϊtext/javascript
     - src��������js�ļ�·����
5. ����

  - �﷨��ʽ��var ��������
  - �ñ����������κ����͵����ݣ�
6. ����

  - ���庯�����﷨��ʽ��

  	* function ����������ʽ�����б�{������}
  	* ������ = function����ʽ�����б�{������}

  - ?	JS�ĺ�������Ҫָ������ֵ���ͺ���ʽ�����б���Ҫָ��ֵ���ͣ�
    - JS�ĺ��������ֶ����ò���ִ�У�
    - ���庯�������ȼ�����ߵģ�
    - JS������һ���������Ե����������ʹ�ã�
7. �¼�

     - ʧȥ����blur��
     - �����б�ѡ����ı���ı������ݸı�change��
     - ��굥��click��
     - ���˫��dblclick��
     - ��ȡ����focus��
     - ���̰���keydown��
     - ���̵���keyup��
     - ҳ��������load��body��ǩ�����ã���ҳ��ȫ��Ԫ�ؼ�����Ϸ�������
     - ��갴��mousedown��
     - ��꾭��mouseover��
     - ����ƶ�mousemove��
     - ����ƿ�mouseout��
     - ��굯��mouseup��
     - ������reset��
     - �ı���ѡ��select��
     - ���ύsubmit��

8. ��ȡ�ڵ����

     - document����ΪJS���ö���ҳ���е��������ݾ���document���󣩣�
     - document�е�getElementById��������ͨ��id��ȡ����
     - document�е�getElementByName��������ͨ��name��ȡ����

9. innerHTML����

     - ���Ի�ȡ���߲���Ԫ���ڲ����ݣ�
     - �Ὣ���ݵ���HTML����ִ�У�

10. �ڵ�����innerText����ֻ�Ὣ���ݵ����ı�����������ı����ݣ���
11. ����ͨ���ڵ�.���Ի�ȡ�κα�ǩ���Ѿ���������ԣ�
12. ��ѡ���check���Կ��Ի�ȡ��ѡ���ѡȡ״̬��
13. ͨ��ѭ�����������б�ǩ���¼���
14. trim()����ȥ���ַ�����ǰ��հף�

### ��. ajax�����ֲ�ˢ�µķ�����

1. ȫ��ˢ��
     - ���������ҳ������ȫ���ı䣻


2. �ֲ�ˢ�£�
     - �����ҳ���в������ݱ仯 


3. �첽����XMLHttpRequest��

     - �����첽�����﷨��ʽ��JS���룩��var �첽������ = new XMLHttpRequest();

     - ȫ��ˢ����ͬ����Ϊ���ֲ�ˢ�����첽��Ϊ��

     - �첽�������ں�̨��������������ݣ�

     - responseText()������ȡ��Ӧ����;


4. ������ʹ��XML�ļ��������ݴ��䣨�ֽ׶�ʹ��json�滻��xml����

5. �첽�����ʹ��

     - �����첽����

     - ���첽������¼���onreadstatechange���첽�����ȡ����ʱ���ᴥ�����¼�����

     - onreadstatechange�¼�����������

     - �첽������readstate���Ե����״ֵ̬
       - �����첽����ʱΪ0��
       - ��ʼ�첽����ʱΪ1��
       - �������󷽷�ʱΪ2��
       - �ӷ������˻�ȡ����ʱΪ3��
       - �첽����ѽ��յ����ݴ�����ɺ�Ϊ4��
       - һ��ʹ��4״̬ʱ�����ݣ����µ�ǰҳ�棬ˢ�����ݣ���


  - �첽������status���Ա�ʾ���������״̬��
    - ��status����==200ʱ���������ǳɹ��ģ�


  - �첽����ĳ�ʼ��
    - �첽�����е�open������ʽ�����������˷��ʵ�ַ����ͬ��|�첽����Ĭ��Ϊtrue����������
  - ʹ���첽����������send����������
    - ʹ���첽�����responseText��������ȡ�������˷��ص����ݣ�	

  ```jsp
  <script type="text/javascript">
      //�����첽����
  	var xmlHttp = new xmlHttpRequest();
      //���¼�
      xmlHttp.onreadystatechange = function(){
          if(xmlHttp.readState = 4 and xmlHttp.status = 200){
              //��ȡ������Ӧ���ݣ�
              var data = xmlHttp.responseText;
              //�ֲ�ˢ���ı�����Ϊdata��
              document.getElementById(����¶���id).inertext = data��
          }
      }
      //��ʼ���������
      var �������� = document.getElementById(����id)��
      //ƴ���������������
      var msg = ƴ��"�������˷��ʵ�ַ��name=value&name=value";
      xmlHttp.open("get(����ʽ)", "msg(ʹ�÷������˷��ʵ�ַ��name=value&name=value��������)", true(ͬ��|�첽����Ĭ��Ϊtrue��));
      //��������
      xmlHttp.send();
  </script>
  ```

6. json����

   - ���ࣺjson��������:ֵ�ķ�ʽ����json���ݣ�json�������飩��

   - json��ʽ���ݵ�����

     - ��ʽ������⣻
     - ���������ж����ڴ���
     - ռ�ÿռ�С������飻

   - jacksion jason���߿�

     - ObjectMapper����

       - writeValueAsString(java����)��������java����ת��Ϊjason��ʽ���ַ���������Ϊ���ƣ�ֵΪ����ֵ����

     - ������Ӧ��ʽreponse.setContentType("application/json:charset=utf-8");

     - jsp����json����

       - ��json��ʽ���ַ���ת��Ϊjson����

       ```jsp
       <script type="text/javascript">
           //�����첽����
       	var xmlHttp = new xmlHttpRequest();
           //���¼�
           xmlHttp.onreadystatechange = function(){
               if(xmlHttp.readState = 4 and xmlHttp.status = 200){
                   //��ȡ������Ӧ���ݣ�
                   var data = xmlHttp.responseText;
                   //bajson�ַ���ת��Ϊjason����
                   var jsonobj = eval("(" + data + ")");
                   //�ֲ�ˢ�����ݣ�
                   document.getElementById(����¶���id).value = jsonObj.��������
               }
           }
           //��ʼ���������
           var �������� = document.getElementById(����id)��
           //ƴ���������������
           var msg = ƴ��"�������˷��ʵ�ַ��name=value&name=value";
           xmlHttp.open("get(����ʽ)", "msg(ʹ�÷������˷��ʵ�ַ��name=value&name=value��������)", true(ͬ��|�첽����Ĭ��Ϊtrue Ϊ�첽��Ϊ��));
           //��������
           xmlHttp.send();
       </script>
       ```

   - �첽��ͬ��������

     - �첽��Ϊ��ʾ��������󣬲��õȴ����ݴ�����ϾͿ���ִ����������������ͬʱ�������첽���󣩣�
     - ͬ����Ϊ��ʾ�����������Ҫ�ȴ����ݴ�����ϲ�ִ������������ͬһʱ��ֻ�ܴ���һ�����󣩣�

### ��. JQuery(�Ż�jsҳ�洦��dom,��װjavaScript��ط���)

1.  JQuery��һ��js���ⲿ�⣨�ŵ���js�����⣩��

2.  ����

   - �����٣�
   - �����������
   - ��Դ�������������

3.  dom����js���󣩺�jquery����

   - ʹ��Javascript�﷨�����Ķ������dom����

   ```jsp
   var obj = document��getElementById��"����id"��
   ```

   - ʹ��jquery�﷨��ʾ�Ķ������jquery����
   - dom������jquery�����໥ת����
     - dom����ת��Ϊjquery�����﷨Ϊ${dom����}
     - jquery����ת��Ϊdom�����﷨Ϊ
       - �������л�ȡ��һ�����󣬾���dom����
     - ��������jquery����һ����$��ͷ��

4.  ѡ�������ַ�����

   - ������λdom����ͨ���÷�����jquery������в�����

   - ����ѡ����

     - idѡ������ʹ��dom�����id����λdom����
     - classѡ������ʹ����ʽ����������λdoom����
     - ��ǩѡ������ʹ�ñ�ǩ��������λdoom����
     - ���ѡ���������Զ��Ԫ�����ѡ��

     ```jsp
     <script>  
     	<!%--idѡ����--%>
         $("#dom�����idֵ")
         <!%--classѡ����--%>
         $(".dom�����classֵ")
         <!%--��ǩѡ����--%>
         $("��ǩ����")
         <!%--ѡ��ȫ����Ԫ��--%>
         $("*")
     </script>  	
     ```

   - ��ѡ����

     - ʹ��input��ǩ�е�type����ֵ������doom�Ķ�λ
     - ѡ���������ʱ��jquery����Ϊ���飻
     - ʹ��ѭ�����б�����
     - ����ʹ��jquery����.value�ķ�ʽ��ȡvalueֵ��

     ```jsp
     <script>
         <!%--��ѡ����--%>
         $("��type����ֵ")
     </script>  
     ```

5.  ������

   - �������Ƕ�ѡ��Ķ���ɸѡ��

   - ������ɸѡ˳���ǰ��ն���Ķ���˳����й��ˣ�

   - �����������ѡ����һ��ʹ�ã�

   - ����������

     - �����������׸�����
     - �������������һ������
     - ѡ��������С��ָ��������dom����
     - ѡ�������д���ָ��������dom����
     - ��ȡָ���±��dom����l

     ```jsp
     <script>
         <!%--�����������׸�����--%>
         $("ѡ������frist")
         <!%--�������������һ������--%>
         $("ѡ������last")
         <!%--ѡ��������С��ָ��������dom����--%>
         $("ѡ������lt(��������)")
         <!%--ѡ�������д���ָ��������dom����--%>
         $("ѡ������gt(��������)")  
         <!%--��ȡָ���±��dom����--%>
         $("ѡ������eq(��������)")  
     </script>  
     ```

   - �����Թ�����

     - ���ݱ���dom��״̬�����λdoom����
       - enabled״̬��ѡ�е�
       - disabled״̬�������õ�
       - checked״̬����ѡ��ѡ�еģ�
       - select״̬�������б���ѡ�е�Ԫ�أ�
     - ֻ�ҵ�����״̬������dom����

     ```jsp
     <script>
         <!%--ѡ����õ��ı���--%>
         $(text:enabled)
         <!%--ѡ�񲻿��õ��ı���--%>
         $(text:disabled)
         <!%--ѡ��ѡ��ѡ�е�����--%>
         $(checkbox:checked)
         <!%--ѡ�������б���ѡ�е�Ԫ��--%>
         $(ѡ����>option:selected)
     </script> 
     ```

6.  Jquery�и�dom������¼�

   - $(ѡ����)���ж���¼�����ȫ�����󶨣�
   - on�ķ�ʽ���¼�;
     - ʵ�ֶ�̬���¼�����

   - �¼����ƣ�����js���¼�ȥ��on�Ĳ��֣���click��
   - �¼��Ĵ�����������һ��function���¼�����ʱִ�иú��������ݣ�

   ```jsp
   <script>
       <!%--���¼�--%>
       $(ѡ����).�¼����ƣ��¼���������
       <!%--���¼�--%>
       $(ѡ����).on���¼������¼���������
   </script> 
   ```

7.  ����

   - $(ѡ����).val()���޲���ʽ����ȡ��һ��dom����ֵ��
   - $(ѡ����).val(ֵ)���в���ʽ��������������dom����ͳһֵ��
   - $(ѡ����).text()���޲���ʽ����ȡ����������dom������ʾ���ݣ�Ȼ��ƴ��Ϊһ���ַ��������
   - $(ѡ����).text(ֵ)���в���ʽ��������������dom�������ʾ���ݸ�ͳһֵ��
   - $(ѡ����).attr(������)����ȡ��һ��dom���������ֵ��
   - $(ѡ����).attr(��������ֵ)��������������dom�������������Ϊͳһ��ֵ��
   - $(ѡ����).remove()��������������dom�������Ӷ���ȫ��ɾ����
   - $(ѡ����).empty()��������������dom������Ӷ���ɾ����
   - $(ѡ����).append()��Ϊ����dom��������Ӷ���
   - $(ѡ����).html()����ȡDom�����е�һ��Ԫ�ص��ı�ֵ������
   - $(ѡ����).html(ֵ)���в���ʽ��������������dom����ͳһֵ��
   - each������ѭ��������ÿ����Ա�������һ�δ�������
     - $.each(��Ҫ�����Ķ���, function(index,element){�������})����ȡDom�����е�һ��Ԫ�ص��ı�ֵ������
     - JQuery����.each( function(index,element){�������})��
     - indexΪ�����±꣬elementΪ����Ķ���

8.  ʹ��Jquery���ajax��

   - Jquery����ajax����Ĵ�����̣�

   - ʵ�ֹ���������������

      - $.ajax():���ĺ�����
      - $.post():ʹ��post��ʽ����ajax����
      - $.get():ʹ��get��ʽ����ajax����
      - $.post()��$.get()�ڲ����ǵ���$.ajax()��

   - $.ajax()���ĺ�����ʹ�ã�

      - $.ajax()�����Ĳ�����һ��json�Ľṹ��

      - json�ṹ�Ĳ���˵��

         - {���ƣ�ֵ�����ƣ�ֵ.....}
         - async��boolean���͵�ֵ����ʾ�Ƿ�Ϊ�첽���󣨿��Բ�д�������Ĭ��Ϊtrue����
         - contentType:�ַ�����ʽ����ʾ����������ͷ������Ĳ��������ͣ����Բ�д��
         - data���������ַ��������飬json����ʾ�������ֵ��ͨ��Ϊjson��ʽ���ݣ�
         - dataType����ʾ�ӷ������˷��ص����ݸ�ʽ����ѡ���У�xml, html, text,json;
         - error:һ����������ʾ����������ʱִ�еĺ�����
         - sucess��һ��������function��data��data��ʾ�������˷��ص����ݣ���ʾ����ɹ�ʱִ�еĺ�����
         - url������ĵ�ַ��
         - type������ķ�ʽ��Ĭ��get����3
         - ��Ҫʹ��url��data��dataType��sucess��

         ```jsp
         <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
         <%--����Bmi���㺯��--%>
         <script type="text/javascript">
             <%--��ں�������ҳ�������ɺ�ִ�У���onload�¼�һ��
             	��Jquery���к�����д�ڸ�������
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

   - $.get() �﷨����$.get(url��data��dataType��sucess)

      - ֱ��д������ֵ��
      - ����˳���ǹ̶��ģ�

   - $.post() �﷨����$.post(url��data��dataType��sucess)

      - ֱ��д������ֵ��
      - ����˳���ǹ̶��ģ�


# �ڶ���. web���

### һ. Servlet���������̣߳�

1. ϵͳ�ܹ�

  * C/S�ܹ�

  	- Client/Server���ͻ���/����������
  	- �ص㣺��Ҫ��װ�ض��Ŀͻ��������

  * B/S�ܹ�

  	- Browser/Server�������/����������
  	- B/S��һ�������C/Sϵͳ��
  	- ͨ��ԭ��
  		
  		* �����������Ὣ����������һ�������ip��ַ�˿ںŵȵȣ�
  		* ip��ַ��������������е����֤�ţ�
  		* �˿ںţ�����һ�������Ψһ�ԣ���
  		* ��Դ��
  	
  	- web ���������
  	
  		* Tomcat��WEB����������jetty��WEB����������JBOSS��Ӧ�÷���������WebLogic��Ӧ�÷���������WebSphere��Ӧ�÷�������
  		* Ӧ�÷�����ʵ����javaEE���й淶��
  		* WEB������ʵ����javaWeb��Servlet+JSP�������Ĺ淶��

2. �����ռ�

  * request�������򣩣��������ڵ�������
  * HttpSession���Ự�򣩣��������������Ự��Χ��
  * servletContext��application��Ӧ���򣩣�������������Ӧ�÷�Χ��

3. Servletִ��ԭ��

  * ����map��key��ΪURL-patern Value��ΪServlet�����ã�
  * ���д洢��ʵ����Servlet�����Ϊmap1��
  * ���д洢δ��ʵ����Servlet�����Ϊmap2��
  * �ڳ������������Servletʱ���ȴ�map1��Ѱ�ң�
  * δ�ҵ��ٵ�map2Ѱ�ң��ҵ��������÷������ʵ����Servlet�������Map1�У�

4. ����Servlet��webapp

  * ��webappĿ¼���½�crmĿ¼��webapp�����֣���Ŀ¼����
  * ��webapp�ĸ�Ŀ¼���½�WEB-INFĿ¼��Servlet�涨�ģ�����һģһ������
  * ��WEB-INFĿ¼���½�һ��classesĿ¼��Servlet�涨�ģ�����һģһ������
  * ��WEB-INFĿ¼���½�һ��libĿ¼�����Ǳ���ģ�������ŵ�����jar����Servlet�涨�ģ�����һģһ������
  * ��WEB-INFĿ¼���½�һ��web.xml�ļ���webapp�����ļ�����
  * ��дjava���򣨱���ʵ��Servlet�ӿڣ���

  	- Servlet�ӿڲ���JDK�У�
  	- servlet�ӿ�����Oracle�ṩ�ģ�
  	- ʵ����Servlet�������д��ڸýӿڣ�

  * �ڱ���֮ǰ��Ҫ����classpath����������
  * ��дweb.xml�ļ�����������·�����롱Servlet������������һ��ע��Servlet����
  * ����Tomcat��������
  * ������ϵ�����·��������web.xml�ļ��е�Url-pattern����һ�£�
  * ����ʹ�ó����ӽ��з��ʣ�

5. ʹ�ü��ɿ������߿���Servlet

  * �����չ��̣�
  * �½�ģ�飨java SE����
  * ��ģ����javaEE�����Webappģ��֧�֣�

  	- ע�⣺��IDEA����webĿ¼����webapp�ĸ���

  * ��дServlet��

  	- ��Servlet-api.jar��jsp-api.jar��ӿ��е���������Ŀ�У�

  * ��Servletʵ�����б�дservice�����б�д���룻
  * ����Ҫ�ⲿjar����JDBC�ȣ�����Web-INFĿ¼�µ�libĿ¼�У�
  * ��web.xml�ļ������ʵ�����ע�ᣨ����·����Servlet֮���Ӧ��������
  * ʹ��IDEA���������ȥ����Tomcat������
  * ��debug��ģʽ����Tomcat

6. Servlet�������������

  * Servlet����Ĵ����������ĵ��ã��������յ����ٶ����ɷ�����ȫȨ����ģ�
  * Tomcat������ͨ���ֱ���Ϊ��web������
  * Web������ͨ�����ϣ�Hashmap�����洢�������Servlet�����Լ������Ķ�����web�����ܿأ�
  * Servlet�н�����load-on-startup������������ԽС���ȼ�Խ�ߣ�����������������ʱ����Servlet����
  * �û���һ�η�������ʱ����Servlet����
  * �������ִ��init������Ȼ�����Service������
  * �û���֮��������ֻ����service������

  	- Servlet�����ǵ�ʵ��ģʽ��
  	- �޲ι��췽����init����ֻ���ڵ�һ�η�������ʱ�ŵ��ã�
  	- ����ֻ�����Service������

  * Servletֻ����Tomcat�������ر�ʱ����destroy��������Servlet����

7. Servlet�ӿ��еķ���

  * �޲ι��췽����������д��������init���������ó�ʼ��������ִֻ��һ�Σ�
  * void init():��ʼ��������ֻ�е�һ�η�������ʱ�ŵ��ø÷�����ִֻ��һ�Σ�
  * void service():�����û�����ĺ��ķ�����ÿ�η�������ʱ����ִ�и÷�����
  * void destroy():web����ֻ�������ٶ���֮ǰִ�и÷�������ִ��֮�������ͻ����ٶ���ִֻ��һ�Σ� 

8. ServletConfig�ӿڣ�Servlet���ò�����

  * Servlet�淶�е�һԱ��
  * ServletConfig�����װ��Web.xml��Serlet��ǩ�е���Ϣ��
  * web����ʵ����ServletConfig�ӿڣ�
  * ServletConfig�����Ӧһ��Servlet����
  * web��������ServletConfig����
  * �ڴ���Servlet����ʱͬʱ����ServletConfig����
  * ������

    - String getInitParameter(name):ͨ����ʼ�����������ƻ�ȡServlet��ʼ����Ϣ��
    - Enumeration<String> getInitParameternames():��ȡServlet��ʼ����Ϣ���������ƣ�
    - getServletContext()����ȡServletContext����
    - getServletName()����ȡServlet�������֣�

9. ServletContext�ӿ�(Ӧ����)

   - Servlet�淶�е�һԱ��
   - Servlet����������������Ķ���(�����Ӧ��������web.xml)��
   - ����ServletContext�е�����������Servlet������ģ�
   - web����ʵ����ServletContext�ӿڣ�
   - web��������ServletContext����
   - ��webapp����ʱ������
   - ��webapp�ر�ʱ���٣�
   - һ��webapp��Ӧһ��ServletContext����
   - ͨ��ServletConfig�����getServletContext������ȡ�ö���
   - ͨ��GenericServlet�����getServletContext������ȡ�ö���
   - ����ServletContext�е������ص㣺�����û��������ٱ��޸������������٣�
   - ������

     - String getInitParameter(name):ͨ��Context��ʼ����Ϣ�����ƻ�ȡContext��ʼ����Ϣ��ȫ��������Ϣ����
     - Enumeration<String> getInitParameternames():��ȡContext��ʼ����Ϣ���������ƣ�
     - String getContextPath():��ȡӦ�õĸ�·������̬��ȡӦ�õĸ�·������
     - String getRealPath(String path):��ȡ�ļ��ľ���·����pathĬ�����Ϊ��Ŀ¼��/����Ϊ�ָ�����
     - void log��String message������¼��־��
     - void log��String message��Throwable t������¼��־���쳣����¼��CatalinaĿ¼�µ�logsĿ¼�µ�Localhost.log�ļ��£���
     - void setAttribute��String name, Object value��:��ServletContext�д洢���ݣ�
     - Object getAttribute��String name��:��ȡervletContext�д洢�����ݣ�
     - void removeAttribute��String name��:ɾ��ervletContext�д洢�����ݣ�

10. ���������ģʽ��GenericServlet��

    - Ҳ����Servlet�淶��
      * ���ó�������Ϊ�м��������������
      * ������Ҫ����ʹ�õķ�������Ϊ���󷽷����������ʵ�֣�
      * web�����ṩ��GenericServlet��������Ҳʵ����ServletConfig�ӿڣ���
      * ��������Ƴ�ʼ����ʱӦ����дinit()������
      * ����

      	- getServletName()����ȡServlet�������֣�
      	- log������¼��־��
      	- getServletContext()����ȡServletContext����
      	- getServletConfig()����ȡServletConfig����
      	- String getInitParameter(name):ͨ����ʼ�����������ƻ�ȡServlet��ʼ����Ϣ������������Ϣ����
      	- Enumeration<String> getInitParameternames():��ȡServlet��ʼ����Ϣ���������ƣ�
      	

    - HttpServlet������

    	* �̳�GenericServlet�ࣻ
    	* ר��ΪHttpЭ����Ƶ�Servlet�ࣻ
    	* Servlet/http���е��ࣻ
    		
    		- HttpServlet�����ࣻ
    		- HttpServletRequest�ࣻ
    			
    			* ��װ������Э��ȫ�����ݣ�
    			
    		- HttpServletResponse�ࣻ
    		
    			* ר��������ӦHTTPЭ�鵽������ϵģ�
    		
    	* void Service��HttpServletRequest request�� HttpServletRespond respond����������HttpЭ���service�������ж�����ʽ�����ͣ������������ʽִ����Ӧ��������
    	* void Service��ServletRequest request�� ServletRespond respond������дServlet���е�service����������������HttpЭ���service������
    	* void do����ʽ��ServletRequest request�� ServletRespond respond������������д�ķǺ��ķ�������Ҫǰ�˷����ĸ�����ʽ��д��Ӧ�ķ�������

11. ģ�巽�����ģʽ

   * ���ģʽ��

   	- ĳ������Ĺ̶��Ľ������
   	- GoF���ģʽ��
   	
   		* 23�����ģʽ�������ͣ��ṹ�ͣ���Ϊ�ͣ���
   		
   	- javaEE���ģʽ
   	
   		* DAO
   		* DTO

   * ģ�巽�����ģʽ��ģ�����ģ�巽���ж�������㷨�ɼۣ����岽������ӳٵ����൱����ɣ�
   * ģ����ͨ����һ�������࣬ģ�巽����������㷨���������ͨ����final�ģ�
   * ģ���൱�в�ȷ����ôʵ�ֵķ�������Ϊ���󷽷���

   - Webapp��ӭҳ��

     * �ڸ�Ŀ¼�����û�ӭҳ�棨����ʹ��html����̬ҳ�棩��Servlet����̬ҳ�棩���ļ��� 
     * �������ļ�������Welcome-file-list������welcome-fileѡ��ļ�Ĭ�ϴӸ�Ŀ¼�½��в��ң���
     * ���������ֱ�ӷ���Webapp��Ŀʱֱ����ת��ӭҳ��
     * �������ö����ӭҳ�������������β��ң�
     * �ֲ����ã���webapp��Ŀ¼�����õĻ�ӭҳ�棻
     * ȫ�����ã���CATALINA_HOMe/conf/web.xml�����õĻ�ӭҳ�棻
     * ���Ⱦֲ�����ȫ�֣�

   - WEB-INFĿ¼�µ���Դ���ܱ����ģ�����ͨ��·���ķ�ʽȥ���ʣ�
   - request��response������������Ϊһ������
   - HttpServletRequest�ӿڣ����������

     * ��Servlet�淶��һԱ��
     * ��װ��Http������Э�飻
     * ���÷���

     	- String getParameter��String name������ȡValue���һά�����еĵ�һ��Ԫ�أ�
     	- Map<String,String[]> getParameterMap():��ȡMap��
     	- Enumeration<> getParamenterNames():��ȡMap���������е�Key��
     	- String[] getParamenterValues(name):����Kry��ȡȫmap���ϵ�Values��
     	- Session getSession(boolean x):����Ҫ��Session����洢����xΪtrue�����ڼ���Sessionʹ�ü��еģ������ڼ��е��½��������޲ι��죻ȡ����xΪfalse��ֻ�ܻ�ȡ������Sessionʹ�ü��еģ������½�Session���󣩣�
     	
     	- void setAttribute��String name, Object value��:���������д洢���ݣ�
     	- Object getAttribute��String name��:��ȡ�������д洢�����ݣ�
     	- void removeAttribute��String name��:ɾ���������д洢�����ݣ�
     	
     	- String getRemoteAddr��������ȡ�ͻ��˵�Ip��ַ��
     	- void setCharacterEncoding(String Type)��������������ַ�����ֻ�ܴ���Post������������⣩
     	- String getContextPath��������̬��ȡӦ�õĸ�·����
     	- String getMethod��������ȡ����ʽ��
     	- String getRequestURI��������ȡ�����URI��
     	- String getServletPath��������ȡServlet·����
     	- Cookie[] getCookies():��ȡ����������cookie��
     	- Session getSession()
     	
     		* ��ȡ�뵱ǰ������ص�Session��û�оʹ�����Session��
     		* ��Session�洢������ʹ�ø÷�����
     		
     	- Session getSession(boolean create):
     	
     		* ��ȡ�뵱ǰ������ص�Session��û�еĻ���ʵ��Ϊtrue������Session��false�������µģ�
     		* ��Sessionȡ������ʱʹ�ô�false�ĸ÷�����
     		* ����ж�session�Ƿ�Ϊ�պ��ٽ���������ȡ������
     		
     	- ServletInputStream getInputStream��������ȡmultipart/form-data�������������ʹ������Ҫ�رգ���

   - ʹ������ת�������ڲ�ͬServlet����֮�䴫������Ҳ����ת����Html�ļ��У�

     * ��ȡ����ת��������
     	
     	- request�еķ�����ResquestDispather getRequestDispather(String path);
     	- ����Ҫת��request�����Servlet�����·��path��װ������ת�����У�
     	
     * ����ResquestDispather�����е� void forword��request req�� respond red��

   - HttpResponse�ӿ�

     * ���÷�����

     	- Writer getWriter��������ȡ�������������������
     	- void setContentType��String type��text/html;charset = UTF-8��������������Ӧ�����������Լ��ַ�����
     	- void SendRedirect��String ����Ŀ���ĵ�ַ������·����Ӧ���ض����ķ��ʶ���
     	- String encodeRedirectURL(String uri):�ر����ض���·����ʹ֮����JSessionID�������ֹcookie���ض�����Session�ĻỰ�������⣻
     	- String encodeURL(String uri):�ر��볬����·����ʹ֮����JSessionID�������ֹcookie����ض�����תҳ�淽ʽ��Session�ĻỰ�������⣻

   - ת�����ض���

     * �����������Դ����ת��
     * ����
     	
     	- ת����һ������
     	
     		* ���룺request�еķ���RequestDispather getRequestDispather(String path);
     		* ����ת�����ٴζ���ͬһ������
     		* ��ʽ�����������֮���ַ���ϵĵ�ַ���䣻
     		* ת������web�������Ƶģ�
     		* ֻ����Servlet�а�������ʱ��ʹ��ת����
     		* RequestDispather���з���
     			
     			- forward��response��request����ʾֱ��ת�����󣬵�ǰ�����ܿ�����׼�������
     			- include��response��request����ʾ��ת�������������ǰServlet�У���ǰ�����ܹ�������׼�������
     	
     	- �ض���
     	
     		* ���룺Response �еķ�����Redirect SendRedirect��String ����Ŀ���ĵ�ַ����
     		* �ض���һ�����·���һ��������
     		* ��ʽ����ÿ���ض���֮���ַ���ϵĵ�ַ����ı䣻
     		* �ض�������web��������Ƶģ�
     		* ����������Ҫ�������ʹ���ض���
     		* �����ض����κκϷ��ļ�֮�У�

   - ��������Lisener��

     * ���������ģʽʱ�۲������ģʽ�е�һ�֣�
     * �۲������ģʽ��

     	- һ���۲����������۲���֮�佨���ġ�һ�Զ�Ĺ۲��뱻�۲��ϵ����
     	- �۲����뱻�۲���ָ�Ķ��Ǿ���ĳһ�๦�ܵ��ࣻ
     	
     * ���������ģʽ
     	
     	- �������߶���������߷��͵�Ϊ�ࣨ�¼�����
     	- ����������Ϊ�¼�Դ��
     	- �Լ�������֪ͨ��Ϊ������������
     	
     * һ���ܴ��¼������л�ȡ�¼�Դ����
     * ʹ��Servlet�Դ��İ˸�������֮ǰ��Ҫ��web.xml�ļ��н���ע��
     	
     	- <listener><listener-class>��������ʵ����</listener-class></listener>
     	
     * ServletRequestListener�ӿ�

     	- ��������			
     	- ����
     		
     		* void requestInitialized��ServletRequestEvent sre����������ʱ������
     		* void requestDestroyed��ServletRequestEvent sre������������ʱ������
     	
     * ServletRequestAttributeListener�ӿ�

     	- ����request�����Բ�����
     	- ����
     		
     		* void attributeAdded��ServletRequestAttributeEvent sre��������request�����������ʱ������
     		* void attributeRmoved��ServletRequestAttributeEvent sre����ɾ��request���е�����ʱ������
     		* void attributeReplaced��ServletRequestAttributeEvent sre��������request���е�����ʱ������
     		
     	- ServletRequestAttributeEvent����
     		
     		* ���Ի�ȡ֮ǰrequest�д洢�����ݣ�
     	
     * HttpSessionListener�ӿ�
     	
     	- ����Session�еĴ��������٣�
     	- ����	
     		
     		* void requestCreated��HttpSession sre����Session������ʱ������
     		* void requestDestroyed��HttpSession sre����Session������ʱ������
     	
     * HttpSessionAttributeListener�ӿ�

     	- ����request�����Բ�����
     	- ����
     		
     		* void attributeAdded��HttpSessionAttributeEvent sre��������HttpSession�����������ʱ������
     		* void attributeRmoved��HttpSessionAttributeEvent sre����ɾ��HttpSession���е�����ʱ������
     		* void attributeReplaced��HttpSessionAttributeEvent sre��������HttpSession���е�����ʱ������
     		
     	- HttpSessionAttributeEvent����
     		
     		* ���Ի�ȡ֮ǰHttpSession�д洢�����ݣ�

     * ServletContextListener�ӿ�

     	- ����ServletContext���������٣�			
     	- ����
     		
     		* void ContextInitialized��ServletContextEvent sre����������ʱ������
     		* void ContextDestroyed��ServletContextEvent sre������������ʱ������
     	
     * ServletContextAttributeListener�ӿ�

     	- ����request�����Բ�����
     	- ����
     		
     		* void attributeAdded��ServletContextAttributeEvent sre��������request�����������ʱ������
     		* void attributeRmoved��ServletContextAttributeEvent sre����ɾ��request���е�����ʱ������
     		* void attributeReplaced��ServletContextAttributeEvent sre��������request���е�����ʱ������
     		
     	- ServletContextAttributeEvent����
     		
     		* ���Ի�ȡ֮ǰContext�д洢�����ݣ�
     	
     * HttpSessionBindingListener�ӿ� 

     	- ʵ����ʵ�ָýӿڣ�
     	- ������ǰʵ����Ķ�����Session�İ�����
     	- �ü���������Ҫע�᣻
     	- ����
     		
     		* void valueBound��HttpSessionBindingEvent sre������ǰ������HttpSession��ʱ����������Session��Ӹ���ʱ������
     		* void valueUnbound��HttpSessionBindingEvent sre������ǰ������HttpSession���ʱ����������Sessionɾ������ʱ������
     	
     * HttpSessionActivationListener�ӿ� 

     	- ʵ����ʵ�ָýӿ�ͬʱ����Ҫʵ�����л��ӿڣ�
     	- ����Session�е�ǰʵ����Ķۻ����洢��Ӳ�̣����������ݴ�Ӳ�̴洢��Session�У���
     	- �ü���������Ҫע�᣻
     	- ����
     		
     		* void sessionDidActivate��HttpSessionEvent sre������ǰ����ʱ�����÷������������ݴ�Ӳ�̴洢��Session�У���
     		* void sessionWillPassivate��HttpSessionEvent sre������ǰ���󽫱��ۻ�ʱ�����÷������洢��Ӳ�̣���

   - ��������Fliter�ӿڣ�

     * Fliter�������ڣ�ʵ������Ӧ������ʱ������-> ��ʼ����Ӧ������ʱ��ʼ���� -> doFliter()��ÿ�η������󶼻�ִ�и÷���������һ��ִ��һ�Σ� -> ���٣���Ӧ�ñ�ֹͣʱ���٣���

     * Filter�����ǵ������̵߳ģ�

     * ��Fliter�ӿڵ�ʵ��������дdoFliter����������

     * Ϊ�����̰߳�ȫ���⣬һ�㲻��ΪFilter��ӿ���ӳ�Ա������ 

     * ע��Fliter��web-app.xml��
     	
     	- ��Servletע�����ƣ�����servlet��ǩ����filter��ǩ��
     	- <url-pattern>��ǩ֮��ƥ�������Ҫ������Դ��·���� /*��ʾȫ·�����أ���
     	- �ڲ�ʹ��<url-pattern>��ǩʱ����ʹ��<servlet-name>��������ָ��servlet��
     	- <dispatcher>��ǩ
     		
     		* ֵΪForwardʱ��ֻ����ת����ʽΪforwardʱ������
     		* ֵΪincludeʱ��ֻ����ת����ʽΪincludeʱ������
     		* ֵΪrequestʱ��ֻ������ͨ����Ҳ��Ĭ��ȡֵ����
     		* ֵΪerrorʱ������ת��ָ���Ĵ���ҳ��ʱ����ʾ��ǰ����ᱻ���أ�				
     	
     * ����ӿͻ��˷��͵�������֮ǰ���Ⱦ�����������Filter����

     * ͨ��FiltererChain���е�void doFilter��Request request��Response response��������������и���һ����Դ��

     * ��Ӧ�ӷ��������͵��ͻ���֮ǰ���Ⱦ�����������Filter����

     * FilterConfig�ӿڣ�Filter������Ϣ��

     	- String getInitParameter(name):ͨ����ʼ�����������ƻ�ȡFliter��ʼ����Ϣ��
     	- Enumeration<String> getInitParameternames():��ȡFliter��ʼ����Ϣ���������ƣ�
     	- getServletContext()����ȡServletContext����
     	- getFilterName()����ȡFliter�������֣�
     	
     * Filter��ִ��˳����ע��˳��һ�£�

     * Filterִ��ԭ��
     	
     	- һ��������һ��map��
     	- map����url-paternΪkey��Filterʵ�����������Ϊvalue�洢���ݵģ�
     	- �����д����������ƥ���ŵ�Filter��
     	- �յ����������map�����в�����ƥ��Ķ��󣬲��ҵ��������÷��������У�Ȼ�����ָ������������map��
     	- ����������˳��ִ����Ӧ��Filter��
     	
     * װ�������ģʽ
     	
     	- �ڲ��޸�Ŀ����Ҳ�����ü̳е�����£���̬����չ�¸���Ĺ��ܣ�
     	- װ������
     	
     		* װ��������Ŀ����ʵ����ͬ�Ľӿڣ�
     		* װ������Ҫ��Ŀ�����������Ϊ��Ա������Ŀ�����ĸ�ֵһ��ͨ�����ι��캯��Ĭ�ϸ�ֵ����
     	
     	-װ���߻���

     		* һ��Ҫ���޲ι��캯����
     		* ��дĿ�꺯�����������κ���ǿ��
     	
     	- ����װ����
     		
     		* Ҫ�̳���װ���߻��ࣻ
     		* Ҫ�д��ι�������
     		* ����װ����ֻ��װ���߻���ҵ�񷽷�����ĳһ�ֵ�һ����ǿ��
     		
     	- ʹ��ʱ����װ����������ʽ����ʹ�ã�
     	
     * �������ģʽ

     	- Ϊ���������ṩ�����Կ��ƶ��������ķ��ʣ�
     	- �ͻ���ͨ�����������ʵ�ֶ�Ŀ����ķ��ʣ�	
     	- �������Ϊ�˱���������Ŀ�����Ӷ�����Ȩ�޿��ƣ�
     	- �������ͬʱҲ������ǿԭ��Ŀ����Ĺ��ܣ�
     	- �����๦�ܣ�ʵ��Ŀ���෽���ĵ����Լ���ǿ���ܣ�
     	- ��̬������
     		
     		* ���������Լ��ֹ�ʵ�ֵģ�ͬʱ�����Ŀ����ȷ�ϵģ�
     		* ��̬��������Ŀ����ʵ����ͬ�Ľӿڣ�
     		* ��̬������Ҫ��Ŀ�����������Ϊ��Ա������Ŀ�����ĸ�ֵһ��ͨ���޲ι��캯��Ĭ�ϸ�ֵ����
     		* �ŵ㣺������⣬�򵥣�
     		* ȱ��
     			
     			- �����������������Ŀ�������Ӷ��ɱ����ӣ�
     			- �ӿڱ仯���߹���������֮��Ӱ��ϴ�ά���鷳��
     		
     	- ��̬����
     		
     		* �ڳ���ִ�й���֮�����÷�����ƶ�̬�������������
     		* JDK��̬����
     			
     			- ʹ��java������е���ͽӿ�ʵ�ֶ�̬����Ĺ��ܣ�
     			- java.lang.reflect.InvocationHandler�ӿڣ�
     				
     				* invoke��Object proxy��Method method��Objext[] args������
     					
     					- ��ʾ�������ִ�еĹ��ܷ���������Ŀ�귽����ִ��Ŀ�귽���Ĺ��ܣ�ͬʱ����Ŀ�귽���Ĺ��ܣ���
     					- Object proxy JDK�����Ĵ���������踳ֵ��
     					- Method method��Ŀ�����еķ�����jdk�ṩmethod����
     					- Objext[] args��Ŀ�귽���еĲ�����
     					- ʹ�ã�
     						
     						* �����ӿڵ�ʵ���ࣻ
     						* ��дinvoke����������������Ҫʵ�ֵķ���д�ڸ÷����У�
     				
     			- java.lang.reflect.Method�ࣻ
     			
     				- ��ʾ������ͨ��method����ִ��ĳ��������
     				- ͨ��Method�����ִ��ĳ��Ŀ����ķ�����Object ret = method.invoke��Ŀ������󣬡�����������������
     				
     			- java.lang.reflect.Proxy�ࣻ
     				
     				- ������������
     				- ����������󷽷���Static Object newProxyInstance��ClassLoader classLoader��Class[] interfaces,InvocationHandler h������
     				- ClassLoader classLoader:��������������÷�����ƴ��������getClassLoader����������ȡ����
     				- Class[] interfaces���ӿڣ�ͨ�����䷽ʽ��ȡ��Ŀ�������ʵ�ֵĽӿڣ�
     				- InvocationHandler h������ʵ�ֵ�InvocationHandler��
     				- ���ش������
     			
     		* cglib��code Generation Library����̬����
     			
     			- cglib�ǵ������Ĺ��߿⣬�����������
     			- ԭ���Ǽ̳У�ͨ���̳�Ŀ���࣬�����������࣬������д�����е�ͬ��������
     			
     		* �ŵ�
     		
     			- �������������ܺ��٣�
     			- �޸Ľӿ��еķ�������Ӱ������ࣻ
     			- ʹ�ù���֮�в��ô��������ࣻ
     			- ���Ը���ͬ��Ŀ����ʱ�����������
     	
     * װ�������ģʽ�뾲̬�������ģʽ������

     	- ʹ��Ŀ��
     		
     		* װ�������ģʽ��Ϊ����ǿĿ�����
     		* ��̬�������ģʽ��Ϊ�����غͱ���Ŀ�����
     		
     	- Ŀ������ȡ��ʽ
     		
     		* װ���������ô��ι��������д�����
     		* ��̬�����������޲ι�����ֱ�Ӵ�����
     		
     	- ������ǿʵ���߲�ͬ��
     	
     		* װ�������ģʽ���ڻ��࣬���ڸ�����Ĺ�ϵ��
     		* ��̬�������ģʽ�����ڸ�����Ĺ�ϵ��

     * ���post����������������ʹ�ù��������ã�request.setCharacterEncoding("UTF-8);

     * Ҳ����Servlet�淶��
     	* ���ó�������Ϊ�м��������������
     	* ������Ҫ����ʹ�õķ�������Ϊ���󷽷����������ʵ�֣�
     	* web�����ṩ��GenericServlet��������Ҳʵ����ServletConfig�ӿڣ���
     	* ��������Ƴ�ʼ����ʱӦ����дinit()������
     	* ����
     	
     		- getServletName()����ȡServlet�������֣�
     		- log������¼��־��
     		- getServletContext()����ȡServletContext����
     		- getServletConfig()����ȡServletConfig����
     		- String getInitParameter(name):ͨ����ʼ�����������ƻ�ȡServlet��ʼ����Ϣ������������Ϣ����
     		- Enumeration<String> getInitParameternames():��ȡServlet��ʼ����Ϣ���������ƣ�
     		

     - HttpServlet������

     	* �̳�GenericServlet�ࣻ
     	* ר��ΪHttpЭ����Ƶ�Servlet�ࣻ
     	* Servlet/http���е��ࣻ
     		
     		- HttpServlet�����ࣻ
     		- HttpServletRequest�ࣻ
     			
     			* ��װ������Э��ȫ�����ݣ�
     			
     		- HttpServletResponse�ࣻ
     		
     			* ר��������ӦHTTPЭ�鵽������ϵģ�
     		
     	* void Service��HttpServletRequest request�� HttpServletRespond respond����������HttpЭ���service�������ж�����ʽ�����ͣ������������ʽִ����Ӧ��������
     	* void Service��ServletRequest request�� ServletRespond respond������дServlet���е�service����������������HttpЭ���service������
     	* void do����ʽ��ServletRequest request�� ServletRespond respond������������д�ķǺ��ķ�������Ҫǰ�˷����ĸ�����ʽ��д��Ӧ�ķ�������

     - ģ�巽�����ģʽ

     	* ���ģʽ��
     		
     		- ĳ������Ĺ̶��Ľ������
     		- GoF���ģʽ��
     		
     			* 23�����ģʽ�������ͣ��ṹ�ͣ���Ϊ�ͣ���
     			
     		- javaEE���ģʽ
     		
     			* DAO
     			* DTO
     		
     	* ģ�巽�����ģʽ��ģ�����ģ�巽���ж�������㷨�ɼۣ����岽������ӳٵ����൱����ɣ�
     	* ģ����ͨ����һ�������࣬ģ�巽����������㷨���������ͨ����final�ģ�
     	* ģ���൱�в�ȷ����ôʵ�ֵķ�������Ϊ���󷽷���
     	
     - Webapp��ӭҳ��

     	* �ڸ�Ŀ¼�����û�ӭҳ�棨����ʹ��html����̬ҳ�棩��Servlet����̬ҳ�棩���ļ��� 
     	* �������ļ�������Welcome-file-list������welcome-fileѡ��ļ�Ĭ�ϴӸ�Ŀ¼�½��в��ң���
     	* ���������ֱ�ӷ���Webapp��Ŀʱֱ����ת��ӭҳ��
     	* �������ö����ӭҳ�������������β��ң�
     	* �ֲ����ã���webapp��Ŀ¼�����õĻ�ӭҳ�棻
     	* ȫ�����ã���CATALINA_HOMe/conf/web.xml�����õĻ�ӭҳ�棻
     	* ���Ⱦֲ�����ȫ�֣�
     	
     - WEB-INFĿ¼�µ���Դ���ܱ����ģ�����ͨ��·���ķ�ʽȥ���ʣ�
     - request��response������������Ϊһ������
     - HttpServletRequest�ӿڣ����������

     	* ��Servlet�淶��һԱ��
     	* ��װ��Http������Э�飻
     	* ���÷���
     	
     		- String getParameter��String name������ȡValue���һά�����еĵ�һ��Ԫ�أ�
     		- Map<String,String[]> getParameterMap():��ȡMap��
     		- Enumeration<> getParamenterNames():��ȡMap���������е�Key��
     		- String[] getParamenterValues(name):����Kry��ȡȫmap���ϵ�Values��
     		- Session getSession(boolean x):����Ҫ��Session����洢����xΪtrue�����ڼ���Sessionʹ�ü��еģ������ڼ��е��½��������޲ι��죻ȡ����xΪfalse��ֻ�ܻ�ȡ������Sessionʹ�ü��еģ������½�Session���󣩣�
     		
     		- void setAttribute��String name, Object value��:���������д洢���ݣ�
     		- Object getAttribute��String name��:��ȡ�������д洢�����ݣ�
     		- void removeAttribute��String name��:ɾ���������д洢�����ݣ�
     		
     		- String getRemoteAddr��������ȡ�ͻ��˵�Ip��ַ��
     		- void setCharacterEncoding(String Type)��������������ַ�����ֻ�ܴ���Post������������⣩
     		- String getContextPath��������̬��ȡӦ�õĸ�·����
     		- String getMethod��������ȡ����ʽ��
     		- String getRequestURI��������ȡ�����URI��
     		- String getServletPath��������ȡServlet·����
     		- Cookie[] getCookies():��ȡ����������cookie��
     		- Session getSession()
     		
     			* ��ȡ�뵱ǰ������ص�Session��û�оʹ�����Session��
     			* ��Session�洢������ʹ�ø÷�����
     			
     		- Session getSession(boolean create):
     		
     			* ��ȡ�뵱ǰ������ص�Session��û�еĻ���ʵ��Ϊtrue������Session��false�������µģ�
     			* ��Sessionȡ������ʱʹ�ô�false�ĸ÷�����
     			* ����ж�session�Ƿ�Ϊ�պ��ٽ���������ȡ������
     			
     		- ServletInputStream getInputStream��������ȡmultipart/form-data�������������ʹ������Ҫ�رգ���
     	
     - ʹ������ת�������ڲ�ͬServlet����֮�䴫������Ҳ����ת����Html�ļ��У�

     	* ��ȡ����ת��������
     		
     		- request�еķ�����ResquestDispather getRequestDispather(String path);
     		- ����Ҫת��request�����Servlet�����·��path��װ������ת�����У�
     		
     	* ����ResquestDispather�����е� void forword��request req�� respond red��
     	
     - HttpResponse�ӿ�

     	* ���÷�����
     	
     		- Writer getWriter��������ȡ�������������������
     		- void setContentType��String type��text/html;charset = UTF-8��������������Ӧ�����������Լ��ַ�����
     		- void SendRedirect��String ����Ŀ���ĵ�ַ������·����Ӧ���ض����ķ��ʶ���
     		- String encodeRedirectURL(String uri):�ر����ض���·����ʹ֮����JSessionID�������ֹcookie���ض�����Session�ĻỰ�������⣻
     		- String encodeURL(String uri):�ر��볬����·����ʹ֮����JSessionID�������ֹcookie����ض�����תҳ�淽ʽ��Session�ĻỰ�������⣻
     	
     - ת�����ض���

     	* �����������Դ����ת��
     	* ����
     		
     		- ת����һ������
     		
     			* ���룺request�еķ���RequestDispather getRequestDispather(String path);
     			* ����ת�����ٴζ���ͬһ������
     			* ��ʽ�����������֮���ַ���ϵĵ�ַ���䣻
     			* ת������web�������Ƶģ�
     			* ֻ����Servlet�а�������ʱ��ʹ��ת����
     			* RequestDispather���з���
     				
     				- forward��response��request����ʾֱ��ת�����󣬵�ǰ�����ܿ�����׼�������
     				- include��response��request����ʾ��ת�������������ǰServlet�У���ǰ�����ܹ�������׼�������
     		
     		- �ض���
     		
     			* ���룺Response �еķ�����Redirect SendRedirect��String ����Ŀ���ĵ�ַ����
     			* �ض���һ�����·���һ��������
     			* ��ʽ����ÿ���ض���֮���ַ���ϵĵ�ַ����ı䣻
     			* �ض�������web��������Ƶģ�
     			* ����������Ҫ�������ʹ���ض���
     			* �����ض����κκϷ��ļ�֮�У�
     	
     - ��������Lisener��

     	* ���������ģʽʱ�۲������ģʽ�е�һ�֣�
     	* �۲������ģʽ��
     	
     		- һ���۲����������۲���֮�佨���ġ�һ�Զ�Ĺ۲��뱻�۲��ϵ����
     		- �۲����뱻�۲���ָ�Ķ��Ǿ���ĳһ�๦�ܵ��ࣻ
     		
     	* ���������ģʽ
     		
     		- �������߶���������߷��͵�Ϊ�ࣨ�¼�����
     		- ����������Ϊ�¼�Դ��
     		- �Լ�������֪ͨ��Ϊ������������
     		
     	* һ���ܴ��¼������л�ȡ�¼�Դ����
     	* ʹ��Servlet�Դ��İ˸�������֮ǰ��Ҫ��web.xml�ļ��н���ע��
     		
     		- <listener><listener-class>��������ʵ����</listener-class></listener>
     		
     	* ServletRequestListener�ӿ�
     	
     		- ��������			
     		- ����
     			
     			* void requestInitialized��ServletRequestEvent sre����������ʱ������
     			* void requestDestroyed��ServletRequestEvent sre������������ʱ������
     		
     	* ServletRequestAttributeListener�ӿ�
     	
     		- ����request�����Բ�����
     		- ����
     			
     			* void attributeAdded��ServletRequestAttributeEvent sre��������request�����������ʱ������
     			* void attributeRmoved��ServletRequestAttributeEvent sre����ɾ��request���е�����ʱ������
     			* void attributeReplaced��ServletRequestAttributeEvent sre��������request���е�����ʱ������
     			
     		- ServletRequestAttributeEvent����
     			
     			* ���Ի�ȡ֮ǰrequest�д洢�����ݣ�
     		
     	* HttpSessionListener�ӿ�
     		
     		- ����Session�еĴ��������٣�
     		- ����	
     			
     			* void requestCreated��HttpSession sre����Session������ʱ������
     			* void requestDestroyed��HttpSession sre����Session������ʱ������
     		
     	* HttpSessionAttributeListener�ӿ�
     	
     		- ����request�����Բ�����
     		- ����
     			
     			* void attributeAdded��HttpSessionAttributeEvent sre��������HttpSession�����������ʱ������
     			* void attributeRmoved��HttpSessionAttributeEvent sre����ɾ��HttpSession���е�����ʱ������
     			* void attributeReplaced��HttpSessionAttributeEvent sre��������HttpSession���е�����ʱ������
     			
     		- HttpSessionAttributeEvent����
     			
     			* ���Ի�ȡ֮ǰHttpSession�д洢�����ݣ�
     	
     	* ServletContextListener�ӿ�
     	
     		- ����ServletContext���������٣�			
     		- ����
     			
     			* void ContextInitialized��ServletContextEvent sre����������ʱ������
     			* void ContextDestroyed��ServletContextEvent sre������������ʱ������
     		
     	* ServletContextAttributeListener�ӿ�
     	
     		- ����request�����Բ�����
     		- ����
     			
     			* void attributeAdded��ServletContextAttributeEvent sre��������request�����������ʱ������
     			* void attributeRmoved��ServletContextAttributeEvent sre����ɾ��request���е�����ʱ������
     			* void attributeReplaced��ServletContextAttributeEvent sre��������request���е�����ʱ������
     			
     		- ServletContextAttributeEvent����
     			
     			* ���Ի�ȡ֮ǰContext�д洢�����ݣ�
     		
     	* HttpSessionBindingListener�ӿ� 
     	
     		- ʵ����ʵ�ָýӿڣ�
     		- ������ǰʵ����Ķ�����Session�İ�����
     		- �ü���������Ҫע�᣻
     		- ����
     			
     			* void valueBound��HttpSessionBindingEvent sre������ǰ������HttpSession��ʱ����������Session��Ӹ���ʱ������
     			* void valueUnbound��HttpSessionBindingEvent sre������ǰ������HttpSession���ʱ����������Sessionɾ������ʱ������
     		
     	* HttpSessionActivationListener�ӿ� 
     	
     		- ʵ����ʵ�ָýӿ�ͬʱ����Ҫʵ�����л��ӿڣ�
     		- ����Session�е�ǰʵ����Ķۻ����洢��Ӳ�̣����������ݴ�Ӳ�̴洢��Session�У���
     		- �ü���������Ҫע�᣻
     		- ����
     			
     			* void sessionDidActivate��HttpSessionEvent sre������ǰ����ʱ�����÷������������ݴ�Ӳ�̴洢��Session�У���
     			* void sessionWillPassivate��HttpSessionEvent sre������ǰ���󽫱��ۻ�ʱ�����÷������洢��Ӳ�̣���
     	
     - ��������Fliter�ӿڣ�
     	
     	* Fliter�������ڣ�ʵ������Ӧ������ʱ������-> ��ʼ����Ӧ������ʱ��ʼ���� -> doFliter()��ÿ�η������󶼻�ִ�и÷���������һ��ִ��һ�Σ� -> ���٣���Ӧ�ñ�ֹͣʱ���٣���
     	* Filter�����ǵ������̵߳ģ�
     	* ��Fliter�ӿڵ�ʵ��������дdoFliter����������
     	* Ϊ�����̰߳�ȫ���⣬һ�㲻��ΪFilter��ӿ���ӳ�Ա������ 
     	* ע��Fliter��web-app.xml��
     		
     		- ��Servletע�����ƣ�����servlet��ǩ����filter��ǩ��
     		- <url-pattern>��ǩ֮��ƥ�������Ҫ������Դ��·���� /*��ʾȫ·�����أ���
     		- �ڲ�ʹ��<url-pattern>��ǩʱ����ʹ��<servlet-name>��������ָ��servlet��
     		- <dispatcher>��ǩ
     			
     			* ֵΪForwardʱ��ֻ����ת����ʽΪforwardʱ������
     			* ֵΪincludeʱ��ֻ����ת����ʽΪincludeʱ������
     			* ֵΪrequestʱ��ֻ������ͨ����Ҳ��Ĭ��ȡֵ����
     			* ֵΪerrorʱ������ת��ָ���Ĵ���ҳ��ʱ����ʾ��ǰ����ᱻ���أ�				
     		
     	* ����ӿͻ��˷��͵�������֮ǰ���Ⱦ�����������Filter����
     	* ͨ��FiltererChain���е�void doFilter��Request request��Response response��������������и���һ����Դ��
     	* ��Ӧ�ӷ��������͵��ͻ���֮ǰ���Ⱦ�����������Filter����
     	* FilterConfig�ӿڣ�Filter������Ϣ��

     		- String getInitParameter(name):ͨ����ʼ�����������ƻ�ȡFliter��ʼ����Ϣ��
     		- Enumeration<String> getInitParameternames():��ȡFliter��ʼ����Ϣ���������ƣ�
     		- getServletContext()����ȡServletContext����
     		- getFilterName()����ȡFliter�������֣�
     		
     	* Filter��ִ��˳����ע��˳��һ�£�
     	* Filterִ��ԭ��
     		
     		- һ��������һ��map��
     		- map����url-paternΪkey��Filterʵ�����������Ϊvalue�洢���ݵģ�
     		- �����д����������ƥ���ŵ�Filter��
     		- �յ����������map�����в�����ƥ��Ķ��󣬲��ҵ��������÷��������У�Ȼ�����ָ������������map��
     		- ����������˳��ִ����Ӧ��Filter��
     		
     	* װ�������ģʽ
     		
     		- �ڲ��޸�Ŀ����Ҳ�����ü̳е�����£���̬����չ�¸���Ĺ��ܣ�
     		- װ������
     		
     			* װ��������Ŀ����ʵ����ͬ�Ľӿڣ�
     			* װ������Ҫ��Ŀ�����������Ϊ��Ա������Ŀ�����ĸ�ֵһ��ͨ�����ι��캯��Ĭ�ϸ�ֵ����
     		
     		-װ���߻���

     			* һ��Ҫ���޲ι��캯����
     			* ��дĿ�꺯�����������κ���ǿ��
     		
     		- ����װ����
     			
     			* Ҫ�̳���װ���߻��ࣻ
     			* Ҫ�д��ι�������
     			* ����װ����ֻ��װ���߻���ҵ�񷽷�����ĳһ�ֵ�һ����ǿ��
     			
     		- ʹ��ʱ����װ����������ʽ����ʹ�ã�
     		
     	* �������ģʽ
     	
     		- Ϊ���������ṩ�����Կ��ƶ��������ķ��ʣ�
     		- �ͻ���ͨ�����������ʵ�ֶ�Ŀ����ķ��ʣ�	
     		- �������Ϊ�˱���������Ŀ�����Ӷ�����Ȩ�޿��ƣ�
     		- �������ͬʱҲ������ǿԭ��Ŀ����Ĺ��ܣ�
     		- �����๦�ܣ�ʵ��Ŀ���෽���ĵ����Լ���ǿ���ܣ�
     		- ��̬������
     			
     			* ���������Լ��ֹ�ʵ�ֵģ�ͬʱ�����Ŀ����ȷ�ϵģ�
     			* ��̬��������Ŀ����ʵ����ͬ�Ľӿڣ�
     			* ��̬������Ҫ��Ŀ�����������Ϊ��Ա������Ŀ�����ĸ�ֵһ��ͨ���޲ι��캯��Ĭ�ϸ�ֵ����
     			* �ŵ㣺������⣬�򵥣�
     			* ȱ��
     				
     				- �����������������Ŀ�������Ӷ��ɱ����ӣ�
     				- �ӿڱ仯���߹���������֮��Ӱ��ϴ�ά���鷳��
     			
     		- ��̬����
     			
     			* �ڳ���ִ�й���֮�����÷�����ƶ�̬�������������
     			* JDK��̬����
     				
     				- ʹ��java������е���ͽӿ�ʵ�ֶ�̬����Ĺ��ܣ�
     				- java.lang.reflect.InvocationHandler�ӿڣ�
     					
     					* invoke��Object proxy��Method method��Objext[] args������
     						
     						- ��ʾ�������ִ�еĹ��ܷ���������Ŀ�귽����ִ��Ŀ�귽���Ĺ��ܣ�ͬʱ����Ŀ�귽���Ĺ��ܣ���
     						- Object proxy JDK�����Ĵ���������踳ֵ��
     						- Method method��Ŀ�����еķ�����jdk�ṩmethod����
     						- Objext[] args��Ŀ�귽���еĲ�����
     						- ʹ�ã�
     							
     							* �����ӿڵ�ʵ���ࣻ
     							* ��дinvoke����������������Ҫʵ�ֵķ���д�ڸ÷����У�
     					
     				- java.lang.reflect.Method�ࣻ
     				
     					- ��ʾ������ͨ��method����ִ��ĳ��������
     					- ͨ��Method�����ִ��ĳ��Ŀ����ķ�����Object ret = method.invoke��Ŀ������󣬡�����������������
     					
     				- java.lang.reflect.Proxy�ࣻ
     					
     					- ������������
     					- ����������󷽷���Static Object newProxyInstance��ClassLoader classLoader��Class[] interfaces,InvocationHandler h������
     					- ClassLoader classLoader:��������������÷�����ƴ��������getClassLoader����������ȡ����
     					- Class[] interfaces���ӿڣ�ͨ�����䷽ʽ��ȡ��Ŀ�������ʵ�ֵĽӿڣ�
     					- InvocationHandler h������ʵ�ֵ�InvocationHandler��
     					- ���ش������
     				
     			* cglib��code Generation Library����̬����
     				
     				- cglib�ǵ������Ĺ��߿⣬�����������
     				- ԭ���Ǽ̳У�ͨ���̳�Ŀ���࣬�����������࣬������д�����е�ͬ��������
     				
     			* �ŵ�
     			
     				- �������������ܺ��٣�
     				- �޸Ľӿ��еķ�������Ӱ������ࣻ
     				- ʹ�ù���֮�в��ô��������ࣻ
     				- ���Ը���ͬ��Ŀ����ʱ�����������
     		
     	* װ�������ģʽ�뾲̬�������ģʽ������
     	
     		- ʹ��Ŀ��
     			
     			* װ�������ģʽ��Ϊ����ǿĿ�����
     			* ��̬�������ģʽ��Ϊ�����غͱ���Ŀ�����
     			
     		- Ŀ������ȡ��ʽ
     			
     			* װ���������ô��ι��������д�����
     			* ��̬�����������޲ι�����ֱ�Ӵ�����
     			
     		- ������ǿʵ���߲�ͬ��
     		
     			* װ�������ģʽ���ڻ��࣬���ڸ�����Ĺ�ϵ��
     			* ��̬�������ģʽ�����ڸ�����Ĺ�ϵ��

     	* ���post����������������ʹ�ù��������ã�request.setCharacterEncoding("UTF-8);

   - ?		

	?	

Cookie
	
	- �Ự��������
	- �û����ύ��һ������ʱ���ɷ������˴�����������������ˣ����û�����ͬ������ʱ��cookieһ���ͣ���Դ·����ͬ����
	- javaee�е�cookie����Servlet.http���У�
	- ʹ��response��addCookie������������Ӧ�����cookie��
	- δ���ù���ʱ���cookie�ڻỰ����ʱ�ͻᱻ���٣�
	- Cookie���г��÷���
	
		* void setPath(String path)��������·����
		* void setMaxAge(int time)������cookie����Ч�ڣ�
		* String getName��������ȡcookie���ƣ�
		* String getValue��������ȡcookieֵ��

Session���Ự��������

	- ��Servlet�౻����ʱһ�𴴽���
	- Sessionһ������Դ·���󶨻�����Ŀ��·���󶨣�
	- һ���������Ӧ�Ľ�Ͼ��ǻỰ��
	- Session�����ڷ������ˣ�
	- HttpSession���г��÷���
		
		* void setAttribu te��String name, Object value��:���������д洢���ݣ�
		* Object getAttribute��String name��:��ȡ�������д洢�����ݣ�
		* void removeAttribute��String name��:ɾ���������д洢�����ݣ�
		* void invalidate():ʹSessionʧЧ����Ϊ�գ���
	
	- Session�Ĺ���ԭ��
		
		* �ڴ���Session�󣬷���������request.getSession����ʱ������������ŵ�һ��Map�ṹ��Session�б��У�
		* KeyΪ����32Ϊ�����JSessionID��valueΪSession�����ã�
		* �ڷ�������ʱ������name=JSessionID��Value=Session�����õ���ʽ��װ��cookie�з��͸��������
		* �ٴη�������ʱ��ȡ������Ѱ����Ӧ��Session����cookie��
	
	- Session��ʧЧ
		
		* Ĭ�ϳ�ʱʱ��Ϊ30���ӣ�
		* ����Session��ʱʱ��
			
			- web.xml�ļ�������<seesion-config><seesion-timeout>ʧЧʱ�䣨�Է���Ϊ��λ��</seesion-timeout></seesion-config>
			
	- ֻ��SessionʧЧ��֮��������˻Ự�Ż������

### ��. java sever page��JSP��̬��ҳ������

- JSP�ļ�������servlet������չʾ���ݣ�	

- �������ڵ�һ�η���JSPҳ��ʱ�ὫJSP�ļ�����ΪJAVAԴ�ļ���

- JSPע��<%--ע������--%>��JSPע�Ͳ��ᱻ���뵽javaԴ�ļ��У���

- HTMLע��<!--ע������-->��htmlע�ͻᱻ���뵽javaԴ�ļ��У���

- ����javaƬ�εķ�ʽ

	* java�����
	
		- ��<%java����%>��ʽ���֣�
		- ��java������ʽ������service�����У�
		- ���ֵ�˳����JSP�ļ���һ�£�
		- ��������ӷ���Ȩ�ޣ�
		- ���ܹ����巽����
		- ���ܹ����徲̬����飻
		
	* ��������
		
		- ��<%!java����%>��ʽ���֣�
		- ��java������ʽֱ�ӳ��������У�
		- ������ӷ���Ȩ�ޣ�
		- �ܹ����巽����
		- �ܹ����徲̬����飻

	* ���ʽ��
	
		- ��<%=java����%>��ʽ���֣�
		- β�����ӷֺţ�
		- �����ǽ����������ҳ���ϣ�
	
- ���ö���
	
	* pageContext��
	
		- ���ĸ���Ϊpage��
		- ����ͨ��get����ȡ������˸����ö���
		
	* request
	* session�������ض��򴫵����ݣ�
	* application
	* response
	* config
	* out�� ������������ʾ��ҳ����������
	* page������ǰServlet����
	* exception����ȡ������Ϣ��
	
- JSPָ��
	
	* �﷨����<%@ָ������ ������=����ֵ ������=����ֵ...%>
	* pageָ��
	
		- pageEncoding���ԣ�ָ����ǰҳ����뷽ʽ��Ĭ���ı�����Ϊtext/html��
		- contentType���ԣ�ָ����ǰҳ����뷽ʽ��ͬʱ�����޸��ı����ͣ�
		- import���ԣ�������ʹ�õ��ࣻ
		- errorPage���ԣ�ָ���������ʱ�����ҳ�棨·����ǰ��/����
		- isErrorPage���ԣ�ָ��Ϊtrueʱ�ṹ��һ��exception����ʹ��exception.getMessage�������Ի�ô�����Ϣ��
		- Session���ԣ�ָ������Session�����Ƿ����Ĭ��Ϊtrue��Ĭ�ϣ���false����session�ж�ȡ����ʱʹ�ã�ʱ�����ڣ�
		
	* includeָ��
	
		- ��̬���ࣺ�ļ��İ��������ڷ���������jsp�ļ�֮ǰ��		
		- ��̬�����в�ͬ�ļ��е������ǹ���ģ�
		- file���ԣ�ָ�������ļ�����·����
		- ע�⣺��������Ҫ����ʱ�����ڲ�ͬ�ļ�ʹ�ò�ͬ�ı�������

	* taglibָ��
	
		- ע��El����
		- uri����ָ��tlb�ļ��к�����URI��
		- prefix����ָ����ǩ������
	
- action��JSP������
	
	* ʹ��ϵͳ����ı�ǩ��ȡ��java�����Ĺ��ܣ�
	* �﷨����<jsp���������� ������=����ֵ ������=����ֵ...></jsp����������>����<jsp���������� ������=����ֵ ������=����ֵ.../>��
	* forword����
		
		- forword�����ǽ�ҳ��ֱ��ת����Ŀ��ҳ�棬����ҳ���޷����׼��������������ݣ�
		- ��������������Ŀ��ҳ���������������Ӧ��
		- page���ԣ�ָ��Ŀ��ҳ���ļ���
	
	* includ��������̬���ࣩ
	
		- ��̬���಻����������ھ�̬�붯̬���������ʹ��ʱ����ʹ�þ�̬������Լ����ڴ������Լ�����ִ��Ч�ʣ�
		- include�����ǽ�Ŀ��ҳ�����ݰ�������ǰҳ�棬����ҳ��������׼��������������ݣ�
		- �������������ɵ�ǰҳ���������������Ӧ��
		- page���ԣ�ָ��Ŀ��ҳ���ļ���
	
- EL���ʽ
	
	* ֻ�ܻ�ȡ����ֵ��
	* JSPҳ�澲̬���֣���java����鲿�֣�ʹ��${���������ʽ}����ʽ��ȡ��ָ�����ʽ��ֵ��
	* ֻ�ܴ��Ĵ����л�ȡ���ݣ�pageContext��request��session��application����
	* ������������������С����Χ���β��ң�
	* ���Է��ʶ������ԣ����ʶ����get��������
	* ���ҷ�Χ���ö���pageScope��requestScope��sessionScope��applicationScope�������Ҷ�Ӧ�������ݱ��������ʽΪ����ӦScope.��������
	* ע�⣺
	
		- ����Ϊnull��������ʱ�����׳���ָ���쳣��
		- ���������±�Խ��ʱ�����쳣�������Խ���쳣��
		- ����ͨ����������list�����ܷ���set��
		- ͨ��(map��.keyֵ)�ķ�ʽ����map�е�����ֵ��
		- ��֧��++�Լ�--�������
		
	* empty�������ʾ�����Ƿ�Ϊ��
		
		- �շ���true���򷵻�false��
		- empty������Ҫ�жϵ�����ǰ��
		- �Կ��ַ������ж�Ϊtrue��
		- ����û��Ԫ�ص�����򼯺϶����ж�ҲΪtrue��
		
	* ���ö���pageScope��requestScope��sessionScope��applicationScope��pageContext��param��paramValues��initParam��
	
		- ����pageContext�������������ö������;�Ϊmap��					
		- pageContext��JSP�е�����pagecontextһ���ģ�
			
			* ���ڶ�����ʾ���·��ʱָ����Դ��·����pageContext.request.contextPath��
			
		- param.����ֵ����ȡ�����е�ָ������ֵ���ײ����request�е�getParameter��String name����������
		- paramValues.����ֵ����ȡ�����е�ָ�����в���ֵ���ײ����request�е�getParameterValues��String name����������
		- initParam.����ֵ����ȡ��ʼ���������ײ����ServletContext�е�getInitParameter��String name����������
		
	* EL���ʽ��֧�ֶ��ַ����Ĵ���
	* �Զ���EL����
		
		- ע�����뺯����
			
			* �Զ�����������ĺ�����Ҫ����չ��Ϊ.tld��tag library definition ��ǩ�ⶨ�壩��XML�ļ����Ƚ���ע�᣻
			* ͷ��Լ����\apache-tomcat-10.0.16\webapps\examples\WEB-INF\jsp2�ļ��п�����
			* �ļ�������web-INFĿ¼�£�
			* �����ǩ����Ϣ
				
				- ��ǩ��汾<tilb>�汾��</tilb>
				- һ����ǩ�⣨��ǩ����<short-name>��ǩ����</short-name>һ�����ǩ������ͬ������һ����ǩ��
				- <uri></uri>��ǩ��
				
			* ע�ắ��<function></function>
				
				- <name></name>�������ƣ�
				- <function-class>��������ȫ��</function-class>ע���ࣻ
				- <function-signation>empty</function-signation>�����ǩ�壻
			
		- ��JSP��ʹ���Զ���EL����
		
			* ʹ��taglibָ����JSP�ļ������ע�᣻
			* ʹ��ʱ�������ʽΪ����ǩ�������������ƣ�ʵ�����ݣ���
			* ʵ������Ҳ��Ҫ�����Ĵ����в���ʹ�ã�
		
	* JSTL��JSP Standard Tag Library��JSP��׼��ǩ�⣻
	
- �Զ����ǩ
	
	* �Զ���̳�SimpleTagSupport��ı�ǩ��������

		- ��ǩ�����Է�Ӧ����ǩ����������set������
	* ��д���е�dopag����
			
		- JspBodyΪ��ǩ�����
		- ����getJspBody����������ȡ��ǩ�壻
		- JspBody�е�void invoke(Writer writer)���Խ���ǩ������д�뵽������У���ʵ������Ϊnullʱ�������׼������󶨵ģ�
	* ��tld�ļ���ע���ǩ(�ļ�����Web-INFĿ¼��tlbsĿ¼��)
	
		- �Զ�����������ĺ�����Ҫ����չ��Ϊ.tld��tag library definition ��ǩ�ⶨ�壩��XML�ļ����Ƚ���ע�᣻
		- ͷ��Լ����\apache-tomcat-10.0.16\webapps\examples\WEB-INF\jsp2�ļ��п�����
		- �ļ�������web-INFĿ¼�£�
		- �����ǩ����Ϣ
			
			* ��ǩ��汾<tilb>�汾��</tilb>
			* һ����ǩ�⣨��ǩ����<short-name>��ǩ����</short-name>һ�����ǩ������ͬ������һ����ǩ��
			* <uri></uri>
		- ע���ǩ<tag></tag>
			
			* <name></name>��ǩ���ƣ�
			* <tag-class>��������ȫ��</tag-class>ע���ࣻ
			* <body-content></body-content>�����ǩ��
				
				- �ޱ�ǩ��ʱ����empty��
				- sceiptless����ʾ��ǰ��ǩ���б�ǩ�壬��ǩ�岻�ܳ���java�ű���java����飬JSP���ʽ���������Գ���EL���ʽ��
				- jsp���ѹ�ʱ������ʹ�ã�����ʾ��ǰ��ǩ���б�ǩ�壬��ǩ������ֱ����ʾ��������У�
				- tagdependent����ʾ��ǰ��ǩ���б�ǩ�壬��ǩ������ֱ����ʾ��������У�
				
			* ע���ǩ����<attribute></attribute>
				
				- <name></name>�������ƣ�
				- <required></required>�����Ǳ����ʱ����Ϊtrue��
				- <rtexprvalue></rtexprvalue>֧��EL��JSP���ʽʱ����Ϊtrue
		- ��JSP��ʹ���Զ���EL����
		
			* ʹ��taglibָ����JSP�ļ��������ǩ�⣻
			* <��ǩ����:��ǩ����>���ʽʹ�ñ�ǩ��
	
- jsp��html�е�ַ��ʹ��

  - ���Ե�ַ������Э�����Ƶĵ�ַ���Ǿ��Ե�ַ��

  - ��Ե�ַ

    - û��Э�鿪ͷ�ĵ�ַ��
    - ��Ե�ַ���ܶ���ʹ�ã�����Ͳο���ַ����ʹ�ã�

  - jsp��ʹ�õĵ�ַ������Ե�ַ��

  - ����ַû��б�ܿ�ͷʱ�����ʵ�ַΪ��ǰҳ���ַ�������ӵĵ�ַ��

  - �ԡ�/����ͷ�ĵ�ַ�����ʵ�ַΪ��������ַ�������ӵĵ�ַ��

  - ��jsp��head��ǩ�м���base�ӱ�ǩ���òο���ַ��

    ```jsp
    <!--��ȡ�ο���ַ-->
    <%
    	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + 	
        request.getContextPath() + "/";
    %>
    <head>
        <!--���òο���ַ-->
    	<base href="<%=basePath%>"/>    
    </head>
    ```

### ��. ϵͳ����ģ��

- javaBean

* ����JavaBean
	
	- ���ݳ���bean��
	- ҵ����Bean��
	
* ����JavaBean��
	
	- ����JavaBean�淶��
		
		* ����Ҫ�ǹ����ģ�
		* ������Ҫ����װͬʱ�ṩ������set��get������
		* ����Ҫ�̳�Serializable�ӿڣ�
		* ����Ҫ���޲ι��캯����

- model1ģ��ΪJSP+javaBean��
- modle2ģ�;���MVCģ�ͣ���ͼ�㣨JSP��+���Ʋ㣨Servlet��+ģ�Ͳ㣩��
- ����ܹ�
	
	* ��ͼ�㣨view����Ҫ��Servlet�ࣩ�����ֲ㣬�����û��ύ�������ڸò��д��
	* ����㣨service����ҵ��㣬�߼��㣻ϵͳ����Ҫҵ���߼���д�㣻
	* �־ò㣨dao�������ݷ��ʲ㣻ֱ�Ӳ������ݿ�Ĵ����иò��д��
	
- MVC+����ܹ���������
	
	* ��һ��������ʵ�����Լ����ݿ�����Ӧ��񣨴ӳ־û��㿪ʼд����
	* �ڶ�������dao�㿪ʼд��

