 def main():    n = int(input())    if (n < 3):        print(-1)    else:        n -= 1        p = n        b = 10        res = 1        while p:            if p & 0x1: res *= b            b *= b            p >>= 1                for i in range(0, 1000):                         if (res + i) % 210 == 0:                 print(10 ** n + i)                exit()  main()
