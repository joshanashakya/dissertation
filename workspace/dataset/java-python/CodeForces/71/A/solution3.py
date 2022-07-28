n = int(input())
for i in range(n):    str1 = input()
if len(str1) > 10:
    print(str1[0] + str(len(str1) - 2) + str1[-1])    else:
    print(str1)
