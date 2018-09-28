package com.board.persistence;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {
	public void insert(BoardVO vo) throws Exception;
	public List<BoardVO>listall() throws Exception;
}
