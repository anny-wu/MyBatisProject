//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.annyw.dao;

import com.annyw.pojo.User;
import com.annyw.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class UserDaoTest {
    SqlSession sqlSession;
    
    public UserDaoTest() {
    }
    
    @Test
    public void test() {
        try {
            this.sqlSession = MybatisUtils.getSqlSession();
            UserDao mapper = this.sqlSession.getMapper(UserDao.class);
            
            //Setup Environment
            mapper.checkTable("TESTNEW");
            mapper.createTable("TESTNEW");
            mapper.checkTrigger();
            mapper.createTrigger("TESTNEW");
            
            //Setup Table
            mapper.addUser("TESTNEW", "Anny", 12);
            
            List<User> userList = mapper.getAllUsers("TESTNEW");
            Iterator itr = userList.iterator();
            
            while (itr.hasNext()) {
                User user = (User)itr.next();
                System.out.println(user);
            }
            System.out.println();
            
            mapper.addUser("TESTNEW", "Tom", 18);
            
            userList = mapper.getAllUsers("TESTNEW");
            itr = userList.iterator();
            
            while (itr.hasNext()) {
                User user = (User)itr.next();
                System.out.println(user);
            }
            System.out.println();
            
            mapper.addUser("TESTNEW", "Jessica", 36);
            
            userList = mapper.getAllUsers("TESTNEW");
            itr = userList.iterator();
            
            while (itr.hasNext()) {
                User user = (User)itr.next();
                System.out.println(user);
            }
            System.out.println();
            
            mapper.addUser("TESTNEW", "Jack", 20);
            
            userList = mapper.getAllUsers("TESTNEW");
            itr = userList.iterator();
            
            while (itr.hasNext()) {
                User user = (User)itr.next();
                System.out.println(user);
            }
            System.out.println();
            
            mapper.addUser("TESTNEW", "Catherine", 10);
            
            userList = mapper.getAllUsers("TESTNEW");
            itr = userList.iterator();
            
            while (itr.hasNext()) {
                User user = (User)itr.next();
                System.out.println(user);
            }
            System.out.println();
            
            //Perform Query
            userList = mapper.getUserList("TESTNEW");
            itr = userList.iterator();
            
            while (itr.hasNext()) {
                User user = (User)itr.next();
                System.out.println(user);
            }
            
            System.out.println();
            
        }
        catch (Exception var8) {
            var8.printStackTrace();
        }
        finally {
            if (this.sqlSession != null) {
                this.sqlSession.close();
            }
        }
    }
}
