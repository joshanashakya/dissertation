# https://codeforces.com/problemset/problem/95/B


def nextLuckyNumber(digits: str) -> str:
    n = len(digits)
    halfLen = n >> 1
    if n & 1 or digits > f"{'7' * halfLen}{'4' * halfLen}":
        halfLen += 1
        return f"{'4' * halfLen}{'7' * halfLen}"

    result = [0 for i in range(n)]
    remaining = [halfLen, halfLen]  # number of 4s and 7s to add in result
    for i in range(n):
        add4 = False
        if remaining[0]:
            if digits[i] < '4':
                add4 = True
            elif digits[i] == '4':
                lastIdx = i + remaining[1]  # last index can be replaced with 7
                for j in range(i + 1, n):
                    d = '7' if j <= lastIdx else '4'
                    if digits[j] < d:
                        add4 = True
                        break
                    elif digits[j] > d:
                        add4 = False
                        break
                    elif j == n - 1:
                        add4 = True
        if add4:
            result[i] = '4'
            remaining[0] -= 1
        else:
            result[i] = '7'
            remaining[1] -= 1
        if result[i] > digits[i] or remaining[1] == 0:
            # append remaining 4s and 7s
            for k in range(i + 1, i + 1 + remaining[0]):
                result[k] = '4'
            for k in range(i + 1 + remaining[0],
                           i + 1 + remaining[0] + remaining[1]):
                result[k] = '7'
            break

    return ''.join(result)


if __name__ == "__main__":
    # input: 474778, output=477447
    # input: 477746, output=744477
    # input: 477775, output=744477
    # input: 747741, output=747744
    # input: 774674, output=774744
    # input: 774764, output=777444
    print(nextLuckyNumber(input()))
