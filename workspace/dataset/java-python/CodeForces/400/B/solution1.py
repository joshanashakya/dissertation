n, m =map(int,input().split())l = []for i in range(n):    l.append(input())l1, l2, ansl = [], [], []for i in range(n):    l1.append(l[i].index('G'))    l2.append(l[i].index('S'))ans = -1for i in range(n):    if l1[i]<l2[i]:        ansl.append(l2[i]-l1[i]-1)        ans = max(ans, l2[i]-l1[i]-1)    elif l1[i]>l2[i]:        ansl.append(-1)if -1 in ansl:    print(-1)else:    print(len(set(ansl)))