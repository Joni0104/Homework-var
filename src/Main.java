public class Main {
    public static void main(String[] args) {
        System.out.println("Задача№1");
        double dog = 8;
        double cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача№2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача№3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача№4");
        var friends = 19;
        System.out.println(friends);
        friends = friends + 2;
        System.out.println(friends);
        friends = friends / 7;
        System.out.println(friends);

        System.out.println("Задача№5");
        double frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача№6");
        double boxFirstWeight = 78.2;
        double boxSecondWeingt = 82.7;
        System.out.println(boxFirstWeight + boxSecondWeingt);
        System.out.println("Разица между весами боксеров " + (boxSecondWeingt - boxFirstWeight));

        System.out.println("Задача№7");
        double differenceBetweenScales = boxSecondWeingt % boxFirstWeight;
        System.out.println(differenceBetweenScales);

        System.out.println("Задача№8");
        var time = 640;
        var timeEmployeeCompany = 8;
        var numberEmployees = time / timeEmployeeCompany;
        System.out.println("Всего работников в компании- " + numberEmployees + " человек");
        numberEmployees = numberEmployees + 94;
        System.out.println(numberEmployees);
        var newTime = numberEmployees * 8;
        System.out.println("Если в компании работает " + numberEmployees + " человек, то всего " + newTime + " часов " +
                "работы может быть поделено между сотрудниками.");






























    }
}