import math for _ in range(int(input())):    [a,b]=sorted(list(map(int, input().split())))         n=math.floor((-1+math.sqrt(1+8*(b-a)))/2)    a=a+n*(n+1)/2    while ((a-b)%2)!=0 or a<b:        n+=1        a+=n    print(n)    