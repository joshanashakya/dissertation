'''a=[int(i) for i in input().split()]x=a[0]y=a[1]z=a[2]if y==x and z==0:    print('0')elif x>y+z:    print('+')elif y>x+z:    print('-')else:    print('?')n=int(input())z=[int(i) for i in input().split()]x=[]d=0v=''for i in range(n):    c=0    e=0    for f in range(len(z)):        if z[f]>c and f+1 not in x:            c=z[f]            e=f+1    d+=(i*c)+1    x.append(e)print(d)for i in x:    v+=str(i)    v+=' 'print(v) f=int(input())g=[int(i) for i in input().split()]for i in range(len(g)-1):    for f in range(len(g)-1-i):        if g[f]>g[f+1]:            g[f],g[f+1]=g[f+1],g[f]if g[0]*g[1]>g[-2]*g[-3] and g[-1]>0:    print(g[-1]*g[0]*g[1])else:    print(g[-1]*g[-2]*g[-3])for u in range(int(input())):    z=int(input())    y=[int(f) for f in input().split()]    y.sort()    d=0    for i in y:        d+=i    if d<2048:        print('No')        continue    if 2048 in y:        print('yes')        continue    for x in range(z+1):        if 2048 in y:            print('yes')            break        for i in range(len(y)-1):            if y[i]==y[i+1]:                y[i+1]=y[i]*2                y.pop(i)            if i>len(y)-3:                break        y.sort()    else:        print('no')n=int(input())x=[]for i in range(1,((n**2)//2)+1):    x.append(n**2+1-i)    x.append(i)    if len(x)==n:        print(*x)        x=[]for z in range(int(input())):    z=int(input())    x=[int(i) for i in input().split()]    f=0    o=0    t=0    for i in range(z):        if x[i]%3==0:            f+=1        elif x[i]%3==1:            o+=1        else:            t+=1    if o<t:        print(f+o+(t-o)//3)    else:        print(f+t+(o-t)//3)'''n=int(input())if n%2==1:    print(0)elif n%4==0:    print((n//4)-1)else:    print(n//4)                                                                            