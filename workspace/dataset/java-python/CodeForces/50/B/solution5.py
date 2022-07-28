m=input()n={}s=0for each in m:    n[each]=n.get(each,0)+1for i in n:    s+=n[i]*n[i]print(s)
