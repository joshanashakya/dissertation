def do(a,b)->bool:    if a[0]!=b[0]:return False    i=0    for j in range(1,len(b)):        if i<len(a)-1 and a[i+1]==b[j]:i+=1        elif b[j]!=a[i]:return False    return i==len(a)-1for _ in range(int(input())):    a=input()    b=input()    print("YES") if do(a,b) else print("NO")         
