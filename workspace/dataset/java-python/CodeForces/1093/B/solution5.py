r = lambda : list(map(int, input().split()))t = int(input())for _ in range(t):    s = list(input())    if(len(set(s)) ==1): print(-1)    else: print(''.join(sorted(s)))
