for _ in range(int(input())):    a, b = map(int, input().split(" "))
count = 0
if a != b:        if
a < b: count = ((b - a) // 10)
a += 10 * ((b - a) // 10)
if b - a:
    count += 1        else:
    count += ((a - b) // 10)
a -= 10 * ((a - b) // 10)
if a - b:                count += 1
print(count)
