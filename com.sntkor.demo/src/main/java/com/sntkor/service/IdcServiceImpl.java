package com.sntkor.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sntkor.domain.IdcVO;
import com.sntkor.persistence.IdcDAO;

@Service
public class IdcServiceImpl implements IdcService {

	@Inject
	private IdcDAO dao;
	
	@Override
	public void insert(IdcVO vo) throws Exception {
		dao.insert(vo);
	}

	@Override
	public List<IdcVO> list() throws Exception {
		return dao.list();
	}
	
	@Override
	public IdcVO detail(int idx) throws Exception {
		return dao.detail(idx);
	}
	
	
}
