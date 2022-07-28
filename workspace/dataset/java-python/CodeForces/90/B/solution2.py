if __name__ == '__main__':    n, m = map(int, input().split())
l = []
for i in range(n):        a = input()
s = []
for i in a:            s.append(i)
l.append(s)
ans = ''
for i in range(n):        for
j in range(m): s = l[i][j]
rflag = 1
cflag = 1
for k in range(m):                if
k != j and l[i][k] == s: rflag = 0
break
for k in range(n):                if
k != i and l[k][j] == s: cflag = 0
break
if cflag != 0 and rflag != 0:                ans = ans + l[i][j]
print(ans)
