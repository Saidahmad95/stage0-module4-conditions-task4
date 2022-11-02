package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int temp,greatest;
        temp=first>second?first:second;
        greatest=third>temp?third:temp;
        System.out.println(greatest);
    }
}
