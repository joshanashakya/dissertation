n = int(input())nn = neight = []rest = []s = list(input())for i in range(n):    if s[i] == "8":        eight.append(i)    else:        rest.append(i)lst = eight + rest[::-1]i = 0left = 1right = 0while n > 11:    n -= 1    if i == 0:        s[lst[-left]] = ""        left += 1        i = 1    else:        s[lst[right]] = ""        right += 1        i = 0ans = ""for i in range(nn):    ans += s[i]if ans[0] == "8":    print("YES")else:    print("NO")
