package chunming.liu.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * The most common way to use Dubbo is to run it in Spring framework.
 * The following content will guide you to develop a Dubbo application with Spring framework's XML configuration.
 * Dubbo缺省协议采用单一长连接和NIO异步通讯，适合于小数据量大并发的服务调用，以及服务消费者机器数远大于服务提供者机器数的情况
 *
 * Hessian协议用于集成Hessian的服务，Hessian底层采用Http通讯，采用Servlet暴露服务。适用场景：传入传出参数数据包较大，提供者比消费者个数多，提供者压力较大，可传文件。因此比较高效的做法是带上传下载文件的服务使用hessian协议，去普通的服务使用dubbo协议。
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/dubbo-provider-applicationContext.xml");
        context.start();
        System.out.println("服务已经启动了");
        System.in.read();
    }
}
