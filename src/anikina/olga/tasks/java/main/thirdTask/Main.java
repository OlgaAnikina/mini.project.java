package anikina.olga.tasks.java.main.thirdTask;


public class Main {
    public static void main(String[] args) {
        MyListVSDefault compare = new MyListVSDefault();
        ArrayVSLinked compareArrayVSLinked = new ArrayVSLinked();
        CompareSets compareSets = new CompareSets();
        CompareMap compareMap = new CompareMap();

        compare.compareOperation();
        compareArrayVSLinked.compareOperation();
        compareSets.compareOperation();
        compareMap.compareOperation();


    }
}
