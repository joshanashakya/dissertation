n=input()m=input()l1=len(n)l2=len(m)if l1!=l2:    print('NO')else:    for i in range(l1):        if n[i]!=m[l2-1-i]:            print('NO')            break    else:        print("YES")
