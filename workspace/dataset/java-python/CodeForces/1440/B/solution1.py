cases = int(input())
while cases:    cases -= 1
a, b = map(int, input().split())
arr = list(map(int, input().split()))
ln = a * b
cut = (a - 1) // 2 * b
a -= (a - 1) // 2
arr = arr[cut:]     ans = 0
for i in range(0, ln - cut, a):        ans += arr[i]  # print(arr[i])     print(ans)
