n ,m =[int(x) for x in input().split()]list = []for _ in range(n):    list.append([int(x) for x in input().split()])for _ in range(1 , n-1 , 1):    if list[_][0] == 1 or list[_][-1] == 1:        print(2)        exit()for _ in range(1, m-1 , 1):    if list[0][_] ==1 or list[-1][_] ==1:        print(2)        exit()print(4)
