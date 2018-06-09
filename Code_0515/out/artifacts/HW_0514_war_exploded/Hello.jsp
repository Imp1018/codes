<%@page contentType="text/html;charset=utf-8" language="java" %>
<!--
jsp 是 java server pages
允许在页面中 使用 java 作为脚本语言
动态生成HTML代码

jsp首先和HTML的区别:
HTML 可以直接放在浏览器中运行 但是 jsp必须把 Tomcat 启动起来 才能看到效果
jsp页面由以下几部分组成
1. 静态内容
2. 指令
3. 表达式
4. 脚本
5. 声明
6. 注释
-->
<!--
1.注释:
第一种:跟HTML注释一样,跟上面的一样,在客户端可以看见
第二种:<%----%>jsp注释 在客户端看不见, 在编译期会被干掉

-->


<%
    // 标准java注释
    /**
     * 这里也是标准java注释
     * 这种注释只能写在jsp脚本中
     */
    out.println("HelloWorld");
%>

<%--
jsp指令
jsp页面可以在最上方加入一些当前页面的配置的信息
叫做jsp指令
jsp指令一共有三个
page:当前页面的配置信息,最为常用
include:在一个页面中,将另一个文件嵌入其中
taglib:引入标签库,这个基本不会讲

page指令:
语法:
<%@page 属性1="属性值" 属性2="属性值"...%>
常见属性:
1. language: 指定当前jsp页面所使用的脚本语言,默认是java
2. import:引包,当页面中使用到其他包下的java类时,使用该属性引包
3. contenttype: 为页面添加响应头 contenttype,默认值是:text/html;iso-8859-1,我们需要改成utf8
4. pageEncoding: 设置当前页面的编码格式,默认值是ISO-8859-1,如果设置了contentType,那么就会跟contentType保持一致,不需要单独设置
5. errorPage:当前页面出错了,浏览器会自动跳转到到哪个页面,只能决定当前这个jsp出错行为,我们一般会使用web.xml去统一配置整个项目的出错
页面,而不会一个jsp一个jsp的配置
6. isErrorPage: 是否是专门处理错误信息的页面,标记为true后 可以使用jsp九大内置对象中的exception
--%>


<%--
jsp脚本
--%>
<%
    // 在这里写java代码
    // 可以写任何java代码 但是不能定义方法 全局变量
    // 所有的脚本 会原样复制进_javaservice方法中
    /**
     * 里面只能写java代码
     * 并且 所有的jsp脚本,都会和HTML代码混合复制进_javaservice方法中
     * 所以不需要在一个脚本中写一段完整的java代码
     * 示例看Test1中的 隔行换色
     */
%>

<%--
静态内容,所有直接写在jsp文件中的没有被任何jsp标签 包裹的 都是 静态内容
即 所有的HTML代码 就是静态内容
--%>

<%--
声明:用来写自定义方法,成员变量的
见Test2
--%>

<%--
表达式:
表达式是在HTML代码中,使用声明中定义的全局变量
或jsp脚本中定义的 局部变量 而存在的
即 表达式 是没有复杂逻辑的,只能取值用
一定要返回一个值
--%>