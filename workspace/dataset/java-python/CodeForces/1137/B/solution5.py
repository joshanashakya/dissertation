import sysinput = sys.stdin.readline  def MP(s):    a = [0] * (len(s) + 1)    a[0] = -1    j = -1    for i in range(len(s)):        while j >= 0 and s[i] != s[j]:            j = a[j]        j += 1        a[i + 1] = j    return a  s = input()[:-1]t = input()[:-1] cnt = [0, 0]for char in s:    cnt[int(char)] += 1 tbl = MP(t)lap = len(t) - tbl[len(t)]t = t[0:lap] ans = []while True:    for char in t:        if cnt[int(char)] > 0:            ans.append(char)            cnt[int(char)] -= 1        else:            break    else:        continue    break for i in range(cnt[0]):    ans.append("0")for i in range(cnt[1]):    ans.append("1") print(''.join(ans))