package com.sntkor.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sntkor.domain.IdcVO;

@Repository
public class IdcDAOImpl implements IdcDAO{

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.sntkor.mappers.IdcMapper";
	
	@Override
	public void insert(IdcVO vo) throws Exception {
		session.insert(namespace+".insert",vo);
	}

	@Override
	public List<IdcVO> list() throws Exception {
		return session.selectList(namespace+".list");
	}

	@Override
	public IdcVO detail(int idx) throws Exception {
		return session.selectOne(namespace+".detail", idx);
	}
	
	
	
}
