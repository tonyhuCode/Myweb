package com.android;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	
	public LoginServlet() {
		super();
	}
	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if (name != null && password != null) {
			System.out.println("name:"
					+ new String(name.getBytes("iso-8859-1"), "utf-8"));
			System.out.println("password:"
					+ new String(password.getBytes("iso-8859-1"), "utf-8"));

		}
		//new commit test.
		// ģ��һ����ѯ���ݿ�Ĳ���.
		if ("zhangsan".equals(name) && "123456".equals(password)) {
			//��ҳ��д�����ݣ�����utf-8���뷽ʽ**********
			response.getOutputStream().write("��½�ɹ�".getBytes("utf-8"));
		} else {
			response.getOutputStream().write("��½ʧ��".getBytes("utf-8"));
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("post");
		doGet(request, response);
	}

}
