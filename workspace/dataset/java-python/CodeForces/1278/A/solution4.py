r = lambda : list(map(int, input().split()))t = int(input())for _ in range(t):    a = list(input())    b = list(input())     a.sort()    f = False    for i in range(len(b) - len(a)+1):        if sorted(b[i:i+len(a)]) == a:            f = True            break      print("YES" if f else "NO")    