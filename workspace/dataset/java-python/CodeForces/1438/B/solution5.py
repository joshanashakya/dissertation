import sysimport

mathfrom
collections
import \
    deque  # input = sys.stdin.readline#print = sys.stdout.writefrom string import ascii_lettersletters = ascii_letters[:26]ONLINE_JUDGE = 0 if all(['program' not in i for i in sys.argv]) and not ONLINE_JUDGE:    sys.stdin = open('input.txt', 'r')    sys.stdout = open('output.txt', 'w')  def solve():    n = int(input())    arr = list(map(int, input().split()))    print('NO' if len(set(arr)) == n else 'YES')  for _ in range(int(input())):    solve()
