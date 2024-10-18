//Упр. Написать метод,
//который принимает ArrayList строк,
//оборачивает каждое слово в скобочки и выводит результат в консоль.

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        // Создаем студента
        Student student1 = new Student("Иван");
        Student student2 = new Student("Маша");
        Student student3 = new Student("Саша");

        // Устанавливаем оценку
        student1.setGrade(5);
        student1.setGrade(3);
        student1.setGrade(4);
        student2.setGrade(5);
        student2.setGrade(5);
        student2.setGrade(3);
        student3.setGrade(3);
        student3.setGrade(4);
        student3.setGrade(4);

        // Показываем информацию об оценках студента
        student1.info();
        student2.info();
        student3.info();

        // Показываем средний балл студента
        System.out.println("Средний балл: " + student1.average());
        System.out.println("Средний балл: " + student2.average());
        System.out.println("Средний балл: " + student3.average());
    }

    String name;
    ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void setGrade(int grade) {
        grades.add(grade);
    }

    public double average() {

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void info() {
        System.out.println("Текущие оценки: '" + name + "' "+ "\n" + grades);
    }
}

