from math import ceildef seal(a, b):    return (a + b - 1) // bn = int(input())i = 0while(n % pow(3,i) == 0):    i+=1print(seal(n, pow(3,i)))
