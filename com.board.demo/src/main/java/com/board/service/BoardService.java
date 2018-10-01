package com.board.service;

import java.util.List;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;

public interface BoardService {
	public void insert(BoardVO vo) throws Exception;
	public List<BoardVO>listall(Criteria cri) throws Exception;
	public BoardVO detail(int idx) throws Exception;
	public void update(BoardVO vo) throws Exception;
	public void delete(int idx) throws Exception;
	public void hit_count(int idx) throws Exception;
	public int countingPage(Criteria cri) throws Exception;
}	
