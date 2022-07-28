
import collections
import itertools
import math
import networkx as nx
import numpy as np
import heapq

if __name__ != '__main__':
    import devtools

################################################################################

def read_case(r):
    N, K = r.read_ints()
    P = r.read_arr(N)
    return N, K, P

def solve_small(case):
    N, K, P = case
    P = list(sorted(P))
    best_K = []
    for i in range(K-1):
        heapq.heappush(best_K, 2*math.pi*P[i][0]*P[i][1])
    best = sum(best_K) + 2*math.pi*P[K-1][0]*P[K-1][1] + math.pi*P[K-1][0]**2
    for i in range(K, N):
        if K > 1:
            l = max(heapq.heappop(best_K), 2*math.pi*P[i-1][0]*P[i-1][1])
            heapq.heappush(best_K, l)
        best = max(best, sum(best_K) + 2*math.pi*P[i][0]*P[i][1] + math.pi*P[i][0]**2)
    return best

def solve_large(case):
    return solve_small(case)

def write_case(w, res):
    w.write_str(res)

################################################################################

class CaseReader(object):
    def __init__(self, f):
        self.f = f

    def __iter__(self):
        def iter():
            T = self.read_int()
            for i in range(1, T+1):
                yield i, read_case(self)
        return iter()

    def read_str(self):
        return next(self.f).strip()

    def read_int(self, b=10):
        return int(self.read_str(), b)

    def read_chrs(self):
        return list(self.read_str())

    def read_digits(self, b=10):
        return [int(x, b) for x in self.read_chrs()]

    def read_strs(self, d=' '):
        return self.read_str().split(d)

    def read_ints(self, b=10, d=' '):
        return [int(x, b) for x in self.read_strs(d)]

    def read_floats(self, d=' '):
        return [float(x) for x in self.read_strs(d)]

    def read_arr(self, rows, read_kind=read_ints, *args, **kwargs):
        return [read_kind(self, *args, **kwargs) for _ in range(rows)]

class ResWriter(object):
    def __init__(self, f, case_reader, solver=solve_small):
        self.f = f
        self.case_reader = case_reader
        self.solver = solver

    def __iter__(self):
        def iter():
            for i, case in self.case_reader:
                res = self.solver(case)
                self.f.write("Case #%d: "%i)
                write_case(self, res)
                yield i, case, res
        return iter()

    @staticmethod
    def _strb(i, b):
        if i == 0:
            return '0'
        s = []
        while i > 0:
            s.append(str(i%b))
            i = i//b
        return ''.join(reversed(s))

    def write_str(self, res, newl=True):
        self.f.write(str(res))
        if newl:
            self.f.write('\n')

    def write_int(self, res, b=10, newl=True):
        self.f.write(self._strb(res, b))
        if newl:
            self.f.write('\n')

    def write_strs(self, res, d=' ', newl=True):
        self.f.write(d.join(str(r) for r in res))
        if newl:
            self.f.write('\n')

    def write_chars(self, res, d='', newl=True):
        self.write_strs(res, d)
        if newl:
            self.f.write('\n')

    def write_ints(self, res, b=10, d=' ', newl=True):
        self.f.write(d.join(self._strb(r, b) for r in res))
        if newl:
            self.f.write('\n')

    def write_arr(self, arr, write_kind, newl=True, *args, **kwargs):
        first = True
        some = False
        for row in arr:
            if first:
                first = False
            else:
                self.f.write('\n')
            write_kind(self, row, newl=False, *args, **kwargs)
            some = True
        if some and newl:
            self.f.write('\n')

if __name__ == '__main__':
    in_fn = 'test-small-attempt0.in'
    out_fn = 'test-small-attempt0.out'
    with open(in_fn, 'r') as fi:
        with open(out_fn, 'w') as fo:
            collections.deque(ResWriter(fo, CaseReader(fi)), 0)
else:
    from run import *
