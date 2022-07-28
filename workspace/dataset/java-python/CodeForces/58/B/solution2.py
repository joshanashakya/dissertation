import sysdef

fmax(n):
if n == 1:        print(1)
return 0
i = 2
print(n)
while (i < 1000001):                if
n == 1:
break
if n % i == 0:            n = n // i
i = 2
print(n)
continue
i = i + 1
return 0
if __name__ == '__main__':        input = sys.stdin.read()
data = list(map(int, input.split()))
n = data[0]
fmax(n)
