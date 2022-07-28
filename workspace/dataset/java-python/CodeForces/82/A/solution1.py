import sys n = int(sys.stdin.readline()) iterations = 0
prev_idx = 0
idx = 1 step = 5
width = 1 while idx <= n:    prev_idx = idx
idx += step
step *= 2
width *= 2 step //= 2
width //= 2 assert n >= prev_idxif
n < prev_idx + width: print("Sheldon") elif n < prev_idx + 2 * width: print(
    "Leonard") elif n < prev_idx + 3 * width: print("Penny") elif n < prev_idx + 4 * width: print(
    "Rajesh") else:    print("Howard")
