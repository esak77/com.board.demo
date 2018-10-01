package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;
import com.board.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;

	@Override
	public void insert(BoardVO vo) throws Exception {
		dao.insert(vo);
	}

	@Override
	public List<BoardVO> listall(Criteria cri) throws Exception {
		return dao.listall(cri);
	}

	@Override
	public BoardVO detail(int idx) throws Exception {
		return dao.detail(idx);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		dao.update(vo);
	}

	@Override
	public void delete(int idx) throws Exception {
		dao.delete(idx);
	}

	@Override
	public void hit_count(int idx) throws Exception {
		dao.hit_count(idx);
	}

	@Override
	public int countingPage(Criteria cri) throws Exception {
		return dao.countingPage(cri);
	}
	
	
	
	
}
