import sysfrom array import array  def readline(): return sys.stdin.buffer.readline().decode('utf-8')  n, m = map(int, readline().split())c = list(map(int, readline().split()))a = list(map(int, readline().split()))i, ans = 0, 0 for bill in a:    while i < n and bill < c[i]:        i += 1    if i < n:        ans += 1        i += 1 print(ans)
