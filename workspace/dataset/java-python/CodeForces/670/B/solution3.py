import sysinput = sys.stdin.readline n, k = [int(i) for i in input().split()]a = [int(i) for i in input().split()]count = 1while k > count:    k -= count    count += 1print(a[k - 1])
