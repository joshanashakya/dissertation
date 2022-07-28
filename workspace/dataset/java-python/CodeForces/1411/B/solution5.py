def is_fair(n):  nn = n


while n != 0:    d = n % 10
if d != 0 and nn % d != 0:      return False
n //= 10
return True 

def solve():  n = int(input())


while not is_fair(n):    n += 1
print(n) t = int(input())
for _ in range(t):  solve()
