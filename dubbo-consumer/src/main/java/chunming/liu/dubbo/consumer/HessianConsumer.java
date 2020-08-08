package chunming.liu.dubbo.consumer;

import chunming.liu.dubbo.api.IDubboService;
import com.caucho.hessian.client.HessianProxyFactory;

import java.util.List;
import java.util.Map;

/**
 * 提供者用Dubbo的Hessian协议暴露服务，消费者直接用标准Hessian接口调用
 * https://blog.csdn.net/weixin_41986096/article/details/82627365
 * https://github.com/apache/dubbo/issues/5373
 * https://www.shangmayuan.com/a/29ea7caf809542859e77e6b3.html
 */
public class HessianConsumer {
    //todo: 跑不起来，调用不通。
    public static void main(String[] args) throws Throwable {
        String serviceUrl = "http://127.0.0.1:20881";
        HessianProxyFactory factory = new HessianProxyFactory();
        IDubboService dubboService = (IDubboService) factory.create(IDubboService.class, serviceUrl);
        Map<String, List> response = dubboService.getPermissins("hessiantest",8);
        System.out.println(response);
    }
}
