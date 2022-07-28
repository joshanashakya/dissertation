t = int(input())
for a in range(t):
    r, g, b, w = map(int, input().split())
    flag = False
    if (r + g + b + w) % 2 == 0:
        # print("C")
        if r % 2 == 0 and g % 2 == 0 and b % 2 == 0 and w % 2 == 0:
            # print("D")
            flag = True
        else:
            while (r > 0 and g > 0 and b > 0):
                r -= 1
                g -= 1
                b -= 1
                w += 3
                if r % 2 == 0 and g % 2 == 0 and b % 2 == 0 and w % 2 == 0:
                    flag = True
                break
    else:
        # print("A")
        if (r % 2 == 0 and g % 2 == 0 and b % 2 == 0 and w % 2 == 1) or (
                r % 2 == 0 and g % 2 == 0 and b % 2 == 1 and w % 2 == 0) or (
                r % 2 == 0 and g % 2 == 1 and b % 2 == 0 and w % 2 == 0) or (
                r % 2 == 1 and g % 2 == 0 and b % 2 == 0 and w % 2 == 0):
            flag = True

        else:
            while (r > 0 and g > 0 and b > 0):
                # print("B")
                r -= 1
                g -= 1
                b -= 1
                w += 3
                if (r % 2 == 0 and g % 2 == 0 and b % 2 == 0 and w % 2 == 1) or (
                        r % 2 == 0 and g % 2 == 0 and b % 2 == 1 and w % 2 == 0) or (
                        r % 2 == 0 and g % 2 == 1 and b % 2 == 0 and w % 2 == 0) or (
                        r % 2 == 1 and g % 2 == 0 and b % 2 == 0 and w % 2 == 0):
                    flag = True
                break
    if (flag):
        print("Yes")
    else:
        print("No")
