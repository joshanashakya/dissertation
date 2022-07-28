n=int(input())a=list(map(int,input().split()))f=[0]*(max(a)+1)for i in a:    f[i]+=1c=0for i in f:    if(i%2!=0):        c=1        breakif(c==0):    print('Agasa')else:    print('Conan')
