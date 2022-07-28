input() x=z=0 for i in[int(x)for x in input().split()][::-1]:     z+=x==0     x=max(x-1,i) print(z)
