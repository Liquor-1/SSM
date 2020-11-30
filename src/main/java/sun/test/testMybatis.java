package sun.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import sun.dao.AccountDao;
import sun.domain.Account;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMybatis {
        @Test
        public void run1() throws IOException {
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            SqlSession session = factory.openSession();
            AccountDao dao = session.getMapper(AccountDao.class);
            List<Account> list = dao.findAll();
            for (Account account : list) {
                System.out.println(account);
            }
            in.close();

        }
    @Test
    public void run2() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("bbb");
        account.setMoney(21d);
        dao.saveAccount(account);
        session.commit();
        in.close();

    }
    }
