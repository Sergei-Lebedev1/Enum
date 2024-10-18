//Реализовать код на Java
//Упр. Написать enum Season с константами WINTER, SUMMER, SPRING, AUTUMN.
//Написать класс Cat с полями имя, цвет, сезон (поле сезон типа Season).
//Конструктор принимает все три поля.
//В классе создать метод, который в зависимости от сезона сообщает, что делает кошка.
public class EnumSeason {
    public static void main(String[] args) {

        Season s1 = Season.WINTER;
        Season s2 = Season.SUMMER;
        Season s3 = Season.SPRING;
        Season s4 = Season.AUTUMN;


        Cat cat1 = new Cat("Барсик", "Черный", s1);
        Cat cat2 = new Cat("Васька","Белый",s2);
        Cat cat3 = new Cat("Мурка","Серая",s3);
        Cat cat4 = new Cat("Кузя","Пятнистый",s2);

        cat1.catInfo();
        cat2.catInfo();
        cat3.catInfo();
        cat4.catInfo();


    }
}

enum Season {
    WINTER, SUMMER, SPRING, AUTUMN
}

class Cat {
    String name;
    String color;
    Season season;

    public Cat(String name, String color, Season season) {
        this.name = name;
        this.color = color;
        this.season = season;
    }

    public void catInfo() {

        switch (season) {
            case WINTER:
                System.out.println(name + " " +color+ " много спит зимой.");
                break;
            case SUMMER:
                System.out.println(name + " " +color+ " летом играет на улице.");
                break;
            case SPRING:
                System.out.println(name + " " +color+ " наслаждается цветущими цветами весной.");
                break;
            case AUTUMN:
                System.out.println(name + " " +color+ " наблюдает, как опадают листья осенью..");
                break;
        }
    }
}

