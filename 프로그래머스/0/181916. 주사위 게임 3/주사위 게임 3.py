def solution(a, b, c, d):
    dice = [a, b, c, d]
    
    # 각 숫자가 몇 번 나왔는지 세기
    count = {}
    for x in dice:
        count[x] = count.get(x, 0) + 1
    
    values = list(count.keys())
    counts = list(count.values())
    
    # 4개 모두 같음
    if len(values) == 1:
        return 1111 * values[0]
    
    # 3개가 같음
    if 3 in counts:
        p = values[counts.index(3)]
        q = values[counts.index(1)]
        return (10 * p + q) ** 2
    
    # 2개씩 같음
    if counts.count(2) == 2:
        p, q = values
        return (p + q) * abs(p - q)
    
    # 2개가 같고 나머지 2개는 서로 다름
    if 2 in counts:
        p = values[counts.index(2)]
        others = [x for x in dice if x != p]
        return others[0] * others[1]
    
    # 모두 다름
    return min(dice)