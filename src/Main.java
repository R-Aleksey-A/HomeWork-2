public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 767789;
        System.out.println("dog=" + dog + " cat=" + cat + " paper=" + paper);

        System.out.println("Задание 2");
        var dogIncrease = (dog + 4);
        System.out.println("dog+4=" + dog);
        var catIncrease = (cat + 4);
        System.out.println("cat+4=" + cat);
        var paperIncrease = (paper + 4);
        System.out.println("paper+4=" + paper);

        System.out.println("dog+4=" + dogIncrease + " cat+4=" + catIncrease + " paper+4=" + paperIncrease);

        System.out.println("Задание 3");
        System.out.println("Вариант 1 уменьшение числа заданного в условии Задания 1");
        var dogDecrease = (dog - 3.5);
        var catDecrease = (cat - 1.6);
        var paperDecrease = (paper - 7639);
        System.out.println("dog-3.5=" + dogDecrease + " cat-1.6=" + catDecrease + " paper-7639=" + paperDecrease);
        System.out.println("Вариант 2 уменьшение числа полученного в Задании 2");
        var DogDecrease = (dogIncrease - 3.5);
        var CatDecrease = (catIncrease - 1.6);
        var PaperDecrease = (paperIncrease - 7639);
        System.out.println("(dog+4)-3.5=" + DogDecrease + " (cat+4)-1.6=" + CatDecrease + " (paper+4)-7639=" + PaperDecrease);
        System.out.println("Вариант 3 уменьшение числа полученного из-за Задания-2 с помощью уровнения в переменной");
        var Dog = ((dog + 4) - 3.5);
        var Cat = ((cat + 4) - 1.6);
        var Paper = ((paper + 4) - 7639);
        System.out.println("(dog+4)-3.5=" + Dog + " (cat+4)-1.6="+Cat+ "(paper+4)-7639="+Paper);
    }
}