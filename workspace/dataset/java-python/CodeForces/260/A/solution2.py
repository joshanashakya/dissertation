a,b,n = map(int,input().split(" "))fixed_length = len(str(a))if a % b == 0:    print(a*10**n)else:    while len(str(a)) != fixed_length + n:        flag = False        for digit in range(10):            if int(str(a) + str(digit)) % b == 0:                a = int(str(a) + str(digit))                flag = True                break        if flag == False:            print(-1)            break        if a % b == 0:            a *= 10**(n - (len(str(a)) - fixed_length))            breakif len(str(a)) == n + fixed_length: print(a)             '''brute force przeciez po osiagnieciu pierwszej podzielnoscimozesz dodac tylko zera i koniec algorytmu'''
