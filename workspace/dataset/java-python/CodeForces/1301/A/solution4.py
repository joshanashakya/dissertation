for _ in range(int(input())):    a=input()    b=input()    c=input()    ans=True    for i in range(len(a)):        if c[i]!=a[i] and c[i]!=b[i]:            ans=False            print("NO")            break    if ans:        print("YES")    
