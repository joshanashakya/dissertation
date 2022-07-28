word = input()ans = 0num = {} for i in word:    num[i] = num.get(i, 0) + 1 for j in num.values():    ans += j**2 print(ans)
