def check(flags: str, first: str, second: str) -> bool:    if first not in flags or second not in flags:        return False    f_f_ind = flags.index(first)    l_s_ind = flags.rindex(second)    return f_f_ind + len(first) - 1 < l_s_ind  flags, first, second = input(), input(), input()f = check(flags, first, second)flags = flags[::-1]b = check(flags, first, second) if f and b:    print('both')elif f:    print('forward')elif b:    print('backward')else:    print('fantasy')