def main():    for


_ in range(int(input())): n, k = map(int, input().split())
s = input()
if k >= s.count('L'):
    print(2 * n - 1)        elif 'W' not in s:
    print(max(min(n, k) * 2 - 1, 0))        else:
    diff, ans, ind = [], s.count('W'), s.index('W')             for i in range(ind + 1, n):                if
s[i] == 'W': diff.append(i - ind - 1)
ind = i
diff.sort()             for value in diff:                if
value <= k: ans += 2 * value + 1
k -= value
if k > 0:                ans += 2 * k
print(ans)
main()
