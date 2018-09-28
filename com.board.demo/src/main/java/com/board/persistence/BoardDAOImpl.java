package com.board.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.board.mappers.BoardMapper";

	@Override
	public void insert(BoardVO vo) throws Exception {
		session.insert(namespace+".insert",vo);
	}

	@Override
	public List<BoardVO> listall() throws Exception {
		return session.selectList(namespace+".listall");
	}

	@Override
	public BoardVO detail(int idx) throws Exception {
		return session.selectOne(namespace+".detail", idx);
	}
	
	
	
	
	
	
}
