# https://codeforces.com/problemset/problem/1505/B

def digital_root(n):
    x = sum(int(digit) for digit in str(n))
    if x < 10:
        return x
    else:
        return digital_root(x)


def main():
    a = int(input())

    print(digital_root(a))


if __name__ == '__main__':
    main()
