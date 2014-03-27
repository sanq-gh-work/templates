package sanq.example.collections.tree;

/**
 * Created with IntelliJ IDEA.
 * User: pospelov
 * Date: 15.04.13
 * Time: 12:03
 * To change this template use File | Settings | File Templates.
 */
public class launcher {

    public static void main(String[] args) {
        Area area = new Area();
        area.addPoint(new Point(100, 101));
      //  area.addPoint(new Point(902, 103));
      //  area.addPoint(new Point(104, 905));
      //  area.addPoint(new Point(906, 907));

        System.out.println(area.selectPoints(200, 700, 300, 800));
        System.out.println(area.selectPoints(0, 500, 0, 500));
       // System.out.println(area.selectPoints(0, 500, -1000, 1000000));
       // System.out.println(area.selectPoints(400, 2000, 500, 5000));
       // System.out.println(area.selectPoints(-100, 1100, -100, 1100));
    }
}
