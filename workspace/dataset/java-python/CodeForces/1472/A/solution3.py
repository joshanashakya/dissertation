for _ in range(int(input())):    a, b, n = map(int, input().split())
ans = 'NO'
r = 1
if n == 1:        print('YES')
continue
if a % 2 == 1 and b % 2 == 1:        print('NO')
continue
while a % 2 == 0:        a //= 2
r *= 2
if n <= r:            ans = 'YES'
break
if n >= r and b % 2 == 0:        while
b % 2 == 0: b //= 2
r *= 2
if n <= r:                ans = 'YES'
break
print(ans) 
