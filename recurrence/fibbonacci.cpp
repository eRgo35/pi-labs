#include <iostream>

void recFib(unsigned long x, unsigned long y, int t)
{
  if (x == 0 && y == 1) std::cout << x << std::endl << y << std::endl;
  unsigned long long int c;
  c = x + y;
  x = y;
  y = c;
  std::cout << c << std::endl;
  if (t > 0) recFib(x, y, t - 1);
}

void loopFib(int t)
{
  
  unsigned long int a = 0;
  unsigned long int b = 1;

  unsigned long long int c;

  std::cout << a << std::endl << b << std::endl;

  for (int i = 0; i < t; i++) {
    c = a + b;
    a = b;
    b = c;
    std::cout << c << std::endl;
  }
}

int main()
{  
  // recFib(0, 1, 10);
  // loopFib(10);
  return 0;
}