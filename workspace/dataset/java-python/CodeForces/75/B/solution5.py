name = input()
n = int(input()) priority = {}
nomes = [] for i in range(n):    txt = input().split()
a = txt[0]
b = txt[3][:-2]
action = txt[1]
if action == 'likes':        b = txt[2][:-2]
if b not in priority and b != name:        priority[b] = 0
if a not in priority and a != name:        priority[a] = 0
if a == name:        if
action == 'posted': priority[b] += 15 elif action == 'commented': priority[b] += 10 elif action == 'likes': priority[
    b] += 5 elif b == name:
if action == 'posted':
    priority[a] += 15        elif action == 'commented':
    priority[a] += 10        elif action == 'likes':
    priority[a] += 5     for ele in priority:    nomes.append((ele, priority[ele]))
nomes = sorted(nomes, key=lambda element: (-element[1], element[0])) for i in nomes:    print(
    i[0])   # printa em ordem alfabetica todos so elementos de priority se forem iguais
