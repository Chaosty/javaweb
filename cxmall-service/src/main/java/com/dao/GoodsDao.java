package com.dao;

import org.apache.ibatis.annotations.Param;
import com.databean.Goods;;
public interface GoodsDao {
	
	public Goods find(@Param("id") String id);
}
