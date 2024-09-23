package com.board.service;

import static com.common.JDBCTemplate.*;
import static com.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.board.model.dao.BoardDao;
import com.board.model.vo.Attachment;
import com.board.model.vo.Board;
import com.board.model.vo.Category;
import com.common.PageInfo;

public class BoardService {

	public int selectListCount() {
		Connection conn = getConnection();
		
		int listCount = new BoardDao().selectListCount(conn);
		close(conn);
		
		return listCount;
	}
	
	public ArrayList<Board> selectList(PageInfo pi) {
		Connection conn = getConnection();
		
		ArrayList<Board> list = new BoardDao().selectList(conn, pi);
		close(conn);
		
		return list;
	}
	
	// BoardDetailController
	public Board increaseCount(int boardNo) {
		Connection conn = getConnection();
		BoardDao bDao = new BoardDao();
		Board b = null;
		
		int result = bDao.increaseCount(conn, boardNo);
		if(result > 0) {
			commit(conn);
			b = bDao.selectBoard(conn, boardNo);
		}
		else {
			rollback(conn);
		}
		
		return b;
	}
	
	public Attachment selectAttachment(int boardNo) {
		Connection conn = getConnection();
		Attachment at = new BoardDao().selectAttachment(conn, boardNo);
		
		close(conn);
		return at;
	}
	
	public ArrayList<Category> selectCategoryList(){
		Connection conn = getConnection();
		ArrayList<Category> list = new BoardDao().selectCategoryList(conn);
		
		close(conn);
		
		return list;
	}
}







