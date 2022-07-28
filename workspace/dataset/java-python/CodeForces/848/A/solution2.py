k,s,o=int(input()),"",97if k==0:s="a"while k:    q=int(((1+8*k)**.5-1)/2)+1    k-=q*(q-1)//2    s+=chr(o)*q    o+=1print(s)
