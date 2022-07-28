a=3*[0]+sorted(map(int,input().split()))print(sum(a)-max(2*z+(x==z)*z for x,y,z in zip(a,a[1:],a[2:]) if z==y))
