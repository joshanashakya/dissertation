t = int(input())for i in range(t):    a = int(input())    p =4    while a % (p-1):        p<<=1    print(a//(p-1))
