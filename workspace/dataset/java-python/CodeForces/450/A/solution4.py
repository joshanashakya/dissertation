n, m = map(int,input().split())lst = [(int(v), idx+1) for idx,v in enumerate(input().split())] class Queue:    def __init__(self, lst=[]):        self.instack = lst[::]        self.outstack = []        def append(self, val):        self.instack.append(val)                def __iter__(self):        return self     def __next__(self):        if not self.outstack:            while self.instack:                self.outstack.append(self.instack.pop())                if self.outstack:            return self.outstack.pop()        else:            raise StopIteration q = Queue(lst) ans = 0for val,idx in q:    if val > m:        q.append((val-m, idx))    ans=idxprint(ans)
