import math  def solve(n):     x = int(math.sqrt(n))     while (x*x + 81*x >= n):        if x*x + sum_digit(x)*x == n:            return x        x -= 1        return -1  def sum_digit(n):     str_n = str(n)    digit_sum = 0    for i in str_n:        digit_sum += int(i)     return digit_sum  if __name__ == '__main__':    n = int(input())     result = solve(n)     print(result)