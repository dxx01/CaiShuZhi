package com.dengxinxin.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 *  ����:������
 *
 *  2018��12��11������8:24:51
 *  
 *  ���Ʋ�
 */
@SuppressWarnings("serial")
public class CCC extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("ci1");
		session.removeAttribute("i");
		session.removeAttribute("error");
		session.removeAttribute("hui");
		request.getRequestDispatcher("biaodan.jsp").forward(request,response);
	}
	
	public int suijishu(HttpServletRequest request){
		HttpSession session = request.getSession();
		 
		int i = (int)(Math.random()*100);
		session.setAttribute("i", i);
		return i;
	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		String name=request.getParameter("num");
		int num1 = Integer.parseInt(name);
	
		String ci = request.getParameter("ci");
		if(ci==""||ci==null){
			ci="0";
		}
		int ci1 = Integer.parseInt(ci);
		//�����
		int i = 0;
		if(ci1==0){
			i = suijishu(request);
		}else{
			i = (int) session.getAttribute("i");
		}
		System.out.println(i);
		ci1++;session.setAttribute("ci1", ci1);
		if(ci1>9){
			session.setAttribute("hui",1);
			if(num1!=i){
				session.setAttribute("error","��Ǹ��Ļ��������ˣ�");
			}else{
				session.setAttribute("error","�¶���");
			}
		}else{
			if(num1==i){
				session.setAttribute("error","�¶���");
				session.setAttribute("hui",1);
			}else if(num1>i){
				session.setAttribute("error","�´���");
			}else{
				session.setAttribute("error","��С��");
			}
		}
	//	System.out.println("Thread Name: " + Thread.currentThread().getName());
		request.getRequestDispatcher("biaodan.jsp").forward(request,response);
	}

	

}

