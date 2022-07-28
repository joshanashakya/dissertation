str1=input('')k=int(input(''))w=list(map(int,input().split()))p=max(w)pidx=w.index(p)+97q=chr(pidx)str2=k*qstr3=str1+str2f=0for i in range(0,len(str3)):    a=ord(str3[i])-97    f=f+(i+1)*w[a]print(f)
