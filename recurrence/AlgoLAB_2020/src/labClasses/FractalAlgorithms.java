package labClasses;

import turtlePck.TurtleGraphicsWindow;

public class FractalAlgorithms extends TurtleGraphicsWindow {

  public void algoA(double l, double i) {
    if (l < i)
      return;
    for (int j = 0; j < 3; j++) {
      left(60);
      algoA(l / 2, i);
      right(60);
      forward(l);
      right(120);
    }
  }

  public void algoB(int l, int i) {
    if (l < i)
      return;
    for (int j = 0; j < 2; j++) {
      forward(l);
      right(90);
      forward(l);
      left(90);
      algoB(l / 2, i);
      right(180);
    }
  }

  public void algoC(int l, int i, int a) {
    if (l < i)
      return;
    forward(l);
    left(a / 2);
    algoC(5 * l / 8, i, a);
    right(a);
    algoC(5 * l / 8, i, a);
    left(a / 2);
    back(l);
  }

  public void algoAalt(double l, double i) {
    if (l < i)
      return;
    for (int j = 0; j < 3; j++) {
      forward(l / 2.0);
      left(180);
      algoA(l / 2.0, i);
      right(180);
      forward(l / 2.0);
      right(120);
    }
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
      left(a / 2);
      forward(l);
      tree(3 * l / 4, i, a);
      back(l);
      right(a);
      forward(l);
      tree(3 * l / 4, i, a);
      back(l);
      left(a / 2);

    }
  }

  public void za1(int l, int i) {
    if (l > i) {
      for (int j = 0; j < 4; j++) {
        forward(l);
        za1(l / 2, i);
        right(90);
      }
    }
  }

  public void za2(int l, int i) {
    if (l > i) {
      for (int j = 0; j < 3; j++) {
        forward(l);
        za2(l / 2, i);
        right(120);
      }
    }
  }

  public void za3(int l, int i) {
    if (l > i) {
      for (int j = 0; j < 4; j++) {
        forward(l);
        za3(l / 5, i);
        right(90);
      }
    }
  }

  public void za6(int l, int i) {
    if (l > i) {
      for (int j = 0; j < 4; j++) {
        forward(l / 4);
        left(90);
        za6(l / 2, i);
        right(90);
        forward(3 * l / 4);
        right(90);
      }
    }
  }

  public void za8(int l, int i) {
    if (l > i) {
      for (int j = 0; j < 6; j++) {
        forward(l / 4);
        left(120);
        za8(l / 2, i);
        right(120);
        forward(3 * l / 4);
        right(60);
      }
    }
  }

  public void za9(double l, int i) {
    if (l > i) {
      forward(l);
      right(90);
      za9(l - 10, i);
    }
  }

  public void za10(double l, int i) {
    if (l > i) {
      forward(l);
      left(120);
      za10(l - 10, i);
    }
  }

  public void za11(double l, int i) {
    if (l > i) {
      forward(l);
      left(60);
      za11(l - 10, i);
    }
  }

  public void za12(int l, int i) {
    if (l > i) {
      for (int j = 0; j < 3; j++) {
        forward(l / 3);
        right(120);
        za12(l / 3, i);
        left(120);
        forward(l / 3);
        right(120);
        za12(l / 3, i);
        left(120);
        forward(l / 3);
        right(120);
      }
    }
  }

  public void zb5(double l, int i) {
    if (l < i)
      return;
    for (int j = 0; j < 4; j++) {
      forward(l);
      right(90);
      zb5(l / 3, i - 1);
    }
  }

  public void zb7(double l, int i) {
    if (l < i)
      return;
    for (int j = 0; j < 6; j++) {
      forward(l);
      right(60);
      if (j % 2 == 0)
        zb7(l / 2, i);
    }
  }

  public void zc4(int l, int i, int a, int c) {
    for (int j = 0; j < 2; j++) {
      if (l > i) {
        forward(l);
        left(a / 2);
        forward(l / 3);
        zc4(3 * l / 4, i, a, c++);
        back(l / 3);
        right(a);
        forward(l);
        zc4(3 * l / 4, i, a, c++);
        back(l);
        left(a / 2);
        back(l);
      }
      // if (c == 0) {
      // right(90);
      // forward(l);
      // left(90);
      // break;
      // }
    }
  }

  public void zc5(double l, int i) {
    if (l < i)
      return;
    for (int j = 0; j < 4; j++) {
      forward(l / 3);
      right(90);
      zc5(l / 3, i);
      left(90);
      forward(l / 3);
      right(90);
      zc5(l / 3, i);
      left(90);
      forward(l / 3);
      right(90);
    }
  }

  public void zc6(int l, int i) {
    if (l < i)
      return;
    for (int j = 0; j < 3; j++) {
      forward(l);
      zc6(l / 2, i);
      back(l / 2);
      zc6(l / 4, i);
      back(l / 4);
      zc6(l / 8, i);
      back(l / 8);
      zc6(l / 16, i);
      back(l / 8);
      right(120);
    }
  }

  public void zc7(int l, int i) {
    if (l < i)
      return;
    for (int j = 0; j < 4; j++) {
      forward(l / 4);
      zc7(l / 6, i);
      forward(l / 4);
      zc7(l / 6, i);
      forward(l / 4);
      zc7(l / 3, i);
      forward(l / 4);
      back(l);
      right(90);
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
