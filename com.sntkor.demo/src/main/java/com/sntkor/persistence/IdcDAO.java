package com.sntkor.persistence;

import java.util.List;

import com.sntkor.domain.IdcVO;

public interface IdcDAO {
	public void insert(IdcVO vo) throws Exception;
	public List<IdcVO> list() throws Exception;
	public IdcVO detail(int idx) throws Exception;
}
