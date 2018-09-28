package com.board.service;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {
	public void insert(BoardVO vo) throws Exception;
	
	public List<BoardVO>listall() throws Exception;
}	
