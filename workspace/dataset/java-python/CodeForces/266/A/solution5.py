n = eval(input())s = input()current = s[0]ans = 0for i in s[1::]:    if i == current:        ans += 1    current = iprint(ans)
