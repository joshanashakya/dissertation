n=int(input())l=list(map(int,input().split()))if n%2==1 and l[0]%2==1 and l[n-1]%2==1:    print('Yes')else:    print('No')
