arr=list(input().split())s = list(arr[0])k = int(arr[1])ans = [] while s:    x = s.index(max(s[:k+1]))    ans.append(s[x])    s.pop(x)    k-=xprint(''.join(ans))
