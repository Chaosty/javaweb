package com.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dao.GoodsDao;
import com.databean.Goods;
import com.service.GoodsService;
//import com.service.*;


class Shop {
	String name;
	String staffName[];

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getStaffName() {
		return staffName;
	}
	public void setStaffName(String[] staffName) {
		this.staffName = staffName;
	}	
}

@Controller
@RequestMapping("Goods.do")
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	
//	@Resource
//	private GoodsDao goodsDao;
//	@Resource
//	private SqlSessionFactory sqlSessionFactory;
	//	@RequestMapping(method = RequestMethod.GET)
	//	public String printHello(ModelMap model) {
	//		model.addAttribute("message", "Hello222 Spring MVC Framework!");
	//
	//		return "hello";
	//	}

	@RequestMapping(value="pre_{name}", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@PathVariable String name) {



		//Goods goods = goodsDao.find("562379");
		//GoodsService service = new GoodsService();
		//Goods goods = service.findGood("562379");
		Goods goods = goodsService.findGood("562379");
		
		System.out.println(goods.getTitle());

		System.out.println("-----请求json数据--------");
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});

		return shop;

	}
}
