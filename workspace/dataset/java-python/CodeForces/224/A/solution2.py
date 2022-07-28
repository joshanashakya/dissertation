import math (lb, bh, lh) = list(map(int, input().split(" ")))v = math.sqrt(lb*bh*lh)l = v/bhb = v/lhh = v/lbprint(int((l+b+h)*4))
