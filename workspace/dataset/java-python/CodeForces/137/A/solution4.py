st = input()con = 1ans = 1pre = st[0]for i in range(1, len(st)):    if pre == st[i] and con <5:        con+=1    else:        con = 1        ans+=1    pre = st[i]print(ans)
