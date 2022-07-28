import sys, io, os

if os.environ['USERNAME'] == 'kissz':    inp1 = inp2 = open('in.txt', 'r').readline


def debug(*args):        print(*args, file=sys.stderr)

else:  # inp1=input    inp1=inp2=sys.stdin.readline    #inp2=io.BytesIO(os.read(0,os.fstat(0).st_size)).readline    def debug(*args):        pass # SCRIPT STARTS HEREclass lazytree:    def __init__(self,array):        n=len(array)-1        i=1        while n:            n>>=1            i+=1        self.tree=[0]*(2**(i-1)-1)+array+[0]*(2**(i-1)-len(array))        self.l=0        self.r=2**(i-1)-1        self.lazy=[0]*(2**i-1)        self.lazyval=[0]*(2**i-1)        for i in range(2**(i-1)-2,-1,-1):            self.tree[i]=self.tree[2*i+1]+self.tree[2*i+2]                   def query(self,l,r):        if l==self.l and r==self.r:            parents=[]            children=[(0,l,r)]        else:            parents=[(0,self.l,self.r)]            children=[]            i=0            while i<len(parents):                loc,L,R=parents[i]                left=(loc*2+1,L,L+(R-L+1)//2-1)                right=(loc*2+2,L+(R-L+1)//2,R)                if self.lazy[loc]:                    self.lazy[loc]=0                    self.tree[left[0]]=self.tree[right[0]]=(left[2]-left[1]+1)*self.lazyval[loc]                    self.lazy[left[0]]=self.lazy[right[0]]=1                    self.lazyval[left[0]]=self.lazyval[right[0]]=self.lazyval[loc]                if l<=left[1] and left[2]<=r:                    children.append(left)                elif left[1]<=l<=left[2] or left[1]<=r<=left[2]:                    parents.append(left)                if l<=right[1] and right[2]<=r:                    children.append(right)                elif right[1]<=l<=right[2] or right[1]<=r<=right[2]:                    parents.append(right)                i+=1        ones=sum(self.tree[child[0]] for child in children)        zeros=r-l+1-ones        if ones==zeros:            return -1        elif ones>zeros:            for child in children:                self.tree[child[0]]=child[2]-child[1]+1                self.lazy[child[0]]=1                self.lazyval[child[0]]=1        else:            for child in children:                self.tree[child[0]]=0                self.lazy[child[0]]=1                self.lazyval[child[0]]=0        for i,_,_ in reversed(parents):            self.tree[i]=self.tree[2*i+1]+self.tree[2*i+2]        return self.tree[child[0]]                    def get_all(self):        n=self.r-self.l        for i in range(n):            if self.lazy[i]:                self.lazy[i]=0                self.tree[2*i+1]=self.tree[2*i+2]=self.lazyval[i] # destroying tree                self.lazy[2*i+1]=self.lazy[2*i+2]=1                self.lazyval[2*i+1]=self.lazyval[2*i+2]=self.lazyval[i]        return self.tree[n:]    for _ in range(int(inp2())):    n,q=map(int,inp2().split())    s=[int(c) for c in inp1().strip()]    f=[int(c) for c in inp1().strip()]    moves=[]    ans=True    for _ in range(q):        l,r=map(int,inp2().split())        moves.append((l-1,r-1))    tr=lazytree(f)    for l,r in reversed(moves):        success=tr.query(l,r)        if success==-1:            break    else:        f=tr.get_all()[:n]        if f!=s: success=-1    if success>=0:        print('YES')    else:        print('NO')
