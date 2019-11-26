import com.lol.BmApp;
import com.lol.Service.UserService;
import com.lol.po.DeptInfoList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ValueTest.class)
public class ValueTest {

    @Autowired
    UserService userService;

    @Test
    public void searchValue(){
        List<DeptInfoList> lists= userService.searchMyEvaluate(1);
        System.out.println(lists);

    }
}
