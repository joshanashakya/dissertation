n,m = map(int,input().split())if m:    l = list(map(int,input().split()))if not m:    print("YES")    exit()if 1 in l or n in l:    print("NO")    exit()l.sort()for i in range(len(l)-2):     if l[i]+1==l[i+1] and l[i+1]+1==l[i+2]:        print("NO")        exit() print("YES")