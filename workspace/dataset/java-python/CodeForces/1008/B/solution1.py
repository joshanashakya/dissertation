n = int(input())ans = "YES"num = 0for i in range(n):    w, h = map(int, input().split())    if i == 0:        num = max(w, h)    else:        if max(w, h) <= num:            num = max(w, h)        elif min(w, h) <= num:            num = min(w, h)        else:            ans = "NO"print(ans)
