public class main5 {


    public static void main(String[] args) {

    }
}



abstract class Shape {
    public abstract double area_calculation(int a);
}



class Circle extends Shape {

    public double area_calculation(int a) {
        return Math.PI * a * a;
    }
}

class Rectangle extends Shape {

    public double area_calculation(int a) {
        return a * a;
    }
}

class Square extends Shape {

    public double area_calculation(int a) {
        return a * a;
    }
}


