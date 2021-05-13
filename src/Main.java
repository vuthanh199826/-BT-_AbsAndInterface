public class Main {
    public static void main(String[] args) {
        Shape obj[] = new Shape[2];
        obj[0] = new Square();
        obj[1] = new Retangle();

        System.out.println("before");

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        System.out.println("after");

        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof Colorable) {
                System.out.println(obj[i]);
                ((Colorable) obj[i]).howToColor();
            } else {
                System.out.println(obj[i]);
            }
        }
    }
}
