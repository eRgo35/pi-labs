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
    
    public void tree(int l, int i, int a) {
        if (l > i) {
            left(a/2);
            forward(l);
            tree(3*l/4, i, a);
            back(l);
            right(a);
            forward(l);
            tree(3*l/4, i, a);
            back(l);
            left(a/2);

        }
    }
    
    public void za1(int l, int i) {
        if (l > i) {
            for (int j = 0; j < 4; j++) {
                forward(l);
                za1(l/2, i);
                right(90);
            }
        }
    }
    
    public void za2(int l, int i) {
        if (l > i) {
            for (int j = 0; j < 3; j++) {
                forward(l);
                za2(l/2, i);
                right(120);
            }
        }
    }
    
    public void za3(int l, int i) {
        if (l > i) {
            for (int j = 0; j < 4; j++) {
                forward(l);
                za3(l/2, i);
                right(90);
            }
        }
    }
    
    public void za8(int l, int i) {
        if (l > i) {
            for (int j = 0; j < 6; j++) {
                forward(l/5);
                za8(l/2, i);
                forward(4*l/5);
                right(60);
            }
        }
    }
    
    public void za9(int l, int i, int c) {
        if (c == 0) {
            
        }
        c++;
        if (l > i) {
          forward(l);
          right(90);
          za9(l - 5, i, c);
        }
    }
    
    public void za12(int l, int i) {
        if (l > i) {
            for (int j = 0; j < 3; j++) {
                forward(2*l/3);
                right(60);
                za2(l/3, i);
                left(60);
                forward(l/3);
                right(120);
            }
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
