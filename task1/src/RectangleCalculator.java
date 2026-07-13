public class RectangleCalculator
{
    public static void main(String[]args) {
        // declaring variables
        double length = 12.5;
        double width = 8.0;
        double area;
        double perimeter;
        // adding area and perimeter formula
        area = length * width;
        perimeter = 2 * (length + width);
        // printing messages with values
        System.out.println("Entered length is : " + length);
        System.out.println("Entered width is : " + width);
        System.out.println("The area is : " + area);
        System.out.println("The perimeter is : " + perimeter);

    }
}
