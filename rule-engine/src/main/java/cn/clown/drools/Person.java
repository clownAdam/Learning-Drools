package cn.clown.drools;

/**
 * TODO
 *
 * @author clown
 * @version 1.0
 * @date 2021/4/7 17:13
 */
public class Person {
    private String name;
    private int age;
    private String desc;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
