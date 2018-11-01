package anikina.olga.tasks.java.main.secondTask;


public class Constraction {
    public enum Poets {Dostoevsky, Tolstoy, Gogol, Esenin, Fet}

    public void elseIf(Poets poets) {
        if (poets == Poets.Dostoevsky) {
            System.out.println(" Poets is " + poets);
        } else if (poets == Poets.Tolstoy) {
            System.out.println(" Poets is " + poets);
        } else if (poets == Poets.Gogol) {
            System.out.println(" Poets is " + poets);
        } else if (poets == Poets.Esenin) {
            System.out.println(" Poets is " + poets);
        } else if (poets == Poets.Fet) {
            System.out.println(" Poets is " + Poets.Fet);
        } else {
            System.out.println("Don't have poets");
        }
    }

    public void switchConstrustion(Poets poets) {
        switch (poets) {
            case Dostoevsky: {
                System.out.println(" Poets is " + Poets.Dostoevsky);
                break;
            }
            case Tolstoy: {
                System.out.println(" Poets is " + Poets.Tolstoy);
                break;
            }
            case Gogol: {
                System.out.println(" Poets is " + Poets.Gogol);
                break;
            }
            case Esenin: {
                System.out.println(" Poets is " + Poets.Esenin);
                break;
            }
            case Fet: {
                System.out.println(" Poets is " + Poets.Fet);
                break;
            }
            default: {
                System.out.println("Don't have poets");
                break;
            }
        }
    }

    public void calculateForArray() {
        OtherArrays array = new OtherArrays();
        int[] result = array.createArrays(0, 10, 50);
        System.out.println(array.toString());
        long startTime = System.nanoTime();
        smartCalculate(result);
        long finishTimeOfSmart = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        elseIfCalculate(result);
        long finishTimeOfElseIf = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        switchCalculate(result);
        long finishTimeOfSwitch = System.nanoTime() - startTime;
        System.out.println(" Smart work : " + finishTimeOfSmart + "\nElse - if work : "
                + finishTimeOfElseIf + "\nSwitch work : " + finishTimeOfSwitch);
    }

    private void smartCalculate(int[] array) {
        System.out.println("\n\nSmart construction: ");
        int[] counter = new int[11];
        for (int i = 0; i < array.length; i++) {
            counter[array[i]]++;
        }
        for (int i = 0; i < counter.length; i++) {
            System.out.println(" Value " + i + " contain in array " + counter[i]);
        }
    }

    private void elseIfCalculate(int[] array) {
        System.out.println("\n\nElse - if construction: ");
        int[] counter = new int[11];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counter[0]++;
            } else if (array[i] == 1) {
                counter[1]++;
            } else if (array[i] == 2) {
                counter[2]++;
            } else if (array[i] == 3) {
                counter[3]++;
            } else if (array[i] == 4) {
                counter[4]++;
            } else if (array[i] == 5) {
                counter[5]++;
            } else if (array[i] == 6) {
                counter[6]++;
            } else if (array[i] == 7) {
                counter[7]++;
            } else if (array[i] == 8) {
                counter[8]++;
            } else if (array[i] == 9) {
                counter[9]++;
            } else if (array[i] == 10) {
                counter[10]++;
            }
        }
        for (int i = 0; i < counter.length; i++) {
            System.out.println(" Value " + i + " contain in array " + counter[i]);
        }

    }

    public void switchCalculate(int[] array) {
        System.out.println("\n\nSwitch construction: ");
        int[] counter = new int[11];
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 0: {
                    counter[0]++;
                    break;
                }
                case 1: {
                    counter[1]++;
                    break;
                }
                case 2: {
                    counter[2]++;
                    break;
                }
                case 3: {
                    counter[3]++;
                    break;
                }
                case 4: {
                    counter[4]++;
                    break;
                }
                case 5: {
                    counter[5]++;
                    break;
                }
                case 6: {
                    counter[6]++;
                    break;
                }
                case 7: {
                    counter[7]++;
                    break;
                }
                case 8: {
                    counter[8]++;
                    break;
                }
                case 9: {
                    counter[9]++;
                    break;
                }
                default: {
                    counter[10]++;
                }
            }

        }
        for (int i = 0; i < counter.length; i++) {
            System.out.println(" Value " + i + " contain in array " + counter[i]);
        }

    }


}
