t = int(input())
for _ in range(t):
    r, g, b, w = map(int, input().split())
    max_op = min(r, g, b)
    even_count = 0
    if r % 2 == 0:
        even_count += 1
    if g % 2 == 0:
        even_count += 1
    if b % 2 == 0:
        even_count += 1
    if even_count == 3 or even_count == 0:
        print('Yes')
    elif even_count == 2:
        if w % 2 == 1:
            print('No')
        else:
            print('Yes')
    else:
        if w % 2 == 0:
            print('No')
        else:
            if max_op >= 1:
                print('Yes')
            else:
                print('No')
