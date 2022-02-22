package cn.zzstc.dao.impl;

import cn.zzstc.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//<bean id="userDao" class="cn.zzstc.dao.impl.UserDaoImpl"/>
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save running...");
    }
}
