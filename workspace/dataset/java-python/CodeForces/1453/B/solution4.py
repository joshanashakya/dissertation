import sysimport

mathfrom
collections
import \
    deque  # input = sys.stdin.readline#print = sys.stdout.writefrom string import ascii_lettersletters = ascii_letters[:26]ONLINE_JUDGE = 0 if all(['program' not in i for i in sys.argv]) and not ONLINE_JUDGE:    sys.stdin = open('input.txt', 'r')    sys.stdout = open('output.txt', 'w')  def solve():    n = int(input())    arr = list(map(int, input().split()))     mx = -1    pos = -1    for i in range(n - 2):        a = arr[i] - arr[i + 1]        b = arr[i + 1] - arr[i + 2]        delta = abs(a) + abs(b) - abs(arr[i] - arr[i + 2])        if delta > mx:            mx = delta            pos = i + 1    if abs(arr[-2] - arr[-1]) > mx:        mx = abs(arr[-2] - arr[-1])        pos = n - 1    if abs(arr[0] - arr[1]) > mx:        pos = 0    if pos != -1:        arr.pop(pos)        n -= 1    res = 0    for i in range(n - 2, -1, -1):         res += abs(arr[i] - arr[i + 1])    print(res)     for _ in range(int(input())):    solve()
