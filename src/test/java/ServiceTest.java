import com.example.store.config.SpringConfig;
import com.example.store.service.AccountService;
import com.example.store.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ServiceTest {
    @Autowired
    private AccountService accountService;

    @Autowired
    private GoodsService goodsService;

    @Test
    public void textFindAll(){
        System.out.println(goodsService.findAll());
        System.out.println(accountService.findAll());
    }

    @Test
    public void testFindUser(){
        System.out.println(accountService.findUser("2"));
    }
}
