public class Main {
    public static void main(String[] args){
    // Задание 1,2,3
    var cat = 3.6;
    var dog = 8;
    var paper = 763789;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);
    dog = dog + 4;
    cat = cat + 4;
    paper = paper + 4;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);
    dog = (int)(dog - 3.5); /*я не очень понял, если не привести тип к int (и потерять часть данных)
    или не объявить изначально dog как double то IDEA ругается. p/s я посмотрел в решении что нужно
    было просто объявить дополнительную переменную, но из за задачи это вообще никак не понять было))*/
    cat = cat - 1.6;
    paper = paper - 7639;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);
    // Задание 4,5
    var fiend = 19;
    System.out.println(fiend);
    fiend = fiend * 2;
    System.out.println(fiend);
    fiend = fiend / 7;
    System.out.println(fiend);
    var frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog / 3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);
    // Задание 6,7
    var firstFighterWeight = 78.2;
    var secondFighterWeight = 82.7;
    var totalFightersWeight = firstFighterWeight + secondFighterWeight;
    System.out.println("Общий вес двух бойцов = " + totalFightersWeight + " кг.");
    var fightersWeightDifferent = secondFighterWeight - firstFighterWeight;
    System.out.println("Разница в весе бойцов составляет = " + fightersWeightDifferent + " кг.");
    var fightersWeightDifferentSub = secondFighterWeight - firstFighterWeight;
    var fightersWeightDifferentRem = secondFighterWeight % firstFighterWeight;
    System.out.println("Разница веса первым способом - " + fightersWeightDifferentSub );
    System.out.println("Разница веса вторым способом - " + fightersWeightDifferentRem );
    // Задание 8
        var totalWorkHours = 640;
        var workingTimeOfOneEmployee = 8;
        var amountOfEmployee = totalWorkHours / workingTimeOfOneEmployee;
        System.out.println("Всего работников в компании – " + amountOfEmployee + " человек.");
        var newAmountOfEmployee = amountOfEmployee + 94;
        var newWorkingTimeOfOneEmployee = newAmountOfEmployee * workingTimeOfOneEmployee;
        System.out.println("Если в компании работает " + newAmountOfEmployee + " человека, то всего " + newWorkingTimeOfOneEmployee + " часа работы может быть поделено между сотрудниками.");
    }
}