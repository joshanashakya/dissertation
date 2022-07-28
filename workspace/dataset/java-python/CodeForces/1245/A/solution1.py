import math t = int(input()) for tc in range(t):    a, b = map(int, input().split())     if math.gcd(a, b) == 1:        print("Finite")    else:        print("Infinite")  
