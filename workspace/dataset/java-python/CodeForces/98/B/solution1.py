import math


def simply(a, b):
    g = math.gcd(a, b)
    a = a // g
    b = b // g

    return (a, b)


def mul(a, b, c, d):
    return simply(a * c, b * d)


def add(a, b, c, d):
    return simply(a * d + b * c, b * d)


def main():
    n = int(input())

    nxt = 0
    depth = 0
    node = 1
    total_node = 1

    p = 0
    q = 1

    while (n % 2 == 0):
        depth = depth + 1
        n = n // 2

    nxt = depth

    if (n == 1):
        print(str(depth) + "/1")
        return

    for i in range(0, n):
        node = node * 2
        total_node = total_node * 2
        depth = depth + 1

        p = p * 2
        q = q * 2

        if (node >= n):
            p = p + n * depth
            node -= n

        if (node == 1):
            nxt = depth - nxt
            break

    # p/q + 1/total_node * p/q + (1/total_node)^2 * p/q + ...
    p, q = mul(p, q, total_node, total_node - 1)

    # 1/nxt_node * (nxt_node_1)/nxt_node * nxt + (1/nxt_nod)^2 * (nxt_node_1)/nxt_node * nxt * 2 + ...
    s, t = (total_node - 1) * nxt * total_node * total_node, total_node * total_node * (total_node - 1) * (
                total_node - 1)
    s, t = simply(s, t)

    x, y = add(p, q, s, t)

    print(str(x) + "/" + str(y))


if __name__ == "__main__":
    main()
