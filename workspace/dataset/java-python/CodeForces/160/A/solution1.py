n=int(input()) #twinsl = list(map(int,input().split()))l = sorted(l)s = 0c = 0cnt =0for i in l:    s+=ifor i in l[::-1]:    c+=i    cnt+=1    if c >(s/2):        breakprint(cnt)
