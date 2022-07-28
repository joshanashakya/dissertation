n = int(input())a = [int(i) for i in input().split()]m = int(input())a.sort(reverse=True)s = sum(a)q = [s - a[int(i) - 1] for i in input().split()]print(*q, sep='\n')
