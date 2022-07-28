import mathimport

itertools if __name__ == '__main__':    N = int(input())
likes = [input() for i in range(N)]
likes = [line.split() for line in likes]
likes = [(words[0], words[2]) for words in likes]
a, b, c = (float(val) for val in input().split())     min_diff = max(a, b, c)
possible_groups = []
for i in range(1, 7 - 1):        for
j in range(1, 7 - i): a_e = math.floor(a / i)
b_e = math.floor(b / j)
c_e = math.floor(c / (7 - i - j))
diff = max(a_e, b_e, c_e) - min(a_e, b_e, c_e)
if diff < min_diff:                min_diff = diff
possible_groups = [(i, j)] elif diff == min_diff: possible_groups.append((i, j))
max_likes = 0
for order in itertools.permutations(['Anka', 'Chapay', 'Cleo', 'Troll', 'Dracul', 'Snowy', 'Hexadecimal']):        for
i, j in possible_groups: likes_count = 0
seta = set(order[:i])
setb = set(order[i:(i + j)])
setc = set(order[(i + j):])
for p, q in likes:                if
p in seta and q in seta: likes_count += 1
if p in setb and q in setb:                    likes_count += 1
if p in setc and q in setc:                    likes_count += 1
max_likes = max(max_likes, likes_count)
print(f'{min_diff} {max_likes}') 
