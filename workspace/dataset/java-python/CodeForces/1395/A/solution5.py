def check(r, g, b, w):
    if r < 0 or g < 0 or b < 0 or w < 0:
        return -1
    else:
        count = 0
        count1 = 0
        if r % 2 == 0:
            count += 1
        else:
            count1 += 1
        if g % 2 == 0:
            count += 1
        else:
            count1 += 1
        if b % 2 == 0:
            count += 1
        else:
            count1 += 1
        if w % 2 == 0:
            count += 1
        else:
            count1 += 1
        if count == 4 and count1 == 0:
            return 1
        elif count == 3 and count1 == 1:
            return 1
        else:
            return -1


t = int(input())
for i in range(t):
    r, g, b, w = map(int, input().split())
    if check(r, g, b, w) == 1:
        print("YES")
    else:
        w += 3
        r -= 1
        g -= 1
        b -= 1
        if check(r, g, b, w) == 1:
            print("YES")
        else:
            print("No")
