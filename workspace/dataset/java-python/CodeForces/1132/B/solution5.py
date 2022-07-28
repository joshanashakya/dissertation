a=int(input())b=list(map(int,input().split()))b.sort(reverse=True)res=sum(b)n=int(input())mas=list(map(int,input().split()))for k in mas:        print(res-b[k-1])
