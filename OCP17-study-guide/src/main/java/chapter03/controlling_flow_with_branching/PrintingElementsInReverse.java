package chapter03.controlling_flow_with_branching;

public class PrintingElementsInReverse {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (var i = 4; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
