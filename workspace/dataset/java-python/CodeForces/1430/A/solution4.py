for i in range(int(input())):     num = int(input())
if num % 3 != 0 and num < 5:
    print(-1)     elif num % 3 == 0:
    print(num // 3, 0, 0)     elif num % 5 == 0:
    print(0, num // 5, 0)     elif num % 7 == 0:
    print(0, 0, num // 7)     else:
    remain = num % 5
while True:               if
remain % 3 == 0: print(remain // 3, num // 5, 0)
break elif remain % 7 == 0: print(0, num // 5, remain // 7)
break
num1 = 5 * ((num // 5) - 1)
remain = num - num1
num = num1
