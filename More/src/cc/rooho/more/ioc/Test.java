package cc.rooho.more.ioc;

import javax.annotation.Resource;

/**
 * package : cc.rooho.more.ioc
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.6.28 10:29.
 */
public class Test {
    public static void main(String[] args) {
        Resource input = new ClassPathResource("cc/rooho/more/ioc/Bean.xml");//Bean.xml的路径

        System.out.println("resource is:" + input);

        BeanFactory factory = new XmlBeanFactory(input);//把input扔到工厂里面去，这个工厂就能为你提供实例了（我也不知道能不能这样说）

        Person person = (Person) factory.getBean("Person");//你要一个叫Person的东西，那好，工厂就去找“Person"给你
        Grade grade = (Grade)factory.getBean("Grade");
        System.out.println("姓名："+person.getName());//person可以调用里面相关的方法，就相当于new了一个Person一样
        System.out.println("年龄："+person.getAge());
        System.out.println("数学成绩："+grade.getMath());
        System.out.println("英语成绩："+grade.getEnglish());
        System.out.println("数学，英语总成绩："+person.getTotleGrade());
    }
}
