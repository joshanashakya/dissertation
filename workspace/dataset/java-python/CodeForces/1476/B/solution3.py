import sysimport

mathinf = float(
    'inf')  # input = sys.stdin.readlinedef lcm(a,b):    return int((a/math.gcd(a,b))*b) """n = int(input())n,k = map(int,input().split())arr = list(map(int,input().split()))"""for _ in range(int(input())):    n,k = map(int,input().split())    arr = list(map(int,input().split()))    s1 = 0    s2 = 0    for i in range(1,n):        s2 = s2+arr[i-1]        s1 = s1+arr[i-1]        if (arr[i]/s1 > k/100):            s = ((arr[i]*100.00)/k) - s1            s = math.ceil(s)            s1 = s1+s    print(s1-s2)
