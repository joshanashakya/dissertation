n, m = [int(x) for x in input().split()] edges = [set()] drain = set() for i in range(n):     nums = [int(x) for x in input().split()]     if nums[0] == 0:         drain.add(i + 1)     edges.append(set(nums[1:])) start = int(input())   nodes = {start} visited = {} while len(nodes) > 0:     curr = nodes.pop()     for v in edges[abs(curr)]:         if curr > 0:             v = -v         if visited.get(v) is None:             nodes.add(v)             visited[v] = curr   ok = False for d in drain:     if -d in visited:         print('Win')         v = -d         l = []         while v != start:             l.append(abs(v))             v = visited[v]         l.append(start)         print(' '.join(str(x) for x in l[::-1]))         ok = True         break   if not ok:     stack = [start]     in_stack = {start}     visited = {start}     while len(stack) > 0:         curr = stack[-1]         if len(edges[curr]) == 0:             stack.pop()             in_stack.remove(curr)             continue         v = edges[curr].pop()         if v not in visited:             visited.add(v)             stack.append(v)             in_stack.add(v)         elif v in in_stack:             print('Draw')             ok = True             break     if not ok:         print('Lose')            # Made By Mostafa_Khaled
