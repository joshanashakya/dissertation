from sys import stdin  def real_puzzle(n, active_teeth):    while active_teeth[0] != 0:        for i in range(n):            if i % 2 == 0:                active_teeth[i] = (active_teeth[i] + 1) % n            else:                active_teeth[i] = active_teeth[i] - 1 if active_teeth[i] != 0 else n - 1    for i in range(n):        if active_teeth[i] != i:            return "No"    return "Yes"  if __name__ == "__main__":    n = int(stdin.readline())    active_teeth = [int(c) for c in stdin.readline().split(" ")]    print(real_puzzle(n, active_teeth))
