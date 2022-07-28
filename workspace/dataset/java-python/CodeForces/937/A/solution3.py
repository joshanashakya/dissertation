import sysinput = sys.stdin.readline n = int(input())     a = [int(i) for i in input().split()]res = [int(i) for i in a if i > 0]print(len(set(res)))
