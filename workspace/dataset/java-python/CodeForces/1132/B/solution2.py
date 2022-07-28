n=int(input())l=list(map(int,input().split()))add = sum(l)l.sort(reverse=True)m=int(input())q=list(map(int,input().split()))for i in range(m):    sum1 = add    sum1 = sum1 - l[q[i]-1]    print(sum1)
