import modele.RatioCalculator;
import presenter.Presenter;
import view.View;

public class Main {
    public static void main(String[] args) {
        var v = new View();
        var r = new RatioCalculator();
        Presenter presenter = new Presenter(v, r);
        presenter.menuCalculator();
    }
}