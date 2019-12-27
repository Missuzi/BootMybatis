import com.lol.Service.GameCetaService;
import com.lol.Service.UserService;
import com.lol.common.Result;
import com.lol.po.DeptInfoList;
import com.lol.po.GameCeta;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ValueTest.class)
public class ValueTest {

    @Autowired
    GameCetaService gameCetaService;


    @Test
    public  void insertListEntity()
    {


//     Result result= gameCetaService.insert(listGame);
//        System.out.println(result.getCode());


    }
}
