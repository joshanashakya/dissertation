n=int(input())a=sorted([int(x) for x in input().split()])s=sum(a)if a[0]!=0:    print(-1)    exit(0)if s%3!=0:    for x in a:        if x%3==s%3:            a.remove(x)            break    else:        for x in a:            if x%3:                a.remove(x)                break        for x in a:            if x%3:                a.remove(x)                breakwhile len(a)>1 and a[-1]==0:    a.pop()a=a[::-1]print(''.join(str(x) for x in a))
