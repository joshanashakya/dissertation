t = int(input())
for _ in range(t):    n = int(input())
s = input()
ali = []
for i in s:        ali.append(int(
    i))  # print(ali)    f = 0    if(n%2 == 0):        for i in range(1,n,2):            if(ali[i]%2 == 0):                f = 1        if(f == 1):            print(2)        else:            print(1)    else:        for i in range(0,n,2):            if(ali[i] % 2 != 0):                f = 1        if(f == 1):            print(1)        else:            print(2)
