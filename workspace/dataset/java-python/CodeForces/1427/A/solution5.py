test = int(input())
for t in range(test):     n = int(input())
lt = list(map(int, input().split()))
lst = sorted(lt)
if (sum(lst) == 0):
    print("NO")     elif sum(lst) < 0:
    print("YES")
print(*lst) else:         print("YES")
tmp = []
for i in range(n - 1, -1, -1):             tmp.append(lst[i])
print(*tmp)
