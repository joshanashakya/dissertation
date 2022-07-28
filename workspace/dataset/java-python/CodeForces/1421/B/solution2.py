for _ in range(int(input())):    n = int(input())
mat = []
for i in range(n):        mat.append(input())
s1 = mat[0][1]
s2 = mat[1][0]
s3 = mat[-2][-1]
s4 = mat[-1][-2]
if s1 == s2 == s3 == s4:        print(2)
print(1, 2)
print(2, 1) elif s1 == s2 == s3: print(1)
print(n - 1, n) elif s1 == s2 == s4: print(1)
print(n, n - 1) elif s1 == s4 == s3: print(1)
print(1, 2) elif s4 == s2 == s3: print(1)
print(2, 1) elif s1 == s3: print(2)
print(1, 2)
print(n, n - 1) elif s1 == s4: print(2)
print(1, 2)
print(n - 1, n) else:        print(0)
