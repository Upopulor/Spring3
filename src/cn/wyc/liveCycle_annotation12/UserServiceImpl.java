package cn.wyc.liveCycle_annotation12;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service("userServiceId")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("liveCycle6 Add User");
	}
	@PostConstruct
	public void myInit() {
		System.out.println("我的初始化");
	}
	@PreDestroy
	public void myDestory() {
		System.out.println("我的销毁");
	}
}
