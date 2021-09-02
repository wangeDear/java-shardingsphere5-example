import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.spring.domain.Order;
import com.example.spring.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})
public class SpringMapperTest {

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testInsert() {
        for (int i = 0; i < 100; i++) {
            Order order = new Order();
//            order.setOrderId(i);
            order.setOrderNo("A001" + i);
            order.setCreateName("test");
            order.setPrice(new BigDecimal("5.00"));
            orderMapper.insert(order);
        }

        List<Order> orders = orderMapper.selectList(new QueryWrapper<>());
        System.out.println(orders.size());
    }
}
