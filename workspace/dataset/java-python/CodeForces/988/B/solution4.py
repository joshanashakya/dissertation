t = int(input())a = sorted((input() for _ in range(t)), key=lambda res: len(res))ans = all(a[i] in a[i+1] for i in range(t-1))print('YES\n'+"\n".join(a) if ans else 'NO')
