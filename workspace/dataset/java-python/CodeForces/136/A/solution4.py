n=int(input())l=list(map(int,input().split()))for i in range(len(l)):    for j in range(len(l)):        if((i+1)==l[j]):            print(j+1,end=' ')
