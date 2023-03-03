import java.util.ArrayList;

public class FamilyTree {
    public static void main(String[] args) {
        Person sergei = new Person("Сергей", "муж.",
                45, "Александра", "Петр", "Анна");
        System.out.println(sergei);

        ArrayList<String> child = new ArrayList<String>();
        sergei.addChild1(child, "Дмитрий");
        sergei.addChild1(child, "Оля");
        sergei.printChild();


        ArrayList<Children> children = new ArrayList<>();

        Children nikolai = new Children("Николай", "муж.", 25, "Мария",
                sergei.getNameAncestor(), sergei.getWife());

        Children dim = new Children("Дмитрий", "муж.", 19, "нет",
                sergei.getNameAncestor(), sergei.getWife());


        sergei.addChild2(children, nikolai);
        sergei.addChild2(children, dim);


        sergei.allChildren();
    }
}
