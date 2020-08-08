package chunming.liu.dubbo.consumer;

import chunming.liu.dubbo.api.IDubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/dubbo-consumer-applicationContext.xml");
        context.start();
        System.out.println("客户端已经启动");
        IDubboService dubboService = context.getBean(IDubboService.class);
        System.out.println("消费");
        System.out.println(dubboService.getPermissins("test",5));
    }
}
