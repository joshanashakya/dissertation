def gen_len(l):    gen = []    for i in range(2 ** l):        k = int(bin(i)[2:].rjust(l, '0').replace('0', '4').replace('1', '7'))        if k <= 10 ** 9:            gen.append(k)    return gen  def pairs_with_k_len(a, k):    l = 0    r = k - 1    while r < len(a):        yield l, r        l += 1        r += 1  def get_intersection_length(l1, r1, l2, r2):    return max(min(r1, r2) - max(l1, l2) + 1, 0)  def main():    gen = set()    for i in range(1, 10):        for e in gen_len(i):            gen.add(e)    gen = list(sorted(gen))     pl, pr, vl, vr, k = map(int, input().split())    denominator = (pr - pl + 1) * (vr - vl + 1)    p = (pl, pr)    v = (vl, vr)     count = 0    for l, r in pairs_with_k_len(gen, k):        if gen[l] >= min(pl, vl) and gen[r] <= max(pr, vr):            l1 = gen[l - 1] if l != 0 else 0            r1 = gen[l]            l2 = gen[r]            r2 = gen[r + 1] if r != len(gen) - 1 else 10**9 + 1            count += (get_intersection_length(l1 + 1, r1, pl, pr)                      * get_intersection_length(l2, r2 - 1, vl, vr))            count += (get_intersection_length(l1 + 1, r1, vl, vr) *                      get_intersection_length(l2, r2 - 1, pl, pr))            if k == 1 and get_intersection_length(vl, vr, pl, pr) != 0:                count -= 1     print(f"{(count / denominator):.{12}f}")  if __name__ == '__main__':    main()