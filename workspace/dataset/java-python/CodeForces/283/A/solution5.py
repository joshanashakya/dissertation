import sys  def main():    n = int(sys.stdin.readline())    arr = [0] * (n + 1)    cnt = [0] * (n + 1)    curr_len = 1    curr_sum = 0    for _ in range(n):        t = list(map(int, sys.stdin.readline().split()))        if t[0] == 1:            curr_sum += t[1] * t[2]            cnt[t[1] - 1] += t[2]        elif t[0] == 2:            curr_sum += t[1]            arr[curr_len] = t[1]            curr_len += 1        else:            curr_len -= 1            curr_sum -= arr[curr_len] + cnt[curr_len]            cnt[curr_len - 1] += cnt[curr_len]            cnt[curr_len] = 0        print(curr_sum / curr_len)  main()
