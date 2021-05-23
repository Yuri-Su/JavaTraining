package proxy_pattern;

public class ProxyObject implements Object{

    Object object;
    

    public ProxyObject() {
        System.out.println("这是代理类");
        this.object = new Objectimpl();
    }


    @Override
    public void action() {
        // TODO Auto-generated method stub
        System.out.println("代理开始");
        object.action();
        System.out.println("代理结束");
    }
    
}

