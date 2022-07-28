n = int(input())o = 2 * (n // 7)b = 0if n % 7 > 1:    b = 2elif n % 7 == 1:    b = 1m = 0if n % 7 == 6:    m = 1print(o + m, o + b)    
