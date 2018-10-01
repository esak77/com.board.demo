package com.board.service;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {
	public void insert(BoardVO vo) throws Exception;
	public List<BoardVO>listall() throws Exception;
	public BoardVO detail(int idx) throws Exception;
	public void update(BoardVO vo) throws Exception;
	public void delete(int idx) throws Exception;
	public void hit_count(int idx) throws Exception;
}	
