package com.srvIml;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.GoodsDao;
import com.databean.Goods;
import com.service.GoodsService;

@Service
public class GoodsSrvIml implements GoodsService{
	@Resource
	private GoodsDao goodsDao;
	
	public Goods findGood(String id) {
		Goods goods;
		goods = goodsDao.find(id);
		return goods;
	}
}
