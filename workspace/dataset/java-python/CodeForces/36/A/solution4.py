# for _ in range(int(input())):input=open("input.txt","r").readlinen=int(input())l=input()d=[]e=[]for i in range(n):    if l[i]=='1':        d.append(i)for i in range(1,len(d)):    e.append(d[i]-d[i-1])if len(set(e))==1:    open("output.txt","w").write("YES")else:    open("output.txt","w").write("NO")