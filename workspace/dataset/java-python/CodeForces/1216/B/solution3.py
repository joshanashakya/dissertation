'''a=[int(i) for i in input().split()]x=a[0]y=a[1]z=a[2]if y==x and z==0:    print('0')elif x>y+z:    print('+')elif y>x+z:    print('-')else:    print('?')'''n=int(input())z=[int(i) for i in input().split()]x=[]d=0v=''for i in range(n):    c=0    e=0    for f in range(len(z)):        if z[f]>c and f+1 not in x:            c=z[f]            e=f+1    d+=(i*c)+1    x.append(e)print(d)for i in x:    v+=str(i)    v+=' 'print(v)    