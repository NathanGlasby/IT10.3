package continentarea;

public class ContinentManager {

    public static void main(String[] args) {
        ContinentArea ca = new ContinentArea();
        ca.populate();
        System.out.println(ca.display());
    }
}
