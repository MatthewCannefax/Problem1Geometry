import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Geometry g = new Geometry();
        System.out.println("I implemented: ");
        implementedInterfaceNames(g);
        int base = 2;
        int height = 6;
        System.out.println("Triangle area = " + g.area(base, height));
        System.out.println("Square area = " + g.area(height));
    }

    /*
     *  Takes an Object and prints the name of the interfaces it implemented
     */
    static void implementedInterfaceNames(Object o) {
        Class[] interfaces = o.getClass().getInterfaces();
        Arrays.sort(interfaces, new Comparator<Class>() {
            public int compare(Class o1, Class o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Class c : interfaces) {
            System.out.println(c.getName());
        }
    }

}
