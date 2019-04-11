package com.ctbu.srm;



import com.ctbu.srm.entity.domian.Teacher;
import com.ctbu.srm.repository.TeacherRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;


/**
 * @Author: Meiziyu
 * @Date: 2019/4/3 19:34
 * @Email 308348194@qq.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SrmApplication.class)
public class TeacherRepositoryTests {

    @Autowired
    private TeacherRepository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userRepository.save(new Teacher("1L", "aa@126.com", "aa", "aa123456",formattedDate));
        userRepository.save(new Teacher("2L", "bb@126.com", "bb", "bb123456",formattedDate));
        userRepository.save(new Teacher("3L", "cc@126.com", "cc", "cc123456",formattedDate));

        Assert.assertEquals(9, userRepository.findAll().size());
        Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
        userRepository.delete(userRepository.findByUserName("aa1"));
    }
}
