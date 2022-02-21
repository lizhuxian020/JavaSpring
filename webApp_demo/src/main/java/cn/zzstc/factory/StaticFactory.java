package cn.zzstc.factory;

import cn.zzstc.dao.UserDao;
import cn.zzstc.dao.impl.UserDaoImple;

public class StaticFactory {

    public static UserDao getUserDao() {
        return new UserDaoImple();
    }
}
