n = int(input())
l = []
arr = []
n = (n * (n - 1)) // 2
for i in range(n):    temp = list(map(int, input().split()))
l.append(temp)
for i in temp[1:]: arr.append(i)
if n == 1:    print(l[0][0] - 1, *l[0][1: l[0][0]])
print(1, l[0][l[0][0]])
exit()
arr = list(set(arr))
ans = []
for i in range(len(arr)):    search = arr[i]
temp = []
for j in range(n):        for
k in l[j][1:]:
if search == k: temp.append(j)
ans.append(temp)
finans = []
for i in range(len(ans)):    search = ans[i]
temp = []
for j in range(len(ans)):        if
ans[j] == search: temp.append(arr[j])
chh = 0
for j in finans:         if
j == temp: chh = 1
break
if chh == 0: finans.append(temp)
for i in finans:    print(len(i), *i)
