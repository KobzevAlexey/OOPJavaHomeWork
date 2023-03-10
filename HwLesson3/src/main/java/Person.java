import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person extends Methods implements Serializable {
    private final String name;
    private final String sex;
    private int age;
    Person mather;
    Person father;
    private List<Methods> children;

    public Person(String name, String sex, int age) {
        super(null);
        this.name = name;
        this.sex = sex;
        this.age = age;
        children = new ArrayList<>();
    }


    public Person(String name, String sex, int age, Person mather, Person father) {
        super(null);
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mather = mather;
        this.father = father;
    }


    @Override
    public String toString() {
        String res = "Имя: " + name + ", Пол: " + sex + ", Возраст: " + age;
        if (this.mather != null) {
            res += ", Мать: " + mather.name;
        } else res += ", Мать: неизвестна";

        if (this.father != null) {
            res += ", Отец: " + father.name;
        } else res += ", Отец: неизвестен,";

        res += printChildren();

        return res;

    }


    public String getName() {
        return name;
    }

    public Methods getFather() {
        return father;
    }

    public Methods getMather() {
        return mather;
    }

    public void setAge(int age) {
        this.age = age;
    }
}