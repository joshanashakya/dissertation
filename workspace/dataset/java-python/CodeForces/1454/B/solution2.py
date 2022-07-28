for _ in range(int(input())):    n = int(input())
a = tuple(map(int, input().split()))
hash_map = {}
for i in a:        hash_map[i] = hash_map.get(i, 0) + 1
key = None
for k, v in hash_map.items():        if
v == 1:
if key:
    key = min(k, key)            else:
    key = k
if key:         for
i in range(n):
if a[i] == key:                print(i + 1)
break else:        print(-1)
