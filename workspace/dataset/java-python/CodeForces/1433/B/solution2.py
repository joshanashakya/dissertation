import sysinput = sys.stdin.readline for test in range(int(input())):    n = int(input())
a = input()
low = a.find("1")
high = a.rfind("1")
ans = a[low:high].count("0")
print(ans)
