import sys def lookup(val, key, q):    if key == "?":        return q    else:        return val[key] def evaluate(d, order, i, q):    val = dict()    S = 0    for k in order:        elem = d[k]        if isinstance(elem, tuple):            v = None            if elem[0] == "XOR":                v = lookup(val, elem[1], q) ^ lookup(val, elem[2], q)            elif elem[0] == "AND":                v = lookup(val, elem[1], q) & lookup(val, elem[2], q)            elif elem[0] == "OR":                v = lookup(val, elem[1], q) | lookup(val, elem[2], q)            val[k] = v            S += v        else:            val[k] = ord(elem[i])-ord("0")            S += val[k]    return S    lines = sys.stdin.readlines()(n,m) = map(int, lines[0].split()) order = []d = dict() for line in lines[1:]:    elems = line.split()    order.append(elems[0])    if len(elems) > 3:        d[elems[0]] = (elems[3], elems[2], elems[4])    else:        d[elems[0]] = elems[2] xM = []xm = []for i in xrange(m):    S0 = evaluate(d, order, i, 0)    S1 = evaluate(d, order, i, 1)    if S0 == S1:        xM.append("0")        xm.append("0")    elif S1 > S0:        xM.append("1")        xm.append("0")    else:        xM.append("0")        xm.append("1") print "".join(xm)print "".join(xM)  
