from sys import stdin, stdoutdef

main():
for _ in range(int(stdin.readline())):        n = int(stdin.readline())
ans = [0, 0]
first, second = 1, 0
get = [0, 1, 1, 2, 3]
while n:            if
n < 5: temp = get[n]
if first:                    ans[0] += temp
first ^= 1
ans[1] += n - temp else:                    ans[1] += temp
second ^= 1
ans[0] += n - temp
break elif n % 2 == 1 or ((n // 2) % 2 == 0):
if first:                    ans[0] += 1
first ^= 1
second = 1 else:                    ans[1] += 1
second ^= 1
first = 1
n -= 1 else:                if first:                    ans[0] += n // 2
first ^= 1
second = 1 else:                    ans[1] += n // 2
second ^= 1
first = 1
n = n // 2
stdout.write("%d\n" % (ans[0]))
main()
