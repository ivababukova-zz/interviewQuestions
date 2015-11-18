# Print all permutation

import sys


def permute(toPermute, prefix):

#    print(toPermute)
    
    if len(toPermute) == 0:
        yield prefix
    
    for i, _ in enumerate(toPermute):
        newPrefix = prefix + " " + str(toPermute[i])
        remains = toPermute[:i] + toPermute[i+1:]
        for result in permute(remains, newPrefix):
            yield result


size = sys.argv[1]
toPermute = [i + 1 for i in range(int(size))]
permutations = permute(toPermute, "")
    

for result in permutations:
    print(result)
