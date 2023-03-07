import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {
    private final String name;
    private final String sex;
    private int age;
    private Person mather;
    private Person father;
    private List<Person> children;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        children = new ArrayList<>();
    }


    public Person(String name, String sex, int age, Person mather, Person father) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mather = mather;
        this.father = father;
    }


    public void addChild(Person child) {
        this.children.add(child);
        if (this.sex.equals("муж.")) {
            child.father = this;
        } else child.mather = this;
    }

    public String printChildren() {
        String res = " Дети: ";
        if (!this.children.isEmpty()) {
            StringBuilder resBuilder = new StringBuilder(" Дети: ");
            for (Person child : children) {
                resBuilder.append(child.name).append(",");
            }
            res = resBuilder.toString();
        } else res += " нет";
        return res;
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

    public Person getFather() {
        return father;
    }

    public Person getMather() {
        return mather;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void saveObj() {
        IO save = new IO();
        save.save("FreeFamily.data", this);
    }
}