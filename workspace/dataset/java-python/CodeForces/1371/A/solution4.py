t=int(input())for i in range(t):    x=int(input())    if x%2==0 and x>2:        print(x//2)    elif x==1 or x==2:        print(1)    else:        print((x//2)+1)
