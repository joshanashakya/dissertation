import sys,mathdef input():    return sys.stdin.readline().strip()  def iinput():    return int(input())  def tinput():    return input().split()  def rinput():    return map(int, tinput())  def rlinput():    return list(rinput()) n,m = rinput()names = []for _ in range(n):    names.append(input())pairs = []for _ in range(m):    pairs.append(list(input().split())) total_sets = int(math.pow(2,n))max_set = []for i in range(1,total_sets):    cur_set = []    for j in range(n):        if i & 1 << j:            cur_set.append(names[j])    for p in pairs:        if p[0] in cur_set and p[1] in cur_set:            break    else:        if len(cur_set) > len(max_set):            max_set = cur_setmax_set.sort()print(len(max_set))print(*max_set,sep="\n")  