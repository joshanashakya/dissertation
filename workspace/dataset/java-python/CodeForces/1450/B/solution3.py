import functoolsdef

comp(a, b):
if (len(a) < len(b)):        return 1
if (len(a) == len(b)):
    return 0    else:
    return -1


def solve():    n, k = input().split()


n = int(n)
k = int(k)
p_x = []
p_y = []
for i in range(n):        x, y = input().split()
p_x.append(int(x))
p_y.append(int(
    y))  # print(p_x)    # print(p_y)    # print(n,k)    graph = []    for i in range(len(p_x)):        temp = []        for j in range(len(p_x)):            if(i!=j or i==j):                if(abs(p_x[i]-p_x[j])+abs(p_y[i]-p_y[j])<=k):                    temp.append(j)        graph.append(temp)    # print(graph)    graph = sorted(graph,key=functools.cmp_to_key(comp))    # print(graph,'***')    for i in graph:        if len(i)!=n:            print(-1)            return        else:            print(1)            return     # print(graph)    t = input()t = int(t)while t:    solve()    t=t-1
