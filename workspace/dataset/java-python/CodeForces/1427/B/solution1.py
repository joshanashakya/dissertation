'''from heapq import * t = int(input())for _ in range(t):    n,w = map(int,input().split())    a = list(map(int,input().split()))    a.sort(reverse=True)    h = [0]    for i in range(n):        t =heappop(h)        if t+a[i]<=w:            heappush(h,t+a[i])        else:            heappush(h,a[i])            heappush(h,t)    print(len(h))    '''
t = int(input())
for _ in range(t):    n, k = map(int, input().split())
s = input()
s = list(s)
sum = 1
j = 0
for i in range(n):        if
s[i] == 'W': j = i
break
l = j
j = j + 1
lst = []
while j < n:        if
s[l] == s[j] and j - l == 1: j += 1
l += 1 elif s[l] == s[j] and j - l > 1: lst.append([j - l - 1, l + 1])
l = j
j += 1 else:            j += 1  # print(lst)    lst.sort()    for i in range(len(lst)):        while lst[i][0]>0 and k>0:            s[lst[i][1]]='W'            lst[i][1]+=1            lst[i][0]-=1            k=k-1    j = 0            for i in range(n):       if s[i]=='W':           j = i           break    b = 0        while j>0:        b = 1        c = j-1        #print(c)        if k>0 and s[c]=='L':            s[j-1]='W'            k=k-1            j=j-1        else:            break        for i in range(n):        if k>0 and s[i]=='L':            s[i]='W'            k=k-1        elif k<0:            break                j = 0        b = 0    for i in range(n):        if s[i]=='W':            j = i            b = 1            break            l = j    j=j+1    sum = 0    if b==1:        sum = 1        while j<n:            if s[l]==s[j] and j-l==1:                sum+=2                j+=1                l+=1            elif  s[l]==s[j] and j-l>1:            #lst.append([j-l-1,l+1])                sum+=1                l = j                j+=1            else:                j+=1         print(sum)
