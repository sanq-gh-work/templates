
package sanq.example.collections.tree;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


/**
 * Created with IntelliJ IDEA.
 * User: pospelov
 * Date: 15.04.13
 * Time: 10:27
 * To change this template use File | Settings | File Templates.
 *
 *
 *
 */
public class Area {
    private final NavigableSet<Point> xIndex
            = new TreeSet<Point>(new Comparator<Point>() {
        @Override
        public int compare(Point point0, Point point1) {
        return point0.getX() - point1.getX();
    }
});

    private final NavigableSet<Point> yIndex
            = new TreeSet <Point> (new Comparator<Point>() {
        @Override
        public int compare(Point point0, Point point1) {
            return point0.getY() - point1.getY();
        }
    });

    void addPoint(Point point) {
        xIndex.add(point);
        yIndex.add(point);
    }

    Collection<Point> selectPoints( int leftX, int rightX, int bottomY, int topY) {
        Point leftEdge = new Point(leftX, 0);
        Point rightEdge = new Point(rightX, 0);
        Point bottomEdge = new Point(0, bottomY);
        Point topEdge = new Point(0, topY);
        // vertical strip
        Collection<Point> xSelection = xIndex.subSet(leftEdge, true, rightEdge, true);
        // horizontal strip
        Collection<Point> ySelection = yIndex.subSet(bottomEdge, true, topEdge, true);
        // strip intersection == rectangle
        xSelection.retainAll(ySelection);
        return xSelection;
    }
}
