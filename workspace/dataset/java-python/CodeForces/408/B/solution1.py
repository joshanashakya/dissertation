import sysfrom collections import Counterdef fmax(n,m):    cn = Counter(n)    cm = Counter(m)    for i in cm:        if cn[i] == 0:            return -1    ta = 0            if len(n)<=len(m):        for i in cm:            ta = ta+min(cn[i],cm[i])    if len(n)>len(m):        for i in cm:            ta = ta+min(cn[i],cm[i])        return ta       if __name__ == '__main__':        input = sys.stdin.read()    data = list(map(str, input.split()))    n = data[0]    m = data[1]    print(fmax(n,m))    