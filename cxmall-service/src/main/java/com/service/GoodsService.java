package com.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.*;
import com.databean.Goods;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class GoodsService {
	
	@Resource
	GoodsDao goodsDao;
	
	
	public Goods findGood(String id) {
		//return goodsDao.find(id);
		Goods goods;
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = sqlSessionFactory.openSession();
			goods = (Goods) session.selectOne(
					"com.dao.GoodsDao.find", id);
			return goods;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
