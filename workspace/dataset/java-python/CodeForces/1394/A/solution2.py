def main():
    n, day, mood = map(int, input().split())
    a = list(map(int, input().split()))
    out = []
    safe = []
    for v in a:
        if v <= mood:
            safe.append(v)
        else:
            out.append(v)
    safe.sort(reverse=True)
    out.sort(reverse=True)

    if not out:
        print(sum(safe))
        return

    safe.insert(0, 0)
    out.insert(0, 0)
    for i in range(1, len(safe)):
        safe[i] += safe[i - 1]

    for i in range(1, len(out)):
        out[i] += out[i - 1]

    ans = 0
    for l in range(len(out)):
        if l == 0:
            ans = max(ans, safe[min(n, len(safe) - 1)])
        else:
            possible = n - 1 - (day + 1) * (l - 1)
            if possible >= 0:
                ans = max(ans, safe[min(possible, len(safe) - 1)] + out[l])
    print(ans)
    return


if __name__ == "__main__":
    main()
