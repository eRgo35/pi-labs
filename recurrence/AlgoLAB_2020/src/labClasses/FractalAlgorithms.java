package labClasses;

import turtlePck.TurtleGraphicsWindow;

/**
 *
 * @author Rau7LabToCS
 */
public class FractalAlgorithms extends TurtleGraphicsWindow {

    public void algoA() {
        //TODO
    }

    public void algoB() {
        //TODO
    }

    public void algoC() {
        //TODO
    }

    public void figure(int length, int amount, double divider, int sides) {
        for (int i = 0; i < sides; i++) {
            forward(length);
            right(360 / sides);
            if (amount > 0) {
                figure((int) (length * divider), amount - 1, divider, sides);
            }
        }
    }
    
    public void tree(int a) {
        for (int i = 0; i < 10; i++)
        forward(50);
        right(20);
        if (a > 0) {
            tree(a - 1);
        }
    }
    
    public void positioningTurtle(int angle) {
        right(angle);
    }

    public void sierpinski(int side, int minSide) {
        if (side < minSide) {
            return;
        }
        for (int i = 1; i < 4; i++) {
            sierpinski(side / 2, minSide);
            forward(side);
            right(120);
        }
    }
}
