n=int(input())l=list(map(int,input().split()))m=list(map(int,input().split()))k=[]for i in range(1,len(l)):    k.append(l[i])for i in range(1,len(m)):    k.append(m[i])k=list(set(k))if(len(k)==n):    print("I become the guy.")else:    print("Oh, my keyboard!")
