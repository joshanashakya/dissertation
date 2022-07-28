T = int(input())
for _ in range(T):    n, q = [int(x) for x in input().split()]
s = input()
for _ in range(q):        i, j = [int(x) for x in input().split()]
sub = s[i - 1:j]
k = 0
while k < n and sub[0] != s[k]:            k += 1
l = n - 1
while l >= 0 and sub[-1] != s[l]:            l -= 1
if k != i - 1 or l != j - 1:
    print("YES")        else:
    print("NO") 
