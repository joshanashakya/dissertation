from sys import stdin, stdout def main():    for _ in range(int(stdin.readline())):        s = int(stdin.readline())        x = 0        while s>=10:            q = s//10            r = s%10            s = q+r            x += q*10        x += s        stdout.write(str(x)+'\n') if __name__ == "__main__":    main()
