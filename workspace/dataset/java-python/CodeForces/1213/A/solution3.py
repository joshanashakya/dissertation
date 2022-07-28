n=int(input())x=list(map(int, input().split()))k=0l=0for i in range(len(x)):    if x[i]%2==0:        k=k+1    else:        l=l+1m=min(k,l)print(m)
