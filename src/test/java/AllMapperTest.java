import com.xing.example.entity.Answer;
import com.xing.example.entity.Author;
import com.xing.example.entity.Question;
import com.xing.example.repository.AllMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author xingzhe
 * @date 2019-06-21
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/magnet-server.xml"})
@MapperScan("com.xing.example.repository")
public class AllMapperTest {

    @Autowired
    AllMapper allMapper;

    @Test
    public void selectById() {
        List<Answer> answers = allMapper.selectByQid(1L);
        for (Answer answer : answers) {
            System.out.println(answer.toString());
        }
    }

    @Test
    public void selectAuthor() {
        Author author = allMapper.selectAuthor(2);
        System.out.println(author.toString());
    }

    @Test
    public void selectAll() {
        Question question = allMapper.selectQuestion(1L);
        System.out.println(question);
    }
}
