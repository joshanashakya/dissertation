import sysfrom

_collections
import dequeinput = lambda: sys.stdin.readline().rstrip("\r\n") for _ in range(int(input())):    n, k = map(int,
                                                                                                            input().split())
a = input()
c0 = c1 = 0
ans = 'YES'
for i in range(k):        j = i
ck = a[i]
while j < n:            if
ck != '?':
if a[j] != '?' and a[j] != ck:                    ans = 'NO'
break
if ck == '?':                if
a[j] != '?': ck = a[j]
j += k
if ck == '1':
    c0 += 1        elif ck == '0':
    c1 += 1
if ans == 'NO':            break
if c0 > k // 2 or c1 > k // 2:        ans = 'NO'
print(ans)
