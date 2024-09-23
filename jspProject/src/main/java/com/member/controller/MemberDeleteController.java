package com.member.controller;

import java.io.IOException;

import com.member.service.MemberService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class MemberDeleteController
 */
public class MemberDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberDeleteController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		int result = new MemberService().deleteMember(userId, userPwd);
		
		HttpSession session = request.getSession();
		if(result > 0) {	// 성공 -> session loginUser 정보 삭제 후 -> 메인페이지로 이동
			session.removeAttribute("loginUser");
			session.setAttribute("alertMsg", "성공적으로 회원탈퇴 되었습니다.");
			
			response.sendRedirect(request.getContextPath());
		}
		else {	// 실패 -> myPage.me로 이동 -> session alertMsg로 회원탈퇴 실패 알림
			session.setAttribute("alertMsg", "회원탈퇴에 실패하였습니다.");
			response.sendRedirect(request.getContextPath() + "/myPage.me");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
