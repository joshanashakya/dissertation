n=int(input())l=[]l.extend(map(int,input().split()))x=0for i in l:  if x+15>=i:    x=i  else:    breakprint(min(90,x+15))
