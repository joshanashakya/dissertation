import sysfrom

os
import environfrom

collections
import defaultdict  if environ['USERNAME'] == 'kissz':    inp = open('in0.txt', 'r').readline


def debug(*args):        print(*args, file=sys.stderr)

else:    inp = sys.stdin.readline


def debug(*args):        pass

   # SCRIPT STARTS HERElookup=[i for i in range(1000001)]for i in range(2,1001):    i2=i**2    for j in range(i2,1000001,i2):        lookup[j]=j//i2 for _ in range(int(inp())):    inp()    X=[*map(int,inp().split())]    q=int(inp())    classes=defaultdict(int)    for x in X:        classes[lookup[x]]+=1    beauty=max(classes.values())    ans=[beauty,         max(beauty,classes[1]+sum(cnt for cl,cnt in classes.items() if (not cnt%2) and cl>1))]    for _ in range(q):        w=int(inp())        print(ans[w>0])        def create_test():    from random import randint    with open('in0.txt','w') as f:        print(1,file=f)        print(300000,file=f)        print(*[randint(1,1000000) for _ in range(300000)],file=f)        print(300000,file=f)        for _ in range(300000): print(randint(0,1),file=f)
