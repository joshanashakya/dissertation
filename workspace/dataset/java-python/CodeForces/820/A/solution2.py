c,v0,v1,a,l=map(int,input().split()) count=0days=0  while(1):    if(days==0):        days+=1        count+=v0        index=0    else:               count+=min(v0+((days)*a),v1)-l              days+=1    if(count>=c):        break; print(days)        
