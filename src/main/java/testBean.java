import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext path = new ClassPathXmlApplicationContext("config.xml");

        FirstBean bean = path.getBean(FirstBean.class);
        {
            System.out.println(bean.getName());
            FirstBean mombean = (FirstBean) path.getBean("firstBean");
            System.out.println(mombean.getName());
        }
        path.close();
    }
}
