import java.util.Arrays;

public class EnumExample {
    public static void main(String[] args) {

        Color c1 = Color.RED;
        Color c2 = Color.GREEN;
        Color c3 = Color.BLUE;
        Color c4 = Color.BLACK;


        Models m1 = Models.LADA;
        Models m2 = Models.JEEP;
        Models m3 = Models.KIA;
        Models m4 = Models.FORD;

        Car car1 = new Car(m1, c1);
        Car car2 = new Car(m2, c2);
        Car car3 = new Car(m3, c3);
        Car car4 = new Car(m4, c4);
        car1.sayInfo();
        car2.sayInfo();
        car3.sayInfo();
        car4.sayInfo();

//        System.out.println(c2.ordinal());// порядковый номер
//        System.out.println(c2);

//
//        Color.values();                   // просмотр значений в Enum
//        Color [] str = Color.values();
//        System.out.println(Arrays.toString(str));
    }
}

enum Color {
    RED, GREEN, BLUE, BLACK
}

enum Models {
    LADA, JEEP, KIA, FORD
}

class Car {
    Models model;
    Color color;

    public Car(Models model, Color color) {
        this.model = model;
        this.color = color;

    }

    public void sayInfo() {
        System.out.println("Наша машина " + model + " " + color);
    }

}


