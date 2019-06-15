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
	//��½������
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		//��ȡ�����url
		String url = request.getRequestURI();
		if(url.indexOf("/login.action") >= 0){
			return true;
		}
		//��ȡsession
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("USER_SESSION");
		//�ж�session���Ƿ������ݣ�����зŻ�true  ��������ִ��
		if(user != null){
			return true;
		}
		//�����������ĸ�����ʾ��Ϣ��ת������½ҳ��
		request.setAttribute("msg", "����û�е�½�����ȵ�½");
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
		
		//�ж�session���Ƿ������ݣ�����У���Ż�true����������ִ��
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
	
	//�˳���½
	@RequestMapping(value = "/logout.action")
	public String logout(HttpSession session){
		//���session
		session.invalidate();
		//�ض��򵽵�½ҳ�����ת����
		return "redirect:logout.action";
		
	}
	//���û���½ҳ����ת
	@RequestMapping(value = "/login.action",method = RequestMethod.GET)
	public String toLogin(){
		return "login";
	}
}
