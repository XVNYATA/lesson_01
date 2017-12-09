import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.xvnyata.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;

public class lesson_01_user {

    @Test
    public void findUserByIdTest() throws IOException{
        String resource="SqlMapConfig.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        User user=sqlSession.selectOne("test.findUserById",1);
        System.out.print(user);
        sqlSession.close();

    }
}
