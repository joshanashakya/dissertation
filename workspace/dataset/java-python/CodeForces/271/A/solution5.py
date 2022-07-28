l=int(input())def split(num):    return list(num)for i in range(l+1,9013):    u=str(i)    v=split(u)    o=set(v)    if len(o)==4:        v=i        breakprint(v)
