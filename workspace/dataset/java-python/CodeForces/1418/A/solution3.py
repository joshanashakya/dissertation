import sysinput = sys.stdin.readlinefor
_ in range(int(input())): a, b, c = [int(x) for x in input().split()]
print(c + (b * c + c - 1 + a + -2) // (a - 1))
