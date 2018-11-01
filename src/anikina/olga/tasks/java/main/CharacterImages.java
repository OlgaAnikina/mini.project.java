package anikina.olga.tasks.java.main;

/*
This class contain task #3
 */
public class CharacterImages {
    public void printRectangle() {
        String result = "";
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result += "#";
            }
            result += "\n";
        }
        System.out.println(result);
    }

    public void printTriangle() {
        String result = "";
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                result += "#";
            }
            result += "\n";
        }
        System.out.println(result);
    }

    public void printZ() {
        String result = "";
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == n - i) || (i == n) || (i == 0) || (i == n - 1)) {
                    result += "#";

                } else result += " ";

            }
            result += "\n";

        }
        System.out.println(result);
    }

    public void printReverceZ() {
        String result = "";
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == i) || (i == 0) || (i == n - 1)) {
                    result += "#";

                } else result += " ";

            }
            result += "\n";

        }
        System.out.println(result);
    }

    public void printZero() {
        String result = "";
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0) || (i == 0) || (i == n - 1) || (j == n - 1)) {
                    result += "#";

                } else result += " ";

            }
            result += "\n";

        }
        System.out.println(result);
    }


}
