cases = int(input())while cases:    cases -= 1    a, b = map(int, input().split())    c, d = map(int, input().split())     if max(a,b) == max(c,d) == min(a,b)+min(c,d):        print("YES")    else:        print("NO")