n=int(input())q,s=int(n**.5)+1,{1}for i in range(1,q):    if n%i==0:s.add(i);s.add(n//i)print(len(s)-1)
