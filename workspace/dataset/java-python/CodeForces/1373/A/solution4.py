cases = int(input())while cases:    cases -= 1    a, b, c = map(int, input().split())     if a >= c:        ans1 = -1    else:        ans1 = 1    if a <= c//b:        ans2 = -1    else:        ans2 = b     print(ans1, ans2)  
