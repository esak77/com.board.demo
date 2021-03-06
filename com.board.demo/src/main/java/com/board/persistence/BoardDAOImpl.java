package com.board.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;

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
	public List<BoardVO> listall(Criteria cri) throws Exception {
		return session.selectList(namespace+".listall", cri);
	}

	@Override
	public BoardVO detail(int idx) throws Exception {
		return session.selectOne(namespace+".detail", idx);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(namespace+".update", vo);
	}

	@Override
	public void delete(int idx) throws Exception {
		session.delete(namespace+".delete", idx);
	}

	@Override
	public void hit_count(int idx) throws Exception {
		session.update(namespace+".hit_count", idx);
	}

	@Override
	public int countingPage(Criteria cri) throws Exception {
		return session.selectOne(namespace+".countingPage", cri);
	}
	
	
	
	
	
}
