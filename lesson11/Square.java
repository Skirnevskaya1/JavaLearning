public class Square extends Figure implements Moveable {

    public Square(String name, double length) {
        super(name, length);
    }

    @Override
    public double findArea() {
        return (length * length);
    }

    @Override
    public double findPerimeter() {
        return (4 * length);
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public void shear(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double valueShear) throws InterruptedException {
        System.out.println("Наименование = " + name + "\n" + "Координаты фигуры: " + "\n" + x1 + " ; " + y1 + "\n" + x2 + " ; " + y2 + "\n" + x3 + " ; " + y3 + "\n" + x4 + " ; " + y4 + "\n" + "Величина сдвига : " + valueShear);
        double ay2 = y2 + valueShear;
        double ax3 = x3 + valueShear;
        double ay3 = y3 + valueShear;
        double ax4 = x4 + valueShear;
        Thread.sleep(2000);
        System.out.println("Ожидайте результата...");
        Thread.sleep(5000);
        System.out.println("\n" + "Координаты фигуры после сдвига: " + "\n" + x1 + " ; " + y1 + "\n" + x2 + " ; " + ay2 + "\n" + ax3 + " ; " + ay3 + "\n" + ax4 + " ; " + y4);
    }

    @Override
    public void rotation(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double degrees) {
        System.out.println("Наименование = " + name + "\n" + "Координаты фигуры: " + "\n" + x1 + " ; " + y1 + "\n" + x2 + " ; " + y2 + "\n" + x3 + " ; " + y3 + "\n" + x4 + " ; " + y4 + "\n" + "Угол поворота : " + degrees);
        double ax1 = (x1 * (Math.cos(degrees))) - (y1 * (Math.sin(degrees)));
        double ay1 = (x1 * (Math.sin(degrees))) + (y1 * (Math.cos(degrees)));

        double ax2 = (x2 * (Math.cos(degrees))) - (y2 * (Math.sin(degrees)));
        double ay2 = (x2 * (Math.sin(degrees))) + (y2 * (Math.cos(degrees)));

        double ax3 = (x3 * (Math.cos(degrees))) - (y3 * (Math.sin(degrees)));
        double ay3 = (x3 * (Math.sin(degrees))) + (y3 * (Math.cos(degrees)));

        double ax4 = (x4 * (Math.cos(degrees))) - (y4 * (Math.sin(degrees)));
        double ay4 = (x4 * (Math.sin(degrees))) + (y4 * (Math.cos(degrees)));
        System.out.println("\n" + "Координаты фигуры после поворота: " + "\n" + ax1 + " ; " + ay1 + "\n" + ax2 + " ; " + ay2 + "\n" + ax3 + " ; " + ay3 + "\n" + ax4 + " ; " + ay4);

    }
}
