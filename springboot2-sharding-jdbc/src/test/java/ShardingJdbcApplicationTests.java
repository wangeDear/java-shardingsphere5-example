import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sharding.ShardingJdbcApplication;
import com.example.sharding.domain.Order;
import com.example.sharding.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShardingJdbcApplication.class})
public class ShardingJdbcApplicationTests {

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testInsert() {

        for (int i = 0; i < 100; i++) {
            Order order = new Order();
//            order.setOrderId(i);
            order.setOrderNo("A001" + i);
            order.setCreateName("test");
            order.setPrice(new BigDecimal("5.00"));
//            orderMapper.insert(order);
        }

        List<Order> orders = orderMapper.selectList(new QueryWrapper<>());
        System.out.println(orders.size());
    }

}
