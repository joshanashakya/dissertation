cases = int(input())
while cases:    cases -= 1
num = int(input())
arr = list(map(int, list(input())))     odds = 0
evens = 0
if num == 1:        if
arr[0] % 2 == 0: print(2) else:            print(1) else:         for i, n in enumerate(arr, start=1):            if
i % 2 != 0 and n % 2 != 0: odds += 1 elif i % 2 == 0 and n % 2 == 0: evens += 1  # print("odds:", odds)        # print("evens:", evens)        # print(arr)        if odds + evens == 0:            if num % 2 == 0:                print(1)            else:                print(2)        elif num % 2 == 0 and evens > 0:            print(2)        elif num % 2 == 0 and evens == 0:            print(1)        elif num % 2 != 0 and odds > 0:            print(1)        elif num % 2 == 0 and odds == 0:            print(2)        else:            print(2)
