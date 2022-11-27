package com.dcxuexi;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.dcxuexi.dao.UserDao;
import com.dcxuexi.domain.QueryUser;
import com.dcxuexi.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringbootMp03DqlApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void testSelectAll(){
		QueryWrapper<User> queryWrapper = new QueryWrapper<User>();

		//condition ：条件，返回boolean，当condition为true，进行排序，如果为false，则不排序
		//isAsc:是否为升序，true为升序，false为降序
		//columns：需要操作的列
		queryWrapper.lambda().orderBy(true,true,User::getUserId);

		List<User> userList = userDao.selectList(queryWrapper);
		userList.forEach(System.out::println);
	}

	@Test
	void testSelect(){
		QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
		//queryWrapper.lt("user_id",10);
		//queryWrapper.lambda().lt(User::getUserId,10);
		//lambdaQueryWrapper.likeRight(User::getBranchName,"安徽");
		//lambdaQueryWrapper.lt(User::getUserId,10).or().gt(User::getUserId,20);
		queryWrapper.select("user_name","email");

		//模拟页面传递过来的查询数据
		QueryUser queryUser = new QueryUser();
		queryUser.setUserId2(50);
		queryUser.setUserId(20);
		LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		lambdaQueryWrapper.lt(null != queryUser.getUserId2(),User::getUserId,queryUser.getUserId2());
		lambdaQueryWrapper.gt(null != queryUser.getUserId(),User::getUserId,queryUser.getUserId());

		List<User> userList = userDao.selectList(queryWrapper);
		userList.forEach(System.out::println);

		//queryWrapper.select("count(*) as num");
		//queryWrapper.select("max(user_id) as maxId");
		//queryWrapper.select("min(user_id) as minId");
		//queryWrapper.select("avg(user_id) as avgId");
		queryWrapper.select("sum(user_id) as sumId");

		queryWrapper.select("count(*) as num , branch_name");
		queryWrapper.groupBy("branch_name");

		List<Map<String, Object>> mapList = userDao.selectMaps(queryWrapper);
		System.out.println(mapList);

		//queryWrapper.lambda().eq(User::getUserName,"fenjinba").eq(User::getBranchName, "奋进吧");

		User user = userDao.selectOne(queryWrapper);
		System.out.println("user = " + user.toString());

		//queryWrapper.lambda().between(User::getUserId,10,20);
		//queryWrapper.lambda().like(User::getBranchName,"上海");


	}



	@Test
	void testSelectById() {
		User user = userDao.selectById(146);
		System.out.println("user = " + user);
	}

}
