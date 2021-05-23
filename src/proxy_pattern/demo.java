/*
 * @Description: 测试代理类
 * @Author: Yuri Su
 * @Date: 2021-05-23 15:39:26
 */
package proxy_pattern;

public class demo {

    public static void main(String[] args) {
        Object object = new ProxyObject();
        object.action();
    }
    
}
