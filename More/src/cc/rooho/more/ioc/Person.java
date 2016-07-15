package cc.rooho.more.ioc;

/**
 * package : cc.rooho.more.ioc
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.6.28 10:25.
 */
public class Person {
    private String name;
    private int age;
    private Grade grade;
    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getTotleGrade() {
        return grade.getEnglish() + grade.getMath();
    }
}
