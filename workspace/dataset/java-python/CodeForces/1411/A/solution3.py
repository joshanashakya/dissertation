for _ in range(int(input())):    n = int(input())
s = input()
b = -1
c = 0
while b >= -n and s[b] == ')':        c += 1
b -= 1
print("YES" if c > n - c else "NO")
