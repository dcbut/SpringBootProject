package com.dcxuexi;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringbootMp04DmlApplicationTests {
	
	@Autowired
	private UserDao userDao;

	@Test
	void testUpdate(){
		//1.先通过要修改的数据id将当前数据查询出来
		User user = userDao.selectById(35);   //version=2
		User user2 = userDao.selectById(35);  //version=2

		//2.将要修改的属性逐一设置进去
		user.setEmail("shanghai@dcxuexi.com");
		user.setUserName("上海");
		user.setBranchName("上海奋进吧");

		int i = userDao.updateById(user);   //version=>3
		System.out.println("i = " + i);

		user2.setEmail("shanghai02@dcxuexi.com");
		user2.setUserName("上海02");
		user2.setBranchName("上海奋进吧02");

		int j = userDao.updateById(user2);   //verion=2 ? 条件还成立吗？
		System.out.println("j = " + j);
	}

	@Test
	void testUpdate2(){
		User user = new User();
		user.setUserId(36);
		user.setEmail("shanghai@dcxuexi.com");
		user.setUserName("上海");
		user.setBranchName("上海奋进吧");
		user.setVersion(1);
		int i = userDao.updateById(user);
		System.out.println("i = " + i);
	}


	@Test
	void testSelectAll(){
		//List<User> userList = userDao.selectList(null);
		List<User> userList = userDao.selectAll();
		userList.forEach(System.out::println);
	}

	@Test
	void testDelete(){
		//删除指定多条数据
		List<Integer> ids = new ArrayList<>();
		ids.add(1668284418);
		ids.add(1668284419);
		int i = userDao.deleteBatchIds(ids);
		System.out.println("i = " + i);
	}

	@Test
	void testInsert(){
		User user = new User();
		//user.setUserId(666666);
		user.setUserName("奋进吧老铁2");
		user.setEmail("fenjinbalaotie@dcxuexi.com");
		user.setBranchName("上海奋进吧2");
		int i = userDao.insert(user);
		System.out.println("i = " + i);
	}







	@Test
	void testSelect() {
		//查询指定多条数据
		List<Integer> ids = new ArrayList<>();
		ids.add(13);
		ids.add(14);
		ids.add(15);
		List<User> userList = userDao.selectBatchIds(ids);
		userList.forEach(System.out::println);
	}

}
