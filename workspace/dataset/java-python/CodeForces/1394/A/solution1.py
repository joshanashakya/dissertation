def solve():
    input_str = input().split()

    n, d, m = int(input_str[0]), int(input_str[1]), int(input_str[2])

    a = [0] + [int(x) for x in input().split()]

    # sort the fun factor in reverse order so we can greedily pick the optimal combination muzzle fun days and normal days
    # if we are getting muzzled, we want to get the largest fun factor(greedy technique).
    a[1:] = sorted(a[1:], reverse=True)
    # print(a)
    muzzle_days_cnt = 0

    # prefix_sum
    for i in range(1, n + 1):
        if a[i] > m:
            muzzle_days_cnt += 1

        a[i] += a[i - 1]

    # print(a)

    ans = 0

    if muzzle_days_cnt == 0:
        print(a[n])
        return 0

    for i in range(1, muzzle_days_cnt + 1):

        # first i - 1 days, there will d + 1 muzzle days including the start of muzzle day and + 1 for the last muzzle day
        days_left = n - ((i - 1) * (d + 1) + 1)

        # ans = sum of normal days left after select muzzle days and muzzle days
        if days_left >= 0:
            ans = max(ans, (a[min(n, muzzle_days_cnt + days_left)] - a[muzzle_days_cnt]) + a[i])

    print(ans)

    return 0


solve()
