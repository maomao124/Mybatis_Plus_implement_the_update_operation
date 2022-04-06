package mapper;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import data.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：Mybatis_Plus实现更新操作
 * Package(包名): mapper
 * Class(测试类名): StudentMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/6
 * Time(创建时间)： 13:31
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */


class StudentMapperTest
{

    /**
     * 根据id更新
     *
     * @throws Exception the exception
     */
    @Test
    public void update1() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setStudent_no(202012341065L);
        student.setEmail("123@qq.com");
        System.out.println(student);
        int update = studentMapper.updateById(student);
        System.out.println(update);

        sqlSession.commit();
        sqlSession.close();

    }

    /**
     * 根据条件更新
     *
     * @throws Exception the exception
     */
    @Test
    public void update2() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setEmail("124@qq.com");
        System.out.println(student);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_no", 202012341065L);
        int update = studentMapper.update(student, queryWrapper);
        System.out.println(update);

        sqlSession.commit();
        sqlSession.close();

    }

    /**
     * 根据条件更新
     *
     * @throws Exception the exception
     */
    @Test
    public void update3() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setEmail("125@qq.com");
        System.out.println(student);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_no", 202012341065L).or().eq("student_no", 202012341066L);
        int update = studentMapper.update(student, queryWrapper);
        System.out.println(update);

        sqlSession.commit();
        sqlSession.close();

    }

    /**
     * 根据条件更新
     *
     * @throws Exception the exception
     */
    @Test
    public void update4() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setEmail("125@qq.com");
        System.out.println(student);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_no", 202012341065L).eq("student_no", 202012341066L);
        int update = studentMapper.update(student, queryWrapper);
        System.out.println(update);

        sqlSession.commit();
        sqlSession.close();

    }

    /**
     * 根据条件更新
     *
     * @throws Exception the exception
     */
    @Test
    public void update5() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setEmail("126@qq.com");
        System.out.println(student);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_no", 202012341065L).eq("sex", "男");
        int update = studentMapper.update(student, queryWrapper);
        System.out.println(update);

        sqlSession.commit();
        sqlSession.close();

    }


    /**
     * 根据条件更新
     *
     * @throws Exception the exception
     */
    @Test
    public void update6() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);


        UpdateWrapper<Student> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("student_no", 202012341065L).set("address", "北京");

        int update = studentMapper.update(null, updateWrapper);
        System.out.println(update);

        sqlSession.commit();
        sqlSession.close();

    }

    /**
     * 根据条件更新
     *
     * @throws Exception the exception
     */
    @Test
    public void update7() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);


        UpdateWrapper<Student> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("name", "张三").set("state", "在读");

        int update = studentMapper.update(null, updateWrapper);
        System.out.println(update);

        sqlSession.commit();
        sqlSession.close();

    }

}