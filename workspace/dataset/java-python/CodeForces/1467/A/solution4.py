import sysinput = sys.stdin.readlinefrom
collections
import *  for _ in range(int(input())):    n = int(input())
ans = []
for i in range(n):        if
i == 0: ans.append('9') elif i == 1: ans.append('8') elif i == 2: ans.append('9') else:            ans.append(
    str((9 + (i - 2)) % 10))
print(''.join(ans))
