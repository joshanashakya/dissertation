n, k = [int(x) for x in input().split(' ')]
a = [int(x) for x in input().split(' ')]
a_dict = {i: 0 for i in range(k + 1)}
for x in a:    if
x in a_dict: a_dict[x] += 1 else:        a_dict[x] = 1
steps = 0
while a_dict[k] < n:    a_dict = {i: a_dict[i] - int(a_dict[i] > 0 and i < k) + int(i > 0 and a_dict[i - 1] > 0) for i
                                  in range(1, k + 1)}
a_dict[0] = 0
steps += 1
print(steps)
