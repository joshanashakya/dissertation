for i in range(int(input())):    input()
a = list(map(int, input().split()))
print(max([a.count(i) for i in a]))
