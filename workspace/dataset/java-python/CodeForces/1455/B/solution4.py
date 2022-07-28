for t in range(int(input())):    n = int(input())
i = 1
while i * (
        i + 1) / 2 < n:        i += 1   # print("i", i)    sm = i*(i + 1)/2    if n == sm - 1:        print(i + 1)    else:        print(i)
