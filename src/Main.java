public class Main {
    public static void main(String[] args) {

        task1_2_3();
        task4_5();
        task6_7();
        task8();
    }
    public static void task1_2_3() {
        System.out.println("task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("task 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("task 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
    }
    public static void task4_5() {
        System.out.println("task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();
    }
    public static void task6_7() {
        System.out.println("task 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Общий вес боксёров " + totalWeight + " кг!");
        System.out.println("Разница в весе боксёров " + weightDifference + " кг!");

        System.out.println("task 7");
        System.out.println("Вычитание из большего веса меньшего.");
        weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе боксёров " + weightDifference + " кг!");
        System.out.println("C помощью функции остаток от деления");
        weightDifference = secondBoxer % firstBoxer;
        System.out.println("Разница в весе боксёров " + weightDifference + " кг!");
    }
    public static void task8() {
        System.out.println();
        System.out.println("task 8");
        var totalWorkingHours = 640;
        var job = 8;
        var workers = totalWorkingHours / job;
        System.out.println("Всего работников в компании - " + workers + " человек");
        workers = workers + 94;
        totalWorkingHours = workers * job;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками");
    }

}