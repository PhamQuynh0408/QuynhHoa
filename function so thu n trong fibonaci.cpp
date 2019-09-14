#include <stdio.h>
int tim_so_thu_n_trong_day_fibonaci(int n)
{
    int x1 = 1, x2 = 1;
    if (n == 1 || n == 2)
        return 1;
    int i = 3, x;
    while (i <= n)
    {
        x = x1 + x2;
        x1 = x2;
        x2 = x;
        i++;
    }
    return x;
}
int main()
{
    int n;
    printf("nhap n: ");
    scanf("%d", &n);
    printf("So thu n trong Fibonacci la: %d", n, tim_so_thu_n_trong_day_fibonaci(n));
    return 0;
}
