inp, out = open('input.txt', 'r'), open('output.txt', 'w')n = int(inp.readline())a = inp.readline().split()b = {}s = []for i in range(1, 2*n+1):    e = int(a[i-1])    if not e in b:        b[e]=i    else:        s.append(str(b[e]) +' '+str(i))        del(b[e])if len(b)==0:    out.write('\n'.join(s))else:    out.write('-1')out.close()
