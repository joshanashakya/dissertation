import sysimport re def main():    inp = sys.stdin.read().strip().split()[2::2]    out = []    for s in inp:        out.append(('NO', 'YES')[bool(re.search('8\d{10}', s))])    return out print(*main(), sep='\n')