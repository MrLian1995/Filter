# Filter
过滤器


	JAVA过滤机制——过滤简介:
	
	1.过滤器三部分：过滤源（用户请求）——>过滤规则——>过滤结果

	2.过滤器不处理结果，只做辅助性操作

	3.定义：过滤器是一个【服务器端】的组件，它可以【截取用户端的请求和响应信息】，并对这些信息过滤。
	
	1.什么是过滤器？

	过滤器是web服务器端的一个组件，可以截获用户的请求和web资源的响应，对请求和响应进行过滤

	2.过滤器的工作原理？

	原理：用户发送请求到过滤器，过滤器将用户请求发送到web资源，web资源将响应发送到过滤器，过滤器将响应发送给用户
	
	JAVA过滤机制——第一个过滤器案例

	1.创建一个过滤器类 ，继承自servlet下的Filter

	2.重写三个方法init() doFilter() destroy()方法

	（1）init()初始化：这个方法可以读取web.xml文件中的过滤器初始化参数。通过参数FilterConfig arg0可以获取更多参数

	（2）doFIlter()核心：完成实际的过滤操作。当用户请求访问与过滤器【关联的URL】时，Web容器将先调用过滤器的doFilter方法，
	
         FilterChain arg2参数可以调用chain.doFilter方法，将请求传给下一个过滤器（或目标资源），或利用转发，重定向将请求转发给其他资源。

	 (3)web容器在消耗过滤器前调用该方法，用于释放过滤器占用的资源。（大多数情况用不到）
	 
	Q1:过滤器的配置可以在设计里面
	
	Q2:过滤器可以改变用户处理的路径，但不能直接处理数据
	
	过滤器链：
	
	Web应用允许多个过滤器来过滤页面请求——联想现实生活中的例子是最好理解的啦！比如：为了获得更加干净的水，可能需要多个过滤器来进行过滤。

	这个时候就分为两种情况了

	1.多个过滤器过滤的URL不同，那么此时的多个过滤器是互不相干的，各过滤各的，互不干扰

	2.多个多虑期过滤的URL相同，那么此时的多个过滤器就形成了一个过滤器链，此时就有个一个问题了Web容器现将对应的请求给谁过滤呢？
	
	处理规则也很简单，就是根据在Web.xml文件中配置的声明的顺序来决定，那个先过滤那个在过滤。
	 
	过滤器分类

	1.使用request过滤器的有：response.sendRedirect()和浏览器直接访问

	2.使用forward过滤器的有：request.getRequestDispatcher().forward(request,response)以及forward动作

	3.使用include过滤器的有：request.getRequestDispatcher().include(request,response)以及include动作和指令 
	 
	ERROR： <error-page>如果【没有】设置且ERROR过滤器【有】设置，则输出错误地址检测不到且ERROR过滤器也失效；<error-page>如果【有】设置
	 
	且ERROR过滤器【有】设置，则输出错误地址可检测到且ERROR过滤器生效；<error-page>如果【有】设置且ERROR过滤器【没有】设置，
	
	则输出错误地址可检测到但ERROR过滤器不会生效。
	
	filterchain.doFilter(servletrequest, servletresponse);//注意：放行
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
