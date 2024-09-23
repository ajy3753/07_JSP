package com.board.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

/**
 * Servlet implementation class BoardInsertController
 */
public class BoardInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardInsertController() {
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 일반 방식이 아닌 multipart/form-data로 전송하는 경우 request로부터 값 추출 불가
		
		// enctype이 multipart/form-data로 전송이 되었는지 체크
		
		// 파일 업로드를 위한 라이브러리 cos.jar > maven 저장소에서 다운로드
		
		// 1. 파일 용량 제한(byte)
		// byte -> kbyte -> mbyte -> gbnte -< 12
		int maxSize = 1024 * 1024 * 10;
		
		// 2. 전달된 파일을 저장시킬 폴더 경로 가져오기
		request.getSession().getServletContext().getRealPath("/resources/board_upfile");
		
		// new MultipartRequest(request, 저장시킬 폴더의 경로, 용량 제한, 인코딩, 이름을 어떻게 변경할지 정해둔 객체
		MultipartRequest multiRequest = new MultipartRequest();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}