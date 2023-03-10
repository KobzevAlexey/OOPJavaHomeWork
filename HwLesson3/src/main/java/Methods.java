import java.io.Serializable;
import java.util.List;

public class Methods {
    private List<Person> children;
    private String sex;

    public Methods(List<Person> children) {
        this.children = children;
    }

    public void addChild(Person child) {
        children.add(child);
        if (this.sex.equals("муж.")) {
            child.father = (Person) this;
        } else child.mather = (Person) this;
    }

    public String printChildren() {
        String res = " Дети: ";
        if (!this.children.isEmpty()) {
            StringBuilder resBuilder = new StringBuilder(" Дети: ");
            for (Person child : children) {
                resBuilder.append(child.getName()).append(",");
            }
            res = resBuilder.toString();
        } else res += " нет";
        return res;
    }

    public void saveObj() {
        IO save = new IO();
        save.save("FreeFamily.data", (Serializable) this);
    }
}
