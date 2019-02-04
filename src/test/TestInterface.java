package test;

public interface TestInterface {

    interface Shape {

        void draw();

        double area();
    }

    interface Goper {

        void draw();

        double area();
    }

    class Rectangle implements Shape, Goper {

        int length, width;

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public void draw() {
            System.out.println("Rectangle has been drawn ");
        }

        @Override
        public double area() {
            return (double) (length * width);
        }
    }

    class Circle implements Shape {

        double pi = 3.14;
        int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        @Override
        public void draw() {
            System.out.println("Circle has been drawn ");
        }

        @Override
        public double area() {
            return (double) ((pi * radius * radius) / 2);
        }

    }

    class GFG {

        public static void main(String[] args) {
            TestInterface.Shape rect = new Rectangle(2, 3);
            System.out.println("Area of rectangle: " + rect.area());

            Shape circle = new Circle(2);
            System.out.println("Area of circle: " + circle.area());
        }
    }

}
