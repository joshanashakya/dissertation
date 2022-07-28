import sysinput = sys.stdin.readline for _ in range(int(input())):  n = int(input())
a = input()
target = 'trygub'
b = ''
i = 0
count = 0
for e in a:    if
i == 5 and e == target[i]: count += 1
continue
if e == target[i]:      i += 1
b += e
b = 'b' * (count) + b
print(b)
