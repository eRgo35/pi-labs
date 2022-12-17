#include <iostream>

int main()
{
  const int N = 8;
  int tab[N] = {-5, -3, 10, -5, 4, -3, -8, 5};

  int max = tab[N - 1];
  for (int i = (N - 1); i >= 0; i--)
    if (max < tab[i])
      max = tab[i];

  std::cout << max << std::endl;

  return 0;
}