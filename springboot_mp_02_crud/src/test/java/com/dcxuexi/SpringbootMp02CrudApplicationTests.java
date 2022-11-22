package com.dcxuexi;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dcxuexi.dao.UserDao;
import com.dcxuexi.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMp02CrudApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void testPageSelect(){
		//1 创建IPage分页对象,设置分页参数,1为当前页码，5为每页显示的记录数
		IPage<User> userIPage = new Page<>(1,5);
		//2 执行分页查询
		userIPage = userDao.selectPage(userIPage,null);
		System.out.println("当前页码值 = " + userIPage.getCurrent());
		System.out.println("一共多少页 = " + userIPage.getPages());
		System.out.println("每页显示数 = " + userIPage.getSize());
		System.out.println("一共多少条数据 = " + userIPage.getTotal());
		System.out.println("数据 = ↓↓↓↓ ");
		userIPage.getRecords().forEach(System.out::println);
	}


	@Test
	void testSelectAll(){
		List<User> userList = userDao.selectList(null);
		userList.forEach(System.out::println);
	}

	@Test
	void testSelectById(){
		User user = userDao.selectById(146);
		System.out.println(user.toString());
	}

	@Test
	void testUpdate(){
		User user = new User();
		user.setUserId(146);
		user.setUserName("奋进吧2");
		user.setEmail("fenjinba@dcxuexi.com");
		user.setBranchName("奋进吧");
		int i = userDao.updateById(user);
		System.out.println(i);
	}


	@Test
	void  testDelete(){
		int i = userDao.deleteById(132);
		System.out.println(i);
	}


	@Test
	void testInsert() {
		User user = new User();
		user.setUserName("奋进吧");
		user.setEmail("fengjin@dcxuexi.com");
		user.setBranchName("上海奋进吧");
		int i = userDao.insert(user);
		System.out.println(i);
	}


}
