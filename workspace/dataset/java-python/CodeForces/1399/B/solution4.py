t = int(input())

while t > 0:

    gift_num = int(input())
    a = map(int, input().split())
    a = list(a)
    b = map(int, input().split())
    b = list(b)

    min_a = min(a)
    min_b = min(b)
    cont = 0

    for i in range(gift_num):
        if a[i] > min_a and b[i] > min_b:
            temp_a = a[i] - min_a
            temp_b = b[i] - min_b
            if temp_a == temp_b:
                a[i] -= temp_a
                b[i] -= temp_b
                cont += temp_b
            elif temp_a > temp_b:
                a[i] -= temp_b
                b[i] -= temp_b
                cont += temp_b
            elif temp_a < temp_b:
                a[i] -= temp_a
                b[i] -= temp_a
                cont += temp_a

        while a[i] > min_a or b[i] > min_b:
            if a[i] > min_a:
                temp = a[i] - min_a
                a[i] -= temp
                cont += temp
            elif b[i] > min_b:
                temp = b[i] - min_b
                b[i] -= temp
                cont += temp
    print(cont)

    t -= 1
