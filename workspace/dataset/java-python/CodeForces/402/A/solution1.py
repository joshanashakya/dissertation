sections,a,divisors,cap=map(int,input().split()) # 1 3 1 1# [ 1 | 1 ] ->divisor=0# [ 1 ]count=0while a!=0:    k=min(sections,divisors+1)    divisors=divisors-k+1    if a<=(k)*cap and k!=0:        count+=1        break    elif a>(k)*cap and k!=0:        a-=(k)*cap        count+=1    else:        count+=(a//cap)+min(1,a%cap)        breakprint(count)