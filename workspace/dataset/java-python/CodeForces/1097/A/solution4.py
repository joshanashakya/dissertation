s=input()x=list(map(str,input().split()))d=''.join(x)c=0for i in s:    if i in d:        print("YES")        break    else:        c+=1if c==2:    print("NO")
