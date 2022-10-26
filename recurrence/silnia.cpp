#include <iostream>

int recF(unsigned long x)
{
  if (x == 1)
    return 1;
  return x * recF(x - 1);
}

void loopF(int x)
{
  unsigned long n = 1;
  for (int i = 1; i <= x; i++)
  {
    n *= i;
  }
    std::cout << n << std::endl;
}

int main()
{
  // std::cout << recF(10) << std::endl;
  loopF(10);
  return 0;
}