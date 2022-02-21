package cn.zzstc.dynamic;

import cn.zzstc.dao.UserDao;
import cn.zzstc.dao.impl.UserDaoImple;

public class DynamicFactory {

    public UserDao getUserDao() {
        return new UserDaoImple();
    }
}
