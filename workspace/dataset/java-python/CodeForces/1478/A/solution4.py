for t in range(int(input())):    n = int(input())
a = list(map(int, input().split()))
a = sorted(a, reverse=True, key=a.count)
print(a.count(a[0]))
