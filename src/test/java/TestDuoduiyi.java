import com.demo.mybatislearn.duoduiyi.bean.Post;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class TestDuoduiyi {



        private static SqlSessionFactory sqlSessionFactory;
        private static Reader reader;


        static {
            try {
                reader = Resources.getResourceAsReader("Config-duoduiyi.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
                //注解形式需要拿到Iuser的属性
                //sqlSessionFactory.getConfiguration().addMapper(IUser.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static SqlSessionFactory getSession() {
            return sqlSessionFactory;
        }


        public static void main(String[] args) {

            SqlSession sqlSession = sqlSessionFactory.openSession();
            try {

                int postId  = 1 ;

                Post post = sqlSession.selectOne("com.demo.mybatislearn.duoduiyi.dao.UserMaper.getPost",postId );

                System.out.println("title: "+post.getTitle());
                System.out.println("userName: "+post.getUser().getUsername());

            } finally {

                sqlSession.close();

            }

        }






}
