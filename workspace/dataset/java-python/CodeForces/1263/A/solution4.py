for _ in range(int(input())):    l=list(map(int,input().split()))    l.sort()    if l[0]+l[1]<=l[2]:print(l[0]+l[1])    else:        print(sum(l)//2)    
