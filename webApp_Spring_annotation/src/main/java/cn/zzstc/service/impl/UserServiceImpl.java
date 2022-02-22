package cn.zzstc.service.impl;

import cn.zzstc.dao.UserDao;
import cn.zzstc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

//<bean id="userService" class="cn.zzstc.service.impl.UserServiceImpl">
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")
    private String desc;

//    <property name="userDao" ref="userDao"/>
//    @Autowired //通过成员变量类型去spring寻找bean
//    @Qualifier("userDao")
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println(this.desc);
        this.userDao.save();
    }

    @PostConstruct
    private void init() {
        System.out.println("init running");
    }


}
