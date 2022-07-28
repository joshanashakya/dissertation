def inpl():    return list(map(int, input().split()))

 

def inpi():    return int(input())

 r = {'0': '0', '1': '1', '2': '5', '5': '2', '8': '8', ':': ':'}


def refl(d):    if


d in r:
return r[d] else:        return 'x' 

def to_h(h, m):    rr = '0' if h < 10 else ''


rr += str(h)
rr += ':'
rr += '0' if m < 10 else ''
rr += str(m)
return rr 

def from_h(h):    return list(map(int, h.split(':')))

 

def mirror(h):    return ''.join([refl(d) for d in h[::-1]])

 

def is_mirror(h):    return mirror(h) == h

 

def is_legal(ch, cm, h, m):    return ch < h and cm < m

 

def inc(ch, cm, h, m):    cm += 1


ch += cm // m
cm = cm % m
ch = ch % h
return ch, cm 

def f():    h, m = inpl()


sh, sm = list(map(int, input().split(':')))
while True:        st = to_h(sh, sm)
mt = mirror(
    st)  # print(st, mt)		if 'x' not in mt and is_legal(*from_h(mt),h,m):			print(st)			return		sh,sm = inc(sh,sm,h,m) t = int(input())for _ in range(t):	f()
