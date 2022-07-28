for _ in range(int(input())):    n = int(input())
b = list(map(int, input().split()))
s = set(b)
if len(s) == len(b):
    print("No")    else:
    print("Yes")
