import sysinput_=lambda: sys.stdin.readline().strip("\r\n")from math import gcdsa=lambda :input_()sb=lambda:int(input_())sc=lambda:input_().split()sd=lambda:list(map(int,input_().split()))se=lambda:float(input_())sf=lambda:list(input_())flsh=lambda: sys.stdout.flush()mod=10**9+7def hnbhai():    n=sb()    a=sd()    b=list(set(a))    sum_=sum(a)    min_=min(a)    minus=0    for i in b:        fact=2        while(i//fact)>min_:            if i%fact==0:                temp=i//fact+min_*fact-i-min_                minus=min(minus,temp)            fact+=1    print(sum_+minus)for _ in range(1):    hnbhai()
