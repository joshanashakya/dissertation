from sys import stdin, stdout def main():    for _ in range(int(stdin.readline())):        n, k = map(int, stdin.readline().split(' '))        if n<=k:            stdout.write(str(k-n)+'\n')        else:            stdout.write(str((n-k)%2)+'\n') if __name__ == "__main__":    main()