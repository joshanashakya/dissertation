import sysinput = sys.stdin.readlinefor _ in range(int(input())):    n=int(input())    if n>2:        sys.stdout.write(str(n-2)+'\n')    else:        sys.stdout.write('0\n')
