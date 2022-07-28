t = int(input())
for _ in range(t):    n = int(
    input())  # ali = list(map(int, input().split()))    s = input()    f  = 0    for i in range(len(s)-1,-1,-1):        if(s[i] != ")"):            f = 1            break    if(f == 1):        i += 1        q = n - i         if(q > n//2):            print("YES")        else:            print("NO")    else:        print("YES")
