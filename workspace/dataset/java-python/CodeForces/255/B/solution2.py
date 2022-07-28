s = input()xs = s.count("x")ys = s.count("y") if xs > ys:    print("x" * (xs - ys))else:    print("y" * (ys - xs))
