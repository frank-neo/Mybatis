import com.demo.mybatislearn.yiduiduo.bean.Post;
import com.demo.mybatislearn.yiduiduo.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

public class Testyiduiduo {



        private static SqlSessionFactory sqlSessionFactory;
        private static Reader reader;


        static {
            try {
                reader = Resources.getResourceAsReader("Config-yiduiduo.xml");
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

                    int userid = 1 ;

                User user = sqlSession.selectOne("com.demo.mybatislearn.yiduiduo.dao.userMaper.getUser",userid);

                System.out.println(user.getUsername());
                List<Post> list = user.getPosts();
                for(Post p:list){
                    System.out.println("Title:" + p.getTitle());
                    System.out.println("Content:" + p.getContent());
                }

            } finally {

                sqlSession.close();

            }

        }



    }


