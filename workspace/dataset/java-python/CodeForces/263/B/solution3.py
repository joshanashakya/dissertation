from sys import stdin def read_lines(sep=' ', input_type=None):    #list of rows    _lines = stdin.readlines()    cast = input_type is not None    lines = []    for line in _lines:        line = line[:-1].split(sep)        if cast:            line = [input_type(x) for x in line]        lines.append(line)    return lines if __name__ == '__main__':     lines = read_lines(input_type=int)        n,k = lines[0]    lines = lines[1:]     for line in lines:        line.sort()                length = len(line)                if k > length:            print(-1)        else:            x = line[-k]            print(x,x)