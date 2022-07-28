"""inp_start4AABBACCACABBBBACACBCBC inp_end"""
tcs = int(input())
l = [[-1, -1, 1], [-1, 1, -1], [-1, 1, 1], [1, -1, -1], [1, -1, 1], [1, 1, -1]] for tc in range(tcs):    s = input()
for j in l:        cnt = 0
p = 1
for i in s:            cnt += j[ord(i) - 65]
if cnt < 0:                p = 0
if p == 1 and cnt == 0:            print("YES")
break else:        print("NO")
