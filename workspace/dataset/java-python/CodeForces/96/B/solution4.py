def luckynumwithequalnumberoffourandseven(x, n, a):
    if x >= n and str(x).count("4") == str(x).count("7"):
        a.append(x)
    else:
        if x < 1e12:
            luckynumwithequalnumberoffourandseven(x * 10 + 4, n, a)
            luckynumwithequalnumberoffourandseven(x * 10 + 7, n, a)
    return a


def main():
    n = int(input())
    s = []
    luckynumwithequalnumberoffourandseven(0, n, s)
    s = sorted(s)
    # print(s)
    print(s[0])


if __name__ == '__main__':
    main()
