cases = int(input()) while cases:    cases -= 1
num = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = list(map(int, input().split()))
ans = [a[0]]
for i in range(1, num):        if
a[i] != ans[-1]: ans.append(a[i]) else:            ans.append(b[i])     if ans[0] == ans[-1]:        if
ans[-2] != c[-1]: ans[-1] = c[-1] elif ans[-2] != b[-1] and ans[0] != b[-1]: ans[-1] = b[-1] else:            ans[-1] =
a[-1]     print(*ans)  
