c = int(input())
while c:    c -= 1
n, m = map(int, input().split())
cases = n
pair_one = False
pair_two = False
while cases:        cases -= 1
a, b = map(int, input().split())
b2, a2 = map(int, input().split())
if a == a2:            pair_one = True
if b2 == b:            pair_two = True     if pair_two and m % 2 == 0:
    print("YES")    else:
    print("NO")
