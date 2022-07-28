k=int(input())l=int(input())i=1c=0while k**i<l+1:    if k**i==l:        c=i        break    i+=1if c==0:    print("NO")else:    print("YES")    print(c-1)
