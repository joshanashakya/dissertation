n = int(input())
a = list(map(int, input().split()))
odd = [i for i in a if i % 2 != 0]
even = [i for i in a if i % 2 == 0]
if len(odd) == 0:
    print(0)else:
    s = sum(even)
if len(odd) % 2 != 0:
    ans = s + sum(odd)    else:
    ans = s + sum(odd)
odd.sort()
ans -= odd[0]
print(ans)
