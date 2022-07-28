import sysimport

mathclass
DictList(dict):


def __setitem__(self, key, value):        try

    :  # Assumes there is a list on the key            self[key].append(value)        except KeyError: # If it fails, because there is no key            super(DictList, self).__setitem__(key, value)        except AttributeError: # If it fails because it is not a list            super(DictList, self).__setitem__(key, [self[key], value]) def fn(n):    if n==1:        print(1)        return 0    m=0     c=0    ans = [n]    for i in range(20):        if m==0 and c==1:            break        m=0        c=1        for j in range(2,n):            if n%j==0:                m=1                n=n//j                ans.append(n)                break    ans.append(1)        print(*ans)                            if __name__ == '__main__':        input = sys.stdin.read()    data = list(map(int, input.split()))    n = (data[0])    (fn(n))
