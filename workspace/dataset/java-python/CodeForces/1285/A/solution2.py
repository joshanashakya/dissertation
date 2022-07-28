import redef post(n,x):    a=len(re.findall('L',x))    b=len(re.findall('R',x))    return a+b+1t=int(input())y=input()r=post(t,y)print(r)
