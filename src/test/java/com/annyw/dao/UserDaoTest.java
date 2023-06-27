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
            System.out.println("Delete table if exists:");
            mapper.checkTable("TESTNEW");
            System.out.println("Create table:");
            mapper.createTable("TESTNEW");
            System.out.println("Delete trigger if exists:");
            mapper.checkTrigger();
            System.out.println("Create trigger to record update time:");
            mapper.createTrigger("TESTNEW");
            
            //Setup Table
            System.out.println("Add user Anny:");
            mapper.addUser("TESTNEW", "Anny", 12);
            
            List<User> userList = mapper.getAllUsers("TESTNEW");
            Iterator itr = userList.iterator();
            
            while (itr.hasNext()) {
                User user = (User)itr.next();
                System.out.println(user);
            }
            System.out.println();
            
            System.out.println("Add user Tom:");
            mapper.addUser("TESTNEW", "Tom", 18);
            
            userList = mapper.getAllUsers("TESTNEW");
            itr = userList.iterator();
            
            while (itr.hasNext()) {
                User user = (User)itr.next();
                System.out.println(user);
            }
            System.out.println();
            
            System.out.println("Add user Jessica:");
            mapper.addUser("TESTNEW", "Jessica", 36);
            
            userList = mapper.getAllUsers("TESTNEW");
            itr = userList.iterator();
            
            while (itr.hasNext()) {
                User user = (User)itr.next();
                System.out.println(user);
            }
            System.out.println();
            
            System.out.println("Add user Jack:");
            mapper.addUser("TESTNEW", "Jack", 20);
            
            userList = mapper.getAllUsers("TESTNEW");
            itr = userList.iterator();
            
            while (itr.hasNext()) {
                User user = (User)itr.next();
                System.out.println(user);
            }
            System.out.println();
            
            System.out.println("Add user Catherine:");
            mapper.addUser("TESTNEW", "Catherine", 10);
            
            userList = mapper.getAllUsers("TESTNEW");
            itr = userList.iterator();
            
            while (itr.hasNext()) {
                User user = (User)itr.next();
                System.out.println(user);
            }
            System.out.println();
            
            //Perform Query
            System.out.println("Find users who are under 20:");
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
