import math k,d,t=input().split()k=float(k)d=float(d)t=float(t)itr=float(k/d)itr=math.ceil(itr)d=d*itr cycle1=float(k/t) cycle2=float((d-k)/(2*t))timer=d    cycle=cycle1+cycle2itr=1/cycleitr=math.floor(itr) if itr*cycle==1:    print(d*itr)    exit()        timer=d*itr    if itr*cycle+cycle1>=1:    left=1-itr*cycle    print(timer+left/(1.0/t))else:    timer+=k    left=1-itr*cycle-cycle1    print(timer+left/(1.0/(2.0*t)))
