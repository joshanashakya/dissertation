a , b = map(int , input().split()) names = dict() for i in range(a):    x , y = input().split()    names[y] = x for i in range(b):    com = input()     h = com.split()[-1][:-1]    print(f"{com} #{names[h]}")