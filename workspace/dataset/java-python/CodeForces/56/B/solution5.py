def res():    n = int(input())


v = [int(i) for i in input().split()]
ans = sorted(v)
if (v == ans):        return "0 0"     try:        ini = 0
temp = []
while v[ini] < v[ini + 1]:            temp.append(v[ini])
ini += 1
fim = ini
v2 = []
while fim < n - 1 and v[fim] > v[fim + 1]:            v2.append(v[fim])
fim += 1
v2.append(v[fim])
ini += 1
fim += 1
temp += v2[::-1] + v[fim:]
if temp == ans:
    return str(ini) + ' ' + str(fim)        else:
    return "0 0"            except:        return "0 0"


def main():    print(res())

 main()
