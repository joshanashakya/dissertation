n=int(input())m=int(input())a=[]for i in range(n):    a.append(int(input()))k1=max(a)kmax=k1+m  aa=m/nk2=sum(a)+m+n-1kmin=k2//n  print(max(kmin,k1),kmax)    
