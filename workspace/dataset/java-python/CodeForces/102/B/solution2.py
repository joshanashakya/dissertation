n = input()count = 0while len(n) != 1:        lst = list(map(int,n.strip()))    n = str(sum(lst))    count+=1print(count)
