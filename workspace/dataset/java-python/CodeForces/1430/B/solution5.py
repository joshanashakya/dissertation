for i in range(int(input())):    n, k = list(map(int, input().split()))
print(sum(sorted(list(map(int, input().split())))[::-1][:k + 1]))
