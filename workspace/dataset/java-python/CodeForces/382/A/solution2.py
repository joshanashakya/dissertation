s=input()add=input()x=s.find('|')ls=s[:x]rs=s[x+1:]l=len(ls)r=len(rs)fl=0#AB|CD EFGHif l==r:    if len(add)%2==0:        ls+=add[:len(add)//2]        rs+=add[len(add)//2:]        ans=ls+'|'+rs    else:        fl=1#ABCKMNO|DEFGHPQ KMNOPQ d=2 2+2elif l<r:    d=r-l    if d==len(add):        ls+=add        ans=ls+'|'+rs    elif d<len(add):        if (len(add)-d)%2!=0:            fl=1        else:            al=d+((len(add)-d)//2)            ls+=add[:al]            rs+=add[al:]            ans=ls+'|'+rs    elif d>len(add):        fl=1#ABCD|PQ  KMNO d=2  2+1elif r<l:    d=l-r    if d==len(add):        rs+=add        ans=ls+'|'+rs    elif d<len(add):        if (len(add)-d)%2!=0:            fl=1        else:            al=d+((len(add)-d)//2)            rs+=add[:al]            ls+=add[al:]            ans=ls+'|'+rs    elif d>len(add):        fl=1if fl==1:    print("Impossible")else:    print(ans)
