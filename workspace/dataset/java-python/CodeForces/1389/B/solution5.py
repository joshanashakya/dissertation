import sys

for _ in range(int(sys.stdin.readline())):
    n, k, z = map(int, sys.stdin.readline().split())
    a = [int(i) for i in sys.stdin.readline().split()]

    prefix_sums = [a[0]]
    for a_i in a[1:]:
        prefix_sums.append(prefix_sums[-1] + a_i)

    if z == 0:
        print(sum(a[:k + 1]))
    else:
        max_score = a[0]
        for ind in range(1, n):
            if k == 0:
                break
            local_max_score = prefix_sums[ind]
            local_k = k - 1
            local_z = z
            flag = 0
            while local_k != 0 and local_z != 0:
                if flag == 0:
                    local_max_score += a[ind - 1]
                    flag = 1
                    local_z -= 1
                else:
                    local_max_score += a[ind]
                    flag = 0
                local_k -= 1

            if local_k == local_z == 0:
                max_score = max(max_score, local_max_score)
            elif local_k == 0:
                max_score = max(max_score, local_max_score)
            elif local_z == 0:
                local_max_score += (prefix_sums[ind - 1 + local_k] - prefix_sums[ind - 1])
                max_score = max(max_score, local_max_score)

            k -= 1

        print(max_score)
