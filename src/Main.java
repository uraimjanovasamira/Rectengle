//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        System.out.println("------------CIRCLE-----------");
        System.out.println("square:"+circle.square()+"\n" +"perimeter:"+circle.perimeter());


        Rectangle rectangle=new Rectangle(5,6);
        System.out.println("-------------RECTANGLE--------");
        System.out.println("square:"+rectangle.square()+"\n"
                +"perimeter:"+rectangle.perimeter());

        Triangle triangle=new Triangle(8,8,8);
        System.out.println("-------------TRIANGLE----------");
        System.out.println("square:"+triangle.square()+"\n"
                +"perimeter:"+triangle.perimeter());
    }
}