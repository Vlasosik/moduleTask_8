public interface DrawShapes {
    void draw();

    abstract class Shape implements DrawShapes {
        protected double area;

        public abstract void draw();

    }

    class Circle extends Shape implements DrawShapes {
        private double radius;

        @Override
        public String toString() {
            String colorName = getColor().getColorName();
            return "Радіус кола дорівнює: " + radius + ", площа дорівнює: " + getArea() + ", колір нашої фігури " +
                    colorName + ";";
        }

        @Override
        public void draw() {
            System.out.println("Малюємо коло та його дані:");
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        private Circle() {
            radius = 0.0;
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        private double getArea() {
            return calculateArea();
        }

        private double calculateArea() {
            return radius * radius * Math.PI;
        }

        private ColorEnum getColor() {
            return ColorEnum.WHITE;
        }
    }

    class Square extends Shape implements DrawShapes {
        private double sideLength;

        @Override
        public void draw() {
            System.out.println("Малюємо квадрат та його дані:");
        }

        @Override
        public String toString() {
            String colorName = getColor().getColorName();
            return "Периметр квадрата дорівнює: " + getPerimeter() + ", площу дорівнює " + getArea() + ", колір нашої фігури "
                    + colorName + ";";
        }


        public double getSideLength() {
            return sideLength;
        }

        public void setSideLength(double sideLength) {
            this.sideLength = sideLength;
        }

        public Square(double sideLength) {
            this.sideLength = sideLength;
        }

        private double getArea() {
            return sideLength * sideLength;
        }

        public double getPerimeter() {
            return 4 * sideLength;
        }

        private ColorEnum getColor() {
            return ColorEnum.BLUE;
        }

    }

    class Triangle extends Shape implements DrawShapes {

        private double base;
        private double high;

        @Override
        public void draw() {
            System.out.println("Малюємо Трикутник та його дані:");
        }

        @Override
        public String toString() {
            String colorName = getColor().getColorName();
            return "Основа трикутника: " + base + ", висота трикутника " + high + ", площа трикутника дорівнює: "
                    + getArea() + ", колір нашої фігури " + colorName + ";";
        }

        public Triangle(double base, double high) {
            this.base = base;
            this.high = high;
        }

        public Triangle() {
            base = 0.0;
            high = 0.0;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getHigh() {
            return high;
        }

        public void setHigh(double high) {
            this.high = high;
        }

        private double calculateArea() {
            area = (base * high) / 2;
            return area;
        }

        private double getArea() {
            return calculateArea();
        }

        private ColorEnum getColor() {
            return ColorEnum.YELLOW;
        }

    }

    class Diamond extends Shape implements DrawShapes {
        private double diagonal1;
        private double diagonal2;

        @Override
        public void draw() {
            System.out.println("Малюємо Ромб та його дані:");
        }

        @Override
        public String toString() {
            String colorName = getColor().getColorName();
            return "Діагоналі ромба дорівнюють: " + diagonal1 + ", " + diagonal2 + ", площа ромба дорівнює: " +
                    getArea() + ", периметр ромба дорівнює: " + getPerimeter() + ", колір нашої фігури " + colorName + ";";
        }

        public Diamond(double diagonal1, double diagonal2) {
            this.diagonal1 = diagonal1;
            this.diagonal2 = diagonal2;
        }

        public double getDiagonal1() {
            return diagonal1;
        }

        public void setDiagonal1(double diagonal1) {
            this.diagonal1 = diagonal1;
        }

        public double getDiagonal2() {
            return diagonal2;
        }

        public void setDiagonal2(double diagonal2) {
            this.diagonal2 = diagonal2;
        }

        private double getArea() {
            return (diagonal1 * diagonal2) / 2;
        }

        public double getPerimeter() {
            double side = Math.sqrt((diagonal1 * diagonal1 + diagonal2 * diagonal2) / 4);
            return 4 * side;
        }

        private ColorEnum getColor() {
            return ColorEnum.ORANGE;
        }

    }

    class Rectangle extends Shape implements DrawShapes {
        private double length;
        private double width;

        @Override
        public void draw() {
            System.out.println("Малюємо Прямокутник та його дані:");
        }

        @Override
        public String toString() {
            String colorName = getColor().getColorName();
            return "Ширина прямокутника: " + width + ", довжина прямокутинка: " + length + ", "
                    + "площа прямокутника дорівнює : " + getArea() + ", колір нашої фігури " + colorName + ";";
        }

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        private double getArea() {
            return calculateArea();
        }

        private double calculateArea() {
            return area = width * length;
        }

        private ColorEnum getColor() {
            return ColorEnum.GREEN;
        }
    }

    class Star extends Shape implements DrawShapes {
        public String toString() {
            String colorName = getColor().getColorName();
            return "Колір нашої фігури " + colorName;
        }

        private ColorEnum getColor() {
            return ColorEnum.GOLD;
        }

        @Override
        public void draw() {
            System.out.println("Малюємо зірочку");
            System.out.println("Для такого типу фігур площа не розраховується)");
        }

    }
}
