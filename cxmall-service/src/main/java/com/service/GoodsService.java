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
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public interface GoodsService {
	
//	@Resource
//	private GoodsDao goodsDao;
//	@Resource
//	private SqlSessionFactory sqlSessionFactory;
	public Goods findGood(String id);
//	public Goods findGood(String id) {
//		//return goodsDao.find(id);
//		
//		
////		Goods goods;
////		try {
////			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
////			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
////			SqlSession session = sqlSessionFactory.openSession();
////			goods = (Goods) session.selectOne(
////					"com.dao.GoodsDao.find", id);
////			return goods;
////		} catch (Exception e) {
////			e.printStackTrace();
////			return null;
////		}
//		
//		Goods goods;
//		
////		ApplicationContext appContext = 
////	    		new ClassPathXmlApplicationContext(new String[] {"spring.xml"});
//		
//		//SqlSessionFactory cust = (SqlSessionFactory)appContext.getBean("sqlSessionFactory");
////		SqlSession session = sqlSessionFactory.openSession();
////		goods = (Goods) session.selectOne(
////				"com.dao.GoodsDao.find", id);
//		goods = goodsDao.find(id);
//		return goods;
//		//return null;
//	}
}
