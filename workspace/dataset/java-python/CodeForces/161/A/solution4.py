class bulletproof:    def __init__(self,x,y):        self.soldier=x        self.vest=ys=list(map(int, input().split()))a=list(map(int, input().split()))b=list(map(int, input().split()))c=[]x=s[2]y=s[3]j=0k=0i=0for i in range (len(a)):    while j<=len(b)-1 and b[j]<a[i]-x:        j+=1    if j<=len(b)-1 and a[i]-x<=b[j]<=a[i]+y:        p=bulletproof(i+1, j+1)        c.append(p)        k+=1        j+=1    if j==len(b):        breakprint(k)for i in range (len(c)):    print(c[i].soldier, c[i].vest)