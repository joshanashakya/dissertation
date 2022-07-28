n = int(input())fibs = [0, 1] while fibs[-1] < n:    fibs.append(sum(fibs[-2:]))if n <= 3:    print(" ".join(["0"]*(3-n) + ["1"]*n))else:    print(fibs[-5], fibs[-4], fibs[-2])
