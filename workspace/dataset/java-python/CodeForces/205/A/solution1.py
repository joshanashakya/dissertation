import sysn=int(input())A=list(map(int,input().split()))minn=sys.maxsizeindex=0count=0for i in range(n):    if A[i]<minn:        minn=A[i]        index=i        count=1    elif A[i]==minn:        count+=1if count==1:    print(index+1)else:    print("Still Rozdil")