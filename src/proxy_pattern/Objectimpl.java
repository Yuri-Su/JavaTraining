/*
 * @Description: 创建实现接口的实体类。
 * @Author: Yuri Su
 * @Date: 2021-05-23 15:26:02
 */
package proxy_pattern;

public class Objectimpl implements Object {

    @Override
    public void action() {
        // TODO Auto-generated method stub
        System.out.println("==============");
        System.out.println("这是被代理的类");
        System.out.println("==============");
    }

}
