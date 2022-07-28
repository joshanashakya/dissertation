dontcare = input()
a = [int(i) for i in input().split()]
sum = 0
for i in a: sum += iif
sum % 2 == 1: print(sum) else:    max = sum
for i in a:        if
i % 2 == 1: max -= i
break
for i in a:        if
i % 2 == 1 and sum - i > max: max = sum - i
if max % 2 == 1:
    print(max)    else:
    print(0)
