public class Geometry implements Triangle, Square {
    @Override
    public int area(int length) {
        return length * 2;
    }

    @Override
    public int area(int base, int height) {
        return (base * height)/2;
    }
}
