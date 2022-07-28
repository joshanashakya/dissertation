import sysimport

inspectimport
reimport
math if __name__ == "CP":    sys.stdin = open('ip.txt', 'r')
sys.stdout = open('op.txt', 'w')
sys.stderr = open('error.txt', 'w') 

def debug(arg):    frame = inspect.currentframe()


try:        context = inspect.getframeinfo(frame.f_back).code_context
caller_lines = ''.join([line.strip() for line in context])
m = re.search(r'debug\s*\((.+?)\)$', caller_lines)
if m:            caller_lines = m.group(1)
sys.stderr.write(caller_lines + " = " + str(arg) + "\n")    finally:        del frame try:    M = 1000000007


def solve():        n, m = [int(x) for x in input().split()]


a = list(map(int, input().split()))
b = list(map(int, input().split()))         a.sort(
    reverse=True)  # print(a)        i,k = 0,0        ans = 0        while(i<n and k<m):            if(b[a[i]-1]>b[k]):                ans += b[k]                k+=1            else:                ans += b[a[i]-1]            i+=1                print(ans)         pass     def main():        t=1        t=int(input())        for _ in range(t):            solve()    main()     except Exception as e:    sys.stderr.write("ErrOR : "+e)
