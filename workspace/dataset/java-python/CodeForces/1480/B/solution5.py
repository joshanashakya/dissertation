import sysinput = sys.stdin.readlinet = int(input())
for i in range(t):    a, b, c = map(int, input().split())
attack = list(map(int, input().split()))
health = list(map(int, input().split()))
li = []
for j in range(c):        if
health[j] % a != 0: li.append([attack[j], (health[j] // a) + 1]) else:            li.append(
    [attack[j], (health[j] // a)])
li.sort(key=lambda x: x[0])
bl = False
for j in range(c):        b -= li[j][1] * li[j][0]
if b <= 0:            bl = True
if bl == True:        if
b + li[-1][0] > 0: bl = False
if bl == False:
    print("YES")    else:
    print("NO")
