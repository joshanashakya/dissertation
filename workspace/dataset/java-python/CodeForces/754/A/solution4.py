import sys,mathn = int(input())array = list(map(int,input().split()))if array.count(0)==n:    print('NO')    sys.exit()if sum(array)==0:    print('YES')    print(2)    i = 1    while sum(array[0:i]) ==0 or sum(array[i:])==0:        i+=1    print(1,i)    print(i+1,n)else:    print('YES')    print(1)    print(1,n)