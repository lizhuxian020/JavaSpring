package cn.zzstc.dao.impl;

import cn.zzstc.dao.UserDao;
import cn.zzstc.domain.User;

import java.security.PrivateKey;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImple implements UserDao {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private List<String> strList;
    private Map<String, User> userMap;
    private Properties props;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public UserDaoImple() {
        System.out.println("UserDaoImpl create");
    }

    public void init(){
        System.out.println("init userDao");
    }

    public void destroy() {
        System.out.println("destroy UserDao");
    }


    @Override
    public void save() {

        System.out.println("save running...");
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(props);
    }
}
