n = int(input())
s1, s2 = "aabb", 'ccdd'
if n % 2 == 0:    print((s1 * n)[:n])
print('e' + (s2 * n)[:n - 2] + 'f')
print('e' + (s1 * n)[:n - 2] + 'f')
print((s2 * n)[:n]) else:    print((s1 * n)[:n - 1] + 'e')
print((s1 * n)[2:n + 1] + 'e')
print('f' + (s2 * n)[:n - 1])
print('f' + (s2 * n)[2:n + 1])
