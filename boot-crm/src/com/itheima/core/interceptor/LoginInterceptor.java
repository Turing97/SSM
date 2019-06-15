package com.itheima.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.core.po.User;

public class LoginInterceptor implements HandlerInterceptor {
	//登陆拦截器
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		//获取请求的url
		String url = request.getRequestURI();
		if(url.indexOf("/login.action") >= 0){
			return true;
		}
		//获取session
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("USER_SESSION");
		//判断session中是否有数据，如果有放回true  继续向下执行
		if(user != null){
			return true;
		}
		//不符合条件的给出提示信息，转发到登陆页面
		request.setAttribute("msg", "您还没有登陆，请先登陆");
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
		
		//判断session中是否有数据，如果有，则放回true，继续向下执行
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	//退出登陆
	@RequestMapping(value = "/logout.action")
	public String logout(HttpSession session){
		//清除session
		session.invalidate();
		//重定向到登陆页面的跳转方法
		return "redirect:logout.action";
		
	}
	//向用户登陆页面跳转
	@RequestMapping(value = "/login.action",method = RequestMethod.GET)
	public String toLogin(){
		return "login";
	}
}
