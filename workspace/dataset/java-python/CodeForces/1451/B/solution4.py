cases = int(input())
while cases:    cases -= 1
a, b = map(int, input().split())
s = input()     while b:        b -= 1
l, r = (map(int, input().split()))
l, r = l - 1, r - 1         if s[:l].count(s[l]) == s[r + 1:].count(s[r]) == 0:
    print("NO")        else:
    print("YES")
