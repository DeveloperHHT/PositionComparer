import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------MENU----------\n" +
                "| 1- Circle           |\n" +
                "| 2- Rectangle        |\n" +
                "| 3- Line             |\n" +
                "| 4- Quit             |\n" +
                "-----------------------\n" +
                "Please select a menu item (1-4) -->");
        int m = input.nextInt();
        if (m == 1) {
            System.out.println("Enter Circle1's x- , y- and radius(Use blank between the coordinates and radius) -->");
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double r1 = input.nextDouble();
            System.out.println("Enter Circle2's x- , y- and radius(Use blank between the coordinates and radius) -->");
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double r2 = input.nextDouble();
            if (r1 < 0 || r2 < 0)
                System.out.println("Please enter a valid radius! (Radius must be positive)");
            else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) == (r1 + r2))
                System.out.println("Circles have an intersect at a point.");
            else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) > (r1 + r2))
                System.out.println("Circles are separate.");
            else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) == Math.abs(r1 - r2) && r1 > r2)
                System.out.println("Circle2 is inside Circle1 and circles have an intersect at a point.");
            else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) == Math.abs(r1 - r2) && r1 < r2)
                System.out.println("Circle1 is inside Circle2 and circles have an intersect at a point.");
            else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) < Math.abs(r1 - r2) && r1 > r2)
                System.out.println("Circle2 is inside Circle1.");
            else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) < Math.abs(r1 - r2) && r1 < r2)
                System.out.println("Circle1 is inside Circle2.");
            else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) > Math.abs(r1 - r2) && Math.abs(r1 - r2) >= 0)
                System.out.println("Circles have two intersects.");
            else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) == Math.abs(r1 - r2) && r1 == r2)
                System.out.println("Circles are overlapping.(They are same Circles.)");

        }
        else if (m == 2) {
            System.out.println("Enter Rectangle1's center x-, y- coordinates, width and height -->");
            double a1 = input.nextDouble();
            double b1 = input.nextDouble();
            double c1 = input.nextDouble();
            double d1 = input.nextDouble();
            System.out.println("Enter Rectangle2's center x-, y- coordinates, width and height -->");
            double a2 = input.nextDouble();
            double b2 = input.nextDouble();
            double c2 = input.nextDouble();
            double d2 = input.nextDouble();
            if (c1 < 0 || c2 < 0 || d1 < 0 || d2 < 0)
                System.out.println("Please enter valid variables!");
            else if (a1 == a2 && b1 == b2 && c1 == c2 && d1 == d2)
                System.out.println("Rectangles are overlapping.(They are same Rectangles.)");
            else if (Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2)) <= Math.sqrt((c1 - c2) * (c1 - c2) + (d1 - d2) * (d1 - d2)) && Math.sqrt((c1 * c1) + (d1 * d1)) >= Math.sqrt((c2 * c2) + (d2 * d2)) && d1>=d2 && c1>=c2 && 2*Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2)) <= Math.abs(c1-c2) && 2*Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2)) <= Math.abs(d1-d2))
                System.out.println("Rectangle2 is inside Rectangle1");
            else if (Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2)) <= Math.sqrt((c1 - c2) * (c1 - c2) + (d1 - d2) * (d1 - d2)) && Math.sqrt((c1 * c1) + (d1 * d1)) <= Math.sqrt((c2 * c2) + (d2 * d2)) && d1<=d2 && c1<=c2 && 2*Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2)) <= Math.abs(c1-c2) && 2*Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2)) <= Math.abs(d1-d2))
                System.out.println("Rectangle1 is inside Rectangle2");
            else if (Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2)) > (c1 + c2) && Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2)) > (d1 + d2))
                System.out.println("Rectangles are separate. There is no intersect point.");
            else if (((Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2)) < ((c1 + c2))) && (Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2)) < ((d1 + d2)))))
                System.out.println("Rectangles have intersects");


        }
        else if (m == 3) {
            System.out.println("Enter three points for P1, P2 and P3 :(x1, y1) (x2,y2) (x3,y3) -->");
            double p1 = input.nextDouble();
            double z1 = input.nextDouble();
            double p2 = input.nextDouble();
            double z2 = input.nextDouble();
            double p3 = input.nextDouble();
            double z3 = input.nextDouble();
            if ((p2-p1)*(z3-z1)-(p3-p1)*(z2-z1) > 0)
                System.out.println("P3 is on the left side of line from " + "(" + p1 + " , " + z1 + ")" + " to " + "(" + p2 + " , " + z2 + ")");
            else if ((p2-p1)*(z3-z1)-(p3-p1)*(z2-z1) < 0)
                System.out.println("P3 is on the right side of line from " + "(" + p1 + " , " + z1 + ")" + " to " + "(" + p2 + " , " + z2 + ")");
            else if ((p2-p1)*(z3-z1)-(p3-p1)*(z2-z1) == 0)
                System.out.println("P3 is on the line from " + "(" + p1 + " , " + z1 + ")" + " to " + "(" + p2 + " , " + z2 + ")");

        }
        else if (m == 4) {
            System.out.println("See you soon :)");
        }
        else if (m <= 0 || m >=5) {
            System.out.println("Please select a valid menu item next time!");

        }
    }
}