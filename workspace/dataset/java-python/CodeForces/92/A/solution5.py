n, m = map(int, input().split())
it_is_end = False
while True:
    for i in range(1, n + 1):
        if m >= i:
            m -= i
        else:
            it_is_end = True
            break

    if it_is_end:
        break
print(m)
