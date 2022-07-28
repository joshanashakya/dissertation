cases = int(input())
while cases:    cases -= 1
num = int(input())     if num in [1, 2, 4]:        print(-1)
continue     if num % 3 == 0:
    print(num // 3, 0, 0)    elif num % 5 == 0:
    print(0, num // 5, 0)    elif num % 7 == 0:
    print(0, 0, num // 7)    else:
    thr = 0
while num % 3 != 0 and num > 0:            num -= 3
thr += 1
if num % 5 == 0:                print(thr, num // 5, 0)
break
if num % 7 == 0:                print(thr, 0, num // 7)
break 
