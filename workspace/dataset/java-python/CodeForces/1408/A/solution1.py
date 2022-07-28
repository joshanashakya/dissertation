import systry:    sys.stdin = open("input.txt", "r")except FileNotFoundError:
pass 

def next_array():    return [int(i) for i in input().split()]

 

def prefix(lst):    assert len(lst)


pre = [lst[0]]
for i in range(1, len(lst)):        pre.append(lst[i] + pre[i - 1])
return pre 

def solve():    l = int(input())


a = next_array()
b = next_array()
c = next_array()
lst = [a, b, c]
out = []
for i in range(l):        if
i == 0: out.append(lst[0][0]) elif i == l - 1:
for j in range(3):                if
lst[j][i] != out[i - 1] and lst[j][i] != out[0]: out.append(lst[j][i])
break elif i:
for j in range(3):                if
lst[j][i] != out[i - 1]: out.append(lst[j][i])
break
print(" ".join(str(i) for i in out))
if __name__ == "__main__":    test_cases = True
if test_cases:            for
i in range(int(input())): solve() else:        solve()
