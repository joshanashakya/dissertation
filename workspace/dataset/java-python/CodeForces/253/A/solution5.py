Fi = open('input.txt', 'r')Fo = open('output.txt', 'w')B, G = Fi.read().split()B = int(B)G = int(G) if B > G:    Fo.write('BG'*G + 'B'*(B-G))else:    Fo.write('GB'*B + 'G'*(G-B))
