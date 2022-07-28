t = int(input()) for tc in range(t):     a, b = map(int, input().split())     twow = a*2    twol = b*2     twowsq = max(twow, b)    twolsq = max(twol, a)     print(min(twolsq, twowsq) ** 2)  
