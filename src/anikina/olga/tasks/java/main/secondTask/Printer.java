package anikina.olga.tasks.java.main.secondTask;

public class Printer {
    public static void main(String[] args) {
        ArraySort array1 = new ArraySort(10);
        System.out.println("Input array :");
        System.out.println(array1.toString());

        // Bubble Sort
        System.out.println("\n\nBubble sort: ");
        long startTimeOfBubble = System.nanoTime();
        ArraySort result1 = array1.bubbleSort();
        long finishTimeOfBubble = System.nanoTime() - startTimeOfBubble;
        System.out.println("Output array :");
        System.out.println(result1.toString());
        System.out.println("Time of work:  " + finishTimeOfBubble);

        // Sort of insert
        System.out.println("\n\nInsert sort: ");
        long startTimeOfInsert = System.nanoTime();
        ArraySort result2 = array1.insertSort();
        long finishTimeOfInsert = System.nanoTime() - startTimeOfInsert;
        System.out.println("Output array :");
        System.out.println(result2.toString());
        System.out.println("Time of work:  " + finishTimeOfInsert);


        // Default Sort
        System.out.println("\n\nDefault sort: ");
        long startTimeOfDefault = System.nanoTime();
        ArraySort result3 = array1.defaultSort();
        long finishTimeOfDefault = System.nanoTime() - startTimeOfDefault;
        System.out.println("Output array :");
        System.out.println(result3.toString());
        System.out.println("Time of work:  " + finishTimeOfDefault);

        // Factorial
        System.out.println("\n\n\nWork of Factorial:");
        Factorial factorialRecursion = new Factorial();
        Factorial factorial = new Factorial(6);

        System.out.println("Recursion: ");
        long startTimeOfFactorialWithRecursion = System.nanoTime();
        System.out.println(factorialRecursion.factorialRecursion(6));
        long finishTimeOfFactorialWithRecoursion = System.nanoTime() - startTimeOfFactorialWithRecursion;
        System.out.println("Time of work:  " + finishTimeOfFactorialWithRecoursion);
        System.out.println("\n Without recursion: ");
        long startTimeOfFactorial = System.nanoTime();
        System.out.println(factorial.factorial());
        long finishTimeOfFactorial = System.nanoTime() - startTimeOfFactorial;
        System.out.println("Time of work:  " + finishTimeOfFactorial);

        //Print Character images
        System.out.println("\n\nPrint Character images :");
        CharacterImages characterImages = new CharacterImages();
        characterImages.printRectangle();
        System.out.println("\n\n");
        characterImages.printTriangle();
        System.out.println("\n\n");
        characterImages.printZ();
        System.out.println("\n\n");
        characterImages.printReverceZ();
        System.out.println("\n\n");
        characterImages.printZero();

        //Task 4 linear array
        System.out.println("\n\n Task 4. Work with linear arrays");
        System.out.println("\n 4.a Direct Order array with odd numbers");
        OtherArrays otherArrays = new OtherArrays();
        otherArrays.aDirectOrder();
        System.out.println("\n 4.a Reverse Order array with odd numbers");
        otherArrays.aReverseOrder();
        System.out.println("\n\n 4.b ");
        otherArrays.bToDo();
        System.out.println("\n\n 4.c");
        otherArrays.cToDo();
        System.out.println("\n\n 4.d ");
        otherArrays.dToDo();
        System.out.println("\n\n 4.e ");
        otherArrays.eToDo();
        System.out.println("\n\n 4.f ");
        otherArrays.fToDo();

        //Task 5 matrix
        System.out.println("\n\n Task 5. Work with two-dimensional arrays");
        System.out.println("\n\n 5.a ");
        otherArrays.a5ToDo();
        System.out.println("\n\n 5.b ");
        otherArrays.b5ToDo();
        System.out.println("\n\n 5.c ");
        otherArrays.c5ToDo();
        System.out.println("\n\n 5.d ");
        otherArrays.d5ToDo();

        //Task 6 work with constraction
        System.out.println("\n\n Task 6. Work with construction");
        System.out.println("\n6.1");
        Constraction constraction = new Constraction();
        System.out.println("If - else construction:");
        long startTime = System.nanoTime();
        constraction.elseIf(Constraction.Poets.Fet);
        long finishTime = System.nanoTime() - startTime;
        System.out.println(" If - else work  = "  + finishTime);
        System.out.println("Switch construction:");
        startTime = System.nanoTime();
        constraction.switchConstrustion(Constraction.Poets.Fet);
        finishTime = System.nanoTime() - startTime;
        System.out.println("Switch work  = " + finishTime);
        System.out.println("\n\n6.2");
        constraction.calculateForArray();


    }
}
