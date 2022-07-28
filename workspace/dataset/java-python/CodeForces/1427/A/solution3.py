cases = int(input())
while cases:    cases -= 1
num = int(input())
arr = list(map(int, input().split()))     summ = sum(arr)     if summ == 0:
    print("NO")    elif summ < 0:
    ans = sorted(arr)
print("YES")
print(*ans) else:        ans = sorted(arr, reverse=True)
print("YES")
print(*ans)
